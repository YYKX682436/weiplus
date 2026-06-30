package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class o2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f197176a;

    /* renamed from: b, reason: collision with root package name */
    public final km2.m f197177b;

    public o2(long j17, km2.m mVar) {
        this.f197176a = j17;
        this.f197177b = mVar;
    }

    /* renamed from: equals */
    public boolean m57203xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.o2)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.o2 o2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.o2) obj;
        return this.f197176a == o2Var.f197176a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f197177b, o2Var.f197177b);
    }

    /* renamed from: hashCode */
    public int m57204x8cdac1b() {
        int hashCode = java.lang.Long.hashCode(this.f197176a) * 31;
        km2.m mVar = this.f197177b;
        return hashCode + (mVar == null ? 0 : mVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m57205x9616526c() {
        return "LoadMoreInfo(loadMoreCostMs=" + this.f197176a + ", firstLiveData=" + this.f197177b + ')';
    }

    public /* synthetic */ o2(long j17, km2.m mVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? 0L : j17, (i17 & 2) != 0 ? null : mVar);
    }
}
