package az0;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.a0 f15680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15681e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(az0.a0 a0Var, java.lang.String str) {
        super(2);
        this.f15680d = a0Var;
        this.f15681e = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.instamovie.MJMoviePlayer.OnTaskProgress onProgress = (com.tencent.maas.instamovie.MJMoviePlayer.OnTaskProgress) obj;
        com.tencent.maas.instamovie.MJMoviePlayer.OnComplete onComplete = (com.tencent.maas.instamovie.MJMoviePlayer.OnComplete) obj2;
        kotlin.jvm.internal.o.g(onProgress, "onProgress");
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        az0.a0 a0Var = this.f15680d;
        java.lang.String str = a0Var.f15311c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startWithClipBundleId ");
        java.lang.String str2 = this.f15681e;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        return a0Var.f15309a.openWithClipBundle(str2, onProgress, new az0.l(a0Var, onComplete));
    }
}
