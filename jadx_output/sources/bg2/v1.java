package bg2;

/* loaded from: classes3.dex */
public final class v1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f20563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.d2 f20564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f20565f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20566g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20567h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f20568i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f20569m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r45.kr0 f20570n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f20571o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(bg2.d2 d2Var, r45.nw1 nw1Var, int i17, android.content.Context context, com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.qt2 qt2Var, r45.kr0 kr0Var, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20564e = d2Var;
        this.f20565f = nw1Var;
        this.f20566g = i17;
        this.f20567h = context;
        this.f20568i = finderObject;
        this.f20569m = qt2Var;
        this.f20570n = kr0Var;
        this.f20571o = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.v1(this.f20564e, this.f20565f, this.f20566g, this.f20567h, this.f20568i, this.f20569m, this.f20570n, this.f20571o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.v1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0119  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.v1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
