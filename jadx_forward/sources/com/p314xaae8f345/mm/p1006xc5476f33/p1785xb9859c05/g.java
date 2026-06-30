package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05;

/* loaded from: classes14.dex */
public class g implements com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j f223973a;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j jVar) {
        this.f223973a = jVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.e
    public boolean a() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.e
    public void b() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.e
    public void c(android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b abstractC18931xc27fcc5b) {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().c()) {
            abstractC18931xc27fcc5b.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h3d));
            return;
        }
        int H1 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(this.f223973a.f223989s);
        if (H1 <= 0) {
            H1 = 0;
        }
        abstractC18931xc27fcc5b.l(java.lang.String.format("%02d:%02d", java.lang.Integer.valueOf(H1 / 60), java.lang.Integer.valueOf(H1 % 60)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.e
    public void d() {
    }
}
