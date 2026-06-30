package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class r4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f198890h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r4(android.content.Context r8, zl2.u4 r9, int r10, p3321xbce91901.jvm.p3324x21ffc6bd.i r11) {
        /*
            r7 = this;
            r11 = 2
            r10 = r10 & r11
            if (r10 == 0) goto L6
            zl2.u4 r9 = zl2.u4.f555521d
        L6:
            r3 = r9
            java.lang.String r9 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r9)
            java.lang.String r9 = "uiMode"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r9)
            android.content.res.Resources r9 = r8.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            int r9 = r9.orientation
            if (r9 != r11) goto L20
            r9 = 1
            goto L21
        L20:
            r9 = 0
        L21:
            r2 = r9
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r4.<init>(android.content.Context, zl2.u4, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aoq;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int n() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.obi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) findViewById);
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.obk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) findViewById2);
        ng5.a.a((android.widget.ImageView) rootView.findViewById(com.p314xaae8f345.mm.R.id.hlm), c01.z1.r());
        ng5.a.a((android.widget.ImageView) rootView.findViewById(com.p314xaae8f345.mm.R.id.hlh), c01.z1.r());
        android.widget.ImageView imageView = (android.widget.ImageView) rootView.findViewById(com.p314xaae8f345.mm.R.id.r6c);
        if (imageView != null) {
            this.f198890h = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.q4(imageView, null), 3, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public boolean r() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        super.t();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f198890h;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }
}
