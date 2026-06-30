package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class w2 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final long f219259n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e3 f219260o;

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e3 e3Var, long j17) {
        this.f219260o = e3Var;
        this.f219259n = j17;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "DeleteServiceNotifyMsgTask";
    }

    @Override // p13.c
    public boolean i() {
        this.f219260o.f219050h.F(o13.d.f423752e, this.f219259n);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{MsgId: %d}", java.lang.Long.valueOf(this.f219259n));
    }
}
