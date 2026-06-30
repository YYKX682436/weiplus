package com.tencent.kinda.framework.widget.tools;

/* loaded from: classes9.dex */
public class ActivityController {
    public static final java.lang.String TAG = "MicroMsg.ActivityController";
    private static java.lang.ref.WeakReference<android.app.Activity> currentActivity;
    private byte _hellAccFlag_;
    private static java.util.HashMap<java.lang.Integer, com.tencent.kinda.framework.widget.base.BaseFragment> fragmentPond = new java.util.HashMap<>();
    private static boolean activityCreating = false;
    private static java.util.List<java.lang.Integer> pendingList = new java.util.ArrayList();

    /* loaded from: classes9.dex */
    public static abstract class LiteAppOnCloseListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent> {
        public LiteAppOnCloseListener() {
            super(com.tencent.mm.app.a0.f53288d);
            this.__eventId = 1907495603;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void attach(android.app.Activity activity) {
        com.tencent.mars.xlog.Log.i(TAG, "attach %s", activity);
        synchronized (com.tencent.kinda.framework.widget.tools.ActivityController.class) {
            currentActivity = new java.lang.ref.WeakReference<>(activity);
            if (pendingList.size() > 0) {
                com.tencent.kinda.framework.widget.base.IEventFragment iEventFragment = (com.tencent.kinda.framework.widget.base.IEventFragment) activity;
                if (activity.isFinishing()) {
                    return;
                }
                java.util.Iterator<java.lang.Integer> it = pendingList.iterator();
                while (it.hasNext()) {
                    com.tencent.kinda.framework.widget.base.BaseFragment baseFragment = fragmentPond.get(it.next());
                    if (baseFragment != null) {
                        iEventFragment.addFragment(baseFragment);
                    }
                }
                pendingList.clear();
            }
            activityCreating = false;
            com.tencent.mars.xlog.Log.i(TAG, "activityCreating has set false.");
        }
    }

    public static void attachOnlyActivity(android.app.Activity activity) {
        com.tencent.mars.xlog.Log.i(TAG, "attachOnlyActivity %s", activity);
        synchronized (com.tencent.kinda.framework.widget.tools.ActivityController.class) {
            currentActivity = new java.lang.ref.WeakReference<>(activity);
        }
    }

    public static void detach(android.app.Activity activity) {
        com.tencent.mars.xlog.Log.i(TAG, "detach %s", activity);
        synchronized (com.tencent.kinda.framework.widget.tools.ActivityController.class) {
            java.lang.ref.WeakReference<android.app.Activity> weakReference = currentActivity;
            if (weakReference != null && activity == weakReference.get()) {
                currentActivity = null;
            }
            pendingList.clear();
            activityCreating = false;
        }
    }

    private static boolean isTopKindaActivity() {
        java.lang.ref.WeakReference<android.app.Activity> weakReference = currentActivity;
        return weakReference != null && (weakReference.get() instanceof com.tencent.mm.framework.app.UIPageFragmentActivity) && currentActivity.get().equals(com.tencent.kinda.framework.widget.tools.KindaContext.get());
    }

    public static void remove(com.tencent.kinda.gen.IUIModal iUIModal) {
        synchronized (com.tencent.kinda.framework.widget.tools.ActivityController.class) {
            com.tencent.mars.xlog.Log.i(TAG, "remove modal: %s, %s", iUIModal.getReportUrl(), java.lang.Integer.valueOf(iUIModal.hashCode()));
            com.tencent.kinda.framework.widget.base.BaseFragment remove = fragmentPond.remove(java.lang.Integer.valueOf(iUIModal.hashCode()));
            if (remove != null) {
                androidx.activity.k activity = remove.getActivity();
                if (activity instanceof com.tencent.kinda.framework.widget.base.IEventFragment) {
                    ((com.tencent.kinda.framework.widget.base.IEventFragment) activity).removeModal(remove);
                }
            } else {
                for (com.tencent.kinda.framework.widget.base.BaseFragment baseFragment : fragmentPond.values()) {
                    if (baseFragment.getReportUrl().equals(iUIModal.getReportUrl())) {
                        com.tencent.mars.xlog.Log.w(TAG, "remove same url modal");
                        androidx.activity.k activity2 = baseFragment.getActivity();
                        if (activity2 instanceof com.tencent.kinda.framework.widget.base.IEventFragment) {
                            ((com.tencent.kinda.framework.widget.base.IEventFragment) activity2).removeModal(baseFragment);
                        }
                        return;
                    }
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(965, 53);
                com.tencent.mars.xlog.Log.e(TAG, "can't find associated activity");
            }
        }
    }

    public static void removeAll() {
        com.tencent.mars.xlog.Log.i(TAG, "removeAllFragments");
        java.lang.ref.WeakReference<android.app.Activity> weakReference = currentActivity;
        if (weakReference == null || weakReference.get() == null) {
            com.tencent.mars.xlog.Log.e(TAG, "currentActivity is null, needn't remove any modal.");
            return;
        }
        android.app.Activity activity = currentActivity.get();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        com.tencent.mars.xlog.Log.w(TAG, "remove all modal");
        if (fragmentPond.size() > 0) {
            fragmentPond.clear();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(965, 52);
        }
        activity.finish();
    }

    public static void resetFlag() {
        activityCreating = false;
        com.tencent.mars.xlog.Log.i(TAG, "activityCreating has set false.");
    }

    public static com.tencent.kinda.framework.widget.base.BaseFragment resolveFragment(android.os.Bundle bundle) {
        int i17 = bundle.getInt(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_TARGET, 0);
        if (fragmentPond.containsKey(java.lang.Integer.valueOf(i17))) {
            return fragmentPond.remove(java.lang.Integer.valueOf(i17));
        }
        return null;
    }

    public static void startNewUIModal(com.tencent.kinda.gen.IUIModal iUIModal) {
        com.tencent.kinda.framework.widget.base.BaseFragment baseFragment;
        android.content.Intent intent;
        synchronized (com.tencent.kinda.framework.widget.tools.ActivityController.class) {
            if (com.tencent.kinda.framework.widget.tools.KindaContext.getBackupContextStack().size() > 0) {
                com.tencent.kinda.framework.widget.tools.KindaContext.getBackupContextStack().removeAllElements();
            }
            java.lang.ref.WeakReference<android.app.Activity> weakReference = currentActivity;
            if (weakReference != null) {
                android.app.Activity activity = weakReference.get();
                if ((activity instanceof com.tencent.mm.framework.app.UIPageFragmentActivity) && fragmentPond.size() == 0) {
                    ((com.tencent.mm.framework.app.UIPageFragmentActivity) activity).f68151d = true;
                }
            }
            int hashCode = iUIModal.hashCode();
            if (fragmentPond.containsKey(java.lang.Integer.valueOf(hashCode))) {
                baseFragment = fragmentPond.get(java.lang.Integer.valueOf(hashCode));
            } else {
                com.tencent.kinda.framework.app.ModalFragment modalFragment = new com.tencent.kinda.framework.app.ModalFragment();
                modalFragment.attachModal(iUIModal);
                fragmentPond.put(java.lang.Integer.valueOf(hashCode), modalFragment);
                baseFragment = modalFragment;
            }
            if (isTopKindaActivity()) {
                ((com.tencent.kinda.framework.widget.base.IEventFragment) currentActivity.get()).addFragment(baseFragment);
                com.tencent.mars.xlog.Log.i(TAG, "startNewUIModal by an existing activity.");
            } else {
                pendingList.add(java.lang.Integer.valueOf(hashCode));
                if (activityCreating) {
                    com.tencent.mars.xlog.Log.w(TAG, "startNewUIModal failed, because activityCreating is true!");
                    return;
                }
                android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
                if (context == null) {
                    com.tencent.mars.xlog.Log.w(TAG, "startNewUIModal failed, because KindaContext get null!");
                    return;
                }
                activityCreating = true;
                com.tencent.mars.xlog.Log.i(TAG, "activityCreating has set true.");
                android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.framework.app.UIPageFragmentActivity.class);
                if ((context instanceof android.app.Activity) && (intent = ((android.app.Activity) context).getIntent()) != null) {
                    intent.putExtra(com.tencent.mm.ui.MMFragmentActivity.EXTRA_USE_SYSTEM_DEFAULT_ENTER_EXIT_ANIM, true);
                }
                intent2.putExtra("key_support_swipe_back", false);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/kinda/framework/widget/tools/ActivityController", "startNewUIModal", "(Lcom/tencent/kinda/gen/IUIModal;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/kinda/framework/widget/tools/ActivityController", "startNewUIModal", "(Lcom/tencent/kinda/gen/IUIModal;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.tencent.mars.xlog.Log.i(TAG, "startNewUIModal by a new activity.");
            }
        }
    }

    public static void startNewUIPage(final com.tencent.kinda.gen.IUIPage iUIPage, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, int i17) {
        int i18;
        android.app.Activity activity;
        android.content.Intent intent;
        if (com.tencent.kinda.framework.widget.tools.KindaContext.getBackupContextStack().size() > 0) {
            com.tencent.kinda.framework.widget.tools.KindaContext.getBackupContextStack().removeAllElements();
        }
        java.lang.ref.WeakReference<android.app.Activity> weakReference = currentActivity;
        if (weakReference != null) {
            android.app.Activity activity2 = weakReference.get();
            if (activity2 instanceof com.tencent.mm.framework.app.UIPageFragmentActivity) {
                ((com.tencent.mm.framework.app.UIPageFragmentActivity) activity2).f68151d = false;
            }
        }
        java.lang.String string = iTransmitKvData.getString("KindaWebViewURL");
        java.lang.String string2 = iTransmitKvData.getString("KindaTinyAppUserName");
        java.lang.String string3 = iTransmitKvData.getString("KindaTinyAppPath");
        java.lang.String string4 = iTransmitKvData.getString("KindaTinyAppVersion");
        int P = com.tencent.mm.sdk.platformtools.t8.P(iTransmitKvData.getString("KindaTinyAppScene"), 0);
        int P2 = com.tencent.mm.sdk.platformtools.t8.P(iTransmitKvData.getString("KindaTinyAppType"), 0);
        boolean bool = iTransmitKvData.getBool("KindaTinyAppTransparent");
        boolean bool2 = iTransmitKvData.getBool(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP);
        java.util.ArrayList<java.lang.String> allKeys = iTransmitKvData.allKeys();
        com.tencent.kinda.framework.app.MainFragment mainFragment = new com.tencent.kinda.framework.app.MainFragment();
        mainFragment.enterAnimStyle = i17;
        mainFragment.attachPage(iUIPage);
        fragmentPond.put(java.lang.Integer.valueOf(iUIPage.hashCode()), mainFragment);
        if (isTopKindaActivity()) {
            activity = currentActivity.get();
            i18 = P;
            intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.framework.app.UIPageFragmentActivity.class);
            intent.addFlags(67108864);
        } else {
            i18 = P;
            activity = com.tencent.kinda.framework.widget.tools.KindaContext.get();
            if (activity == null) {
                com.tencent.mars.xlog.Log.w(TAG, "can't find valid activity");
                return;
            }
            intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.framework.app.UIPageFragmentActivity.class);
        }
        final android.os.Bundle bundle = new android.os.Bundle();
        android.content.Context context = activity;
        bundle.putInt(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_TARGET, iUIPage.hashCode());
        if (bool2) {
            bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP, true);
            bundle.putString("appId", iTransmitKvData.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID));
            bundle.putBoolean("isHalfScreen", iTransmitKvData.getBool(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_IS_HALF_SCREEN));
            bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, iTransmitKvData.getBool(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT));
            bundle.putDouble("heightPercent", java.lang.Double.valueOf(iTransmitKvData.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_HEIGHT_PERCENT)).doubleValue());
            if (allKeys.contains(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)) {
                bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, iTransmitKvData.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH));
            }
            if (allKeys.contains("query")) {
                bundle.putString("query", iTransmitKvData.getString("query"));
            }
            if (allKeys.contains(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_MIN_VERSION)) {
                bundle.putString("minVersion", iTransmitKvData.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_MIN_VERSION));
            }
            if (allKeys.contains(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_ENTER_ANIMATION)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("nextAnimIn", iTransmitKvData.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_ENTER_ANIMATION));
                    ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                    bundle.putInt("nextAnimIn", ra3.h0.a(jSONObject));
                } catch (org.json.JSONException unused) {
                }
            }
            if (allKeys.contains(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_EXIT_ANIMATION)) {
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("currentAnimOut", iTransmitKvData.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_EXIT_ANIMATION));
                    ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                    bundle.putInt("currentAnimOut", ra3.h0.b(jSONObject2));
                } catch (org.json.JSONException unused2) {
                }
            }
            if (allKeys.contains(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_EXTRA_DATA)) {
                bundle.putString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, iTransmitKvData.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_EXTRA_DATA));
            }
            new com.tencent.kinda.framework.widget.tools.ActivityController.LiteAppOnCloseListener() { // from class: com.tencent.kinda.framework.widget.tools.ActivityController.1
                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent) {
                    am.ri riVar = liteAppLifeCycleEvent.f54468g;
                    if (riVar.f7817a != 3 || !com.tencent.mm.sdk.platformtools.t8.D0(riVar.f7819c, bundle.getString("appId"))) {
                        return false;
                    }
                    com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                    org.json.JSONObject jSONObject3 = liteAppLifeCycleEvent.f54468g.f7818b;
                    if (jSONObject3 != null) {
                        dd.d.f228871a.b(jSONObject3, create);
                    }
                    iUIPage.notify(create);
                    iUIPage.onBack();
                    iUIPage.onDestroy();
                    dead();
                    return false;
                }
            }.alive();
        } else if (string.length() > 0) {
            bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_WEBVIEW, true);
            bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_WEBVIEW_URL, string);
        } else if (string2.length() > 0) {
            bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_TINYAPP, true);
            bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_TINYAPP_USERNAME, string2);
            bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_TINYAPP_PATH, string3);
            bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_TINYAPP_VERSION, string4);
            bundle.putInt(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_TINYAPP_TYPE, P2);
            bundle.putInt(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_TINYAPP_SCENE, i18);
            bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_TINYAPP_TRANSPARENT, bool);
        }
        intent.putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_BUNDLE, bundle);
        intent.putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.CHEEK_WALLET_LOCK, iTransmitKvData.getBool(com.tencent.kinda.framework.widget.tools.ConstantsKinda.CHEEK_WALLET_LOCK));
        if (isTopKindaActivity()) {
            com.tencent.mm.framework.app.UIPageFragmentActivity uIPageFragmentActivity = (com.tencent.mm.framework.app.UIPageFragmentActivity) currentActivity.get();
            uIPageFragmentActivity.getClass();
            uIPageFragmentActivity.T6(intent.getBundleExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_BUNDLE));
            boolean booleanExtra = intent.getBooleanExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.CHEEK_WALLET_LOCK, false);
            uIPageFragmentActivity.f68157m = booleanExtra;
            com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "check wallet lock %s", java.lang.Boolean.valueOf(booleanExtra));
            com.tencent.mars.xlog.Log.i(TAG, "startNewUIPage by onNewIntentForKinda.");
            return;
        }
        if (i17 == com.tencent.kinda.framework.widget.tools.ConstantsKinda.ENTER_ANIMATE_STYLE_SLIDE) {
            intent.putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_ENTER_ANIMATION, com.tencent.mm.R.anim.f477886ea);
        } else if (i17 == com.tencent.kinda.framework.widget.tools.ConstantsKinda.ENTER_ANIMATE_STYLE_POP) {
            intent.putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_ENTER_ANIMATION, com.tencent.mm.R.anim.f477876e0);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/kinda/framework/widget/tools/ActivityController", "startNewUIPage", "(Lcom/tencent/kinda/gen/IUIPage;Lcom/tencent/kinda/gen/ITransmitKvData;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/kinda/framework/widget/tools/ActivityController", "startNewUIPage", "(Lcom/tencent/kinda/gen/IUIPage;Lcom/tencent/kinda/gen/ITransmitKvData;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mars.xlog.Log.i(TAG, "startNewUIPage by a new activity.");
    }
}
