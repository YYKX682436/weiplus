package bg2;

/* loaded from: classes2.dex */
public final class r5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f20462d;

    /* renamed from: e, reason: collision with root package name */
    public int f20463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.eg6 f20464f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f20465g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bg2.s5 f20466h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f20467i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f20468m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(r45.eg6 eg6Var, com.tencent.mm.view.MMPAGView mMPAGView, bg2.s5 s5Var, android.view.View view, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20464f = eg6Var;
        this.f20465g = mMPAGView;
        this.f20466h = s5Var;
        this.f20467i = view;
        this.f20468m = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.r5(this.f20464f, this.f20465g, this.f20466h, this.f20467i, this.f20468m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.r5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.r5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
