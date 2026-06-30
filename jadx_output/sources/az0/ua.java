package az0;

/* loaded from: classes16.dex */
public final class ua extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.xb f15948e;

    /* renamed from: f, reason: collision with root package name */
    public int f15949f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(az0.xb xbVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f15948e = xbVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15947d = obj;
        this.f15949f |= Integer.MIN_VALUE;
        return this.f15948e.m0(this);
    }
}
