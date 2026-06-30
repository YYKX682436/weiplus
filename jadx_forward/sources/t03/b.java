package t03;

/* loaded from: classes11.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t03.e f495962d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(t03.e eVar) {
        super(0);
        this.f495962d = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("abandonFocus ");
        t03.e eVar = this.f495962d;
        sb6.append(eVar.hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterPlayerAudioFocusController", sb6.toString());
        f25.m0 m0Var = eVar.f495975c;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
            eVar.f495975c = null;
        }
        return jz5.f0.f384359a;
    }
}
