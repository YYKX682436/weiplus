package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3;

/* loaded from: classes2.dex */
public final class g extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f211192e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f211193f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewOutlineProvider f211194g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.f();

    public g(int i17, java.lang.String str) {
        this.f211192e = i17;
        this.f211193f = str;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.du8;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.e item = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.e) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.s1k);
        int i19 = this.f211192e;
        if (i19 != 0) {
            imageView.getLayoutParams().width = i19;
            imageView.getLayoutParams().height = i19;
        }
        r45.eb1 eb1Var = item.f211191d;
        boolean m75933x41a8a7f2 = eb1Var.m75933x41a8a7f2(2);
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (!m75933x41a8a7f2 || hc2.l.g(this.f211193f)) {
            vo0.d l17 = g1Var.l();
            mn2.n nVar = new mn2.n(eb1Var.m75945x2fec8307(0), null, 2, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            l17.c(nVar, imageView, g1Var.h(mn2.f1.f411494o));
            return;
        }
        vo0.d b17 = g1Var.b();
        mn2.e0 e0Var = new mn2.e0(eb1Var.m75945x2fec8307(0), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        b17.c(e0Var, imageView, g1Var.h(mn2.f1.f411490h));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.s1k);
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(this.f211194g);
    }
}
