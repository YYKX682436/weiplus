package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public class nr extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl f185653e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f185654f;

    public nr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl contract) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contract, "contract");
        this.f185653e = contract;
        this.f185654f = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.lr.f185477d);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b4i;
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.f564906ah4);
        jz5.g gVar = this.f185654f;
        android.view.ViewGroup.LayoutParams layoutParams = p17.getLayoutParams();
        layoutParams.height = a06.d.b((((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() / 16.0f) * 9.0f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNewStyleBigCardConvert", "onCreateViewHolder: screenWidth=" + ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() + ", height=" + layoutParams.height);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ah7);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl n() {
        return this.f185653e;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x038a  */
    @Override // in5.r
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r23, so2.u1 r24, int r25, int r26, boolean r27, java.util.List r28) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.nr.h(in5.s0, so2.u1, int, int, boolean, java.util.List):void");
    }
}
