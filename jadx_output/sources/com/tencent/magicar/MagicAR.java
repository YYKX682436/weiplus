package com.tencent.magicar;

/* loaded from: classes7.dex */
public class MagicAR implements xg.b {
    private byte _hellAccFlag_;
    private android.location.LocationListener locationListener;
    private android.location.LocationManager locationManager;
    private android.content.Context mContext;
    private xg.c mDislayOrientationHelper;
    private long mInst;
    private xg.i magicARCallback;
    private java.lang.String providerName;
    private android.location.GnssStatus.Callback statusCallback;
    private java.lang.String TAG = "MagicAR";
    private android.os.Handler mHandler = new android.os.Handler(android.os.Looper.getMainLooper());

    public MagicAR(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        xg.c cVar = new xg.c(applicationContext);
        this.mDislayOrientationHelper = cVar;
        cVar.f454350d.add(this);
        cVar.f454349c.enable();
        xg.f.f454351a.loadLibrary("opencv_world");
        xg.f.f454351a.loadLibrary("wechatxlog");
        xg.f.f454351a.loadLibrary("weslam");
        xg.f.f454351a.loadLibrary("magicar");
        xg.f.f454351a.loadLibrary("wevision2");
        nativeNotifyOrientationChanged(((android.view.WindowManager) this.mDislayOrientationHelper.f454347a.getSystemService("window")).getDefaultDisplay().getRotation());
        this.mInst = nativeCreate();
        createLocationLisenter(this.mContext);
    }

    private void createLocationLisenter(android.content.Context context) {
        this.locationManager = (android.location.LocationManager) context.getSystemService(ya.b.LOCATION);
        android.location.Criteria criteria = new android.location.Criteria();
        criteria.setAccuracy(1);
        criteria.setSpeedRequired(false);
        criteria.setAltitudeRequired(false);
        criteria.setBearingRequired(false);
        criteria.setCostAllowed(true);
        criteria.setPowerRequirement(1);
        this.providerName = this.locationManager.getBestProvider(criteria, true);
        nativePrintLog("provider name: " + this.providerName);
        this.statusCallback = new xg.g(this);
        this.locationListener = new xg.h(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void onGnssStatusChanged(long j17, int i17, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, int[] iArr);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onGpsLocationChanged(long j17, double d17, double d18, float f17, long j18, long j19, float f18, float f19, int i17);

    public void bindTo(long j17, long j18, long j19) {
        long j27 = this.mInst;
        if (j27 != 0) {
            nativeBindTo(j27, j17, j18, j19);
        }
    }

    public void destroy() {
        long j17 = this.mInst;
        if (j17 != 0) {
            nativeDestroy(j17);
        } else {
            this.mInst = 0L;
        }
        xg.c cVar = this.mDislayOrientationHelper;
        java.util.ArrayList arrayList = cVar.f454350d;
        arrayList.remove(this);
        if (arrayList.size() == 0) {
            cVar.f454349c.disable();
        }
    }

    public java.lang.String getLocalFilePath(java.lang.String str) {
        java.lang.String o17;
        if (this.magicARCallback == null) {
            return "";
        }
        com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var = ((com.tencent.luggage.sdk.jsapi.component.service.p0) getMagicARCallback()).f47514a;
        return (a0Var.F() == null || ((com.tencent.luggage.sdk.jsapi.component.service.y) a0Var.F()).getFileSystem() == null || ((com.tencent.luggage.sdk.jsapi.component.service.y) a0Var.F()).getFileSystem().getAbsoluteFile(str) == null || (o17 = ((com.tencent.luggage.sdk.jsapi.component.service.y) a0Var.F()).getFileSystem().getAbsoluteFile(str).o()) == null) ? "" : o17;
    }

    public xg.i getMagicARCallback() {
        return this.magicARCallback;
    }

    public java.lang.String getWAAppInfo_appId() {
        xg.i iVar = this.magicARCallback;
        return iVar != null ? ((com.tencent.luggage.sdk.jsapi.component.service.p0) iVar).f47514a.N() : "";
    }

    public boolean getWAAppInfo_isGame() {
        xg.i iVar = this.magicARCallback;
        if (iVar == null) {
            return false;
        }
        com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var = ((com.tencent.luggage.sdk.jsapi.component.service.p0) iVar).f47514a;
        return (a0Var.S() == null || a0Var.S().u0() == null || !a0Var.S().u0().k()) ? false : true;
    }

    public java.lang.String getWAAppInfo_path() {
        xg.i iVar = this.magicARCallback;
        if (iVar == null) {
            return "";
        }
        com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var = ((com.tencent.luggage.sdk.jsapi.component.service.p0) iVar).f47514a;
        return (a0Var.S() == null || a0Var.S().x0() == null) ? "" : a0Var.S().x0().getCurrentUrl();
    }

    public native void nativeBindTo(long j17, long j18, long j19, long j27);

    public native long nativeCreate();

    public native void nativeDestroy(long j17);

    public native void nativeNotifyOrientationChanged(int i17);

    public native void nativePrintLog(java.lang.String str);

    @Override // xg.b
    public void onDisplayOrientationChanged(int i17) {
        nativeNotifyOrientationChanged(i17);
    }

    public void setMagicARCallback(xg.i iVar) {
        this.magicARCallback = iVar;
    }

    public void startLocationListen() {
        try {
            android.location.LocationManager locationManager = this.locationManager;
            android.location.LocationListener locationListener = this.locationListener;
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            zj0.a aVar = new zj0.a();
            aVar.c(mainLooper);
            aVar.c(locationListener);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            aVar.c(java.lang.Float.valueOf(0.0f));
            aVar.c(0L);
            aVar.c("gps");
            yj0.a.d(locationManager, aVar.b(), "com/tencent/magicar/MagicAR", "startLocationListen", "()V", "android/location/LocationManager_EXEC_", "requestLocationUpdates", "(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V");
            java.lang.String str = (java.lang.String) aVar.a(0);
            zj0.c.f473285a.set(aVar);
            long longValue = ((java.lang.Long) aVar.a(1)).longValue();
            zj0.a a17 = zj0.c.a();
            locationManager.requestLocationUpdates(str, longValue, ((java.lang.Float) a17.a(2)).floatValue(), (android.location.LocationListener) a17.a(3), (android.os.Looper) a17.a(4));
            yj0.a.f(locationManager, "com/tencent/magicar/MagicAR", "startLocationListen", "()V", "android/location/LocationManager_EXEC_", "requestLocationUpdates", "(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V");
            this.locationManager.registerGnssStatusCallback(this.statusCallback, this.mHandler);
        } catch (java.lang.SecurityException unused) {
        }
    }

    public void stopLocationListen() {
        this.locationManager.removeUpdates(this.locationListener);
    }
}
