package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class wm extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public vd2.v5 f186417e;

    /* renamed from: f, reason: collision with root package name */
    public r45.qt2 f186418f;

    public static final void o(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.lang.String str, in5.s0 s0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wm wmVar) {
        int i17 = !c0Var.f391645d ? 1 : 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReservedNoticeItemConvert", "CgiFinderAudienceReserveLiveNotification do op=" + i17);
        az2.j Ni = ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Ni(str, 2, i17, null, 10, 0L);
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        Ni.t(context, s0Var.f374654e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 500L);
        Ni.l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.vm(h0Var, i17, wmVar, s0Var, str));
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ebo;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a9  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r25, in5.c r26, int r27, int r28, boolean r29, java.util.List r30) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wm.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    public final void n(in5.s0 s0Var, r45.c32 c32Var, java.lang.String str) {
        r45.fw4 fw4Var;
        r45.fw4 fw4Var2;
        android.widget.TextView textView = (android.widget.TextView) s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.ulb);
        android.widget.TextView textView2 = (android.widget.TextView) s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.toz);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.uc7);
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.tmq);
        android.widget.TextView textView3 = (android.widget.TextView) s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.tmr);
        android.widget.ImageView imageView2 = (android.widget.ImageView) s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.tmp);
        int h17 = i65.a.h(imageView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        int h18 = i65.a.h(textView3.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        android.content.Context context = s0Var.f374654e;
        c1073x7e08a787.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.jm(c1073x7e08a787, h17, h18, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl) * 2, textView3));
        c1073x7e08a787.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.km(str, s0Var));
        ya2.b2 b17 = ya2.h.f542017a.b(str);
        java.lang.String str2 = null;
        boolean z17 = false;
        if (b17 != null) {
            if (!(b17.D0().length() > 0)) {
                b17 = null;
            }
            if (b17 != null) {
                if (b17.m176700xe5e0d2a0().length() > 0) {
                    mn2.g1 g1Var = mn2.g1.f411508a;
                    g1Var.a().c(new mn2.n(b17.m176700xe5e0d2a0(), null, 2, null), imageView, g1Var.h(mn2.f1.f411490h));
                }
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String w07 = b17.w0();
                ((ke0.e) xVar).getClass();
                textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, w07));
                if (imageView2 != null) {
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    zy2.tb.a(ya2.m1.f542044a, imageView2, b17.f69300x731cac1b, 0, 4, null);
                }
            }
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        if (c32Var != null && (fw4Var2 = (r45.fw4) c32Var.m75936x14adae67(1)) != null) {
            str2 = fw4Var2.m75945x2fec8307(1);
        }
        textView.setText(str2);
        textView2.setVisibility(0);
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        if (c32Var != null && (fw4Var = (r45.fw4) c32Var.m75936x14adae67(1)) != null && fw4Var.m75933x41a8a7f2(2)) {
            z17 = true;
        }
        if (z17) {
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.nkl);
        } else {
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.nkj);
        }
        textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.lm(this, s0Var, c32Var, str));
    }
}
