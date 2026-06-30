package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* loaded from: classes4.dex */
public class u implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.v f223179a;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.v vVar) {
        this.f223179a = vVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        p33.c cVar;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InteractiveMsgMRecycleView", "do CgiGetInteractiveMsgContentRequest errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.v vVar = this.f223179a;
        if (i17 == 0 && fVar.f152149b == 0 && (cVar = ((p33.d) fVar.f152151d).f433059d) != null) {
            java.util.Iterator it = cVar.f433055d.iterator();
            while (it.hasNext()) {
                p33.i iVar = (p33.i) it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a.l1(vVar.f223181d, iVar.f433121d, iVar.f433123f, iVar.f433124g);
            }
        }
        vVar.f223181d.t1();
        return null;
    }
}
