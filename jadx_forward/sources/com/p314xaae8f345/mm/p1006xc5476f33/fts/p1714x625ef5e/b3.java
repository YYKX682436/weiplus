package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class b3 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e3 f219007q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e3 e3Var, p13.u uVar) {
        super(uVar);
        this.f219007q = e3Var;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchSenderTask";
    }

    @Override // p13.c
    public int k() {
        return 33;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        o("start");
        p13.u uVar = this.f432668n;
        java.lang.String str = uVar.f432674c;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e3 e3Var = this.f219007q;
        p13.r c17 = p13.r.c(str, false, e3Var.f219055p);
        vVar.f432692d = c17;
        e3Var.f219050h.getClass();
        android.database.Cursor L0 = ((com.p314xaae8f345.mm.p2621x8fb0427b.z9) ((ro3.e) ((st0.f) i95.n0.c(st0.f.class))).wi()).L0(c17.f432662a);
        try {
            if (L0 == null) {
                return;
            }
            try {
                L0.moveToFirst();
                while (!L0.isAfterLast()) {
                    p13.y yVar = new p13.y();
                    yVar.f432723h = L0.getString(0);
                    yVar.f432720e = L0.getString(1);
                    yVar.f432730o = java.lang.Integer.valueOf(L0.getInt(2));
                    yVar.f432718c = 55;
                    vVar.f432693e.add(yVar);
                    L0.moveToNext();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", e17, "", new java.lang.Object[0]);
            }
            L0.close();
            java.util.Collections.sort(vVar.f432693e, uVar.f432683l);
            o("findSender");
        } catch (java.lang.Throwable th6) {
            L0.close();
            throw th6;
        }
    }
}
