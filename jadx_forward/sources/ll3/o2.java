package ll3;

@j95.b(m140513x1e06fd29 = {bl3.e.class, c42.i.class})
/* loaded from: classes11.dex */
public class o2 extends i95.w implements cl3.e {

    /* renamed from: d, reason: collision with root package name */
    public ql3.b f400738d;

    /* renamed from: e, reason: collision with root package name */
    public ql3.d f400739e;

    public static ql3.b Ai() {
        if (wi().f400738d == null) {
            wi().f400738d = new ql3.b(gm0.j1.u().f354686f);
        }
        return wi().f400738d;
    }

    public static ql3.d Bi() {
        if (wi().f400739e == null) {
            wi().f400739e = new ql3.d(gm0.j1.u().f354686f);
        }
        return wi().f400739e;
    }

    public static ll3.o2 wi() {
        return (ll3.o2) i95.n0.c(ll3.o2.class);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        kl3.e eVar = kl3.t.g().f390377e;
        ((kl3.o) eVar).f390369a = kl3.t.f390376g;
        eVar.mo143620x316510();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        synchronized (kl3.t.class) {
            kl3.t tVar = kl3.t.f390376g;
            if (tVar != null) {
                tVar.i();
            }
        }
        if (sl3.b.f490785b == null) {
            synchronized (sl3.b.class) {
                if (sl3.b.f490785b == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerCoreService", "create");
                    sl3.b.f490785b = new sl3.b(null);
                }
            }
        }
        sl3.b.f490785b.f490786a.remove(kl3.i.class);
        this.f400738d = null;
        this.f400739e = null;
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        kl3.z zVar = new kl3.z();
        synchronized (kl3.t.class) {
            if (kl3.t.f390376g != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicPlayerManager", "music player mgr is init, don't it again");
                kl3.t.f390376g.f390377e = zVar;
            } else {
                kl3.t.f390376g = new kl3.t(zVar);
            }
        }
        sl3.b.a(kl3.i.class, zVar);
        sl3.b.a(kl3.h.class, new pl3.e());
    }
}
