package t03;

/* loaded from: classes11.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t03.e f495968d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t03.e eVar) {
        super(0);
        this.f495968d = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        f25.n0 n0Var = (f25.n0) i95.n0.c(f25.n0.class);
        t03.e eVar = this.f495968d;
        f25.m0 m96 = n0Var.m9(eVar.f495974b, new t03.c(eVar));
        g25.e eVar2 = (g25.e) m96;
        boolean z17 = eVar2.f349513c;
        f25.l0 l0Var = eVar.f495974b;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterPlayerAudioFocusController", "requestFocus success " + eVar.hashCode() + ", currentLockFocusScene: " + eVar2.f349514d + ", scene: " + l0Var.f340637a);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterPlayerAudioFocusController", "requestFocus fail " + eVar.hashCode() + ", scene: " + l0Var.f340637a);
        }
        eVar.f495975c = m96;
        return jz5.f0.f384359a;
    }
}
