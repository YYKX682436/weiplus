package com.p314xaae8f345.p484x3169fe9e;

/* renamed from: com.tencent.magicar.MagicAR */
/* loaded from: classes7.dex */
public class C4207x94a2927e implements xg.b {

    /* renamed from: _hellAccFlag_ */
    private byte f16176x7f11beae;

    /* renamed from: locationListener */
    private android.location.LocationListener f16177x5bba4389;

    /* renamed from: locationManager */
    private android.location.LocationManager f16178x29e5e238;

    /* renamed from: mContext */
    private android.content.Context f16179xd6cfe882;

    /* renamed from: mDislayOrientationHelper */
    private xg.c f16180xe00a4ebb;

    /* renamed from: mInst */
    private long f16182x622dc53;

    /* renamed from: magicARCallback */
    private xg.i f16183x8a30103;

    /* renamed from: providerName */
    private java.lang.String f16184xe702941c;

    /* renamed from: statusCallback */
    private android.location.GnssStatus.Callback f16185x25d64257;
    private java.lang.String TAG = "MagicAR";

    /* renamed from: mHandler */
    private android.os.Handler f16181xc7640a1d = new android.os.Handler(android.os.Looper.getMainLooper());

    public C4207x94a2927e(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f16179xd6cfe882 = applicationContext;
        xg.c cVar = new xg.c(applicationContext);
        this.f16180xe00a4ebb = cVar;
        cVar.f535883d.add(this);
        cVar.f535882c.enable();
        xg.f.f535884a.mo32138xeb57c8f5("opencv_world");
        xg.f.f535884a.mo32138xeb57c8f5("wechatxlog");
        xg.f.f535884a.mo32138xeb57c8f5("weslam");
        xg.f.f535884a.mo32138xeb57c8f5("magicar");
        xg.f.f535884a.mo32138xeb57c8f5("wevision2");
        m34738xe478ad24(((android.view.WindowManager) this.f16180xe00a4ebb.f535880a.getSystemService("window")).getDefaultDisplay().getRotation());
        this.f16182x622dc53 = m34736x73c02ff3();
        m34725xb7df3(this.f16179xd6cfe882);
    }

