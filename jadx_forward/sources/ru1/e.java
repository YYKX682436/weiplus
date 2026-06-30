package ru1;

/* loaded from: classes13.dex */
public final class e implements ru1.u {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f481240a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f481241b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.HandlerThread f481242c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.vfs.y6 f481243d;

    /* renamed from: e, reason: collision with root package name */
    public final tl.w f481244e;

    public e(pu1.a audioConfig, yz5.l callback) {
        boolean fj6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioConfig, "audioConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f481240a = callback;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("MicroMsg.ScreenCastAudioEncoder" + hashCode());
        this.f481242c = handlerThread;
        handlerThread.start();
        this.f481241b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(handlerThread.getLooper());
        int i17 = wo.v1.f529366m.f529297v;
        if (i17 != -1) {
            fj6 = i17 != 1 ? i17 != 2 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_debug, false) : false : true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_debug, false);
        }
        if (fj6) {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a("/sdcard/ScreenCastDebug");
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
            com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
                com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                if (m18.a()) {
                    m18.f294799a.r(m18.f294800b);
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("/sdcard/ScreenCastDebug/audio_");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(android.os.SystemClock.elapsedRealtime());
            sb6.append(".pcm");
            this.f481243d = new com.p314xaae8f345.mm.vfs.y6(sb6.toString());
        }
        tl.w wVar = new tl.w(audioConfig.f439949b, audioConfig.f439950c, 9);
        this.f481244e = wVar;
        wVar.e(1);
        wVar.f501693m = -19;
        wVar.f501705y = new ru1.a(this);
    }

    @Override // ru1.u
    public void a() {
        ru1.c cVar = new ru1.c(this);
        if (this.f481242c.isAlive()) {
            this.f481241b.mo50293x3498a0(new ru1.b(cVar));
        }
    }

    @Override // ru1.u
    /* renamed from: stopRecord */
    public void mo163034xad07d6f3() {
        ru1.d dVar = new ru1.d(this);
        if (this.f481242c.isAlive()) {
            this.f481241b.mo50293x3498a0(new ru1.b(dVar));
        }
    }
}
