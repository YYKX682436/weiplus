package v22;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v22.f f514337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f514338e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f514339f;

    public d(v22.f fVar, byte[] bArr, long j17) {
        this.f514337d = fVar;
        this.f514338e = bArr;
        this.f514339f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        v22.f fVar = this.f514337d;
        boolean a17 = fVar.f514344c.a(this.f514338e, this.f514339f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.f514342a, "encodeRgbaFrame used " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + ", ret:" + a17);
    }
}
