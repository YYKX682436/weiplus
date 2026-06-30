package cw2;

/* loaded from: classes2.dex */
public final class z0 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f305660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9 f305661f;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9 c15175x44dff2e9) {
        this.f305660e = abstractC14490x69736cb5;
        this.f305661f = c15175x44dff2e9;
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "seeker@" + hashCode();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f305660e.B1(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9.E(this.f305661f, true, 0L, false, 6, null);
    }
}
