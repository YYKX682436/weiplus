package cn2;

/* loaded from: classes3.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f43600d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f43601e;

    /* renamed from: f, reason: collision with root package name */
    public int f43602f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f43603g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f43604h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ cn2.c0 f43605i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f43606m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f43607n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.view.View view, java.lang.Object obj, cn2.c0 c0Var, long j17, long j18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f43603g = view;
        this.f43604h = obj;
        this.f43605i = c0Var;
        this.f43606m = j17;
        this.f43607n = j18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cn2.q(this.f43603g, this.f43604h, this.f43605i, this.f43606m, this.f43607n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cn2.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00df  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cn2.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
