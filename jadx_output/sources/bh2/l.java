package bh2;

/* loaded from: classes10.dex */
public final class l implements bh2.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.trtc.TRTCCloud f20875a;

    /* renamed from: b, reason: collision with root package name */
    public final ah2.e f20876b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20877c;

    /* renamed from: d, reason: collision with root package name */
    public om2.s f20878d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f20879e;

    /* renamed from: f, reason: collision with root package name */
    public bh2.j f20880f;

    /* renamed from: g, reason: collision with root package name */
    public bh2.j f20881g;

    public l(com.tencent.trtc.TRTCCloud trtcCloud, ah2.e service) {
        kotlin.jvm.internal.o.g(trtcCloud, "trtcCloud");
        kotlin.jvm.internal.o.g(service, "service");
        this.f20875a = trtcCloud;
        this.f20876b = service;
        this.f20877c = android.view.View.generateViewId();
        this.f20879e = "KTVBgmPlayer";
    }

    @Override // bh2.c
    public void a(float f17) {
        bh2.j jVar = this.f20880f;
        if (jVar != null) {
            jVar.f20873g.f20875a.getAudioEffectManager().setMusicPitch(jVar.f20868b.f20850a, f17);
        }
        bh2.j jVar2 = this.f20881g;
        if (jVar2 != null) {
            jVar2.f20873g.f20875a.getAudioEffectManager().setMusicPitch(jVar2.f20868b.f20850a, f17);
        }
    }

    @Override // bh2.c
    public void b(bh2.w channel, om2.s songData) {
        kotlin.jvm.internal.o.g(channel, "channel");
        kotlin.jvm.internal.o.g(songData, "songData");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("KTVBgmPlayer_");
        om2.s sVar = this.f20878d;
        bh2.j jVar = null;
        sb6.append(sVar != null ? sVar.a() : null);
        sb6.append('_');
        int i17 = this.f20877c;
        sb6.append(i17);
        this.f20879e = sb6.toString();
        this.f20878d = songData;
        java.lang.String a17 = songData.a();
        int generateViewId = android.view.View.generateViewId() + i17;
        om2.q qVar = songData.f346380c;
        this.f20880f = new bh2.j(this, a17, new bh2.a(generateViewId, qVar.f346373b));
        java.lang.String str = qVar.f346374c;
        if (str != null) {
            bh2.j jVar2 = qVar.f346372a ? new bh2.j(this, songData.a(), new bh2.a(i17 + android.view.View.generateViewId(), str)) : null;
            if (jVar2 != null) {
                jVar = jVar2;
            }
        }
        this.f20881g = jVar;
        bh2.j jVar3 = this.f20880f;
        if (jVar3 != null) {
            jVar3.g();
        }
        bh2.j jVar4 = this.f20881g;
        if (jVar4 != null) {
            jVar4.g();
        }
        e(channel);
    }

    @Override // bh2.c
    public boolean c() {
        bh2.j jVar = this.f20880f;
        return jVar != null && jVar.f20871e;
    }

    @Override // bh2.c
    public void d(int i17, int i18) {
        if (!((dh2.w) this.f20876b).d()) {
            bh2.j jVar = this.f20880f;
            if (jVar != null) {
                jVar.e(i17);
            }
            bh2.j jVar2 = this.f20880f;
            if (jVar2 != null) {
                jVar2.f(i18);
                return;
            }
            return;
        }
        bh2.j jVar3 = this.f20880f;
        if (jVar3 != null) {
            jVar3.e(0);
        }
        bh2.j jVar4 = this.f20880f;
        if (jVar4 != null) {
            jVar4.f(0);
        }
        bh2.j jVar5 = this.f20881g;
        if (jVar5 != null) {
            jVar5.e(i17);
        }
        bh2.j jVar6 = this.f20881g;
        if (jVar6 != null) {
            jVar6.f(i18);
        }
    }

    @Override // bh2.c
    public void destroy() {
        bh2.j jVar = this.f20880f;
        if (jVar != null) {
            jVar.a();
        }
        bh2.j jVar2 = this.f20881g;
        if (jVar2 != null) {
            jVar2.a();
        }
    }

    @Override // bh2.c
    public void e(bh2.w channel) {
        kotlin.jvm.internal.o.g(channel, "channel");
        int i17 = bh2.k.f20874a[channel.ordinal()];
        ah2.e eVar = this.f20876b;
        if (i17 == 1) {
            bh2.j jVar = this.f20880f;
            if (jVar != null) {
                jVar.e(0);
            }
            bh2.j jVar2 = this.f20880f;
            if (jVar2 != null) {
                jVar2.f(0);
            }
            bh2.j jVar3 = this.f20881g;
            if (jVar3 != null) {
                jVar3.e(((dh2.w) eVar).a());
            }
            bh2.j jVar4 = this.f20881g;
            if (jVar4 != null) {
                jVar4.f(((dh2.w) eVar).a());
                return;
            }
            return;
        }
        bh2.j jVar5 = this.f20880f;
        if (jVar5 != null) {
            jVar5.e(((dh2.w) eVar).a());
        }
        bh2.j jVar6 = this.f20880f;
        if (jVar6 != null) {
            jVar6.f(((dh2.w) eVar).a());
        }
        bh2.j jVar7 = this.f20881g;
        if (jVar7 != null) {
            jVar7.e(0);
        }
        bh2.j jVar8 = this.f20881g;
        if (jVar8 != null) {
            jVar8.f(0);
        }
    }

    @Override // bh2.c
    public long f() {
        bh2.j jVar = this.f20880f;
        if (jVar != null) {
            return jVar.f20873g.f20875a.getAudioEffectManager().getMusicCurrentPosInMS(jVar.f20868b.f20850a);
        }
        return 0L;
    }

    @Override // bh2.c
    public void g(bh2.b listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        bh2.j jVar = this.f20880f;
        if (jVar != null) {
            jVar.f20869c = listener;
        }
    }

    @Override // bh2.c
    public boolean isPlaying() {
        bh2.j jVar = this.f20880f;
        return jVar != null && jVar.f20872f;
    }

    @Override // bh2.c
    public void pause() {
        bh2.j jVar = this.f20880f;
        if (jVar != null) {
            jVar.b();
        }
        bh2.j jVar2 = this.f20881g;
        if (jVar2 != null) {
            jVar2.b();
        }
    }

    @Override // bh2.c
    public void resume() {
        bh2.j jVar = this.f20880f;
        if (jVar != null) {
            jVar.c();
        }
        bh2.j jVar2 = this.f20881g;
        if (jVar2 != null) {
            jVar2.c();
        }
    }

    @Override // bh2.c
    public void seek(long j17) {
        long f17 = f();
        if (j17 <= f17) {
            com.tencent.mars.xlog.Log.i(this.f20879e, "ignore seek: " + j17 + ", currPos: " + f17);
            return;
        }
        bh2.j jVar = this.f20880f;
        if (jVar != null) {
            jVar.d(j17);
        }
        bh2.j jVar2 = this.f20881g;
        if (jVar2 != null) {
            jVar2.d(j17);
        }
    }
}
