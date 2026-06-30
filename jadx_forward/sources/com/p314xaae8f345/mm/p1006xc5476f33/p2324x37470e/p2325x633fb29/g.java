package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n f257123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f257124e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n nVar, yz5.a aVar) {
        super(0);
        this.f257123d = nVar;
        this.f257124e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompositionExporter", "export: canceled");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n nVar = this.f257123d;
        rm5.v vVar = nVar.f257228n;
        if (vVar != null) {
            vVar.f479126u = null;
        }
        yz5.l lVar = nVar.f257227m;
        if (lVar != null) {
            lVar.mo146xb9724478(new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z(false, true, true, 0, false, false, false, 120, null));
        }
        nVar.f257227m = null;
        yz5.a aVar = this.f257124e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
