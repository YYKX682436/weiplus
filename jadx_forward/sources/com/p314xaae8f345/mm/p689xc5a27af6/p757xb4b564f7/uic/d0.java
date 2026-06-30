package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes8.dex */
public final class d0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final db0.e f148860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0 f148861f;

    public d0(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0 n0Var, db0.e eVar) {
        this.f148861f = n0Var;
        this.f148860e = eVar;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.elk;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.e0 item = (com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.e0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        db0.e eVar = this.f148860e;
        if (eVar != null) {
            eVar.a(item, i17);
        }
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) holder.p(com.p314xaae8f345.mm.R.id.t3n);
        boolean z18 = item.f148864e;
        com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0 n0Var = this.f148861f;
        if (z18) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(relativeLayout);
            com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0.U6(n0Var, relativeLayout, 0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(relativeLayout);
            com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0.U6(n0Var, relativeLayout, es.h.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 20));
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.h6y);
        com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2 = item.f148863d;
        if (c10597xb1f0d2.f148127o) {
            imageView.setColorFilter(b3.l.m9702x7444d5ad(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.f560355i7), android.graphics.PorterDuff.Mode.SRC_IN);
        } else {
            imageView.setColorFilter((android.graphics.ColorFilter) null);
        }
        if (c10597xb1f0d2.f148127o && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c10597xb1f0d2.f148119d, com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0.f148891i)) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c1n);
        } else {
            n11.a b17 = n11.a.b();
            java.lang.String str = c10597xb1f0d2.f148122g;
            java.lang.Object mo141623x754a37bb = ((jz5.n) com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0.f148890h).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            b17.h(str, imageView, (o11.g) mo141623x754a37bb);
        }
        holder.p(com.p314xaae8f345.mm.R.id.f566831h75).setOnClickListener(new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.c0(n0Var, item));
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.k3s)).setText(c10597xb1f0d2.f148121f);
    }
}
