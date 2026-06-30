package zl2;

/* loaded from: classes3.dex */
public final class s3 implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f555502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f555504c;

    public s3(long j17, java.lang.String str, int i17) {
        this.f555502a = j17;
        this.f555503b = str;
        this.f555504c = i17;
    }

    @Override // s40.t0
    /* renamed from: onLiveStatusCallback */
    public void mo44975x964762a2(long j17, int i17, java.lang.Object obj) {
        long j18 = this.f555502a;
        if (j18 == j17 && (obj instanceof r45.l71)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "tryToNotifyLiveEnd liveStatus:" + i17);
            if (i17 == 2) {
                zl2.r4.f555483a.C2(this.f555502a, this.f555503b, 2, this.f555504c);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveUtil", "tryToNotifyLiveEnd, local liveId:" + j18 + " resp live id " + j17 + '!');
    }
}
