package el2;

/* loaded from: classes3.dex */
public final class j1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public final android.view.View.OnClickListener H;
    public android.widget.TextView I;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j1(android.content.Context r8, android.view.View.OnClickListener r9, zl2.u4 r10, int r11, p3321xbce91901.jvm.p3324x21ffc6bd.i r12) {
        /*
            r7 = this;
            r11 = r11 & 4
            if (r11 == 0) goto L6
            zl2.u4 r10 = zl2.u4.f555521d
        L6:
            r3 = r10
            java.lang.String r10 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r10)
            java.lang.String r10 = "onAddClick"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r10)
            java.lang.String r10 = "uiMode"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r10)
            r2 = 0
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.H = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: el2.j1.<init>(android.content.Context, android.view.View$OnClickListener, zl2.u4, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ams;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int J() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.fii);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.I = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.fik);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) findViewById2);
        android.widget.TextView textView = this.I;
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addBtn");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean Q() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 e0Var, boolean z17, int i17) {
        super.V(e0Var, z17, i17);
        android.widget.TextView textView = this.I;
        if (textView != null) {
            textView.setOnClickListener(this.H);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addBtn");
            throw null;
        }
    }
}
