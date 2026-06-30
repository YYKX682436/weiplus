package aq5;

/* loaded from: classes5.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq5.y f13295d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(aq5.y yVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f13295d = yVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aq5.t(this.f13295d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq5.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte[] bArr;
        aq5.q0 q0Var;
        bw5.zd0 zd0Var;
        com.tencent.mm.protobuf.g b17;
        jz5.f0 f0Var = jz5.f0.f302826a;
        aq5.y yVar = this.f13295d;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            aq5.f fVar = (aq5.f) yVar.f13338b.invoke();
            bArr = (fVar == null || (zd0Var = fVar.f13232b) == null || (b17 = zd0Var.b()) == null) ? null : b17.f192156a;
        } catch (java.lang.Exception e17) {
            yVar.f13341e.invoke("listenReadyToReceive: error in main loop", new java.lang.Integer(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL), e17);
        }
        if (bArr != null) {
            if (!(bArr.length == 0)) {
                r45.d87 d87Var = (r45.d87) ((aq5.d0) yVar.f13340d).a(5, bArr, new r45.d87(), true, "listenReadyToReceive: connection closed", com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, true);
                if (d87Var == null) {
                    return f0Var;
                }
                com.tencent.mars.xlog.Log.i(yVar.f13337a, "listenReadyToReceive: received ReadyToReceive response, ok=" + d87Var.f372241d);
                r45.e87 e87Var = new r45.e87();
                e87Var.f373146d = true;
                com.tencent.mars.xlog.Log.i(yVar.f13337a, "listenReadyToReceive: sending ReadyToReceive response");
                dq5.a aVar2 = dq5.a.f242371a;
                byte[] byteArray = e87Var.toByteArray();
                kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
                if (!aVar2.a(5, byteArray, bArr)) {
                    com.tencent.mars.xlog.Log.e(yVar.f13337a, "listenReadyToReceive: failed to send ReadyToReceive response");
                    yVar.f13341e.invoke("listenReadyToReceive: failed to send ReadyToReceive response", new java.lang.Integer(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL), null);
                    return f0Var;
                }
                aq5.f fVar2 = (aq5.f) yVar.f13338b.invoke();
                if (fVar2 != null && (q0Var = fVar2.f13234d) != null) {
                    q0Var.d();
                }
                com.tencent.mars.xlog.Log.i(yVar.f13337a, "listenReadyToReceive: callback onPrepareSendFileOk invoked");
                return f0Var;
            }
        }
        com.tencent.mars.xlog.Log.e(yVar.f13337a, "listenReadyToReceive: encrypt key is empty");
        return f0Var;
    }
}
