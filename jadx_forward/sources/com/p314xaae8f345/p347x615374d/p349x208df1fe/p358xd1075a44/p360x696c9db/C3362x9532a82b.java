package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db;

/* renamed from: com.tencent.kinda.framework.widget.tools.ActivityController */
/* loaded from: classes9.dex */
public class C3362x9532a82b {
    public static final java.lang.String TAG = "MicroMsg.ActivityController";

    /* renamed from: currentActivity */
    private static java.lang.ref.WeakReference<android.app.Activity> f13276x239d8ba8;

    /* renamed from: _hellAccFlag_ */
    private byte f13279x7f11beae;

    /* renamed from: fragmentPond */
    private static java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061> f13277x71ef4665 = new java.util.HashMap<>();

    /* renamed from: activityCreating */
    private static boolean f13275x380746e8 = false;

    /* renamed from: pendingList */
    private static java.util.List<java.lang.Integer> f13278x42580ad5 = new java.util.ArrayList();

    /* renamed from: com.tencent.kinda.framework.widget.tools.ActivityController$LiteAppOnCloseListener */
    /* loaded from: classes9.dex */
    public static abstract class LiteAppOnCloseListener extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3> {
        public LiteAppOnCloseListener() {
            super(com.p314xaae8f345.mm.app.a0.f134821d);
            this.f39173x3fe91575 = 1907495603;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: attach */
    public static void m27169xac1eee45(android.app.Activity activity) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "attach %s", activity);
        synchronized (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3362x9532a82b.class) {
            f13276x239d8ba8 = new java.lang.ref.WeakReference<>(activity);
            if (f13278x42580ad5.size() > 0) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3288xc3ba2d41 interfaceC3288xc3ba2d41 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3288xc3ba2d41) activity;
                if (activity.isFinishing()) {
                    return;
                }
                java.util.Iterator<java.lang.Integer> it = f13278x42580ad5.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061 = f13277x71ef4665.get(it.next());
                    if (abstractViewOnTouchListenerC3283x43ef4061 != null) {
                        interfaceC3288xc3ba2d41.mo26154x63908e11(abstractViewOnTouchListenerC3283x43ef4061);
                    }
                }
                f13278x42580ad5.clear();
            }
            f13275x380746e8 = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activityCreating has set false.");
        }
    }

    /* renamed from: attachOnlyActivity */
    public static void m27170xa70c0dc0(android.app.Activity activity) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "attachOnlyActivity %s", activity);
        synchronized (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3362x9532a82b.class) {
            f13276x239d8ba8 = new java.lang.ref.WeakReference<>(activity);
        }
    }

    /* renamed from: detach */
    public static void m27171xb06a1793(android.app.Activity activity) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "detach %s", activity);
        synchronized (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3362x9532a82b.class) {
            java.lang.ref.WeakReference<android.app.Activity> weakReference = f13276x239d8ba8;
            if (weakReference != null && activity == weakReference.get()) {
                f13276x239d8ba8 = null;
            }
            f13278x42580ad5.clear();
            f13275x380746e8 = false;
        }
    }

    /* renamed from: isTopKindaActivity */
    private static boolean m27172xe575af71() {
        java.lang.ref.WeakReference<android.app.Activity> weakReference = f13276x239d8ba8;
        return weakReference != null && (weakReference.get() instanceof com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) && f13276x239d8ba8.get().equals(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get());
    }

    /* renamed from: remove */
    public static void m27173xc84af884(com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810 abstractC3412xb0aa4810) {
        synchronized (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3362x9532a82b.class) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "remove modal: %s, %s", abstractC3412xb0aa4810.mo27603xea5dece5(), java.lang.Integer.valueOf(abstractC3412xb0aa4810.hashCode()));
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 remove = f13277x71ef4665.remove(java.lang.Integer.valueOf(abstractC3412xb0aa4810.hashCode()));
            if (remove != null) {
                p012xc85e97e9.p013x9d4bf30f.k mo7430x19263085 = remove.mo7430x19263085();
                if (mo7430x19263085 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3288xc3ba2d41) {
                    ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3288xc3ba2d41) mo7430x19263085).mo26157xed80c489(remove);
                }
            } else {
                for (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061 : f13277x71ef4665.values()) {
                    if (abstractViewOnTouchListenerC3283x43ef4061.mo25456xea5dece5().equals(abstractC3412xb0aa4810.mo27603xea5dece5())) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "remove same url modal");
                        p012xc85e97e9.p013x9d4bf30f.k mo7430x192630852 = abstractViewOnTouchListenerC3283x43ef4061.mo7430x19263085();
                        if (mo7430x192630852 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3288xc3ba2d41) {
                            ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3288xc3ba2d41) mo7430x192630852).mo26157xed80c489(abstractViewOnTouchListenerC3283x43ef4061);
                        }
                        return;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(965, 53);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "can't find associated activity");
            }
        }
    }

    /* renamed from: removeAll */
    public static void m27174x4c6f0a7d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "removeAllFragments");
        java.lang.ref.WeakReference<android.app.Activity> weakReference = f13276x239d8ba8;
        if (weakReference == null || weakReference.get() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "currentActivity is null, needn't remove any modal.");
            return;
        }
        android.app.Activity activity = f13276x239d8ba8.get();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "remove all modal");
        if (f13277x71ef4665.size() > 0) {
            f13277x71ef4665.clear();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(965, 52);
        }
        activity.finish();
    }

    /* renamed from: resetFlag */
    public static void m27175x789a515b() {
        f13275x380746e8 = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activityCreating has set false.");
    }

    /* renamed from: resolveFragment */
    public static com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 m27176x25eb1c5c(android.os.Bundle bundle) {
        int i17 = bundle.getInt(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13309x85915094, 0);
        if (f13277x71ef4665.containsKey(java.lang.Integer.valueOf(i17))) {
            return f13277x71ef4665.remove(java.lang.Integer.valueOf(i17));
        }
        return null;
    }

    /* renamed from: startNewUIModal */
    public static void m27177x42f2ccdb(com.p314xaae8f345.p347x615374d.gen.AbstractC3412xb0aa4810 abstractC3412xb0aa4810) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061;
        android.content.Intent intent;
        synchronized (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3362x9532a82b.class) {
            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27309x8d156af1().size() > 0) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27309x8d156af1().removeAllElements();
            }
            java.lang.ref.WeakReference<android.app.Activity> weakReference = f13276x239d8ba8;
            if (weakReference != null) {
                android.app.Activity activity = weakReference.get();
                if ((activity instanceof com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) && f13277x71ef4665.size() == 0) {
                    ((com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) activity).f149684d = true;
                }
            }
            int hashCode = abstractC3412xb0aa4810.hashCode();
            if (f13277x71ef4665.containsKey(java.lang.Integer.valueOf(hashCode))) {
                abstractViewOnTouchListenerC3283x43ef4061 = f13277x71ef4665.get(java.lang.Integer.valueOf(hashCode));
            } else {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3157xfaf573fd c3157xfaf573fd = new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3157xfaf573fd();
                c3157xfaf573fd.m25479xd2353f68(abstractC3412xb0aa4810);
                f13277x71ef4665.put(java.lang.Integer.valueOf(hashCode), c3157xfaf573fd);
                abstractViewOnTouchListenerC3283x43ef4061 = c3157xfaf573fd;
            }
            if (m27172xe575af71()) {
                ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3288xc3ba2d41) f13276x239d8ba8.get()).mo26154x63908e11(abstractViewOnTouchListenerC3283x43ef4061);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startNewUIModal by an existing activity.");
            } else {
                f13278x42580ad5.add(java.lang.Integer.valueOf(hashCode));
                if (f13275x380746e8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "startNewUIModal failed, because activityCreating is true!");
                    return;
                }
                android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
                if (context == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "startNewUIModal failed, because KindaContext get null!");
                    return;
                }
                f13275x380746e8 = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activityCreating has set true.");
                android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2.class);
                if ((context instanceof android.app.Activity) && (intent = ((android.app.Activity) context).getIntent()) != null) {
                    intent.putExtra(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f.f39353x639dcc24, true);
                }
                intent2.putExtra("key_support_swipe_back", false);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/kinda/framework/widget/tools/ActivityController", "startNewUIModal", "(Lcom/tencent/kinda/gen/IUIModal;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/kinda/framework/widget/tools/ActivityController", "startNewUIModal", "(Lcom/tencent/kinda/gen/IUIModal;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startNewUIModal by a new activity.");
            }
        }
    }

    /* renamed from: startNewUIPage */
    public static void m27178xc85b92a1(final com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc abstractC3414xaadd5ccc, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e, int i17) {
        int i18;
        android.app.Activity activity;
        android.content.Intent intent;
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27309x8d156af1().size() > 0) {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27309x8d156af1().removeAllElements();
        }
        java.lang.ref.WeakReference<android.app.Activity> weakReference = f13276x239d8ba8;
        if (weakReference != null) {
            android.app.Activity activity2 = weakReference.get();
            if (activity2 instanceof com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) {
                ((com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) activity2).f149684d = false;
            }
        }
        java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307("KindaWebViewURL");
        java.lang.String mo27551x2fec83072 = abstractC3411xcfaed72e.mo27551x2fec8307("KindaTinyAppUserName");
        java.lang.String mo27551x2fec83073 = abstractC3411xcfaed72e.mo27551x2fec8307("KindaTinyAppPath");
        java.lang.String mo27551x2fec83074 = abstractC3411xcfaed72e.mo27551x2fec8307("KindaTinyAppVersion");
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(abstractC3411xcfaed72e.mo27551x2fec8307("KindaTinyAppScene"), 0);
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(abstractC3411xcfaed72e.mo27551x2fec8307("KindaTinyAppType"), 0);
        boolean mo27542xfb7da360 = abstractC3411xcfaed72e.mo27542xfb7da360("KindaTinyAppTransparent");
        boolean mo27542xfb7da3602 = abstractC3411xcfaed72e.mo27542xfb7da360(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13297x9328e3f0);
        java.util.ArrayList<java.lang.String> mo27540xc99d6335 = abstractC3411xcfaed72e.mo27540xc99d6335();
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749 c3156x441ad749 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749();
        c3156x441ad749.f12616x55935a28 = i17;
        c3156x441ad749.m25452x8aea1a74(abstractC3414xaadd5ccc);
        f13277x71ef4665.put(java.lang.Integer.valueOf(abstractC3414xaadd5ccc.hashCode()), c3156x441ad749);
        if (m27172xe575af71()) {
            activity = f13276x239d8ba8.get();
            i18 = P;
            intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2.class);
            intent.addFlags(67108864);
        } else {
            i18 = P;
            activity = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
            if (activity == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "can't find valid activity");
                return;
            }
            intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2.class);
        }
        final android.os.Bundle bundle = new android.os.Bundle();
        android.content.Context context = activity;
        bundle.putInt(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13309x85915094, abstractC3414xaadd5ccc.hashCode());
        if (mo27542xfb7da3602) {
            bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13297x9328e3f0, true);
            bundle.putString("appId", abstractC3411xcfaed72e.mo27551x2fec8307(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd));
            bundle.putBoolean("isHalfScreen", abstractC3411xcfaed72e.mo27542xfb7da360(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13303xfe2b0e92));
            bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, abstractC3411xcfaed72e.mo27542xfb7da360(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63));
            bundle.putDouble("heightPercent", java.lang.Double.valueOf(abstractC3411xcfaed72e.mo27551x2fec8307(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13302x1788313c)).doubleValue());
            if (mo27540xc99d6335.contains(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714)) {
                bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, abstractC3411xcfaed72e.mo27551x2fec8307(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714));
            }
            if (mo27540xc99d6335.contains("query")) {
                bundle.putString("query", abstractC3411xcfaed72e.mo27551x2fec8307("query"));
            }
            if (mo27540xc99d6335.contains(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13304x269401dc)) {
                bundle.putString("minVersion", abstractC3411xcfaed72e.mo27551x2fec8307(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13304x269401dc));
            }
            if (mo27540xc99d6335.contains(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13299xd840884e)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("nextAnimIn", abstractC3411xcfaed72e.mo27551x2fec8307(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13299xd840884e));
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                    bundle.putInt("nextAnimIn", ra3.h0.a(jSONObject));
                } catch (org.json.JSONException unused) {
                }
            }
            if (mo27540xc99d6335.contains(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13300x5b49b5b2)) {
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("currentAnimOut", abstractC3411xcfaed72e.mo27551x2fec8307(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13300x5b49b5b2));
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                    bundle.putInt("currentAnimOut", ra3.h0.b(jSONObject2));
                } catch (org.json.JSONException unused2) {
                }
            }
            if (mo27540xc99d6335.contains(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13301xac1d9648)) {
                bundle.putString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, abstractC3411xcfaed72e.mo27551x2fec8307(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13301xac1d9648));
            }
            new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3362x9532a82b.LiteAppOnCloseListener() { // from class: com.tencent.kinda.framework.widget.tools.ActivityController.1
                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3) {
                    am.ri riVar = c5675xda3892c3.f136001g;
                    if (riVar.f89350a != 3 || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(riVar.f89352c, bundle.getString("appId"))) {
                        return false;
                    }
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                    org.json.JSONObject jSONObject3 = c5675xda3892c3.f136001g.f89351b;
                    if (jSONObject3 != null) {
                        dd.d.f310404a.b(jSONObject3, m27539xaf65a0fc);
                    }
                    abstractC3414xaadd5ccc.mo27658xc2079749(m27539xaf65a0fc);
                    abstractC3414xaadd5ccc.mo27659xc3977f66();
                    abstractC3414xaadd5ccc.mo27663xac79a11b();
                    mo48814x2efc64();
                    return false;
                }
            }.mo48813x58998cd();
        } else if (mo27551x2fec8307.length() > 0) {
            bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13317xd1443d36, true);
            bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13318xee032ac6, mo27551x2fec8307);
        } else if (mo27551x2fec83072.length() > 0) {
            bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13310x3a0f485e, true);
            bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13315x25cdeb97, mo27551x2fec83072);
            bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13311x3a055766, mo27551x2fec83073);
            bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13316x37b859d7, mo27551x2fec83074);
            bundle.putInt(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13314x3a07827b, P2);
            bundle.putInt(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13312x6d08d4b, i18);
            bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13313xfddbfad1, mo27542xfb7da360);
        }
        intent.putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13294x67f20f85, bundle);
        intent.putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13290xb4020418, abstractC3411xcfaed72e.mo27542xfb7da360(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13290xb4020418));
        if (m27172xe575af71()) {
            com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2 activityC10720x85cbbee2 = (com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) f13276x239d8ba8.get();
            activityC10720x85cbbee2.getClass();
            activityC10720x85cbbee2.T6(intent.getBundleExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13294x67f20f85));
            boolean booleanExtra = intent.getBooleanExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13290xb4020418, false);
            activityC10720x85cbbee2.f149690m = booleanExtra;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "check wallet lock %s", java.lang.Boolean.valueOf(booleanExtra));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startNewUIPage by onNewIntentForKinda.");
            return;
        }
        if (i17 == com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13293xc35eb0de) {
            intent.putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13295x54f0f6fa, com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea);
        } else if (i17 == com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13292x14b710be) {
            intent.putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13295x54f0f6fa, com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/kinda/framework/widget/tools/ActivityController", "startNewUIPage", "(Lcom/tencent/kinda/gen/IUIPage;Lcom/tencent/kinda/gen/ITransmitKvData;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/kinda/framework/widget/tools/ActivityController", "startNewUIPage", "(Lcom/tencent/kinda/gen/IUIPage;Lcom/tencent/kinda/gen/ITransmitKvData;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startNewUIPage by a new activity.");
    }
}
