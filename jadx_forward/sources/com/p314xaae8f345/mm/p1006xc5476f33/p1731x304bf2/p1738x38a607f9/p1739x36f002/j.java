package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002;

/* loaded from: classes8.dex */
public class j implements java.lang.Runnable {
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.k kVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.f220952a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.l lVar : com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.l.m64481xcee59d22()) {
                if (lVar != com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.l.PERMANENT) {
                    java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.f220952a + lVar.name() + "/";
                    long j17 = lVar.f220951d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.a(new com.p314xaae8f345.mm.vfs.r6(str2), j17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.a(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.e(lVar)), j17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.a(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.b(lVar)), j17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.a(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.c(lVar)), j17);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameFileManager", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFileManager", "remove expire files cost time:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
