package cm5;

/* loaded from: classes5.dex */
public abstract class h {
    public static void a(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6[] G;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPhotoEditUtil", "[deleteDirAllFile] dir:%s", str);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (!r6Var.m() || (G = r6Var.G()) == null) {
            return;
        }
        for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
            if (r6Var2.A() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6Var2.m82467xfb82e301()) && r6Var2.m82467xfb82e301().startsWith("wx_photo_edit_")) {
                r6Var2.l();
            }
        }
    }

    public static int b(float f17) {
        return (int) ((f17 * com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
