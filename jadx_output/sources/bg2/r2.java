package bg2;

/* loaded from: classes3.dex */
public final class r2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f20451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.x2 f20453f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.nc2 f20454g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(so2.h1 h1Var, int i17, bg2.x2 x2Var, r45.nc2 nc2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20451d = h1Var;
        this.f20452e = i17;
        this.f20453f = x2Var;
        this.f20454g = nc2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.r2(this.f20451d, this.f20452e, this.f20453f, this.f20454g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bg2.r2 r2Var = (bg2.r2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        so2.h1 h1Var = this.f20451d;
        so2.g1 g1Var = h1Var.f410384n;
        g1Var.f410356a++;
        g1Var.f410358c = this.f20452e;
        bg2.x2 x2Var = this.f20453f;
        bg2.g2 g2Var = (bg2.g2) x2Var.N6(bg2.g2.class);
        if (g2Var != null) {
            g2Var.b7(x2Var.f20640i, x2Var.Z6());
        }
        r45.nc2 nc2Var = this.f20454g;
        java.lang.String e76 = x2Var.e7((com.tencent.mm.protocal.protobuf.FinderJumpInfo) nc2Var.getCustom(0));
        if (e76 != null && e76.length() > 0) {
            h1Var.f410384n.f410357b = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) nc2Var.getCustom(0);
            x2Var.d7();
        }
        return jz5.f0.f302826a;
    }
}
