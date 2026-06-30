package yb0;

@j95.b
/* loaded from: classes12.dex */
public class g extends i95.w implements zb0.b0, zb0.d0 {
    public java.lang.String Ai(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.g(context, str, str2, null);
    }

    public void Bi(android.content.Context context, java.lang.String str, zb0.a0 a0Var) {
        java.util.concurrent.Executor executor = com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.f153934a;
        java.lang.String b17 = q75.c.b("mp4");
        com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(b17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExportFileUtil", "[+] Called exportVideoWithPermissionRequest, src: %s, dest: %s", str, b17);
        com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.h(context, new x51.g0(context, str), new x51.h0(a0Var, str, b17));
    }

    public java.lang.String Di(java.lang.String str) {
        x51.x0 x0Var = x51.x0.f533642a;
        if (str != null) {
            r45.ej4 ej4Var = (r45.ej4) x51.x0.f533644c.get(str);
            r1 = ej4Var != null ? ej4Var.f455105e : null;
            x0Var.b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaExportLogic", "getExportUUID " + str + ", " + r1);
        }
        return r1;
    }

    public void Ni(android.content.Context context, java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        java.util.concurrent.Executor executor = com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.f153934a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExportFileUtil", "[+] Called requestStoragePermission, ctx: %s", context);
        if (!(context instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExportFileUtil", "[-] Context [%s] is not an ui context, regard as user denied since we can't ask him.");
            com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.a(runnable2);
            return;
        }
        boolean z17 = true;
        if (android.os.Build.VERSION.SDK_INT < 29) {
            byte[] bArr = j35.a0.f379028a;
            if (!(b3.l.m9698x3fed0563(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "android.permission.WRITE_EXTERNAL_STORAGE") == 0)) {
                z17 = false;
            }
        }
        if (!z17) {
            j35.u.j(context, 241, new x51.y(runnable, runnable2), new java.lang.String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, "", "");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExportFileUtil", "[+] hasPermission = true");
            com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.a(runnable);
        }
    }

    public void wi(android.content.Context context, java.lang.String str, zb0.a0 a0Var) {
        java.util.concurrent.Executor executor = com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.f153934a;
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            java.lang.String j17 = com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.j(str);
            com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(j17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExportFileUtil", "[+] Called exportImageWithPermissionRequest, src: %s, dest: %s", str, j17);
            com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.h(context, new x51.e0(context, str), new x51.f0(a0Var, str, j17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExportFileUtil", "[+] Called exportImageWithPermissionRequest srcNotFound: " + str);
        if (a0Var != null) {
            a0Var.b(str, "");
        }
    }
}
