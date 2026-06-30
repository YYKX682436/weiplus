package az0;

/* loaded from: classes5.dex */
public final class o7 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f97309a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f97310b;

    public o7(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        boolean z17 = true;
        this.f97309a = c4093x6b88526b == null;
        if ((c4093x6b88526b != null ? c4093x6b88526b.f129708ec : null) != com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b.MaasEC.TimedOut) {
            if ((c4093x6b88526b != null ? c4093x6b88526b.f129708ec : null) != com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b.MaasEC.NetworkFailed) {
                z17 = false;
            }
        }
        this.f97310b = z17;
    }

    /* renamed from: toString */
    public java.lang.String m9365x9616526c() {
        return "MaasRecommendResult(mjError={" + ((java.lang.Object) null) + ' ' + ((java.lang.String) null) + "}, isSuccess=" + this.f97309a + ", isNetError=" + this.f97310b + ')';
    }
}
