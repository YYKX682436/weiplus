package bg2;

/* loaded from: classes2.dex */
public final class g4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f20107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.rg6 f20108e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.h4 f20109f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.px3 f20110g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.pl5 f20111h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f20112i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(r45.rg6 rg6Var, bg2.h4 h4Var, r45.px3 px3Var, r45.pl5 pl5Var, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20108e = rg6Var;
        this.f20109f = h4Var;
        this.f20110g = px3Var;
        this.f20111h = pl5Var;
        this.f20112i = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.g4(this.f20108e, this.f20109f, this.f20110g, this.f20111h, this.f20112i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.g4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0171  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.g4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
