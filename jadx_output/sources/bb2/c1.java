package bb2;

/* loaded from: classes10.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f18820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f18821e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18822f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f18823g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(bb2.w1 w1Var, java.util.List list, java.lang.String str, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f18820d = w1Var;
        this.f18821e = list;
        this.f18822f = str;
        this.f18823g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bb2.c1(this.f18820d, this.f18821e, this.f18822f, this.f18823g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bb2.c1 c1Var = (bb2.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        bb2.b1 b1Var = bb2.w1.f19035x;
        this.f18820d.a(this.f18821e, this.f18822f, this.f18823g);
        return jz5.f0.f302826a;
    }
}
