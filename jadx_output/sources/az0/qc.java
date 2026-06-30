package az0;

/* loaded from: classes5.dex */
public final class qc implements com.tencent.maas.instamovie.MJMovieSession.OnComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f15850b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15851c;

    public qc(java.lang.String str, kotlin.coroutines.Continuation continuation, long j17) {
        this.f15849a = str;
        this.f15850b = continuation;
        this.f15851c = j17;
    }

    @Override // com.tencent.maas.instamovie.MJMovieSession.OnComplete
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        az0.rc.a(this.f15849a, mJError, this.f15850b, this.f15851c);
    }
}
