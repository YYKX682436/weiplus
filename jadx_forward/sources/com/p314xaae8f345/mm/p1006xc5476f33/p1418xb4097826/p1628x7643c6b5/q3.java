package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes5.dex */
public final class q3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.r f207715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f207716b;

    public q3(yz5.r rVar, android.content.Context context) {
        this.f207715a = rVar;
        this.f207716b = context;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.LinkedList m75941xfb821914;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        android.content.Context context = this.f207716b;
        yz5.r rVar = this.f207715a;
        boolean z17 = true;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.t81 t81Var = (r45.t81) fVar.f152151d;
            r45.vi2 vi2Var = (t81Var == null || (m75941xfb821914 = t81Var.m75941xfb821914(1)) == null) ? null : (r45.vi2) m75941xfb821914.getFirst();
            if (vi2Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SessionInfoService", "sessionId:" + vi2Var.m75945x2fec8307(1) + " , reject:" + vi2Var.m75939xb282bd08(2) + ", enableAction:" + vi2Var.m75939xb282bd08(3) + ", followFlag:" + vi2Var.m75939xb282bd08(5) + "  disable_sendmsg_need_follow:" + vi2Var.m75933x41a8a7f2(6));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.dj0 pk6 = ((c61.l7) i95.n0.c(c61.l7.class)).pk();
                java.lang.String m75945x2fec8307 = vi2Var.m75945x2fec8307(1);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                pk6.W0(m75945x2fec8307, vi2Var.m75939xb282bd08(2), vi2Var.m75939xb282bd08(3), vi2Var.m75939xb282bd08(5), vi2Var.m75933x41a8a7f2(6));
                rVar.C(java.lang.Boolean.valueOf(vi2Var.m75933x41a8a7f2(6)), java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c);
            } else {
                rVar.C(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574941k22));
            }
        } else {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(fVar.f152149b);
            java.lang.String str = fVar.f152150c;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            rVar.C(bool, valueOf, valueOf2, z17 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574941k22) : fVar.f152150c);
        }
        return jz5.f0.f384359a;
    }
}
