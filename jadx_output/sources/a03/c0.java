package a03;

/* loaded from: classes11.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a03.h0 f404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f405f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f406g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(a03.h0 h0Var, java.util.Map map, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404e = h0Var;
        this.f405f = map;
        this.f406g = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a03.c0(this.f404e, this.f405f, this.f406g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a03.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object cj6;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f403d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            a03.h0 h0Var = this.f404e;
            java.lang.String str = h0Var.f429q;
            java.util.Map map = this.f405f;
            this.f403d = 1;
            cj6 = a03.h0.cj(h0Var, "watch_later", str, map, null, this, 8, null);
            if (cj6 == aVar) {
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
            cj6 = obj;
        }
        android.content.Context context = this.f406g;
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        this.f403d = 2;
        if (pi0.l1.v((pi0.l1) cj6, context, flutterPageStyle, null, null, null, this, 28, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
