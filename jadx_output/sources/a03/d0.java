package a03;

/* loaded from: classes8.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a03.h0 f410e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f411f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(a03.h0 h0Var, android.content.Context context, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410e = h0Var;
        this.f411f = context;
        this.f412g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a03.d0(this.f410e, this.f411f, this.f412g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a03.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f409d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.content.Context context = this.f411f;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            this.f409d = 1;
            if (this.f410e.hj((androidx.appcompat.app.AppCompatActivity) context, this.f412g, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
