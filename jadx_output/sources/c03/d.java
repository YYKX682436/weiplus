package c03;

/* loaded from: classes2.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f37647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c03.h f37648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f37649f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c03.g f37650g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gx2.q f37651h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c03.h hVar, android.widget.FrameLayout frameLayout, c03.g gVar, gx2.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f37648e = hVar;
        this.f37649f = frameLayout;
        this.f37650g = gVar;
        this.f37651h = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c03.d(this.f37648e, this.f37649f, this.f37650g, this.f37651h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((c03.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0127  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c03.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
