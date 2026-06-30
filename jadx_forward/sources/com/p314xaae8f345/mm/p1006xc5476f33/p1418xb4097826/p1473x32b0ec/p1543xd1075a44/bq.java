package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class bq extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public android.widget.TextView H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f199447J;
    public yz5.a K;
    public java.lang.CharSequence L;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bq(android.content.Context r8, gk2.e r9, boolean r10, int r11, p3321xbce91901.jvm.p3324x21ffc6bd.i r12) {
        /*
            r7 = this;
            r11 = r11 & 4
            if (r11 == 0) goto L5
            r10 = 0
        L5:
            r2 = r10
            java.lang.String r10 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r10)
            java.lang.String r10 = "buContext"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r10)
            r3 = 0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 4
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bq.<init>(android.content.Context, gk2.e, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e8r;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int J() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        a0(this.f199716e.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.d1x));
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.sfg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.ui.fk.b((android.widget.TextView) findViewById);
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.sfc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.H = textView;
        com.p314xaae8f345.mm.ui.fk.b(textView);
        android.widget.TextView textView2 = this.H;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("guidePanelCancelBtn");
            throw null;
        }
        textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zp(this));
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.sff);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById3;
        this.I = textView3;
        com.p314xaae8f345.mm.ui.fk.b(textView3);
        android.widget.TextView textView4 = this.I;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("guidePanelSendBtn");
            throw null;
        }
        textView4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.aq(this));
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.sfe);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f199447J = (android.widget.TextView) findViewById4;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean Q() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 e0Var, boolean z17, int i17) {
        super.V(e0Var, z17, i17);
        android.widget.TextView textView = this.f199447J;
        if (textView != null) {
            textView.setText(this.L);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("guidePanelSampleContentTv");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void s(boolean z17) {
        super.s(z17);
        this.L = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean w() {
        return zl2.r4.f555483a.Y1(this.f199716e);
    }
}
