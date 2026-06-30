package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class wm extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public vd2.v5 f104884e;

    /* renamed from: f, reason: collision with root package name */
    public r45.qt2 f104885f;

    public static final void o(kotlin.jvm.internal.c0 c0Var, java.lang.String str, in5.s0 s0Var, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.convert.wm wmVar) {
        int i17 = !c0Var.f310112d ? 1 : 2;
        com.tencent.mars.xlog.Log.i("FinderLiveReservedNoticeItemConvert", "CgiFinderAudienceReserveLiveNotification do op=" + i17);
        az2.j Ni = ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Ni(str, 2, i17, null, 10, 0L);
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        Ni.t(context, s0Var.f293121e.getResources().getString(com.tencent.mm.R.string.f9y), 500L);
        Ni.l().K(new com.tencent.mm.plugin.finder.convert.vm(h0Var, i17, wmVar, s0Var, str));
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ebo;
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.wm.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    public final void n(in5.s0 s0Var, r45.c32 c32Var, java.lang.String str) {
        r45.fw4 fw4Var;
        r45.fw4 fw4Var2;
        android.widget.TextView textView = (android.widget.TextView) s0Var.itemView.findViewById(com.tencent.mm.R.id.ulb);
        android.widget.TextView textView2 = (android.widget.TextView) s0Var.itemView.findViewById(com.tencent.mm.R.id.toz);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) s0Var.itemView.findViewById(com.tencent.mm.R.id.uc7);
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.itemView.findViewById(com.tencent.mm.R.id.tmq);
        android.widget.TextView textView3 = (android.widget.TextView) s0Var.itemView.findViewById(com.tencent.mm.R.id.tmr);
        android.widget.ImageView imageView2 = (android.widget.ImageView) s0Var.itemView.findViewById(com.tencent.mm.R.id.tmp);
        int h17 = i65.a.h(imageView.getContext(), com.tencent.mm.R.dimen.f479688cn);
        int h18 = i65.a.h(textView3.getContext(), com.tencent.mm.R.dimen.f479688cn);
        android.content.Context context = s0Var.f293121e;
        constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.finder.convert.jm(constraintLayout, h17, h18, i65.a.h(context, com.tencent.mm.R.dimen.f479646bl) * 2, textView3));
        constraintLayout.setOnClickListener(new com.tencent.mm.plugin.finder.convert.km(str, s0Var));
        ya2.b2 b17 = ya2.h.f460484a.b(str);
        java.lang.String str2 = null;
        boolean z17 = false;
        if (b17 != null) {
            if (!(b17.D0().length() > 0)) {
                b17 = null;
            }
            if (b17 != null) {
                if (b17.getAvatarUrl().length() > 0) {
                    mn2.g1 g1Var = mn2.g1.f329975a;
                    g1Var.a().c(new mn2.n(b17.getAvatarUrl(), null, 2, null), imageView, g1Var.h(mn2.f1.f329957h));
                }
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String w07 = b17.w0();
                ((ke0.e) xVar).getClass();
                textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, w07));
                if (imageView2 != null) {
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    zy2.tb.a(ya2.m1.f460511a, imageView2, b17.field_authInfo, 0, 4, null);
                }
            }
        }
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        if (c32Var != null && (fw4Var2 = (r45.fw4) c32Var.getCustom(1)) != null) {
            str2 = fw4Var2.getString(1);
        }
        textView.setText(str2);
        textView2.setVisibility(0);
        com.tencent.mm.ui.fk.a(textView2);
        if (c32Var != null && (fw4Var = (r45.fw4) c32Var.getCustom(1)) != null && fw4Var.getBoolean(2)) {
            z17 = true;
        }
        if (z17) {
            textView2.setText(com.tencent.mm.R.string.nkl);
        } else {
            textView2.setText(com.tencent.mm.R.string.nkj);
        }
        textView2.setOnClickListener(new com.tencent.mm.plugin.finder.convert.lm(this, s0Var, c32Var, str));
    }
}
