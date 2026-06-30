package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class f0 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public boolean f219058n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f219059o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219060p;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, java.lang.String str) {
        this.f219060p = lVar;
        this.f219059o = str;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "MarkContactTimestampTask";
    }

    @Override // p13.c
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar = this.f219060p;
        java.util.HashMap hashMap = lVar.f219124m;
        java.lang.String str = this.f219059o;
        if (hashMap.containsKey(str)) {
            this.f219058n = true;
            return true;
        }
        if (!lVar.f219123i.add(str)) {
            this.f219058n = true;
            return true;
        }
        if (!lVar.p(((com.p314xaae8f345.mm.p1006xc5476f33.fts.p) lVar.f219122h).a(str))) {
            this.f219058n = true;
            return true;
        }
        w13.b bVar = lVar.f219121g;
        bVar.f423737o.m107799x37fbf859(1, 2L);
        bVar.f423737o.m107801x35198eae(2, str);
        bVar.f423737o.m107799x37fbf859(3, 0L);
        bVar.f423737o.m107867xb158f775();
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{username: %s isSkipped: %b}", this.f219059o, java.lang.Boolean.valueOf(this.f219058n));
    }
}
