package dw3;

/* loaded from: classes4.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final dw3.g f325742d = new dw3.g();

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17;
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s18;
        java.lang.String b17 = dw3.h.f325744a.b("capture");
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFilePathUtil", "captureDir:" + b17 + " exist:" + j17);
        int i17 = 0;
        if (j17 && (s18 = com.p314xaae8f345.mm.vfs.w6.s(b17, false)) != null) {
            int i18 = 0;
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : s18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFilePathUtil", "index:" + i18 + "  path:" + x1Var.f294764a + " size:" + x1Var.f294766c);
                i18++;
            }
        }
        java.lang.String b18 = dw3.h.f325744a.b("edit");
        boolean j18 = com.p314xaae8f345.mm.vfs.w6.j(b18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFilePathUtil", "editDir:" + j18 + " exist:" + j18);
        if (!j18 || (s17 = com.p314xaae8f345.mm.vfs.w6.s(b18, false)) == null) {
            return;
        }
        for (com.p314xaae8f345.mm.vfs.x1 x1Var2 : s17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFilePathUtil", "index:" + i17 + "  path:" + x1Var2.f294764a + " size:" + x1Var2.f294766c);
            i17++;
        }
    }
}
