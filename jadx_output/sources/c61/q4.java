package c61;

/* loaded from: classes5.dex */
public final class q4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f39244d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f39245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39246f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f39247g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f39248h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f39249i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f39250m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(java.lang.String str, android.content.Context context, int i17, android.content.Intent intent, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f39246f = str;
        this.f39247g = context;
        this.f39248h = i17;
        this.f39249i = intent;
        this.f39250m = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        c61.q4 q4Var = new c61.q4(this.f39246f, this.f39247g, this.f39248h, this.f39249i, this.f39250m, continuation);
        q4Var.f39245e = obj;
        return q4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((c61.q4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x007b  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.q4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
