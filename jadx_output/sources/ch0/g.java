package ch0;

/* loaded from: classes.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f41206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41208f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41209g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f41210h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f41211i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41206d = i17;
        this.f41207e = str;
        this.f41208f = str2;
        this.f41209g = str3;
        this.f41210h = i18;
        this.f41211i = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ch0.g(this.f41206d, this.f41207e, this.f41208f, this.f41209g, this.f41210h, this.f41211i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ch0.g gVar = (ch0.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = this.f41206d;
        java.lang.String str = this.f41207e;
        su4.k2.j(941, i17, str, str, "", 0, true, this.f41208f, true, this.f41209g, "", this.f41210h, false, this.f41211i);
        return jz5.f0.f302826a;
    }
}
