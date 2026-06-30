package w21;

@j95.b
/* loaded from: classes12.dex */
public class p0 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public w21.g1 f523985d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.lb f523986e;

    /* renamed from: f, reason: collision with root package name */
    public tl.q0 f523987f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.s2 f523988g = new w21.n0(this);

    public static com.p314xaae8f345.mm.p2621x8fb0427b.lb Ai() {
        gm0.j1.b().c();
        if (wi().f523986e == null) {
            iz5.a.g("dataDB is null ", gm0.j1.u().f354686f != null);
            wi().f523986e = new com.p314xaae8f345.mm.p2621x8fb0427b.lb(gm0.j1.u().f354686f);
        }
        return wi().f523986e;
    }

    public static tl.q0 Bi() {
        gm0.j1.b().c();
        if (wi().f523987f == null) {
            wi().f523987f = tl.v0.f501680a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVoice", "getVoiceService %s", wi().f523987f.toString());
        return wi().f523987f;
    }

    public static w21.g1 Di() {
        gm0.j1.b().c();
        if (wi().f523985d == null) {
            iz5.a.g("dataDB is null ", gm0.j1.u().f354686f != null);
            wi().f523985d = new w21.g1(gm0.j1.u().f354686f);
        }
        return wi().f523985d;
    }

    public static w21.p0 wi() {
        return (w21.p0) i95.n0.c(w21.p0.class);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        tl.q0 Bi = Bi();
        Bi.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SceneVoiceService", "setAccountReady: true");
        Bi.f501628f = true;
        this.f523988g.m43071x58998cd();
        q25.b.b(new w21.o0(), "//voicetrymore");
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        if (wi().f523987f != null) {
            tl.q0 q0Var = wi().f523987f;
            q0Var.f501635p = 0;
            q0Var.f(true);
        }
        this.f523988g.m43072x2efc64();
        q25.b.c("//voicetrymore");
        tl.q0 Bi = Bi();
        Bi.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SceneVoiceService", "setAccountReady: false");
        Bi.f501628f = false;
    }
}
