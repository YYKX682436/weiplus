package c61;

/* loaded from: classes.dex */
public final class d6 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f38937a;

    public d6(kotlin.coroutines.Continuation continuation) {
        this.f38937a = continuation;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f38937a.resumeWith(kotlin.Result.m521constructorimpl(new jz5.o(java.lang.Boolean.FALSE, -1L, "errorType=" + i17 + " errorCode=" + i18 + " msg=" + str)));
    }

    @Override // js4.o
    public void onSuccess(java.lang.Object obj) {
        r45.fs3 data = (r45.fs3) obj;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f38937a.resumeWith(kotlin.Result.m521constructorimpl(new jz5.o(java.lang.Boolean.TRUE, java.lang.Long.valueOf(data.f374585d), "")));
    }
}
