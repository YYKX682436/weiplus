package com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/setting/MuteModeService$VolumeBroadcastReceiver", "Landroid/content/BroadcastReceiver;", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.setting.MuteModeService$VolumeBroadcastReceiver */
/* loaded from: classes5.dex */
public final class C10681xf0c095ab extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public cl5.n f149335a;

    public C10681xf0c095ab(java.lang.ref.WeakReference weakEventHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakEventHandler, "weakEventHandler");
        this.f149335a = new cl5.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MuteModeService", "streamType:%s", java.lang.Integer.valueOf(intExtra));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("android.media.VOLUME_CHANGED_ACTION", intent.getAction())) {
            if (intExtra == 3 || intExtra == 0) {
                int intExtra2 = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                int intExtra3 = intent.getIntExtra("android.media.EXTRA_PREV_VOLUME_STREAM_VALUE", 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MuteModeService", "VolumeBroadcastReceiver volume:%s, preVolume:%s", java.lang.Integer.valueOf(intExtra2), java.lang.Integer.valueOf(intExtra3));
                java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
                if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
                    java.lang.ref.WeakReference j17 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
                    activity = j17 != null ? (android.app.Activity) j17.get() : null;
                }
                if (intExtra2 <= intExtra3 || j65.e.h()) {
                    i17 = 29254;
                    r47 = 1;
                } else {
                    if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                        i17 = 29254;
                        z17 = true;
                        if (this.f149335a == null) {
                            this.f149335a = new cl5.n();
                        }
                        cl5.n nVar = this.f149335a;
                        if ((nVar != null ? nVar.f124532d : null) == null) {
                            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.djs, (android.view.ViewGroup) null);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
                            android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.kwj);
                            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                            aVar.pk(inflate, "care_mode_temp_voice_hint");
                            aVar.rj(inflate);
                            aVar.ik(inflate, 32, 29254);
                            button.setOnClickListener(new vd0.z1(this));
                            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568864ob2);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
                            android.widget.TextView textView = (android.widget.TextView) findViewById;
                            com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
                            textView.setTextSize(0, i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz) * i65.a.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
                            android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.oa_);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
                            ((android.widget.TextView) findViewById2).setTextSize(0, i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3) * i65.a.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
                            button.setTextSize(0, i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3) * i65.a.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
                            android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.h5n);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById3;
                            android.view.ViewGroup.LayoutParams layoutParams = c22699x3dcdb352.getLayoutParams();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
                            layoutParams2.topMargin = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                            if (i65.a.E(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                                layoutParams2.topMargin = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1);
                            }
                            layoutParams2.gravity = 48;
                            c22699x3dcdb352.setLayoutParams(layoutParams2);
                            this.f149335a.f124532d = inflate;
                        }
                        android.view.View view = this.f149335a.f124530b;
                        if (!(view != null && view.getVisibility() == 0)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MuteModeService", "show pushBanner!!");
                            cl5.n nVar2 = this.f149335a;
                            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                            boolean C = com.p314xaae8f345.mm.ui.bk.C();
                            boolean a17 = hq.b.a();
                            nVar2.getClass();
                            if (nVar2.f124529a == null) {
                                java.lang.Object systemService = context2.getSystemService("window");
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                                nVar2.f124529a = new cl5.a((android.view.WindowManager) systemService);
                            }
                            if (nVar2.f124530b == null) {
                                nVar2.f124538j = new android.view.GestureDetector(context2, nVar2.f124539k);
                                android.view.View inflate2 = android.view.LayoutInflater.from(context2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570904dk0, (android.view.ViewGroup) null, false);
                                nVar2.f124530b = inflate2;
                                nVar2.f124531c = (android.view.ViewGroup) (inflate2 != null ? inflate2.findViewById(com.p314xaae8f345.mm.R.id.hxy) : null);
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
                                android.view.ViewGroup viewGroup = nVar2.f124531c;
                                if (viewGroup != null) {
                                    viewGroup.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563760bc0);
                                }
                            } else if (C) {
                                android.view.ViewGroup viewGroup2 = nVar2.f124531c;
                                if (viewGroup2 != null) {
                                    viewGroup2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.czw);
                                }
                            } else {
                                android.view.ViewGroup viewGroup3 = nVar2.f124531c;
                                if (viewGroup3 != null) {
                                    viewGroup3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d5y);
                                }
                            }
                            android.view.ViewGroup viewGroup4 = nVar2.f124531c;
                            if (viewGroup4 != null) {
                                viewGroup4.setElevation(ym5.x.a(context2, 10.0f));
                                android.view.View view2 = nVar2.f124532d;
                                if (view2 != null) {
                                    android.view.ViewParent parent = view2.getParent();
                                    if (parent != null) {
                                        ((android.view.ViewGroup) parent).removeView(nVar2.f124532d);
                                    }
                                    viewGroup4.addView(nVar2.f124532d);
                                }
                            }
                            com.p314xaae8f345.mm.ui.yk.c("PushBanner", "initView: ", new java.lang.Object[0]);
                            android.view.View view3 = nVar2.f124530b;
                            if (view3 != null) {
                                view3.setOnTouchListener(new cl5.f(nVar2, view3));
                            }
                            android.view.View view4 = nVar2.f124530b;
                            if (view4 != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                                arrayList.add(4);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/ui/widget/banner/PushBanner", "showBanner", "(Landroid/content/Context;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                                yj0.a.f(view4, "com/tencent/mm/ui/widget/banner/PushBanner", "showBanner", "(Landroid/content/Context;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                android.view.ViewManager viewManager = nVar2.f124529a;
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
                            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574143lx1);
                            java.lang.String a18 = n25.a.a();
                            ((sb0.f) iVar).getClass();
                            i17 = 29254;
                            z18 = true;
                            com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.R6(activity, 38, string, null, false, true, a18);
                        } else {
                            i17 = 29254;
                            z18 = true;
                            ((ft.e) i95.n0.c(ft.e.class)).m7(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.p2052x633fb29.C17357xe1a9af2c(3));
                        }
                        z17 = z18;
                    }
                    ((vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class))).Ri(0);
                    r47 = z17;
                }
                if (intExtra2 == 0 && j65.e.h()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MuteModeService", "recover mute mode !!");
                    ((vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class))).Bi(r47);
                    ((vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class))).getClass();
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5724xdcb7b1da c5724xdcb7b1da = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5724xdcb7b1da();
                    c5724xdcb7b1da.f136047g.f88782a = false;
                    c5724xdcb7b1da.e();
                    if (activity != null) {
                        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activity);
                        e4Var.f293309c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lxa);
                        e4Var.b(com.p314xaae8f345.mm.R.raw.f80350xb902fbc6);
                        e4Var.c();
                    } else {
                        ((ft.e) i95.n0.c(ft.e.class)).m7(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.p2052x633fb29.C17357xe1a9af2c(r47));
                    }
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("care_mode_recover_quite_state_source", java.lang.Integer.valueOf((int) r47));
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("care_mode_recover_quite_state", hashMap, i17);
                }
            }
        }
    }
}
