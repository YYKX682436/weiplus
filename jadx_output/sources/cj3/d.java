package cj3;

/* loaded from: classes14.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f41883d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f41884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cj3.f f41885f;

    /* renamed from: g, reason: collision with root package name */
    public int f41886g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(cj3.f fVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f41885f = fVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f41884e = obj;
        this.f41886g |= Integer.MIN_VALUE;
        return this.f41885f.a(this);
    }
}
