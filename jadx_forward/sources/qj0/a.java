package qj0;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f445397a;

    public a() {
        android.os.Debug.MemoryInfo[] processMemoryInfo;
        android.os.Debug.MemoryInfo memoryInfo;
        int[] iArr = null;
        this.f445397a = null;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        if (activityManager == null || (processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{android.os.Process.myPid()})) == null || processMemoryInfo.length == 0 || (memoryInfo = processMemoryInfo[0]) == null) {
            return;
        }
        try {
            java.lang.reflect.Field declaredField = java.lang.Class.forName("android.os.Debug$MemoryInfo").getDeclaredField("otherStats");
            declaredField.setAccessible(true);
            iArr = (int[]) declaredField.get(memoryInfo);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Gpu.GpuMemoryGetter", "getOtherStatsByReflect fail");
        }
        this.f445397a = iArr;
    }

    public int a() {
        int[] iArr = this.f445397a;
        if (iArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Gpu.GpuMemoryGetter", "getEGL fail, because otherStats == null");
            return 0;
        }
        try {
            return iArr[131] + iArr[129];
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Gpu.GpuMemoryGetter", "getEGL fail, because getOtherPrivate fail");
            return 0;
        }
    }

    public int b() {
        int[] iArr = this.f445397a;
        if (iArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Gpu.GpuMemoryGetter", "getGL fail, because getOtherStats == null");
            return 0;
        }
        try {
            return iArr[140] + iArr[138];
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Gpu.GpuMemoryGetter", "getGL fail, because getOtherStats == null");
            return 0;
        }
    }

    public int c() {
        int[] iArr = this.f445397a;
        if (iArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Gpu.GpuMemoryGetter", "getGfx fail, because otherStats == null");
            return 0;
        }
        try {
            return iArr[41] + iArr[39];
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Gpu.GpuMemoryGetter", "getGfx fail, because getOtherPrivate fail");
            return 0;
        }
    }
}
