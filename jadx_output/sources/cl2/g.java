package cl2;

/* loaded from: classes3.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f42924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl2.j f42925e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f42926f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f42927g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(cl2.j jVar, android.widget.TextView textView, android.widget.TextView textView2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f42925e = jVar;
        this.f42926f = textView;
        this.f42927g = textView2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cl2.g(this.f42925e, this.f42926f, this.f42927g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cl2.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f42924d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f42924d = 1;
            if (kotlinx.coroutines.k1.b(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.widget.TextView textView = this.f42926f;
        cl2.j jVar = this.f42925e;
        jVar.n(textView, true);
        jVar.n(this.f42927g, true);
        return jz5.f0.f302826a;
    }
}
