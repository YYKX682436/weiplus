package bh2;

/* loaded from: classes10.dex */
public final class l implements bh2.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 f102408a;

    /* renamed from: b, reason: collision with root package name */
    public final ah2.e f102409b;

    /* renamed from: c, reason: collision with root package name */
    public final int f102410c;

    /* renamed from: d, reason: collision with root package name */
    public om2.s f102411d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f102412e;

    /* renamed from: f, reason: collision with root package name */
    public bh2.j f102413f;

    /* renamed from: g, reason: collision with root package name */
    public bh2.j f102414g;

    public l(com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 trtcCloud, ah2.e service) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trtcCloud, "trtcCloud");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f102408a = trtcCloud;
        this.f102409b = service;
        this.f102410c = android.view.View.generateViewId();
        this.f102412e = "KTVBgmPlayer";
    }

    @Override // bh2.c
    public void a(float f17) {
        bh2.j jVar = this.f102413f;
        if (jVar != null) {
            jVar.f102406g.f102408a.mo30282x5f1b9a9c().mo29056xed0efa1d(jVar.f102401b.f102383a, f17);
        }
        bh2.j jVar2 = this.f102414g;
        if (jVar2 != null) {
            jVar2.f102406g.f102408a.mo30282x5f1b9a9c().mo29056xed0efa1d(jVar2.f102401b.f102383a, f17);
        }
    }

    @Override // bh2.c
    public void b(bh2.w channel, om2.s songData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channel, "channel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songData, "songData");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("KTVBgmPlayer_");
        om2.s sVar = this.f102411d;
        bh2.j jVar = null;
        sb6.append(sVar != null ? sVar.a() : null);
        sb6.append('_');
        int i17 = this.f102410c;
        sb6.append(i17);
        this.f102412e = sb6.toString();
        this.f102411d = songData;
        java.lang.String a17 = songData.a();
        int generateViewId = android.view.View.generateViewId() + i17;
        om2.q qVar = songData.f427913c;
        this.f102413f = new bh2.j(this, a17, new bh2.a(generateViewId, qVar.f427906b));
        java.lang.String str = qVar.f427907c;
        if (str != null) {
            bh2.j jVar2 = qVar.f427905a ? new bh2.j(this, songData.a(), new bh2.a(i17 + android.view.View.generateViewId(), str)) : null;
            if (jVar2 != null) {
                jVar = jVar2;
            }
        }
        this.f102414g = jVar;
        bh2.j jVar3 = this.f102413f;
        if (jVar3 != null) {
            jVar3.g();
        }
        bh2.j jVar4 = this.f102414g;
        if (jVar4 != null) {
            jVar4.g();
        }
        e(channel);
    }

    @Override // bh2.c
    public boolean c() {
        bh2.j jVar = this.f102413f;
        return jVar != null && jVar.f102404e;
    }

    @Override // bh2.c
    public void d(int i17, int i18) {
        if (!((dh2.w) this.f102409b).d()) {
            bh2.j jVar = this.f102413f;
            if (jVar != null) {
                jVar.e(i17);
            }
            bh2.j jVar2 = this.f102413f;
            if (jVar2 != null) {
                jVar2.f(i18);
                return;
            }
            return;
        }
        bh2.j jVar3 = this.f102413f;
        if (jVar3 != null) {
            jVar3.e(0);
        }
        bh2.j jVar4 = this.f102413f;
        if (jVar4 != null) {
            jVar4.f(0);
        }
        bh2.j jVar5 = this.f102414g;
        if (jVar5 != null) {
            jVar5.e(i17);
        }
        bh2.j jVar6 = this.f102414g;
        if (jVar6 != null) {
            jVar6.f(i18);
        }
    }

    @Override // bh2.c
    /* renamed from: destroy */
    public void mo10546x5cd39ffa() {
        bh2.j jVar = this.f102413f;
        if (jVar != null) {
            jVar.a();
        }
        bh2.j jVar2 = this.f102414g;
        if (jVar2 != null) {
            jVar2.a();
        }
    }

    @Override // bh2.c
    public void e(bh2.w channel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channel, "channel");
        int i17 = bh2.k.f102407a[channel.ordinal()];
        ah2.e eVar = this.f102409b;
        if (i17 == 1) {
            bh2.j jVar = this.f102413f;
            if (jVar != null) {
                jVar.e(0);
            }
            bh2.j jVar2 = this.f102413f;
            if (jVar2 != null) {
                jVar2.f(0);
            }
            bh2.j jVar3 = this.f102414g;
            if (jVar3 != null) {
                jVar3.e(((dh2.w) eVar).a());
            }
            bh2.j jVar4 = this.f102414g;
            if (jVar4 != null) {
                jVar4.f(((dh2.w) eVar).a());
                return;
            }
            return;
        }
        bh2.j jVar5 = this.f102413f;
        if (jVar5 != null) {
            jVar5.e(((dh2.w) eVar).a());
        }
        bh2.j jVar6 = this.f102413f;
        if (jVar6 != null) {
            jVar6.f(((dh2.w) eVar).a());
        }
        bh2.j jVar7 = this.f102414g;
        if (jVar7 != null) {
            jVar7.e(0);
        }
        bh2.j jVar8 = this.f102414g;
        if (jVar8 != null) {
            jVar8.f(0);
        }
    }

    @Override // bh2.c
    public long f() {
        bh2.j jVar = this.f102413f;
        if (jVar != null) {
            return jVar.f102406g.f102408a.mo30282x5f1b9a9c().mo29047x8f832095(jVar.f102401b.f102383a);
        }
        return 0L;
    }

    @Override // bh2.c
    public void g(bh2.b listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        bh2.j jVar = this.f102413f;
        if (jVar != null) {
            jVar.f102402c = listener;
        }
    }

    @Override // bh2.c
    /* renamed from: isPlaying */
    public boolean mo10547xc00617a4() {
        bh2.j jVar = this.f102413f;
        return jVar != null && jVar.f102405f;
    }

    @Override // bh2.c
    /* renamed from: pause */
    public void mo10548x65825f6() {
        bh2.j jVar = this.f102413f;
        if (jVar != null) {
            jVar.b();
        }
        bh2.j jVar2 = this.f102414g;
        if (jVar2 != null) {
            jVar2.b();
        }
    }

    @Override // bh2.c
    /* renamed from: resume */
    public void mo10549xc84dc82d() {
        bh2.j jVar = this.f102413f;
        if (jVar != null) {
            jVar.c();
        }
        bh2.j jVar2 = this.f102414g;
        if (jVar2 != null) {
            jVar2.c();
        }
    }

    @Override // bh2.c
    /* renamed from: seek */
    public void mo10550x35ce78(long j17) {
        long f17 = f();
        if (j17 <= f17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f102412e, "ignore seek: " + j17 + ", currPos: " + f17);
            return;
        }
        bh2.j jVar = this.f102413f;
        if (jVar != null) {
            jVar.d(j17);
        }
        bh2.j jVar2 = this.f102414g;
        if (jVar2 != null) {
            jVar2.d(j17);
        }
    }
}
