package com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94;

/* renamed from: com.tencent.mm.plugin.expansions.ExpansionsGlobal$CP */
/* loaded from: classes16.dex */
public class C13487xd865a7ba extends android.content.ContentProvider {
    @Override // android.content.ContentProvider
    public android.os.Bundle call(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exp.ExpansionsGlobal", "cp receive remote expansions call: " + str + ", arg=" + str2);
        if ("expansionsWait".equals(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.k(this, bundle);
            com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.n(this, kVar);
            java.util.concurrent.ExecutorService executorService = p5.m.f433515f;
            p5.n nVar2 = new p5.n();
            try {
                executorService.execute(new p5.l(null, nVar2, nVar));
            } catch (java.lang.Exception e17) {
                nVar2.a(new p5.i(e17));
            }
            nVar2.f433523a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.l(this, kVar), p5.m.f433516g, null);
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
