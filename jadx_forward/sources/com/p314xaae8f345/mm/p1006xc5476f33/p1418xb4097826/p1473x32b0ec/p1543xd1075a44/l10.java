package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class l10 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 f200417d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l10(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var) {
        super(1);
        this.f200417d = m10Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean z17 = false;
        if ((fVar != null && fVar.f152148a == 0) && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var = this.f200417d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = m10Var.f200546o;
            if (y1Var != null && !y1Var.f()) {
                z17 = true;
            }
            if (z17 || m10Var.H || m10Var.I) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "refresh game team fail");
            } else {
                r45.fr1 fr1Var = (r45.fr1) ((r45.ps1) fVar.f152151d).m75936x14adae67(1);
                if (fr1Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = m10Var.f200534c;
                    ((mm2.c1) lVar.P0(mm2.c1.class)).Y8(fr1Var);
                    ((mm2.c1) lVar.P0(mm2.c1.class)).o9(((r45.ps1) fVar.f152151d).m75933x41a8a7f2(3));
                    m10Var.q(fr1Var);
                }
            }
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh gameteam fail: ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
            sb6.append(' ');
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderLiveVisitorGameTeamWidget", sb6.toString());
        }
        return jz5.f0.f384359a;
    }
}
