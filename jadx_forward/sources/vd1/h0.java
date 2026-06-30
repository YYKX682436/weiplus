package vd1;

/* loaded from: classes5.dex */
public final class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static long f517121b;

    /* renamed from: a, reason: collision with root package name */
    public static final vd1.h0 f517120a = new vd1.h0();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f517122c = jz5.h.b(vd1.g0.f517119d);

    public final java.lang.String a() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = currentTimeMillis - f517121b;
        jz5.g gVar = f517122c;
        if (j17 < 60000) {
            return ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).getString("key_ignore_frequency_config", "");
        }
        f517121b = currentTimeMillis;
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui("ilinkres_11f07170", "IgnoreFrequencyCheckWhiteListJson");
        if (Ui == null || android.text.TextUtils.isEmpty(Ui.m117639xfb83cc9b())) {
            return ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).getString("key_ignore_frequency_config", "");
        }
        java.lang.String M = com.p314xaae8f345.mm.vfs.w6.M(Ui.m117639xfb83cc9b());
        if (M != null) {
            if (!(M.length() == 0)) {
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).putString("key_ignore_frequency_config", M);
            }
        }
        return M;
    }
}
