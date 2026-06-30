package aq1;

/* loaded from: classes5.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f13043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v60 f13044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f13045f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y35.r f13046g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f13047h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r45.v60 v60Var, java.lang.String str, y35.r rVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f13044e = v60Var;
        this.f13045f = str;
        this.f13046g = rVar;
        this.f13047h = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aq1.g(this.f13044e, this.f13045f, this.f13046g, this.f13047h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq1.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f13043d;
        java.lang.String userName = this.f13045f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            hr3.ag agVar = hr3.ag.f283404a;
            r45.v60 imgInfo = this.f13044e;
            kotlin.jvm.internal.o.f(imgInfo, "$imgInfo");
            kotlin.jvm.internal.o.f(userName, "$userName");
            boolean z17 = this.f13046g.f459237f;
            long j17 = this.f13047h;
            this.f13043d = 1;
            obj = agVar.i(imgInfo, userName, z17, j17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        long longValue = ((java.lang.Number) obj).longValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "tryToAddSayHiMsg img inserted to db , imgMsgId = " + longValue);
        gc0.f0 f0Var = gc0.f0.f270167a;
        kotlin.jvm.internal.o.f(userName, "$userName");
        r45.ml5 b17 = f0Var.b(userName);
        b17.getList(6).add(java.lang.Long.valueOf(longValue));
        f0Var.c().H(userName, b17.toByteArray());
        return jz5.f0.f302826a;
    }
}
