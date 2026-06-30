package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes7.dex */
public class z extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160844d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f160845e;

    /* renamed from: f, reason: collision with root package name */
    public final int f160846f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f160847g = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f160848h = false;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f160844d = k0Var;
        this.f160845e = lVar;
        this.f160846f = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.u
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.JsApiDestroyInstanceAudio", "runTask");
        this.f160848h = n01.c.b(this.f160847g);
        super.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.JsApiDestroyInstanceAudio", "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f160845e;
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.JsApiDestroyInstanceAudio", "server is null");
            return;
        }
        boolean z17 = this.f160848h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160844d;
        int i17 = this.f160846f;
        if (z17) {
            lVar.a(i17, k0Var.o("fail"));
        } else {
            lVar.a(i17, k0Var.o("ok"));
        }
    }
}
