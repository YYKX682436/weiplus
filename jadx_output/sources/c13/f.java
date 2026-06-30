package c13;

/* loaded from: classes11.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f37874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f37875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f37876f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f37877g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f37878h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String str, yz5.l lVar, boolean z17, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f37875e = str;
        this.f37876f = lVar;
        this.f37877g = z17;
        this.f37878h = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c13.f(this.f37875e, this.f37876f, this.f37877g, this.f37878h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((c13.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0130  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c13.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
