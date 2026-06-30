package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class e0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f10545d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f10546e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f10547f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10548g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.x f10549h;

    /* renamed from: i, reason: collision with root package name */
    public int f10550i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(androidx.compose.ui.platform.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f10549h = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10548g = obj;
        this.f10550i |= Integer.MIN_VALUE;
        return this.f10549h.a(this);
    }
}
