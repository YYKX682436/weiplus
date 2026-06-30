package cm5;

/* loaded from: classes5.dex */
public abstract class h {
    public static void a(java.lang.String str) {
        com.tencent.mm.vfs.r6[] G;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPhotoEditUtil", "[deleteDirAllFile] dir:%s", str);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!r6Var.m() || (G = r6Var.G()) == null) {
            return;
        }
        for (com.tencent.mm.vfs.r6 r6Var2 : G) {
            if (r6Var2.A() && !com.tencent.mm.sdk.platformtools.t8.K0(r6Var2.getName()) && r6Var2.getName().startsWith("wx_photo_edit_")) {
                r6Var2.l();
            }
        }
    }

    public static int b(float f17) {
        return (int) ((f17 * com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
