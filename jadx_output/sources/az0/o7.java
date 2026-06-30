package az0;

/* loaded from: classes5.dex */
public final class o7 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15776a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15777b;

    public o7(com.tencent.maas.instamovie.base.MJError mJError) {
        boolean z17 = true;
        this.f15776a = mJError == null;
        if ((mJError != null ? mJError.f48175ec : null) != com.tencent.maas.instamovie.base.MJError.MaasEC.TimedOut) {
            if ((mJError != null ? mJError.f48175ec : null) != com.tencent.maas.instamovie.base.MJError.MaasEC.NetworkFailed) {
                z17 = false;
            }
        }
        this.f15777b = z17;
    }

    public java.lang.String toString() {
        return "MaasRecommendResult(mjError={" + ((java.lang.Object) null) + ' ' + ((java.lang.String) null) + "}, isSuccess=" + this.f15776a + ", isNetError=" + this.f15777b + ')';
    }
}
