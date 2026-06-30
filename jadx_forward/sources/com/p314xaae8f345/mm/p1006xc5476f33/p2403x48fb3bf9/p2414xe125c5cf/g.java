package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf;

/* loaded from: classes8.dex */
public class g implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public boolean f264944a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264945b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f264946c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a f264947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d f264948e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d dVar, java.lang.String str, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a aVar) {
        this.f264948e = dVar;
        this.f264945b = str;
        this.f264946c = i17;
        this.f264947d = aVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        if (this.f264944a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageGetA8Key", "ipcGetA8Key callbackCalled");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1653L, 13L, 1L, false);
            return;
        }
        this.f264944a = true;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d dVar = this.f264948e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGetA8Key", "ipcGetA8Key errType:%d, errCode:%d, errMsg:%s, destroyCalled:%b", valueOf, valueOf2, str, java.lang.Boolean.valueOf(dVar.f264929p));
        dVar.f264914a.remove(this.f264945b);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        if (!(fVar instanceof r45.s83)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d.a(this.f264948e, this.f264945b, this.f264946c, i17, i18, str, null, this.f264947d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageGetA8Key", "ipcGetA8Key call back resp is null");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d.a(this.f264948e, this.f264945b, this.f264946c, i17, i18, str, (r45.s83) fVar, this.f264947d);
        }
    }
}
