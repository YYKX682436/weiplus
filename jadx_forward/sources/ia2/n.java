package ia2;

/* loaded from: classes2.dex */
public final class n implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 f371485d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3) {
        this.f371485d = activityC13656x51707ca3;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        android.view.ViewTreeObserver viewTreeObserver;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String string;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3 = this.f371485d;
        if (!activityC13656x51707ca3.V) {
            activityC13656x51707ca3.V = true;
            activityC13656x51707ca3.m78563x4e0f6657(false);
            if (activityC13656x51707ca3.C && !activityC13656x51707ca3.D) {
                java.lang.ref.WeakReference weakReference = activityC13656x51707ca3.f183314u;
                android.app.Activity activity = weakReference != null ? (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) weakReference.get() : null;
                if (activity == null) {
                    activity = activityC13656x51707ca3.m81186xd24c19fa();
                }
                com.p314xaae8f345.mm.ui.bl.c(activity == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : activity);
                com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                java.lang.System.nanoTime();
                if (!com.p314xaae8f345.mm.ui.bk.y() && !com.p314xaae8f345.mm.ui.bk.Q()) {
                    com.p314xaae8f345.mm.ui.bk.A();
                }
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                com.p314xaae8f345.mm.ui.bl.b(activity);
                com.p314xaae8f345.mm.ui.bl.c(activity);
                com.p314xaae8f345.mm.ui.bl.g(activity);
                gx2.q qVar = activityC13656x51707ca3.f183309J;
                if (qVar != null) {
                    qVar.m132476xe4d36290(activityC13656x51707ca3.j7(activity));
                }
            }
            double d17 = activityC13656x51707ca3.f183324z1;
            float a17 = d17 <= 0.0d ? ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 191.0f) : (float) (ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 86.0f) + d17);
            if (!activityC13656x51707ca3.D) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderFlutterPOIActivity", "initViews: updatePeekHeight " + a17);
                gx2.q qVar2 = activityC13656x51707ca3.f183309J;
                if (qVar2 != null) {
                    qVar2.p(a17);
                }
                gx2.q qVar3 = activityC13656x51707ca3.f183309J;
                if (qVar3 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.b(qVar3, false, null, false, null, 14, null);
                }
                android.view.View view = new android.view.View(activityC13656x51707ca3.m81186xd24c19fa());
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 58.0f));
                layoutParams.gravity = 80;
                view.setLayoutParams(layoutParams);
                view.setBackground(activityC13656x51707ca3.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cyh, null));
                activityC13656x51707ca3.K = view;
                gx2.q qVar4 = activityC13656x51707ca3.f183309J;
                if (qVar4 != null) {
                    qVar4.addView(view);
                }
            }
            if (activityC13656x51707ca3.L && !activityC13656x51707ca3.D) {
                android.content.Context m81186xd24c19fa = activityC13656x51707ca3.m81186xd24c19fa();
                if (m81186xd24c19fa == null) {
                    m81186xd24c19fa = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                }
                int c17 = com.p314xaae8f345.mm.ui.bl.c(m81186xd24c19fa);
                android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                int i18 = b17.x;
                int i19 = b17.y;
                java.lang.System.nanoTime();
                boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
                java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                if (z17) {
                    i17 = i19 - c17;
                } else {
                    if (i19 >= i18) {
                        i18 = i19;
                    }
                    i17 = i18 - c17;
                }
                float f17 = i17 * 0.25f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderFlutterPOIActivity", "initViews: setTran " + f17);
                gx2.q qVar5 = activityC13656x51707ca3.f183309J;
                if (qVar5 != null) {
                    qVar5.isSettling = true;
                    android.view.animation.Interpolator loadInterpolator = android.view.animation.AnimationUtils.loadInterpolator(qVar5.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559355cg);
                    qVar5.a();
                    android.view.View view2 = qVar5.f213465d;
                    if (view2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
                        throw null;
                    }
                    android.view.ViewPropertyAnimator translationX = qVar5.c() ? view2.animate().translationX(f17) : view2.animate().translationY(f17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(translationX);
                    translationX.setDuration(0L).setInterpolator(loadInterpolator).setUpdateListener(new gx2.t(qVar5, f17)).setListener(new gx2.u(qVar5)).start();
                }
                activityC13656x51707ca3.q7(true);
            }
            yz5.l lVar = activityC13656x51707ca3.M;
            if (lVar != null) {
            }
            if (activityC13656x51707ca3.f183315v == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderFlutterPOIActivity", "setupFlutter: isFinderHalfScreen=" + activityC13656x51707ca3.D + ", showTakeCar=" + activityC13656x51707ca3.E + ", showETA=" + activityC13656x51707ca3.F);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                byte[] p76 = activityC13656x51707ca3.p7();
                if (p76 != null) {
                    linkedHashMap.put(java.lang.String.valueOf(com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23877x641165a8.f42499x4b5929a3.getRaw()), p76);
                }
                bw5.ah0 ah0Var = activityC13656x51707ca3.f183323z;
                byte[] mo14344x5f01b1f6 = ah0Var != null ? ah0Var.mo14344x5f01b1f6() : null;
                if (mo14344x5f01b1f6 != null) {
                    linkedHashMap.put(java.lang.String.valueOf(com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23877x641165a8.f42501xc47c200d.getRaw()), mo14344x5f01b1f6);
                }
                linkedHashMap.put(java.lang.String.valueOf(com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23877x641165a8.f42498x978ab754.getRaw()), java.lang.Boolean.valueOf(activityC13656x51707ca3.A));
                linkedHashMap.put(java.lang.String.valueOf(com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23877x641165a8.f42500x2b26903f.getRaw()), java.lang.Boolean.valueOf(activityC13656x51707ca3.D));
                linkedHashMap.put(java.lang.String.valueOf(com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23877x641165a8.f42502x4f025aa6.getRaw()), java.lang.Boolean.valueOf(activityC13656x51707ca3.E));
                linkedHashMap.put(java.lang.String.valueOf(com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23877x641165a8.f42492x8c961173.getRaw()), activityC13656x51707ca3.i7(false));
                linkedHashMap.put(java.lang.String.valueOf(com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23877x641165a8.f42493x2afc15b1.getRaw()), activityC13656x51707ca3.i7(true));
                linkedHashMap.put(java.lang.String.valueOf(com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23877x641165a8.f42496x643a5c57.getRaw()), java.lang.Boolean.valueOf(activityC13656x51707ca3.F));
                linkedHashMap.put(java.lang.String.valueOf(com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23877x641165a8.f42491x8113fc4a.getRaw()), java.lang.Integer.valueOf(activityC13656x51707ca3.G));
                java.lang.String valueOf = java.lang.String.valueOf(com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23877x641165a8.f42494xc29aabd7.getRaw());
                bw5.yg0 yg0Var = new bw5.yg0();
                r45.f96 f96Var = activityC13656x51707ca3.f183317x;
                java.lang.String str6 = "";
                if (f96Var == null || (str = f96Var.m75945x2fec8307(17)) == null) {
                    str = "";
                }
                yg0Var.f117013e = str;
                boolean[] zArr = yg0Var.f117017i;
                int i27 = 2;
                zArr[2] = true;
                yg0Var.f117015g = activityC13656x51707ca3.D1;
                zArr[4] = true;
                java.lang.Integer num = activityC13656x51707ca3.E1;
                yg0Var.f117016h = num != null ? num.intValue() : 0;
                zArr[5] = true;
                r45.f96 f96Var2 = activityC13656x51707ca3.f183317x;
                if (f96Var2 == null || (str2 = f96Var2.m75945x2fec8307(5)) == null) {
                    str2 = "";
                }
                yg0Var.f117012d = str2;
                zArr[1] = true;
                yg0Var.f117014f = activityC13656x51707ca3.D ? 2 : 1;
                zArr[3] = true;
                byte[] mo14344x5f01b1f62 = yg0Var.mo14344x5f01b1f6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f62, "toByteArray(...)");
                linkedHashMap.put(valueOf, mo14344x5f01b1f62);
                java.lang.String valueOf2 = java.lang.String.valueOf(com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23877x641165a8.f42497x80ca629b.getRaw());
                r45.f96 f96Var3 = activityC13656x51707ca3.f183317x;
                if (f96Var3 == null || (str3 = f96Var3.m75945x2fec8307(5)) == null) {
                    str3 = "";
                }
                bw5.zg0 zg0Var = new bw5.zg0();
                android.os.Bundle bundleExtra = activityC13656x51707ca3.getIntent().getBundleExtra("poi_from_chat_report_bundle");
                if (bundleExtra != null && (string = bundleExtra.getString("poi_from_chat_name")) != null) {
                    str6 = string;
                }
                zg0Var.f117515d = str6;
                boolean[] zArr2 = zg0Var.f117523o;
                zArr2[1] = true;
                zg0Var.f117517f = bundleExtra != null ? bundleExtra.getInt("poi_from_chat_type") : 0;
                zArr2[3] = true;
                zg0Var.f117516e = bundleExtra != null ? bundleExtra.getInt("poi_from_user_type") : 0;
                zArr2[2] = true;
                boolean z18 = bundleExtra != null ? bundleExtra.getBoolean("poi_from_chat_is_nearby", false) : false;
                activityC13656x51707ca3.f183310l1 = z18;
                if (z18) {
                    i27 = 1;
                } else if (r26.i0.y(str3, "UgcPoiEx_", false)) {
                    i27 = 3;
                }
                zg0Var.f117519h = i27;
                zArr2[5] = true;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("poiAttrType:");
                sb6.append(i27);
                sb6.append(", poiId=");
                sb6.append(str3);
                sb6.append(", poiName=");
                r45.f96 f96Var4 = activityC13656x51707ca3.f183317x;
                sb6.append(f96Var4 != null ? f96Var4.m75945x2fec8307(3) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderFlutterPOIActivity", sb6.toString());
                byte[] mo14344x5f01b1f63 = zg0Var.mo14344x5f01b1f6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f63, "toByteArray(...)");
                linkedHashMap.put(valueOf2, mo14344x5f01b1f63);
                linkedHashMap.put(java.lang.String.valueOf(com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23877x641165a8.f42495xc65397ea.getRaw()), java.lang.Boolean.valueOf(activityC13656x51707ca3.C));
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a), null, null, new ia2.b0(activityC13656x51707ca3, linkedHashMap, null), 3, null);
            }
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) activityC13656x51707ca3.findViewById(com.p314xaae8f345.mm.R.id.rl7);
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(activityC13656x51707ca3.f183321y0);
        }
        activityC13656x51707ca3.f183321y0 = null;
    }
}
