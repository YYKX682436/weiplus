package com.tencent.mm.plugin.expansions;

/* loaded from: classes16.dex */
public class ExpansionsGlobal$CP extends android.content.ContentProvider {
    @Override // android.content.ContentProvider
    public android.os.Bundle call(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exp.ExpansionsGlobal", "cp receive remote expansions call: " + str + ", arg=" + str2);
        if ("expansionsWait".equals(str)) {
            com.tencent.mm.plugin.expansions.k kVar = new com.tencent.mm.plugin.expansions.k(this, bundle);
            com.tencent.mm.plugin.expansions.n nVar = new com.tencent.mm.plugin.expansions.n(this, kVar);
            java.util.concurrent.ExecutorService executorService = p5.m.f351982f;
            p5.n nVar2 = new p5.n();
            try {
                executorService.execute(new p5.l(null, nVar2, nVar));
            } catch (java.lang.Exception e17) {
                nVar2.a(new p5.i(e17));
            }
            nVar2.f351990a.a(new com.tencent.mm.plugin.expansions.l(this, kVar), p5.m.f351983g, null);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}
