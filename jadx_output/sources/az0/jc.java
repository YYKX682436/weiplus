package az0;

/* loaded from: classes5.dex */
public final class jc implements com.tencent.maas.MJMaasCore.OnComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f15615b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15616c;

    public jc(java.lang.String str, kotlin.coroutines.Continuation continuation, long j17) {
        this.f15614a = str;
        this.f15615b = continuation;
        this.f15616c = j17;
    }

    @Override // com.tencent.maas.MJMaasCore.OnComplete
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        az0.rc.a(this.f15614a, mJError, this.f15615b, this.f15616c);
    }
}
