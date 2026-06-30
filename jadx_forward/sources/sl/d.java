package sl;

/* loaded from: classes12.dex */
public class d implements tl.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sl.j f490554a;

    public d(sl.j jVar) {
        this.f490554a = jVar;
    }

    @Override // tl.f
    public void a() {
        sl.j jVar = this.f490554a;
        fl.a aVar = jVar.f490573m;
        aVar.v();
        if (aVar.f345222o) {
            f25.m0 m0Var = aVar.f345219l;
            if (m0Var != null) {
                ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
            }
            aVar.f345219l = null;
            aVar.f345222o = false;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(jVar.f490569i);
        jVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "setError abandon focus, needFocusOnPlay: %s, hasAudioFocus: %s", valueOf, java.lang.Boolean.FALSE);
        if (jVar.f490575o != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new sl.c(this));
        }
    }
}
