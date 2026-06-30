package com.tencent.mm.modelcdntran;

/* loaded from: classes9.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f71180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.b1 f71181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dn.m f71182f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.d1 f71183g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w65.m f71184h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.tencent.mm.modelcdntran.b1 b1Var, dn.m mVar, com.tencent.mm.modelcdntran.d1 d1Var, w65.m mVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f71181e = b1Var;
        this.f71182f = mVar;
        this.f71183g = d1Var;
        this.f71184h = mVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.modelcdntran.z0(this.f71181e, this.f71182f, this.f71183g, this.f71184h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.modelcdntran.z0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f71180d;
        com.tencent.mm.modelcdntran.b1 b1Var = this.f71181e;
        dn.m mVar = this.f71182f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.concurrent.ConcurrentHashMap V6 = b1Var.V6();
            java.lang.String field_mediaId = mVar.field_mediaId;
            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
            com.tencent.mm.modelcdntran.d1 d1Var = this.f71183g;
            V6.put(field_mediaId, new com.tencent.mm.modelcdntran.r0(field_mediaId, d1Var));
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnMediaFSC", "add task " + mVar.field_mediaId + ", size:" + mVar.field_totalLen + ", md5:" + mVar.field_filemd5 + ", now task count:" + b1Var.V6().size());
            long j17 = d1Var.f70920p;
            if (j17 <= 300000) {
                j17 = 300000;
            }
            w65.n nVar = (w65.n) i95.n0.c(w65.n.class);
            w65.m mVar2 = this.f71184h;
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference((com.tencent.mm.modelcdntran.v0) ((jz5.n) b1Var.f70889i).getValue());
            this.f71180d = 1;
            if (((lm.r) nVar).Zi(mVar2, j17, weakReference, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        b1Var.V6().remove(mVar.field_mediaId);
        return jz5.f0.f302826a;
    }
}
