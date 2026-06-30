package by4;

/* loaded from: classes.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f36378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f36379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f36380f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f36381g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f36382h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, java.util.ArrayList arrayList, int i17, kotlin.coroutines.Continuation continuation, kotlin.coroutines.Continuation continuation2) {
        super(2, continuation2);
        this.f36379e = context;
        this.f36380f = arrayList;
        this.f36381g = i17;
        this.f36382h = continuation;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new by4.c(this.f36379e, this.f36380f, this.f36381g, this.f36382h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((by4.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f36378d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            e60.b1 b1Var = (e60.b1) i95.n0.c(e60.b1.class);
            androidx.activity.ComponentActivity componentActivity = (androidx.activity.ComponentActivity) this.f36379e;
            java.util.ArrayList arrayList = this.f36380f;
            int i18 = this.f36381g;
            this.f36378d = 1;
            obj = ((o23.i) b1Var).Di(componentActivity, 4, arrayList, i18, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
        by4.b bVar = new by4.b(this.f36382h, (qc0.m1) obj, null);
        this.f36378d = 2;
        if (kotlinx.coroutines.l.g(p0Var, bVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
