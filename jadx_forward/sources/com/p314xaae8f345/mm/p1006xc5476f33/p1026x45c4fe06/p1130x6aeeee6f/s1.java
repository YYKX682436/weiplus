package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f;

/* loaded from: classes7.dex */
public final class s1 extends c01.i8 {
    @Override // c01.i8
    public java.lang.String a() {
        return "MicroMsg.AppBrand.V8CodeCacheDirectoryTransfer";
    }

    @Override // c01.i8
    public boolean b(int i17) {
        return !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.m48889xc55ddd52().getBoolean("MicroMsg.AppBrand.V8CodeCacheDirectoryTransfer_transfer_finished", false);
    }

    @Override // c01.i8
    public void c(int i17) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d;
        java.lang.String absolutePath = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath.concat("/");
        }
        com.p314xaae8f345.mm.vfs.w6.f(absolutePath + "tencent/MicroMsg/wxajscache");
        try {
            c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t1.class);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.V8CodeCachePathRetriever", "retrieve ipc ex = %s", e17);
            c10756x2a5d7b2d = null;
        }
        java.lang.String str = c10756x2a5d7b2d != null ? c10756x2a5d7b2d.f149939d : null;
        if (str != null) {
            java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u1.b();
            if (com.p314xaae8f345.mm.vfs.w6.j(str) && !com.p314xaae8f345.mm.vfs.w6.j(b17)) {
                android.util.Pair a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i1.a(str, b17);
                if (!((java.lang.Boolean) a17.first).booleanValue()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.V8CodeCacheDirectoryTransfer", "FileMove error: " + a17.second);
                    com.p314xaae8f345.mm.vfs.w6.u(b17);
                    com.p314xaae8f345.mm.vfs.w6.b(str, b17);
                }
            }
            com.p314xaae8f345.mm.vfs.w6.f(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.m48889xc55ddd52().edit().putBoolean("MicroMsg.AppBrand.V8CodeCacheDirectoryTransfer_transfer_finished", true).commit();
    }
}
