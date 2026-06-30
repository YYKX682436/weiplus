package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class vx implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f192467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f192468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f192469f;

    public vx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var) {
        this.f192467d = pzVar;
        this.f192468e = abstractC14490x69736cb5;
        this.f192469f = s0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 99) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = this.f192467d;
            java.util.List<E> m56392xfc5c33e5 = pzVar.C.m56392xfc5c33e5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f192468e;
            int indexOf = m56392xfc5c33e5.indexOf(abstractC14490x69736cb5);
            if (indexOf >= 0) {
                bd2.r.f100817a.e(pzVar.f190288g, abstractC14490x69736cb5.getFeedObject().m59251x5db1b11(), abstractC14490x69736cb5.w(), abstractC14490x69736cb5.getFeedObject().m59276x6c285d75(), abstractC14490x69736cb5.getFeedObject().m59311x25315bf4(), this.f192469f);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("feed_uninterest_clk", this.f192469f.f3639x46306858, null, 24617);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pzVar.U, "[not interested] pos error=" + indexOf + ", feed=" + abstractC14490x69736cb5 + ", dataList=" + m56392xfc5c33e5);
        }
    }
}
