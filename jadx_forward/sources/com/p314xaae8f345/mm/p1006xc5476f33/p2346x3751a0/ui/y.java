package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui;

/* loaded from: classes.dex */
public final class y extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f258558e;

    public y(yz5.p onClickDelete) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClickDelete, "onClickDelete");
        this.f258558e = onClickDelete;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cge;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.w item = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.w) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i19 = item.f258546d;
        sb6.append(i19 != 2 ? i19 != 4 ? i19 != 8 ? i19 != 16 ? i19 != 32 ? "未知编码" : "Vcodec混分软编" : "Vcodec2软编" : "264硬编" : "265硬编" : "Vcodec软编");
        sb6.append("  ");
        int i27 = item.f258547e;
        sb6.append(i27 != 4 ? i27 != 6 ? i27 != 8 ? i27 != 10 ? i27 != 12 ? "未知分辨率" : "1920p" : "1280p" : "640p" : "480p" : "320p");
        sb6.append("  ");
        sb6.append(item.f258552m);
        sb6.append("kbps  ");
        sb6.append(item.f258548f);
        sb6.append("fps  ");
        sb6.append(item.f258550h);
        sb6.append((char) 31186);
        holder.s(com.p314xaae8f345.mm.R.id.o3b, sb6.toString());
        holder.p(com.p314xaae8f345.mm.R.id.f565572ct2).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.x(this, holder, item));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
