package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b;

/* loaded from: classes7.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj1.y f165802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fh1.z f165803e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(fj1.y yVar, fh1.z zVar) {
        super(0);
        this.f165802d = yVar;
        this.f165803e = zVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recreateCallback old bizInstanceName: ");
        fj1.y yVar = this.f165802d;
        sb6.append(yVar.f344676c.f165787i);
        sb6.append(" update ");
        fh1.z zVar = this.f165803e;
        sb6.append(zVar.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAMagicBrushFrameLauncher", sb6.toString());
        yVar.f344676c.f165787i = zVar.c();
        return jz5.f0.f384359a;
    }
}
