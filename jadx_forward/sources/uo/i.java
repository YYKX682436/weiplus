package uo;

/* loaded from: classes12.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f511047d;

    public i(long j17) {
        this.f511047d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17 = this.f511047d / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CameraCompat", "openCameraErrOkay: deltaMin=" + j17);
        java.lang.Throwable th6 = new java.lang.Throwable();
        java.lang.String[] strArr = new java.lang.String[2];
        strArr[0] = java.lang.String.valueOf(j17);
        strArr[1] = uo.n.f511055a.c() ? "1" : "0";
        ap.a.a(1, "openCameraErrOkay", th6, null, strArr);
    }
}
