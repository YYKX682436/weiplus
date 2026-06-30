package go5;

/* loaded from: classes11.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public f25.m0 f355690a;

    /* renamed from: b, reason: collision with root package name */
    public final f25.f f355691b = new go5.y();

    public final boolean a() {
        f25.m0 m0Var = this.f355690a;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.t.f340645c, this.f355691b);
        this.f355690a = m96;
        if (m96 != null && ((g25.e) m96).f349513c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPAudioFocus", "requestAudioFocus: gain focus");
            ((jp5.o) i95.n0.c(jp5.o.class)).W6(false);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPAudioFocus", "requestAudioFocus: not gain focus");
        ((jp5.o) i95.n0.c(jp5.o.class)).W6(true);
        return false;
    }
}
