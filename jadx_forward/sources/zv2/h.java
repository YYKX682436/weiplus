package zv2;

/* loaded from: classes8.dex */
public final class h implements uc0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zv2.m f557939a;

    public h(zv2.m mVar) {
        this.f557939a = mVar;
    }

    @Override // uc0.p
    public final void a(java.lang.String str) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7;
        zv2.m mVar = this.f557939a;
        mVar.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, mVar.f557945h) && (c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b) != null) {
            c19783xd9a946b7.m76397xda56dec(1);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = mVar.f557930f;
        if (c19786x6a1e2862 != null) {
            c19786x6a1e2862.m76570xc2385d6(str);
        }
        uc0.v vVar = mVar.f557946i;
        mVar.f557947m = vVar != null ? vVar.f507819f : -1;
        mVar.f557948n = vVar != null ? vVar.f507820g : -1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786.c(mVar.f557929e, str, false, 2, null);
        mVar.o(str);
    }
}
