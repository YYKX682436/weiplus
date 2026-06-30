package ml3;

/* loaded from: classes11.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ml3.b f409931d;

    public a(ml3.b bVar) {
        this.f409931d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String d17;
        boolean h17;
        this.f409931d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PieceCacheCleanController", "scanMusicFile");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ql3.b Ai = ll3.o2.Ai();
        Ai.getClass();
        java.lang.String format = java.lang.String.format("SELECT * from %s WHERE updateTime < ? AND  musicType  <> 4  AND musicType  <> 10  AND musicType  <> 11   order by updateTime DESC limit 10", "Music");
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - 86400000;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor B = Ai.f446114e.B(format, new java.lang.String[]{java.lang.String.valueOf(currentTimeMillis2)});
        while (B.moveToNext()) {
            ql3.a aVar = new ql3.a();
            aVar.mo9015xbf5d97fd(B);
            arrayList.add(aVar);
        }
        B.close();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ql3.a aVar2 = (ql3.a) it.next();
            java.lang.String str = aVar2.f67008x6e8dd380;
            if (str == null) {
                str = aVar2.f67006x45670355;
            }
            if (!android.text.TextUtils.isEmpty(str) && (h17 = com.p314xaae8f345.mm.vfs.w6.h((d17 = xl3.c.d(str))))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PieceCacheCleanController", "delete music file,  %s, result:%b", d17, java.lang.Boolean.valueOf(h17));
            }
        }
        ql3.b Ai2 = ll3.o2.Ai();
        Ai2.getClass();
        java.lang.String format2 = java.lang.String.format("SELECT * from %s WHERE updateTime < ? AND musicType <> ?  order by updateTime DESC limit 10", "Music");
        long currentTimeMillis3 = java.lang.System.currentTimeMillis() - 604800000;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.database.Cursor B2 = Ai2.f446114e.B(format2, new java.lang.String[]{java.lang.String.valueOf(currentTimeMillis3), java.lang.String.valueOf(6)});
        while (B2.moveToNext()) {
            ql3.a aVar3 = new ql3.a();
            aVar3.mo9015xbf5d97fd(B2);
            arrayList2.add(aVar3);
        }
        B2.close();
        arrayList2.addAll(arrayList);
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            ql3.a aVar4 = (ql3.a) it6.next();
            java.lang.String c17 = xl3.c.c(aVar4.f66983xc8c6afdb, true);
            java.lang.String c18 = xl3.c.c(aVar4.f66983xc8c6afdb, false);
            java.lang.String e17 = xl3.c.e(aVar4.f66983xc8c6afdb, false);
            java.lang.String e18 = xl3.c.e(aVar4.f66983xc8c6afdb, true);
            com.p314xaae8f345.mm.vfs.w6.h(c17);
            com.p314xaae8f345.mm.vfs.w6.h(c18);
            com.p314xaae8f345.mm.vfs.w6.h(e17);
            com.p314xaae8f345.mm.vfs.w6.h(e18);
            ql3.b Ai3 = ll3.o2.Ai();
            java.lang.String str2 = aVar4.f66983xc8c6afdb;
            ((lt0.f) Ai3.f446113d).mo141381xc84af884(str2);
            ((lt0.f) Ai3.f446115f).mo141381xc84af884(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PieceCacheCleanController", "delete music %d %s", java.lang.Integer.valueOf(ll3.o2.Ai().f446114e.mo70514xb06685ab("Music", "musicId=?", new java.lang.String[]{aVar4.f66983xc8c6afdb})), aVar4.f66983xc8c6afdb);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PieceCacheCleanController", "scanMusic UseTime=%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c344.m40330x4c144dd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.k2.f34622x366c91de);
        c4582x424c344.m40331x936762bd(254);
        c4582x424c344.m40332x57b2b64f((int) r4);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3442.m40330x4c144dd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.k2.f34622x366c91de);
        c4582x424c3442.m40331x936762bd(255);
        c4582x424c3442.m40332x57b2b64f(1L);
        arrayList3.add(c4582x424c344);
        arrayList3.add(c4582x424c3442);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList3, false, false);
    }
}
