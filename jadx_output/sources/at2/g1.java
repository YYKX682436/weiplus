package at2;

/* loaded from: classes.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f13666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ at2.n1 f13667e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f13668f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f13669g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f13670h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f13671i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f13672m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f13673n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(at2.n1 n1Var, kotlin.jvm.internal.f0 f0Var, android.widget.TextView textView, java.lang.String str, java.util.List list, int i17, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f13667e = n1Var;
        this.f13668f = f0Var;
        this.f13669g = textView;
        this.f13670h = str;
        this.f13671i = list;
        this.f13672m = i17;
        this.f13673n = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new at2.g1(this.f13667e, this.f13668f, this.f13669g, this.f13670h, this.f13671i, this.f13672m, this.f13673n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((at2.g1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f13666d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f13667e.f13723y = true;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (this.f13667e.f13723y) {
            kotlin.jvm.internal.f0 f0Var = this.f13668f;
            int i18 = f0Var.f310116d + 1;
            f0Var.f310116d = i18;
            if (i18 > Integer.MAX_VALUE) {
                f0Var.f310116d = 0;
            }
            this.f13669g.setText(this.f13670h + ((java.lang.String) this.f13671i.get(f0Var.f310116d % this.f13672m)));
            this.f13666d = 1;
            if (kotlinx.coroutines.k1.b(this.f13673n, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
