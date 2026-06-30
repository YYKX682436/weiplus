package com.tencent.mm.feature.setting;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/setting/MuteModeService$VolumeBroadcastReceiver", "Landroid/content/BroadcastReceiver;", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MuteModeService$VolumeBroadcastReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public cl5.n f67802a;

    public MuteModeService$VolumeBroadcastReceiver(java.lang.ref.WeakReference weakEventHandler) {
        kotlin.jvm.internal.o.g(weakEventHandler, "weakEventHandler");
        this.f67802a = new cl5.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [int, boolean] */
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.app.Activity activity;
        int i17;
        ?? r47;
        boolean z17;
        boolean z18;
        if (context == null || intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1);
        com.tencent.mars.xlog.Log.i("MuteModeService", "streamType:%s", java.lang.Integer.valueOf(intExtra));
        if (kotlin.jvm.internal.o.b("android.media.VOLUME_CHANGED_ACTION", intent.getAction())) {
            if (intExtra == 3 || intExtra == 0) {
                int intExtra2 = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                int intExtra3 = intent.getIntExtra("android.media.EXTRA_PREV_VOLUME_STREAM_VALUE", 0);
                com.tencent.mars.xlog.Log.i("MuteModeService", "VolumeBroadcastReceiver volume:%s, preVolume:%s", java.lang.Integer.valueOf(intExtra2), java.lang.Integer.valueOf(intExtra3));
                java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
                if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
                    java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
                    activity = j17 != null ? (android.app.Activity) j17.get() : null;
                }
                if (intExtra2 <= intExtra3 || j65.e.h()) {
                    i17 = 29254;
                    r47 = 1;
                } else {
                    if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                        i17 = 29254;
                        z17 = true;
                        if (this.f67802a == null) {
                            this.f67802a = new cl5.n();
                        }
                        cl5.n nVar = this.f67802a;
                        if ((nVar != null ? nVar.f42999d : null) == null) {
                            android.view.View inflate = com.tencent.mm.ui.id.b(com.tencent.mm.sdk.platformtools.x2.f193071a).inflate(com.tencent.mm.R.layout.djs, (android.view.ViewGroup) null);
                            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
                            android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.kwj);
                            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                            aVar.pk(inflate, "care_mode_temp_voice_hint");
                            aVar.rj(inflate);
                            aVar.ik(inflate, 32, 29254);
                            button.setOnClickListener(new vd0.z1(this));
                            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f487331ob2);
                            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                            android.widget.TextView textView = (android.widget.TextView) findViewById;
                            com.tencent.mm.ui.bk.s0(textView.getPaint());
                            textView.setTextSize(0, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479850gz) * i65.a.m(com.tencent.mm.sdk.platformtools.x2.f193071a));
                            android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.oa_);
                            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
                            ((android.widget.TextView) findViewById2).setTextSize(0, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479628b3) * i65.a.m(com.tencent.mm.sdk.platformtools.x2.f193071a));
                            button.setTextSize(0, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479628b3) * i65.a.m(com.tencent.mm.sdk.platformtools.x2.f193071a));
                            android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.h5n);
                            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
                            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
                            android.view.ViewGroup.LayoutParams layoutParams = weImageView.getLayoutParams();
                            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
                            layoutParams2.topMargin = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479688cn);
                            if (i65.a.E(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                                layoutParams2.topMargin = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479706d1);
                            }
                            layoutParams2.gravity = 48;
                            weImageView.setLayoutParams(layoutParams2);
                            this.f67802a.f42999d = inflate;
                        }
                        android.view.View view = this.f67802a.f42997b;
                        if (!(view != null && view.getVisibility() == 0)) {
                            com.tencent.mars.xlog.Log.i("MuteModeService", "show pushBanner!!");
                            cl5.n nVar2 = this.f67802a;
                            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            kotlin.jvm.internal.o.f(context2, "getContext(...)");
                            boolean C = com.tencent.mm.ui.bk.C();
                            boolean a17 = hq.b.a();
                            nVar2.getClass();
                            if (nVar2.f42996a == null) {
                                java.lang.Object systemService = context2.getSystemService("window");
                                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                                nVar2.f42996a = new cl5.a((android.view.WindowManager) systemService);
                            }
                            if (nVar2.f42997b == null) {
                                nVar2.f43005j = new android.view.GestureDetector(context2, nVar2.f43006k);
                                android.view.View inflate2 = android.view.LayoutInflater.from(context2).inflate(com.tencent.mm.R.layout.f489371dk0, (android.view.ViewGroup) null, false);
                                nVar2.f42997b = inflate2;
                                nVar2.f42998c = (android.view.ViewGroup) (inflate2 != null ? inflate2.findViewById(com.tencent.mm.R.id.hxy) : null);
                            }
                            android.view.WindowManager.LayoutParams layoutParams3 = new android.view.WindowManager.LayoutParams();
                            layoutParams3.type = android.os.Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
                            layoutParams3.flags = 2621992;
                            layoutParams3.format = -3;
                            layoutParams3.packageName = context2.getPackageName();
                            layoutParams3.gravity = 49;
                            layoutParams3.width = -1;
                            layoutParams3.height = -2;
                            if (!a17) {
                                android.view.ViewGroup viewGroup = nVar2.f42998c;
                                if (viewGroup != null) {
                                    viewGroup.setBackgroundResource(com.tencent.mm.R.drawable.f482227bc0);
                                }
                            } else if (C) {
                                android.view.ViewGroup viewGroup2 = nVar2.f42998c;
                                if (viewGroup2 != null) {
                                    viewGroup2.setBackgroundResource(com.tencent.mm.R.drawable.czw);
                                }
                            } else {
                                android.view.ViewGroup viewGroup3 = nVar2.f42998c;
                                if (viewGroup3 != null) {
                                    viewGroup3.setBackgroundResource(com.tencent.mm.R.drawable.d5y);
                                }
                            }
                            android.view.ViewGroup viewGroup4 = nVar2.f42998c;
                            if (viewGroup4 != null) {
                                viewGroup4.setElevation(ym5.x.a(context2, 10.0f));
                                android.view.View view2 = nVar2.f42999d;
                                if (view2 != null) {
                                    android.view.ViewParent parent = view2.getParent();
                                    if (parent != null) {
                                        ((android.view.ViewGroup) parent).removeView(nVar2.f42999d);
                                    }
                                    viewGroup4.addView(nVar2.f42999d);
                                }
                            }
                            com.tencent.mm.ui.yk.c("PushBanner", "initView: ", new java.lang.Object[0]);
                            android.view.View view3 = nVar2.f42997b;
                            if (view3 != null) {
                                view3.setOnTouchListener(new cl5.f(nVar2, view3));
                            }
                            android.view.View view4 = nVar2.f42997b;
                            if (view4 != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                arrayList.add(4);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/ui/widget/banner/PushBanner", "showBanner", "(Landroid/content/Context;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                                yj0.a.f(view4, "com/tencent/mm/ui/widget/banner/PushBanner", "showBanner", "(Landroid/content/Context;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                android.view.ViewManager viewManager = nVar2.f42996a;
                                if (viewManager != null) {
                                    viewManager.addView(view4, layoutParams3);
                                }
                                view4.post(new cl5.l(nVar2, view4));
                            }
                            new cl5.m(nVar2).sendEmptyMessageDelayed(0, 8000L);
                        }
                    } else {
                        if (activity != null) {
                            tb0.i iVar = (tb0.i) i95.n0.c(tb0.i.class);
                            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492610lx1);
                            java.lang.String a18 = n25.a.a();
                            ((sb0.f) iVar).getClass();
                            i17 = 29254;
                            z18 = true;
                            com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.R6(activity, 38, string, null, false, true, a18);
                        } else {
                            i17 = 29254;
                            z18 = true;
                            ((ft.e) i95.n0.c(ft.e.class)).m7(new com.tencent.mm.plugin.setting.model.ShowMuteModeToastEvent(3));
                        }
                        z17 = z18;
                    }
                    ((vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class))).Ri(0);
                    r47 = z17;
                }
                if (intExtra2 == 0 && j65.e.h()) {
                    com.tencent.mars.xlog.Log.i("MuteModeService", "recover mute mode !!");
                    ((vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class))).Bi(r47);
                    ((vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class))).getClass();
                    com.tencent.mm.autogen.events.MuteModePlayChangeEvent muteModePlayChangeEvent = new com.tencent.mm.autogen.events.MuteModePlayChangeEvent();
                    muteModePlayChangeEvent.f54514g.f7249a = false;
                    muteModePlayChangeEvent.e();
                    if (activity != null) {
                        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
                        e4Var.f211776c = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.lxa);
                        e4Var.b(com.tencent.mm.R.raw.icons_outlined_volume_mute);
                        e4Var.c();
                    } else {
                        ((ft.e) i95.n0.c(ft.e.class)).m7(new com.tencent.mm.plugin.setting.model.ShowMuteModeToastEvent(r47));
                    }
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("care_mode_recover_quite_state_source", java.lang.Integer.valueOf((int) r47));
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("care_mode_recover_quite_state", hashMap, i17);
                }
            }
        }
    }
}
