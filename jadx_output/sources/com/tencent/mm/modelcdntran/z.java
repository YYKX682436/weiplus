package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public final class z extends jm0.g {

    /* renamed from: n, reason: collision with root package name */
    public static final jz5.g f71174n = jz5.h.b(com.tencent.mm.modelcdntran.d.f70901d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f71175f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f71176g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f71177h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f71178i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f71179m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        this.f71175f = jz5.h.b(new com.tencent.mm.modelcdntran.y(service));
        this.f71177h = jz5.h.b(com.tencent.mm.modelcdntran.f.f70936d);
        this.f71178i = jz5.h.b(com.tencent.mm.modelcdntran.u.f71139d);
        this.f71179m = jz5.h.b(com.tencent.mm.modelcdntran.v.f71146d);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void T6(com.tencent.mm.modelcdntran.z r17, java.util.concurrent.ConcurrentHashMap r18, dn.m r19, kotlinx.coroutines.flow.i2 r20) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelcdntran.z.T6(com.tencent.mm.modelcdntran.z, java.util.concurrent.ConcurrentHashMap, dn.m, kotlinx.coroutines.flow.i2):void");
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.Cdn.CdnFSC", "onAccountInit");
        com.tencent.mm.modelcdntran.s1.cj().f71055s.observe(this.f300267d, new com.tencent.mm.modelcdntran.p(this));
        this.f71176g = true;
        b7(1);
        ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.modelcdntran.q(this), 1000L);
    }

    public final kotlinx.coroutines.flow.n2 U6(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(3, 0, null, 6, null);
        c7(new com.tencent.mm.modelcdntran.h(this, mediaId, b17, null));
        return kotlinx.coroutines.flow.l.a(b17);
    }

    public int V6(java.lang.String mediaId, com.tencent.mm.modelcdntran.e runningObj) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(runningObj, "runningObj");
        boolean z17 = runningObj.f70927a.f241786e;
        kotlinx.coroutines.flow.i2 i2Var = runningObj.f70928b;
        if (z17) {
            com.tencent.mm.modelcdntran.s1.cj().getClass();
            ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).cancelTask(mediaId);
            com.tencent.mm.modelcdntran.n1 n1Var = new com.tencent.mm.modelcdntran.n1(com.tencent.mm.modelcdntran.m1.f71090v, mediaId);
            n1Var.f71105c = 0;
            W6(i2Var, n1Var);
        } else {
            com.tencent.mm.modelcdntran.s1.cj().getClass();
            ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).cancelTask(mediaId);
            com.tencent.mm.modelcdntran.n1 n1Var2 = new com.tencent.mm.modelcdntran.n1(com.tencent.mm.modelcdntran.m1.f71085q, mediaId);
            n1Var2.f71105c = 0;
            W6(i2Var, n1Var2);
        }
        return 0;
    }

    public final void W6(kotlinx.coroutines.flow.i2 i2Var, com.tencent.mm.modelcdntran.n1 n1Var) {
        v65.i.b(a7(), null, new com.tencent.mm.modelcdntran.k(i2Var, n1Var, null), 1, null);
    }

    public final java.util.concurrent.ConcurrentLinkedDeque X6() {
        return (java.util.concurrent.ConcurrentLinkedDeque) ((jz5.n) this.f71177h).getValue();
    }

    public final java.util.concurrent.ConcurrentHashMap Y6() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f71178i).getValue();
    }

    public final java.util.concurrent.ConcurrentHashMap Z6() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f71179m).getValue();
    }

    public final com.tencent.mm.sdk.coroutines.LifecycleScope a7() {
        return (com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.f71175f).getValue();
    }

    public final boolean b7(int i17) {
        if (!(!X6().isEmpty())) {
            return false;
        }
        v65.i.b(a7(), null, new com.tencent.mm.modelcdntran.s(this, i17, null), 1, null);
        return true;
    }

    public final void c7(yz5.p pVar) {
        if (!this.f71176g) {
            v65.i.b(a7(), null, new com.tencent.mm.modelcdntran.t(this, pVar, null), 1, null);
        } else {
            b7(3);
            v65.i.b(a7(), null, pVar, 1, null);
        }
    }

    public final kotlinx.coroutines.flow.n2 d7(dn.m task) {
        kotlin.jvm.internal.o.g(task, "task");
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(3, 0, null, 6, null);
        java.lang.String str = task.field_mediaId;
        if (str == null || str.length() == 0) {
            com.tencent.mm.modelcdntran.m1 m1Var = com.tencent.mm.modelcdntran.m1.f71081m;
            java.lang.String str2 = task.field_mediaId;
            if (str2 == null) {
                str2 = "";
            }
            com.tencent.mm.modelcdntran.n1 n1Var = new com.tencent.mm.modelcdntran.n1(m1Var, str2);
            n1Var.f71106d = task;
            W6(b17, n1Var);
            return b17;
        }
        java.lang.String log = "startDownloadTask " + task.field_mediaId + ' ' + Y6().size();
        kotlin.jvm.internal.o.g(log, "log");
        com.tencent.mars.xlog.Log.i("MicroMsg.Cdn.CdnFSC", log);
        task.f241786e = false;
        c7(new com.tencent.mm.modelcdntran.w(this, task, b17, null));
        return kotlinx.coroutines.flow.l.a(b17);
    }

    public final kotlinx.coroutines.flow.n2 e7(dn.m task) {
        kotlin.jvm.internal.o.g(task, "task");
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(3, 0, null, 6, null);
        java.lang.String str = task.field_mediaId;
        if (str == null || str.length() == 0) {
            com.tencent.mm.modelcdntran.m1 m1Var = com.tencent.mm.modelcdntran.m1.f71086r;
            java.lang.String str2 = task.field_mediaId;
            if (str2 == null) {
                str2 = "";
            }
            com.tencent.mm.modelcdntran.n1 n1Var = new com.tencent.mm.modelcdntran.n1(m1Var, str2);
            n1Var.f71106d = task;
            W6(b17, n1Var);
            return kotlinx.coroutines.flow.l.a(b17);
        }
        java.lang.String log = "startUploadTask " + task.field_mediaId + ' ' + Y6().size();
        kotlin.jvm.internal.o.g(log, "log");
        com.tencent.mars.xlog.Log.i("MicroMsg.Cdn.CdnFSC", log);
        task.f241786e = true;
        c7(new com.tencent.mm.modelcdntran.x(this, task, b17, null));
        return kotlinx.coroutines.flow.l.a(b17);
    }
}
