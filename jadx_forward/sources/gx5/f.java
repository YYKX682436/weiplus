package gx5;

/* loaded from: classes14.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f358991a;

    /* renamed from: b, reason: collision with root package name */
    public static f04.j f358992b;

    /* renamed from: c, reason: collision with root package name */
    public static ny4.g f358993c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f358994d;

    static {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_scan_always_show_ocr_menu_when_model_invalid, 0) == 1;
        f358994d = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WordDetectModHelper", "alwaysShowOcrMenuWhenModelInvalid: %s", java.lang.Boolean.valueOf(z17));
    }

    public static byte[] a(android.graphics.Bitmap bitmap) {
        try {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bitmap.getByteCount());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            byte[] bArr = new byte[(array.length / 4) * 3];
            for (int i17 = 0; i17 < array.length / 4; i17++) {
                int i18 = i17 * 3;
                int i19 = i17 * 4;
                bArr[i18] = array[i19];
                bArr[i18 + 1] = array[i19 + 1];
                bArr[i18 + 2] = array[i19 + 2];
            }
            return bArr;
        } catch (java.lang.OutOfMemoryError unused) {
            return null;
        }
    }

    public static void b(gx5.e eVar, g04.k kVar) {
        if (eVar != null) {
            ((g04.d) eVar).a(kVar);
        }
    }
}
