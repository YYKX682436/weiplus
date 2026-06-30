package wj5;

/* loaded from: classes5.dex */
public final class a0 extends wj5.c {

    /* renamed from: e, reason: collision with root package name */
    public final yj5.a0 f528308e;

    public a0(yb5.d ui6, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d tipsBarContext, yj5.a0 processor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsBarContext, "tipsBarContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processor, "processor");
        this.f528308e = processor;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d17;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        xj5.l item = (xj5.l) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        o(holder, item, i17, i18, z17, list);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.hjz);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.olw);
        c22699x3dcdb352.s(item.f536443u, item.f536444v);
        textView.setText(item.f536445w);
        long min = java.lang.Math.min(java.lang.Math.max(c01.id.c() - item.f536446x, 0L), 5000L);
        yj5.a0 a0Var = this.f528308e;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 q17 = a0Var.f280113d.q();
        java.lang.Runnable runnable = a0Var.f544238g;
        q17.mo50300x3fa464aa(runnable);
        a0Var.f280113d.q().mo50297x7c4d7ca2(runnable, min);
    }

    @Override // wj5.c, in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
