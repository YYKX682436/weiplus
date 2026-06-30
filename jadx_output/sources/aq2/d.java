package aq2;

/* loaded from: classes2.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f13125d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aq2.e f13127f;

    /* renamed from: g, reason: collision with root package name */
    public int f13128g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(aq2.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f13127f = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13126e = obj;
        this.f13128g |= Integer.MIN_VALUE;
        return this.f13127f.b(this);
    }
}
