package gk4;

/* loaded from: classes10.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.r f354122d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(gk4.r rVar) {
        super(1);
        this.f354122d = rVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        dk4.a aVar;
        hk4.a it = (hk4.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.String str = this.f354122d.f354135g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlayFinished, mediaId:");
        gk4.s sVar = it.f363462h;
        sb6.append((sVar == null || (aVar = sVar.f354162h) == null) ? null : aVar.f316015s);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        int a17 = gk4.r.a(this.f354122d, it);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354122d.f354135g, "onPlayFinished, status:" + this.f354122d.f354144p + ", playingPlayers.size:" + this.f354122d.f354139k.size() + ", playerMediaIndex:" + a17);
        if (a17 == this.f354122d.f354143o.size() - 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354122d.f354135g, "onPlayFinished last media");
            gk4.r rVar = this.f354122d;
            rVar.m();
            rVar.e();
            rVar.f354145q = 0L;
            yz5.a aVar2 = rVar.f354134f;
            if (aVar2 != null) {
                aVar2.mo152xb9724478();
            }
            if (rVar.f354147s && rVar.f354144p == gk4.e.f354076e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f354135g, "checkLoopStartOrPlayFinished loop to start");
                rVar.f354144p = gk4.e.f354075d;
                rVar.k();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f354135g, "checkLoopStartOrPlayFinished now play is finished");
            }
        }
        return jz5.f0.f384359a;
    }
}
