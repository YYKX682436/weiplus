package ch2;

/* loaded from: classes10.dex */
public final class v1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f41481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f41482e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41483f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(long j17, ch2.o2 o2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41482e = j17;
        this.f41483f = o2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ch2.v1(this.f41482e, this.f41483f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ch2.v1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.trtc.TRTCCloud T;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f41481d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j17 = this.f41482e;
            this.f41481d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.List list = this.f41483f.H;
        kotlin.jvm.internal.o.f(list, "access$getSeiInfoList$p(...)");
        ch2.o2 o2Var = this.f41483f;
        synchronized (list) {
            java.util.List list2 = o2Var.H;
            kotlin.jvm.internal.o.f(list2, "access$getSeiInfoList$p(...)");
            r45.fa4 f76 = o2Var.f7(list2);
            tn0.w0 Q6 = o2Var.Q6();
            if (Q6 != null && (T = Q6.T()) != null) {
                T.sendSEIMsg(f76.toByteArray(), 1);
            }
            o2Var.H.clear();
            o2Var.G = false;
        }
        return jz5.f0.f302826a;
    }
}
