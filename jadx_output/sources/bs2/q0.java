package bs2;

/* loaded from: classes2.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f23936d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f23937e;

    /* renamed from: f, reason: collision with root package name */
    public int f23938f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f23939g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f23940h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f23941i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ bs2.h0 f23942m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f23943n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f23944o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f23945p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f23946q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(yz5.l lVar, bs2.n1 n1Var, bs2.h0 h0Var, com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var, java.util.LinkedList linkedList, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f23940h = lVar;
        this.f23941i = n1Var;
        this.f23942m = h0Var;
        this.f23943n = gVar;
        this.f23944o = qt2Var;
        this.f23945p = linkedList;
        this.f23946q = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        bs2.q0 q0Var = new bs2.q0(this.f23940h, this.f23941i, this.f23942m, this.f23943n, this.f23944o, this.f23945p, this.f23946q, continuation);
        q0Var.f23939g = obj;
        return q0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bs2.q0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0126  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bs2.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
