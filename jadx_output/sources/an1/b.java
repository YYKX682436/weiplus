package an1;

/* loaded from: classes.dex */
public final class b implements j35.b0 {
    @Override // j35.b0
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestCode=");
        sb6.append(i17);
        sb6.append(" and ");
        java.lang.String arrays = java.util.Arrays.toString(iArr);
        kotlin.jvm.internal.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        com.tencent.mars.xlog.Log.i("MicroMsg.BluetoothUtil", sb6.toString());
        i95.n0.c(tb0.j.class);
    }
}
