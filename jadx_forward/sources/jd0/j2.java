package jd0;

@j95.b
/* loaded from: classes8.dex */
public class j2 extends i95.w implements kd0.v2 {
    public java.util.List wi(java.lang.String str, int[] iArr) {
        try {
            android.graphics.Bitmap bitmap = f04.f.a(new f04.c(str), new f04.e()).f339958a;
            if (bitmap != null) {
                return bt5.a.a(bitmap, iArr, true);
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanImageUtilService", e17, "scanCode exception", new java.lang.Object[0]);
            return null;
        }
    }
}
