package hk0;

/* loaded from: classes10.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public int f363364a;

    /* renamed from: b, reason: collision with root package name */
    public hk0.u0 f363365b;

    /* renamed from: c, reason: collision with root package name */
    public int f363366c;

    public final boolean a(int i17) {
        int i18 = (i17 + com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
        return i18 == 0 || i18 == 90 || i18 == 180 || i18 == 270;
    }

    public final int b() {
        java.lang.Integer num;
        if (this.f363365b == null) {
            return -1;
        }
        int i17 = (this.f363366c + com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditRotateHelper", "getFixRotationInActionUp >> " + this.f363366c);
        if (a(this.f363366c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditRotateHelper", "getFixRotationInActionUp is in rotation");
            return -1;
        }
        if (java.lang.Math.abs(i17 + 0) <= 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditRotateHelper", "getFixRotationInActionUp >> fix to 0");
            num = 0;
        } else if (java.lang.Math.abs(i17 - 90) <= 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditRotateHelper", "getFixRotationInActionUp >> fix to 90");
            num = 90;
        } else if (java.lang.Math.abs(i17 + org.p3343x72743996.net.InterfaceC29524x4f65168b.f74094x196df028) <= 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditRotateHelper", "getFixRotationInActionUp >> fix to 180");
            num = 180;
        } else if (java.lang.Math.abs(i17 - 270) <= 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditRotateHelper", "getFixRotationInActionUp >> fix to 270");
            num = 270;
        } else if (java.lang.Math.abs(i17 + org.p3343x72743996.net.InterfaceC29524x4f65168b.f73983x984b3535) <= 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditRotateHelper", "getFixRotationInActionUp >> fix to 360 is 0");
            num = 0;
        } else {
            num = null;
        }
        if (num == null) {
            return -1;
        }
        num.intValue();
        return num.intValue();
    }
}
