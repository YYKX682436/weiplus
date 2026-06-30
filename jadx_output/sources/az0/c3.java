package az0;

/* loaded from: classes.dex */
public final class c3 implements com.tencent.maas.MJMaasCore.OnBoolComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f15380b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f15381c;

    public c3(java.lang.String str, long j17, kotlin.coroutines.Continuation continuation) {
        this.f15379a = str;
        this.f15380b = j17;
        this.f15381c = continuation;
    }

    @Override // com.tencent.maas.MJMaasCore.OnBoolComplete
    public final void onComplete(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "checkLocalTemplate: " + this.f15379a + ", " + this.f15380b + " -> " + z17);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f15381c.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17)));
    }
}
