package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1072x7474f0bb;

/* loaded from: classes7.dex */
public final class b implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h f161561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f161562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f161563f;

    public b(com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h hVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f161561d = hVar;
        this.f161562e = h0Var;
        this.f161563f = c11510xdd90c2f2;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWebViewUseFastLoad", "appId:" + str + ", state:" + bVar);
        if (bVar == u81.b.BACKGROUND) {
            com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h hVar = this.f161561d;
            if (hVar != null) {
                java.lang.Object obj = this.f161562e.f391656d;
                java.lang.String obj2 = obj != null ? obj.toString() : null;
                if (obj2 == null) {
                    obj2 = "";
                }
                hVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(obj2));
            }
            this.f161563f.S();
            u81.h hVar2 = this.f161563f.N;
            if (hVar2 != null) {
                hVar2.c(this);
            }
        }
    }
}
