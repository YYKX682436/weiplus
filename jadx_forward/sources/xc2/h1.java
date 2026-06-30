package xc2;

/* loaded from: classes2.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f534686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f534687e;

    public h1(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f534686d = str;
        this.f534687e = abstractC14490x69736cb5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea;
        ya2.g gVar = ya2.h.f542017a;
        if (gVar.b(this.f534686d) != null || (m76760x76845fea = this.f534687e.getFeedObject().getFeedObject().m76760x76845fea()) == null) {
            return;
        }
        ya2.g.m(gVar, m76760x76845fea, false, 2, null);
    }
}
