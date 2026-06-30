package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes7.dex */
public class v extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f160823e;

    public v(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f160822d = str;
        this.f160823e = lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void b() {
        java.util.Map map = jh1.a.f381328d;
        ((java.util.concurrent.ConcurrentHashMap) map).put(this.f160822d, java.lang.Boolean.TRUE);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.JsApiCreateAudioInstance", "onDestroy, appId:%s", this.f160822d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.w();
        wVar.f160828f = 2;
        wVar.f160826d = this.f160822d;
        java.lang.System.currentTimeMillis();
        wVar.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(this.f160822d, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.x.f160831g.remove(this.f160822d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d dVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f160823e;
        java.lang.String str = this.f160822d;
        dVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioInstanceContext", "removeBufferURLManager");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c1 c1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c1) dVar.f160707e.remove(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d1 H = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v) lVar.mo50357xcd94f799().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v.class)).H();
        if (c1Var == null || H == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.a) H;
        synchronized (aVar.f165496a) {
            aVar.f165496a.remove(c1Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 w0Var) {
        java.lang.String str = this.f160822d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.JsApiCreateAudioInstance", "onPause, appId:%s", str);
        ((java.util.concurrent.ConcurrentHashMap) jh1.a.f381328d).put(str, java.lang.Boolean.FALSE);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.w();
        wVar.f160828f = 1;
        wVar.f160826d = str;
        wVar.c();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void g() {
        java.util.Map map = jh1.a.f381328d;
        ((java.util.concurrent.ConcurrentHashMap) map).put(this.f160822d, java.lang.Boolean.TRUE);
    }
}
