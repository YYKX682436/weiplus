package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes12.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f65550d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f65551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.b1 f65552f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.SupervisedLifecycleScope f65553g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msg.MsgIdTalker f65554h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.tencent.mm.feature.chatrecordstts.b1 b1Var, com.tencent.mm.feature.chatrecordstts.SupervisedLifecycleScope supervisedLifecycleScope, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f65552f = b1Var;
        this.f65553g = supervisedLifecycleScope;
        this.f65554h = msgIdTalker;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.feature.chatrecordstts.w0 w0Var = new com.tencent.mm.feature.chatrecordstts.w0(this.f65552f, this.f65553g, this.f65554h, continuation);
        w0Var.f65551e = obj;
        return w0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.feature.chatrecordstts.w0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object g17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f65550d;
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = this.f65554h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f65551e;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.feature.chatrecordstts.v0 v0Var = new com.tencent.mm.feature.chatrecordstts.v0(msgIdTalker, null);
            this.f65551e = y0Var;
            this.f65550d = 1;
            g17 = kotlinx.coroutines.l.g(p0Var, v0Var, this);
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            g17 = obj;
        }
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) g17;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatRecordsTtsService", "startPlaying failed, message not found msgId=" + msgIdTalker.f149480d + " talker=" + msgIdTalker.a());
            return f0Var;
        }
        com.tencent.mm.feature.chatrecordstts.j jVar = new com.tencent.mm.feature.chatrecordstts.j(f9Var, null, null, new com.tencent.mm.feature.chatrecordstts.k2(this.f65553g, 0, 0L, 6, null), 6, null);
        com.tencent.mm.feature.chatrecordstts.b1 b1Var = this.f65552f;
        b1Var.f65354q = jVar;
        com.tencent.mm.feature.chatrecordstts.SupervisedLifecycleScope supervisedLifecycleScope = b1Var.f65358u;
        if (supervisedLifecycleScope == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatRecordsTtsService", "startConnectivityWatchdog failed, playbackScope is null");
        } else {
            com.tencent.mm.feature.chatrecordstts.f1 f1Var = b1Var.f65361x;
            if (f1Var != null && f1Var.f65421e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ConditionWatchdog", "stop");
                f1Var.f65421e = false;
                kotlinx.coroutines.r2 r2Var = f1Var.f65420d;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                f1Var.f65420d = null;
            }
            com.tencent.mm.feature.chatrecordstts.f1 f1Var2 = new com.tencent.mm.feature.chatrecordstts.f1(0L, com.tencent.mm.feature.chatrecordstts.s0.f65531d, new com.tencent.mm.feature.chatrecordstts.t0(b1Var, null), 1, null);
            if (f1Var2.f65421e) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ConditionWatchdog", "start ignored, already running");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ConditionWatchdog", "start checkIntervalMs=" + f1Var2.f65417a);
                f1Var2.f65421e = true;
                f1Var2.f65420d = v65.i.b(supervisedLifecycleScope, null, new com.tencent.mm.feature.chatrecordstts.e1(f1Var2, null), 1, null);
            }
            b1Var.f65361x = f1Var2;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "startConnectivityWatchdog started");
        }
        b1Var.C.alive();
        b1Var.D.alive();
        b1Var.A = kotlinx.coroutines.sync.l.a(false, 1, null);
        if (b1Var.qj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "startMessageLoop state=" + b1Var.f65353p);
            com.tencent.mm.feature.chatrecordstts.SupervisedLifecycleScope supervisedLifecycleScope2 = b1Var.f65358u;
            if (supervisedLifecycleScope2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChatRecordsTtsService", "startMessageLoop failed, playbackScope is null");
            } else {
                v65.i.b(supervisedLifecycleScope2, null, new com.tencent.mm.feature.chatrecordstts.u0(b1Var, null), 1, null);
            }
        }
        return f0Var;
    }
}
