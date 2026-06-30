package qg3;

/* loaded from: classes2.dex */
public final class n0 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f444366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.ev f444367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f444368f;

    public n0(int i17, bw5.ev evVar, yz5.l lVar) {
        this.f444366d = i17;
        this.f444367e = evVar;
        this.f444368f = lVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeCgiJavaStatic", "fetchChannelFlow onCgiBack pullType:" + this.f444366d + ", errType:" + i17 + ", errCode:" + i18);
        yz5.l lVar = this.f444368f;
        if (i17 == 0 && i18 == 0 && oVar.f152244b.f152233a != null) {
            qg3.p1 p1Var = (qg3.p1) qg3.p1.f444376d.a();
            bw5.ev evVar = this.f444367e;
            p3380x6a61f93.p3383xf5152754.C30543x21b0c8c8.m169769x21b3c30e(p1Var.m105978x2737f10(), evVar != null ? evVar.mo14344x5f01b1f6() : null);
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            bw5.wp wpVar = fVar instanceof bw5.wp ? (bw5.wp) fVar : null;
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mainFlowResp:");
                sb6.append((wpVar == null || (linkedList2 = wpVar.f116341e) == null) ? null : java.lang.Integer.valueOf(linkedList2.size()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeCgiJavaStatic", sb6.toString());
                if ((wpVar == null || (linkedList = wpVar.f116341e) == null || linkedList.size() != 0) ? false : true) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.E(31240, 10022, 7);
                }
                byte[] mo14344x5f01b1f6 = wpVar != null ? wpVar.mo14344x5f01b1f6() : null;
                if (mo14344x5f01b1f6 == null) {
                    mo14344x5f01b1f6 = new byte[0];
                }
                lVar.mo146xb9724478(mo14344x5f01b1f6);
            } catch (java.lang.Exception e17) {
                lVar.mo146xb9724478(new byte[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NativeCgiJavaStatic", e17, "fetchChannelFlow toByteArray", new java.lang.Object[0]);
            }
        } else {
            lVar.mo146xb9724478(new byte[0]);
        }
        return 0;
    }
}
