package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public class m8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 implements im5.b, db2.u3 {

    /* renamed from: d, reason: collision with root package name */
    public final eb2.m0 f189714d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.m0 f189715e;

    /* renamed from: f, reason: collision with root package name */
    public fp0.b f189716f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f189717g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 f189718h;

    public m8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 c13917xbf9dc158, eb2.m0 streamFetcher, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.m0 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamFetcher, "streamFetcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        this.f189718h = c13917xbf9dc158;
        this.f189714d = streamFetcher;
        this.f189715e = scene;
        this.f189717g = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l8.f189690d);
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d info, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 c13917xbf9dc158 = this.f189718h;
        r45.qt2 m56354xfe9224be = c13917xbf9dc158.m56354xfe9224be();
        c13917xbf9dc158.f(m56354xfe9224be != null ? m56354xfe9224be.m75939xb282bd08(5) : 0, info.f189300e);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: alive */
    public void mo56311x58998cd() {
        super.mo56311x58998cd();
        this.f189716f = b();
    }

    public final fp0.b b() {
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) this.f189717g).mo141623x754a37bb()).booleanValue();
        eb2.m0 m0Var = this.f189714d;
        if (booleanValue) {
            return new mn2.m3("FinderSingleTaskExecutor#TabType=" + m0Var.f332355g);
        }
        fp0.t tVar = new fp0.t("SingleExecutor#TabType=" + m0Var.f332355g);
        tVar.e();
        return tVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: dead */
    public void mo56312x2efc64() {
        super.mo56312x2efc64();
        fp0.b bVar = this.f189716f;
        if (bVar != null) {
            bVar.mo129985x6761d4f();
        }
        this.f189716f = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetch */
    public void mo56275x5cd06ba(java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.n8) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.j8 j8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.j8(this, obj, z17, callback, this.f189718h);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.n8 n8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.n8) obj;
            if (n8Var.f189751g && n8Var.f189745a == 1 && ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.r1().r()).booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "[requestClear] pullType=" + n8Var.f189745a + " clear request.");
                fp0.b bVar = this.f189716f;
                if (bVar != null) {
                    bVar.mo129985x6761d4f();
                }
                this.f189716f = b();
            }
            fp0.b bVar2 = this.f189716f;
            if (bVar2 != null) {
                bVar2.b(((java.lang.Boolean) ((jz5.n) this.f189717g).mo141623x754a37bb()).booleanValue() ? new mn2.k3(j8Var, null, 2, null) : new fp0.r(j8Var, null, 2, null));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0549, code lost:
    
        if (((so2.n1) r8).g2(1) != false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x058a, code lost:
    
        if ((r6 != null && r6.m75939xb282bd08(2) == 2) == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x068c, code lost:
    
        if ((r21 + r7) > c01.id.c()) goto L319;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0597 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0699 A[LOOP:6: B:234:0x0634->B:255:0x0699, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06a2 A[EDGE_INSN: B:256:0x06a2->B:257:0x06a2 BREAK  A[LOOP:6: B:234:0x0634->B:255:0x0699], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Type inference failed for: r12v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v7, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.tencent.mm.plugin.finder.report.r1] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r3v48, types: [so2.h3] */
    /* JADX WARN: Type inference failed for: r3v49, types: [cu2.t] */
    /* JADX WARN: Type inference failed for: r46v0, types: [com.tencent.mm.plugin.finder.feed.model.internal.n0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.util.List] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchInit */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo56023xb639f2ea(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 r46) {
        /*
            Method dump skipped, instructions count: 2183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m8.mo56023xb639f2ea(com.tencent.mm.plugin.finder.feed.model.internal.n0):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchLoadMore */
    public void mo56024xaef8a235(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.n8 n8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.n8(2, null, 2, null);
        n8Var.f189750f = this.f189718h.f189197w;
        mo56275x5cd06ba(n8Var, callback, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchRefresh */
    public void mo56025xae25fec1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 c13917xbf9dc158 = this.f189718h;
        int i17 = c13917xbf9dc158.f189182e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.n8 n8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.n8(i17, null, 2, null);
        n8Var.f189745a = i17;
        if (i17 == 0) {
            c13917xbf9dc158.f189182e = 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "[requestRefresh] pullType=" + n8Var.f189745a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0.m56461x34ddd257(this, n8Var, callback, false, 4, null);
    }

    @Override // im5.b
    /* renamed from: keep */
    public void mo46316x322b85(im5.a p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }
}
