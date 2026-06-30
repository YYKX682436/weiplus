package d33;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final d33.a f307732a = new d33.a();

    public final void a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1361L, i17, i18);
    }

    public final void b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageCropReport", "inc: " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1361L, (long) i17, 1L);
    }

    public final void c(int i17) {
        android.os.Debug.MemoryInfo b17 = oj.d.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (b17 != null) {
            d33.a aVar = f307732a;
            aVar.a(i17, b17.nativePss);
            aVar.a(i17 + 1, b17.dalvikPss);
        }
    }
}
