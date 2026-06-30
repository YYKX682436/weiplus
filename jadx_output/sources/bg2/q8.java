package bg2;

/* loaded from: classes2.dex */
public final class q8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f20424d;

    /* renamed from: e, reason: collision with root package name */
    public int f20425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ng6 f20426f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bg2.x8 f20427g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f20428h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f20429i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.ng6 f20430m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.View f20431n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(r45.ng6 ng6Var, bg2.x8 x8Var, so2.h1 h1Var, in5.s0 s0Var, r45.ng6 ng6Var2, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20426f = ng6Var;
        this.f20427g = x8Var;
        this.f20428h = h1Var;
        this.f20429i = s0Var;
        this.f20430m = ng6Var2;
        this.f20431n = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.q8(this.f20426f, this.f20427g, this.f20428h, this.f20429i, this.f20430m, this.f20431n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.q8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x021c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fb  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.q8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
