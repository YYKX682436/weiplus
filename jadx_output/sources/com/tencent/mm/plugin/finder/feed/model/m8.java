package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public class m8 extends com.tencent.mm.plugin.finder.feed.model.internal.p0 implements im5.b, db2.u3 {

    /* renamed from: d, reason: collision with root package name */
    public final eb2.m0 f108181d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.internal.m0 f108182e;

    /* renamed from: f, reason: collision with root package name */
    public fp0.b f108183f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f108184g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader f108185h;

    public m8(com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader, eb2.m0 streamFetcher, com.tencent.mm.plugin.finder.feed.model.internal.m0 scene) {
        kotlin.jvm.internal.o.g(streamFetcher, "streamFetcher");
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f108185h = finderTimelineFeedLoader;
        this.f108181d = streamFetcher;
        this.f108182e = scene;
        this.f108184g = jz5.h.b(com.tencent.mm.plugin.finder.feed.model.l8.f108157d);
    }

    public void a(com.tencent.mm.plugin.finder.feed.model.d info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = this.f108185h;
        r45.qt2 contextObj = finderTimelineFeedLoader.getContextObj();
        finderTimelineFeedLoader.f(contextObj != null ? contextObj.getInteger(5) : 0, info.f107767e);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void alive() {
        super.alive();
        this.f108183f = b();
    }

    public final fp0.b b() {
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) this.f108184g).getValue()).booleanValue();
        eb2.m0 m0Var = this.f108181d;
        if (booleanValue) {
            return new mn2.m3("FinderSingleTaskExecutor#TabType=" + m0Var.f250822g);
        }
        fp0.t tVar = new fp0.t("SingleExecutor#TabType=" + m0Var.f250822g);
        tVar.e();
        return tVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void dead() {
        super.dead();
        fp0.b bVar = this.f108183f;
        if (bVar != null) {
            bVar.reset();
        }
        this.f108183f = null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetch(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (obj instanceof com.tencent.mm.plugin.finder.feed.model.n8) {
            com.tencent.mm.plugin.finder.feed.model.j8 j8Var = new com.tencent.mm.plugin.finder.feed.model.j8(this, obj, z17, callback, this.f108185h);
            com.tencent.mm.plugin.finder.feed.model.n8 n8Var = (com.tencent.mm.plugin.finder.feed.model.n8) obj;
            if (n8Var.f108218g && n8Var.f108212a == 1 && ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.r1().r()).booleanValue()) {
                com.tencent.mars.xlog.Log.i(getTAG(), "[requestClear] pullType=" + n8Var.f108212a + " clear request.");
                fp0.b bVar = this.f108183f;
                if (bVar != null) {
                    bVar.reset();
                }
                this.f108183f = b();
            }
            fp0.b bVar2 = this.f108183f;
            if (bVar2 != null) {
                bVar2.b(((java.lang.Boolean) ((jz5.n) this.f108184g).getValue()).booleanValue() ? new mn2.k3(j8Var, null, 2, null) : new fp0.r(j8Var, null, 2, null));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0549, code lost:
    
        if (((so2.n1) r8).g2(1) != false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x058a, code lost:
    
        if ((r6 != null && r6.getInteger(2) == 2) == false) goto L257;
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
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0 r46) {
        /*
            Method dump skipped, instructions count: 2183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.m8.fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.n8 n8Var = new com.tencent.mm.plugin.finder.feed.model.n8(2, null, 2, null);
        n8Var.f108217f = this.f108185h.f107664w;
        fetch(n8Var, callback, z17);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchRefresh(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = this.f108185h;
        int i17 = finderTimelineFeedLoader.f107649e;
        com.tencent.mm.plugin.finder.feed.model.n8 n8Var = new com.tencent.mm.plugin.finder.feed.model.n8(i17, null, 2, null);
        n8Var.f108212a = i17;
        if (i17 == 0) {
            finderTimelineFeedLoader.f107649e = 1;
        }
        com.tencent.mars.xlog.Log.i(getTAG(), "[requestRefresh] pullType=" + n8Var.f108212a);
        com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(this, n8Var, callback, false, 4, null);
    }

    @Override // im5.b
    public void keep(im5.a p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }
}
