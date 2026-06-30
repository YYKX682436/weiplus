package com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tencent/mm/mj_template/album_template/multi_template/MMMusicManager;", "Landroidx/lifecycle/f;", "Lkotlinx/coroutines/y0;", "scope", "", "", "imageList", "<init>", "(Lkotlinx/coroutines/y0;Ljava/util/List;)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager */
/* loaded from: classes5.dex */
public final class C11004x58386388 implements p012xc85e97e9.p093xedfae76a.f {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f151275d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f151276e;

    /* renamed from: f, reason: collision with root package name */
    public final n0.v2 f151277f;

    /* renamed from: g, reason: collision with root package name */
    public final n0.v2 f151278g;

    /* renamed from: h, reason: collision with root package name */
    public final n0.v2 f151279h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f151280i;

    /* renamed from: m, reason: collision with root package name */
    public gz0.h f151281m;

    /* renamed from: n, reason: collision with root package name */
    public long f151282n;

    /* renamed from: o, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f151283o;

    /* renamed from: p, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f151284p;

    /* renamed from: q, reason: collision with root package name */
    public final ty0.b1 f151285q;

    public C11004x58386388(p3325xe03a0797.p3326xc267989b.y0 scope, java.util.List<java.lang.String> imageList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageList, "imageList");
        this.f151275d = scope;
        this.f151276e = imageList;
        n0.v2 c17 = n0.s4.c(kz5.p0.f395529d, null, 2, null);
        this.f151277f = c17;
        n0.v2 c18 = n0.s4.c(new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356("", "", "", null, null), null, 2, null);
        this.f151278g = c18;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        n0.v2 c19 = n0.s4.c(bool, null, 2, null);
        this.f151279h = c19;
        n0.v2 c27 = n0.s4.c(bool, null, 2, null);
        this.f151280i = new java.util.ArrayList();
        ty0.b1 b1Var = new ty0.b1(c17, c18, new qy0.c(this), c19, c27, new qy0.d(this), new qy0.e(this), new qy0.f(this), false, null, 512, null);
        b1Var.f504335l = new qy0.g(this);
        this.f151285q = b1Var;
    }

    public final void a(java.lang.String str) {
        java.lang.Object obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMMusicManager", "innerRealSelectMusic() called with: musicId = " + str);
        java.util.Iterator it = ((java.lang.Iterable) ((n0.q4) this.f151277f).mo128745x754a37bb()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) obj).m33856x92013dca(), str)) {
                    break;
                }
            }
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) obj;
        if (c4116xf4b2c356 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMMusicManager", "switch music: switch to " + c4116xf4b2c356.m33856x92013dca());
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f151284p;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.f151284p = p3325xe03a0797.p3326xc267989b.l.d(this.f151275d, null, null, new qy0.b(this, c4116xf4b2c356, str, null), 3, null);
        }
    }

    public final void b() {
        jz5.f0 f0Var;
        gz0.h hVar = this.f151281m;
        if (hVar != null) {
            hVar.b();
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            java.lang.String m33856x92013dca = ((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) ((n0.q4) this.f151278g).mo128745x754a37bb()).m33856x92013dca();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33856x92013dca, "getMusicID(...)");
            a(m33856x92013dca);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if ((r0 != null && r0.a()) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r8 = this;
            java.lang.String r0 = "startRecommend: "
            java.lang.String r1 = "MicroMsg.MMMusicManager"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            java.util.List r0 = r8.f151280i
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ r2
            if (r0 != 0) goto L20
            kotlinx.coroutines.r2 r0 = r8.f151283o
            r3 = 0
            if (r0 == 0) goto L1d
            boolean r0 = r0.a()
            if (r0 != r2) goto L1d
            goto L1e
        L1d:
            r2 = r3
        L1e:
            if (r2 == 0) goto L25
        L20:
            java.lang.String r0 = "startRecommend: skip recommend"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
        L25:
            kotlinx.coroutines.y0 r2 = r8.f151275d
            r3 = 0
            r4 = 0
            qy0.i r5 = new qy0.i
            r0 = 0
            r5.<init>(r8, r0)
            r6 = 3
            r7 = 0
            kotlinx.coroutines.r2 r0 = p3325xe03a0797.p3326xc267989b.l.d(r2, r3, r4, r5, r6, r7)
            r8.f151283o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.C11004x58386388.c():void");
    }

    @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
    /* renamed from: onDestroy */
    public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMMusicManager", "onDestroy: ");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMMusicManager", "release: ");
        p3325xe03a0797.p3326xc267989b.l.d(this.f151275d, null, null, new qy0.h(this, null), 3, null);
    }

    @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
    /* renamed from: onPause */
    public void mo7796xb01dfb57(p012xc85e97e9.p093xedfae76a.y owner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMMusicManager", "onPause: ");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMMusicManager", "pausePlay: ");
        gz0.h hVar = this.f151281m;
        if (hVar != null) {
            hVar.a();
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
    /* renamed from: onResume */
    public void mo7055x57429eec(p012xc85e97e9.p093xedfae76a.y owner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMMusicManager", "onResume: ");
        b();
    }
}
