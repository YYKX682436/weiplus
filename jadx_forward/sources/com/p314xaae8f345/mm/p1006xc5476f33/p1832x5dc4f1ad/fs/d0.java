package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs;

/* loaded from: classes7.dex */
public final class d0 {
    public d0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.x1 m17;
        if (com.p314xaae8f345.mm.vfs.w6.j(str + "/dir.lock")) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str + "/dir.lock");
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            long j17 = 0;
            if (m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) {
                j17 = m17.f294768e;
            }
            if (currentTimeMillis - j17 < com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.e0.f229496b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushTempFileCleaner", "checkMagicDirHasLocked path %s, locked", str);
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrushTempFileCleaner", "checkMagicDirHasLocked path %s, lock expired", str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushTempFileCleaner", "checkMagicDirHasLocked path %s, lock free", str);
        return false;
    }
}
