package b00;

/* loaded from: classes9.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lh0 f16738e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f16739f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r45.lh0 lh0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16738e = lh0Var;
        this.f16739f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new b00.o(this.f16738e, this.f16739f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b00.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16737d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            c00.z2 z2Var = (c00.z2) i95.n0.c(c00.z2.class);
            bw5.ne0 ne0Var = new bw5.ne0();
            r45.lh0 lh0Var = this.f16738e;
            ne0Var.d(com.tencent.mm.sdk.platformtools.b8.c(lh0Var.f379475f));
            java.lang.String str = lh0Var.f379477h;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            ne0Var.f30657i = str;
            boolean[] zArr = ne0Var.f30659n;
            zArr[6] = true;
            ne0Var.f30656h = this.f16739f;
            zArr[5] = true;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(lh0Var.f379476g)) {
                bw5.x7 x7Var = new bw5.x7();
                try {
                    x7Var.parseFrom(android.util.Base64.decode(lh0Var.f379476g, 0));
                    bw5.u7 f17 = x7Var.f();
                    ne0Var.f30655g = f17 != null ? f17.getPath() : null;
                    zArr[4] = true;
                } catch (java.lang.Exception unused) {
                }
            }
            this.f16737d = 1;
            if (((b00.r) z2Var).vj(ne0Var, 6, false, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
