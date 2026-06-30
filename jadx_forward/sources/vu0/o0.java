package vu0;

/* loaded from: classes5.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f521661a;

    /* renamed from: b, reason: collision with root package name */
    public final pp0.s0 f521662b;

    /* renamed from: c, reason: collision with root package name */
    public final vu0.y f521663c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f521664d;

    /* renamed from: e, reason: collision with root package name */
    public final wu0.f f521665e;

    /* renamed from: f, reason: collision with root package name */
    public final wu0.d f521666f;

    /* renamed from: g, reason: collision with root package name */
    public final vu0.g0 f521667g;

    /* renamed from: h, reason: collision with root package name */
    public yu0.m f521668h;

    /* renamed from: i, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f521669i;

    /* renamed from: j, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f521670j;

    public o0(java.lang.String finderUserName, pp0.s0 s0Var, vu0.y requestListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestListener, "requestListener");
        this.f521661a = finderUserName;
        this.f521662b = s0Var;
        this.f521663c = requestListener;
        this.f521664d = jz5.h.b(vu0.a0.f521584d);
        this.f521665e = new wu0.f();
        this.f521666f = new wu0.d(new vu0.n0(this));
        this.f521667g = new vu0.g0(this);
        this.f521670j = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392101a.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x069e  */
    /* JADX WARN: Type inference failed for: r1v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r25v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v15 */
    /* JADX WARN: Type inference failed for: r29v16 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r5v39, types: [float] */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(vu0.o0 r35, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 r36, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r37) {
        /*
            Method dump skipped, instructions count: 1899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vu0.o0.a(vu0.o0, com.tencent.maas.moviecomposing.segments.ClipSegment, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(java.util.List allClipSegment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(allClipSegment, "allClipSegment");
        this.f521666f.f531188b.clear();
        vu0.y yVar = this.f521663c;
        yVar.b();
        this.f521665e.f531193a.clear();
        pp0.s0 s0Var = this.f521662b;
        if (s0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoSubtitleService", "automaticSubtitles: mjAudioTaskManager == null");
            yVar.a();
            return;
        }
        boolean hj6 = ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).hj();
        vu0.g0 g0Var = this.f521667g;
        this.f521668h = hj6 ? new yu0.m(new su0.r(this.f521661a, g0Var)) : new yu0.m(new su0.a0(s0Var, g0Var));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = allClipSegment.iterator();
        while (true) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = null;
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a32 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) it.next();
            c4181x2248e1a32.getClass();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a32.D();
            if ((D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.K0(c4181x2248e1a32, D) : bool).booleanValue()) {
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4181x2248e1a32.D();
                if (D2 != null) {
                    bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.V0(c4181x2248e1a32, D2);
                }
                if (bool.booleanValue()) {
                    java.lang.String s17 = c4181x2248e1a32.s1();
                    if (!(s17 == null || s17.length() == 0)) {
                        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 B = c4181x2248e1a32.B();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "getPresentationTimeRange(...)");
                        if (B.m34010x7b953cf2()) {
                            c4181x2248e1a3 = c4181x2248e1a32;
                        }
                    }
                }
            }
            if (c4181x2248e1a3 != null) {
                arrayList.add(c4181x2248e1a3);
            }
        }
        if (!arrayList.isEmpty()) {
            this.f521669i = p3325xe03a0797.p3326xc267989b.l.d(this.f521670j, null, null, new vu0.c0(arrayList, this, null), 3, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoSubtitleService", "automaticSubtitles: videoClipSegments isEmpty");
            yVar.c(null);
        }
    }

    public final void c() {
        this.f521665e.f531193a.clear();
        wu0.d dVar = this.f521666f;
        dVar.f531189c.removeCallbacksAndMessages(null);
        dVar.f531188b.clear();
        yu0.m mVar = this.f521668h;
        if (mVar != null) {
            mVar.b();
        }
        this.f521668h = null;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f521669i;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f521669i = null;
    }
}
