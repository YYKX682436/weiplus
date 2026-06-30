package cx;

/* loaded from: classes7.dex */
public abstract class j1 extends i95.w implements bx.t {

    /* renamed from: e */
    public cx.w0 f305955e;

    /* renamed from: d */
    public final jz5.g f305954d = jz5.h.b(new cx.e1(this));

    /* renamed from: f */
    public long f305956f = -1;

    /* renamed from: g */
    public final jz5.g f305957g = jz5.h.b(new cx.g1(this));

    /* renamed from: h */
    public boolean f305958h = true;

    /* renamed from: i */
    public final java.lang.Runnable f305959i = new cx.c1(this);

    /* renamed from: m */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f305960m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: n */
    public final java.lang.Runnable f305961n = new cx.z0(this);

    /* renamed from: o */
    public final cx.a1 f305962o = new cx.a1(this);

    /* renamed from: p */
    public final com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p706x5dc4f1ad.biz.C10483x5b97a64b f305963p = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.feature.brandservice.flutter.magicbrush.biz.MagicBrandBaseFeatureService$preCleanFileEvent$1
        {
            this.f39173x3fe91575 = 1489935310;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de c5189xf98047de) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de event = c5189xf98047de;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
            ((ku5.t0) ku5.t0.f394148d).B(new cx.f1(event, cx.j1.this));
            return false;
        }
    };

    public static final boolean Ai(cx.j1 j1Var) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(j1Var.cj());
        int o17 = M.o("crashCount", 0);
        long q17 = M.q("lastCrashTimeStamp", -1L);
        int o18 = M.o("lastCrashVersion", -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j1Var.pj(), "hy: stability log: crashCount: " + o17 + ", lastCrashTimeStamp: " + q17 + ", lastCrashVersion: " + o18);
        jz5.g gVar = j1Var.f305957g;
        boolean z17 = q17 != -1 && (android.os.SystemClock.elapsedRealtime() - q17) / ((long) 1000) > ((cx.y0) ((jz5.n) gVar).mo141623x754a37bb()).f306021c;
        boolean z18 = (o18 == -1 || o18 == o45.wf.f424562g) ? false : true;
        if (!z17 && !z18) {
            boolean z19 = o17 < ((cx.y0) ((jz5.n) gVar).mo141623x754a37bb()).f306020b;
            if (!z19) {
                ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicBrandStabilityClose", 1, null, 1.0f);
            }
            return z19;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j1Var.pj(), "hy: recover status because shouldRecoverForTimeout " + z17 + ", shouldRecoverForVersion " + z18);
        ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicBrandStabilityRecover", 1, null, 1.0f);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(j1Var.cj());
        M2.A("crashCount", 0);
        M2.B("lastCrashTimeStamp", -1L);
        M2.A("lastCrashVersion", -1);
        return true;
    }

    public static final /* synthetic */ java.lang.String Bi(cx.j1 j1Var) {
        return j1Var.pj();
    }

    private final java.lang.String cj() {
        return "MagicBrushBrandStability_" + Ri();
    }

    public final java.lang.String pj() {
        return "MicroMsg.MagicBrandBaseFeatureService." + Ri();
    }

    public static final void wi(cx.j1 j1Var, int i17, java.lang.String frameSetName, java.lang.String data) {
        cx.w0 w0Var = j1Var.f305955e;
        if (w0Var != null) {
            cl0.g gVar = new cl0.g();
            gVar.h("frameSetName", frameSetName);
            gVar.o("preLayoutScene", i17);
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
            pm0.v.X(new cx.s0(i17, w0Var, frameSetName, data, gVar2));
        }
    }

    public final synchronized boolean Di(int i17) {
        if (!bj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(pj(), "create not open!");
            return false;
        }
        this.f305960m.mo50302x6b17ad39(null);
        if (this.f305958h && !bx.y.f117768a.contains(java.lang.Integer.valueOf(i17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pj(), "canDestroy set to false, scene: " + i17);
            this.f305958h = false;
        }
        if (this.f305958h) {
            java.lang.Runnable task = this.f305959i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f305960m;
            n3Var.mo50302x6b17ad39(null);
            n3Var.mo50297x7c4d7ca2(task, 60000L);
        }
        if (this.f305955e != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(pj(), "has created, skip biz create, scene: " + i17);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pj(), "createBrandServiceBiz scene:" + i17);
        this.f305955e = Ni(i17);
        return true;
    }

    public synchronized void K6(int i17) {
        if (this.f305955e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pj(), "destroyBrandServiceBiz hasDestroy");
            return;
        }
        mq0.d1 d1Var = mq0.d1.f412079a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBrandReporter", "clearCardExposeKeys");
        mq0.d1.f412081c.clear();
        this.f305956f = -1L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pj(), "destroyBrandServiceBiz " + i17);
        cx.w0 w0Var = this.f305955e;
        if (w0Var != null) {
            w0Var.mo123041x5cd39ffa();
        }
        this.f305955e = null;
        this.f305958h = true;
    }

    public abstract cx.w0 Ni(int i17);

    public abstract java.lang.String Ri();

    public java.lang.String Ui() {
        jc3.x E1;
        java.lang.String e17;
        cx.w0 w0Var = this.f305955e;
        return (w0Var == null || (E1 = w0Var.E1()) == null || (e17 = E1.e()) == null) ? ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).Vi(Vi()) : e17;
    }

    public abstract java.lang.String Vi();

    public abstract dq0.a0 Zi();

    public abstract int aj();

    public final boolean bj() {
        return ((java.lang.Boolean) ((jz5.n) this.f305954d).mo141623x754a37bb()).booleanValue();
    }

    public abstract boolean fj();

    public void hj(long j17, java.lang.String frameSetName, java.lang.String frameSetData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetData, "frameSetData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pj(), "notifyFrameSetInfo " + j17 + ' ' + frameSetName + ' ' + frameSetData.length());
        pm0.v.X(new cx.b1(this, frameSetName, frameSetData));
    }

    public synchronized void ij(java.lang.String eventName) {
        java.lang.String gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventName, "eventName");
        if (!bj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(pj(), "dispatch event not open!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pj(), "notifyStateChange ".concat(eventName));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eventName, "brandServiceBoxClick")) {
            cl0.g gVar2 = new cl0.g();
            gVar2.h("eventName", eventName);
            gVar2.p(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.System.currentTimeMillis());
            gVar = gVar2.toString();
        } else {
            cl0.g gVar3 = new cl0.g();
            gVar3.h("eventName", eventName);
            gVar = gVar3.toString();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar);
        pj();
        cx.d1 d1Var = new cx.d1(this, gVar);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eventName, "brandServiceBoxClick")) {
            Di(7);
            dq0.a0 Zi = Zi();
            synchronized (Zi) {
                if (Zi.f323825h) {
                    d1Var.run();
                } else {
                    Zi.f323826i.add(d1Var);
                }
            }
        } else {
            d1Var.run();
        }
    }

    public abstract void mj();

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c A[Catch: all -> 0x00f1, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:10:0x0013, B:12:0x0017, B:14:0x001d, B:17:0x002d, B:19:0x0037, B:22:0x0051, B:24:0x005c, B:26:0x006a, B:28:0x006e, B:29:0x0076, B:31:0x007a, B:32:0x007d, B:34:0x008a, B:35:0x0094, B:39:0x0099, B:40:0x00f0), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099 A[Catch: all -> 0x00f1, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:10:0x0013, B:12:0x0017, B:14:0x001d, B:17:0x002d, B:19:0x0037, B:22:0x0051, B:24:0x005c, B:26:0x006a, B:28:0x006e, B:29:0x0076, B:31:0x007a, B:32:0x007d, B:34:0x008a, B:35:0x0094, B:39:0x0099, B:40:0x00f0), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void nj() {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cx.j1.nj():void");
    }

    public abstract boolean oj();

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40963x40b15f2e(this.f305962o);
        mo48813x58998cd();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        cx.w0 w0Var = this.f305955e;
        if (w0Var != null) {
            w0Var.mo123041x5cd39ffa();
        }
        this.f305955e = null;
        this.f305958h = true;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40968xa01141ab(this.f305962o);
        mo48814x2efc64();
    }
}
