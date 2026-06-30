package xg;

/* loaded from: classes7.dex */
public class g extends android.location.GnssStatus.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p484x3169fe9e.C4207x94a2927e f535885a;

    public g(com.p314xaae8f345.p484x3169fe9e.C4207x94a2927e c4207x94a2927e) {
        this.f535885a = c4207x94a2927e;
    }

    @Override // android.location.GnssStatus.Callback
    public void onFirstFix(int i17) {
    }

    @Override // android.location.GnssStatus.Callback
    public void onSatelliteStatusChanged(android.location.GnssStatus gnssStatus) {
        long j17;
        java.lang.String unused;
        unused = this.f535885a.TAG;
        gnssStatus.getSatelliteCount();
        int satelliteCount = gnssStatus.getSatelliteCount();
        float[] fArr = new float[satelliteCount];
        float[] fArr2 = new float[satelliteCount];
        float[] fArr3 = new float[satelliteCount];
        float[] fArr4 = new float[satelliteCount];
        int[] iArr = new int[satelliteCount];
        for (int i17 = 0; i17 < satelliteCount; i17++) {
            fArr[i17] = gnssStatus.getAzimuthDegrees(i17);
            fArr2[i17] = gnssStatus.getCn0DbHz(i17);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                fArr4[i17] = gnssStatus.getCarrierFrequencyHz(i17);
            }
            iArr[i17] = gnssStatus.getConstellationType(i17);
        }
        com.p314xaae8f345.p484x3169fe9e.C4207x94a2927e c4207x94a2927e = this.f535885a;
        j17 = c4207x94a2927e.f16182x622dc53;
        c4207x94a2927e.m34726xad26a7fc(j17, satelliteCount, fArr, fArr2, fArr3, fArr4, iArr);
    }

    @Override // android.location.GnssStatus.Callback
    public void onStarted() {
        java.lang.String unused;
        com.p314xaae8f345.p484x3169fe9e.C4207x94a2927e c4207x94a2927e = this.f535885a;
        c4207x94a2927e.m34739xd26d8a8e("on start.");
        unused = c4207x94a2927e.TAG;
    }

    @Override // android.location.GnssStatus.Callback
    public void onStopped() {
    }
}
