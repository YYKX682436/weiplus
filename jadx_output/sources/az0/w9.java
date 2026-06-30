package az0;

/* loaded from: classes16.dex */
public final class w9 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.xb f16026e;

    /* renamed from: f, reason: collision with root package name */
    public int f16027f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(az0.xb xbVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f16026e = xbVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f16025d = obj;
        this.f16027f |= Integer.MIN_VALUE;
        java.lang.Object p07 = this.f16026e.p0(null, null, this);
        return p07 == pz5.a.f359186d ? p07 : kotlin.Result.m520boximpl(p07);
    }
}
