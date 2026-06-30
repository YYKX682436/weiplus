package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes3.dex */
public final class i0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0 f148872e;

    public i0(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0 n0Var) {
        this.f148872e = n0Var;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.elk;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.j0 item = (com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.j0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) holder.p(com.p314xaae8f345.mm.R.id.t3n);
        boolean z18 = item.f148875d;
        com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0 n0Var = this.f148872e;
        if (z18) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(relativeLayout);
            com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0.U6(n0Var, relativeLayout, 0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(relativeLayout);
            com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0.U6(n0Var, relativeLayout, es.h.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 20));
        }
        relativeLayout.setOnClickListener(new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.h0(n0Var));
        ((android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.h6y)).setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d7i);
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.k3s)).setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ob_));
    }
}
