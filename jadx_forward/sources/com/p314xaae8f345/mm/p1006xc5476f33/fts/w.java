package com.p314xaae8f345.mm.p1006xc5476f33.fts;

/* loaded from: classes12.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p13.c f219930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f219931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p13.c f219932f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f219933g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.b0 f219934h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p13.c cVar, int i17, p13.c cVar2, int i18, com.p314xaae8f345.mm.p1006xc5476f33.fts.b0 b0Var) {
        super(0);
        this.f219930d = cVar;
        this.f219931e = i17;
        this.f219932f = cVar2;
        this.f219933g = i18;
        this.f219934h = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add base search task:");
        p13.c cVar = this.f219930d;
        sb6.append(cVar.mo9544xfb82e301());
        sb6.append('|');
        sb6.append(this.f219931e);
        sb6.append(" current:");
        sb6.append(this.f219932f.mo9544xfb82e301());
        sb6.append('|');
        sb6.append(this.f219933g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSThreadPoolQueue", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.fts.b0 b0Var = this.f219934h;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.b0.f(b0Var).add(cVar);
        b0Var.h();
        return jz5.f0.f384359a;
    }
}
