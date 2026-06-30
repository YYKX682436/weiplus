package com.p314xaae8f345.mm.p1006xc5476f33.fts;

/* loaded from: classes12.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p13.c f219935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.b0 f219936e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p13.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.fts.b0 b0Var) {
        super(0);
        this.f219935d = cVar;
        this.f219936e = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add base search task:");
        p13.c cVar = this.f219935d;
        sb6.append(cVar.mo9544xfb82e301());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSThreadPoolQueue", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.fts.b0 b0Var = this.f219936e;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.b0.f(b0Var).add(cVar);
        b0Var.h();
        return jz5.f0.f384359a;
    }
}
