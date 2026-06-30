package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12090xc6e2452b f162391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6 f162392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162393f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162394g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f162395h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.r f162396i;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.r rVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12090xc6e2452b c12090xc6e2452b, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6 o6Var, java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        this.f162396i = rVar;
        this.f162391d = c12090xc6e2452b;
        this.f162392e = o6Var;
        this.f162393f = str;
        this.f162394g = str2;
        this.f162395h = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenSingleStickerView", "start showSinglePage");
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12090xc6e2452b c12090xc6e2452b = this.f162391d;
        yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.plugin.appbrand.jsapi.emoji.q$$a
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.q qVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.q.this;
                qVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12090xc6e2452b c12090xc6e2452b2 = c12090xc6e2452b;
                c12090xc6e2452b2.f162370d = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenSingleStickerView", "close emoji page, finishProcess");
                qVar.f162396i.m50420x7b736e5c(c12090xc6e2452b2);
                return null;
            }
        };
        m50421x3c6fed6a = this.f162396i.m50421x3c6fed6a();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) this.f162392e).pj(m50421x3c6fed6a, this.f162393f, this.f162394g, 42, null, null, 1000042, java.lang.Boolean.valueOf(this.f162395h), aVar, aVar, aVar);
    }
}
