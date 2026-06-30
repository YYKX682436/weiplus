package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class je extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f185279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185280e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je(int i17, in5.s0 s0Var) {
        super(0);
        this.f185279d = i17;
        this.f185280e = s0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f185279d;
        in5.s0 s0Var = this.f185280e;
        if (i17 != 3) {
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vf vfVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vf) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vf.class);
            vfVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1462x365338.C13928xc82087f4 c13928xc82087f4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1462x365338.C13928xc82087f4(vfVar.m158354x19263085(), null, 0, 6, null);
            c13928xc82087f4.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rf.f217328d);
            if (vfVar.O6() && c13928xc82087f4.visibilityManager.O6(c13928xc82087f4.f190598e)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FULL_FINGER_LIKE_FEED_GUIDE_INT;
                int r17 = c17.r(u3Var, 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFingerLikeGuideUIC", "[checkGuide] count=" + r17);
                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(vfVar.m158354x19263085());
                c13928xc82087f4.addView(linearLayout);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                linearLayout.setBackgroundColor(vfVar.m80379x76847179().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77909xe61cad90));
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(vfVar.m158354x19263085(), null);
                int dimension = (int) vfVar.m158354x19263085().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561193bx);
                linearLayout.addView(c22789xd23e9a9b, new android.widget.LinearLayout.LayoutParams(dimension, dimension));
                android.widget.TextView textView = new android.widget.TextView(vfVar.m158354x19263085());
                textView.setText(vfVar.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mha));
                textView.setTextColor(-1);
                textView.setTextSize(1, 17.0f);
                com.p314xaae8f345.mm.ui.fk.a(textView);
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                layoutParams.topMargin = (int) vfVar.m158354x19263085().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                linearLayout.addView(textView, layoutParams);
                c22789xd23e9a9b.m82583xcde73672(-1);
                c22789xd23e9a9b.o(((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Z0().r()).booleanValue());
                if (c22789xd23e9a9b.getUseRfx()) {
                    c22789xd23e9a9b.mo82566x3e3ac3e8(com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77390x243906(vfVar.m80379x76847179().getAssets(), "finder_full_like_guide.pag"));
                } else {
                    c22789xd23e9a9b.mo82568x3e3ac3e8(org.p3363xbe4143f1.C29690xfae77312.m154715x243906(vfVar.m80379x76847179().getAssets(), "finder_full_like_guide.pag"));
                }
                c22789xd23e9a9b.g();
                android.view.View decorView = vfVar.m158354x19263085().getWindow().getDecorView();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
                ((android.widget.FrameLayout) decorView).addView(c13928xc82087f4, new android.widget.FrameLayout.LayoutParams(-1, -1));
                linearLayout.setClickable(false);
                linearLayout.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sf(vfVar, linearLayout));
                c13928xc82087f4.setVisibility(0);
                linearLayout.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tf(c13928xc82087f4, vfVar), 3000L);
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FULL_FINGER_LIKE_FEED_GUIDE_LAST_TIME_LONG, java.lang.Long.valueOf(c01.id.a()));
            }
        } else {
            android.content.Context context2 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vf vfVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vf) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vf.class);
            vfVar2.getClass();
            if (vfVar2.P6()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3(vfVar2.m80379x76847179());
                e3Var.f213492f.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563072cu1);
                android.view.View inflate = android.view.LayoutInflater.from(s0Var.f374654e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dqi, (android.view.ViewGroup) null);
                android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.b0z);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(button);
                com.p314xaae8f345.mm.ui.fk.a(button);
                button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uf(e3Var));
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
                com.p314xaae8f345.mm.ui.fk.a(textView2);
                android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.rqs);
                if (com.p314xaae8f345.mm.ui.bk.C()) {
                    if (imageView != null) {
                        imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cxd);
                    }
                } else if (imageView != null) {
                    imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cxe);
                }
                e3Var.f213508y.addView(inflate, 0);
                e3Var.a();
                e3Var.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FULL_FINGER_LIKE_FEED_DIALOG_GUIDE_INT, 1);
            }
        }
        return jz5.f0.f384359a;
    }
}
