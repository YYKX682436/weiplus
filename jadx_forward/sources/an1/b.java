package an1;

/* loaded from: classes.dex */
public final class b implements j35.b0 {
    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestCode=");
        sb6.append(i17);
        sb6.append(" and ");
        java.lang.String arrays = java.util.Arrays.toString(iArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BluetoothUtil", sb6.toString());
        i95.n0.c(tb0.j.class);
    }
}
