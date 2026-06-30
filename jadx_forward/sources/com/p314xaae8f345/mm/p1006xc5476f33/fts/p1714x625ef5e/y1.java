package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class y1 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final long f219275n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 f219276o;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 l2Var, long j17) {
        this.f219276o = l2Var;
        this.f219275n = j17;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "DeleteMessageTask";
    }

    @Override // p13.c
    public boolean i() {
        this.f219276o.f219142h.F(o13.d.f423748a, this.f219275n);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{MsgId: %d}", java.lang.Long.valueOf(this.f219275n));
    }
}
