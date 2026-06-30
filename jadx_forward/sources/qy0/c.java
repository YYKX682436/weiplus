package qy0;

/* loaded from: classes5.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.C11004x58386388 f449100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.C11004x58386388 c11004x58386388) {
        super(1);
        this.f449100d = c11004x58386388;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String musicId = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.C11004x58386388 c11004x58386388 = this.f449100d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(musicId, ((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) ((n0.q4) c11004x58386388.f151278g).mo128745x754a37bb()).m33856x92013dca())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMMusicManager", "switch music: current play music is " + musicId + ", no need to switch");
        } else {
            c11004x58386388.a(musicId);
        }
        return jz5.f0.f384359a;
    }
}
