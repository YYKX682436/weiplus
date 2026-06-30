package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f219352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.C15587x9e6f975b f219353e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.C15587x9e6f975b c15587x9e6f975b, android.content.Context context) {
        this.f219353e = c15587x9e6f975b;
        this.f219352d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.o oVar;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.o oVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.o oVar3;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean m63580x977ac24b = this.f219353e.m63580x977ac24b(this.f219352d);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(m63580x977ac24b);
        oVar = this.f219353e.f36405x633fb29;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(oVar.f219399b);
        oVar2 = this.f219353e.f36405x633fb29;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.GroupTrainMgr", "init: loadDefault ok=%s, version=%d, boosters=%d, cost=%dms", valueOf, valueOf2, java.lang.Integer.valueOf(oVar2.f219398a.size()), java.lang.Long.valueOf(currentTimeMillis2));
        if (m63580x977ac24b) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.p.a(35);
            this.f219353e.m63573x12b99dfa();
            this.f219353e.m63587xb66fb58c();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.p.a(18);
            oVar3 = this.f219353e.f36405x633fb29;
            if (oVar3.f219398a.isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.p.a(20);
            }
        }
    }
}
