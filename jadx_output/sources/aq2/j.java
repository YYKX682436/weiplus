package aq2;

/* loaded from: classes2.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f13136d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aq2.k f13138f;

    /* renamed from: g, reason: collision with root package name */
    public int f13139g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(aq2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f13138f = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13137e = obj;
        this.f13139g |= Integer.MIN_VALUE;
        return this.f13138f.b(this);
    }
}