    /* renamed from: createLocationLisenter */
    private void m34725xb7df3(android.content.Context context) {
        this.f16178x29e5e238 = (android.location.LocationManager) context.getSystemService(ya.b.f77489x9ff58fb5);
        android.location.Criteria criteria = new android.location.Criteria();
        criteria.setAccuracy(1);
        criteria.setSpeedRequired(false);
        criteria.setAltitudeRequired(false);
        criteria.setBearingRequired(false);
        criteria.setCostAllowed(true);
        criteria.setPowerRequirement(1);
        this.f16184xe702941c = this.f16178x29e5e238.getBestProvider(criteria, true);
        m34739xd26d8a8e("provider name: " + this.f16184xe702941c);
        this.f16185x25d64257 = new xg.g(this);
        this.f16177x5bba4389 = new xg.h(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onGnssStatusChanged */
    public native void m34726xad26a7fc(long j17, int i17, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, int[] iArr);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onGpsLocationChanged */
    public native void m34727xda6a6374(long j17, double d17, double d18, float f17, long j18, long j19, float f18, float f19, int i17);

    /* renamed from: bindTo */
    public void m34728xad361398(long j17, long j18, long j19) {
        long j27 = this.f16182x622dc53;
        if (j27 != 0) {
            m34735x7190a28f(j27, j17, j18, j19);
        }
    }

    /* renamed from: destroy */
    public void m34729x5cd39ffa() {
        long j17 = this.f16182x622dc53;
        if (j17 != 0) {
            m34737x23caefe3(j17);
        } else {
            this.f16182x622dc53 = 0L;
        }
        xg.c cVar = this.f16180xe00a4ebb;
        java.util.ArrayList arrayList = cVar.f535883d;
        arrayList.remove(this);
        if (arrayList.size() == 0) {
            cVar.f535882c.disable();
        }
    }

    /* renamed from: getLocalFilePath */
    public java.lang.String m34730x3bd21496(java.lang.String str) {
        java.lang.String o17;
        if (this.f16183x8a30103 == null) {
            return "";
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 a0Var = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.p0) m34731xed04d2cd()).f129047a;
        return (a0Var.F() == null || ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) a0Var.F()).mo50354x59eafec1() == null || ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) a0Var.F()).mo50354x59eafec1().mo49620x1d537609(str) == null || (o17 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) a0Var.F()).mo50354x59eafec1().mo49620x1d537609(str).o()) == null) ? "" : o17;
    }

    /* renamed from: getMagicARCallback */
    public xg.i m34731xed04d2cd() {
        return this.f16183x8a30103;
    }

    /* renamed from: getWAAppInfo_appId */
    public java.lang.String m34732x6d48048c() {
        xg.i iVar = this.f16183x8a30103;
        return iVar != null ? ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.p0) iVar).f129047a.N() : "";
    }

    /* renamed from: getWAAppInfo_isGame */
    public boolean m34733x497750cc() {
        xg.i iVar = this.f16183x8a30103;
        if (iVar == null) {
            return false;
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 a0Var = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.p0) iVar).f129047a;
        return (a0Var.S() == null || a0Var.S().u0() == null || !a0Var.S().u0().k()) ? false : true;
    }

    /* renamed from: getWAAppInfo_path */
    public java.lang.String m34734x351970b5() {
        xg.i iVar = this.f16183x8a30103;
        if (iVar == null) {
            return "";
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 a0Var = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.p0) iVar).f129047a;
        return (a0Var.S() == null || a0Var.S().x0() == null) ? "" : a0Var.S().x0().m52170xad58292c();
    }

    /* renamed from: nativeBindTo */
    public native void m34735x7190a28f(long j17, long j18, long j19, long j27);

    /* renamed from: nativeCreate */
    public native long m34736x73c02ff3();

    /* renamed from: nativeDestroy */
    public native void m34737x23caefe3(long j17);

    /* renamed from: nativeNotifyOrientationChanged */
    public native void m34738xe478ad24(int i17);

    /* renamed from: nativePrintLog */
    public native void m34739xd26d8a8e(java.lang.String str);

    @Override // xg.b
    /* renamed from: onDisplayOrientationChanged */
    public void mo34740x55a71e07(int i17) {
        m34738xe478ad24(i17);
    }

    /* renamed from: setMagicARCallback */
    public void m34741x23db6c41(xg.i iVar) {
        this.f16183x8a30103 = iVar;
    }

    /* renamed from: startLocationListen */
    public void m34742xdbfb7ade() {
        try {
            android.location.LocationManager locationManager = this.f16178x29e5e238;
            android.location.LocationListener locationListener = this.f16177x5bba4389;
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            zj0.a aVar = new zj0.a();
            aVar.c(mainLooper);
            aVar.c(locationListener);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            aVar.c(java.lang.Float.valueOf(0.0f));
            aVar.c(0L);
            aVar.c("gps");
            yj0.a.d(locationManager, aVar.b(), "com/tencent/magicar/MagicAR", "startLocationListen", "()V", "android/location/LocationManager_EXEC_", "requestLocationUpdates", "(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V");
            java.lang.String str = (java.lang.String) aVar.a(0);
            zj0.c.f554818a.set(aVar);
            long longValue = ((java.lang.Long) aVar.a(1)).longValue();
            zj0.a a17 = zj0.c.a();
            locationManager.requestLocationUpdates(str, longValue, ((java.lang.Float) a17.a(2)).floatValue(), (android.location.LocationListener) a17.a(3), (android.os.Looper) a17.a(4));
            yj0.a.f(locationManager, "com/tencent/magicar/MagicAR", "startLocationListen", "()V", "android/location/LocationManager_EXEC_", "requestLocationUpdates", "(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V");
            this.f16178x29e5e238.registerGnssStatusCallback(this.f16185x25d64257, this.f16181xc7640a1d);
        } catch (java.lang.SecurityException unused) {
        }
    }

    /* renamed from: stopLocationListen */
    public void m34743xa457e67e() {
        this.f16178x29e5e238.removeUpdates(this.f16177x5bba4389);
    }
}
