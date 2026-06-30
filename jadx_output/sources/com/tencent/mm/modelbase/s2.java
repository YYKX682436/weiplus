package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f70803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f70804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f70805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.v2 f70806g;

    public s2(com.tencent.mm.modelbase.v2 v2Var, int i17, int i18, java.lang.String str) {
        this.f70806g = v2Var;
        this.f70803d = i17;
        this.f70804e = i18;
        this.f70805f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.vt4 vt4Var;
        r45.xb xbVar;
        com.tencent.mm.modelbase.v2 v2Var = this.f70806g;
        v2Var.f70827d.getType();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        final o45.ug ugVar = (o45.ug) v2Var.f70827d.getReqObj();
        final o45.vg vgVar = (o45.vg) v2Var.f70827d.getRespObj();
        if (vgVar == null) {
            com.tencent.mars.xlog.Log.f("MicroMsg.RemoteReqResp", "null auth.resp");
            return;
        }
        ((c01.f9) o45.qg.f343000a).getClass();
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMReqRespAuth", "summerauth onAutoAuthEnd but account not ready");
            return;
        }
        r45.sr6 sr6Var = vgVar.f343015a;
        if (sr6Var == null || (xbVar = sr6Var.f385952e) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMReqRespAuth", "summerauth mmtls auto not set as ret:%s", java.lang.Integer.valueOf(vgVar.getRetCode()));
        } else {
            int i17 = xbVar.f389940z;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMReqRespAuth", "summerauth mmtls auto:%s", java.lang.Integer.valueOf(i17));
            gm0.j1.i();
            gm0.j1.u().f273148a.f(47, java.lang.Integer.valueOf(i17));
            com.tencent.mm.network.s sVar = gm0.j1.n().f273288b.f70764d;
            if (sVar != null) {
                sVar.n1((i17 & 1) == 0);
            }
        }
        if (sr6Var != null && (vt4Var = sr6Var.f385954g) != null) {
            c01.f9.c(vt4Var.f388521h);
        }
        int i18 = this.f70803d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        int i19 = this.f70804e;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMReqRespAuth", "summerauth onAutoAuthEnd errType:%d, errCode:%d, errMsg:%s", valueOf, java.lang.Integer.valueOf(i19), this.f70805f);
        if (i18 == 0 && i19 == 0) {
            r45.i1 i1Var = sr6Var.f385953f;
            if (i1Var != null) {
                c01.je.p(i1Var.f376654w);
                c01.je.n(sr6Var.f385953f.f376655x);
                c01.je.j(sr6Var.f385953f.f376656y);
            }
            fs.g.b(c01.g9.class, new fs.o() { // from class: c01.f9$$a
                @Override // fs.o
                public final boolean a(fs.n nVar) {
                    ((fn1.a) ((c01.g9) nVar)).getClass();
                    dn1.i iVar = (dn1.i) i95.n0.c(dn1.i.class);
                    iVar.getClass();
                    o45.vg vgVar2 = vgVar;
                    c01.u7.b(vgVar2.f343015a, true);
                    c01.u7.c(vgVar2.f343015a);
                    iVar.f241874d.onAuthResponse(o45.ug.this, vgVar2, true);
                    return false;
                }
            });
            return;
        }
        if (i18 != 4 || i19 != -301) {
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.idkeyStat(148L, o45.ag.f342892a ? 119L : 120L, 1L, false);
            fVar.idkeyStat(148L, o45.ag.f342893b ? 121L : 122L, 1L, false);
            return;
        }
        jx3.f.INSTANCE.idkeyStat(148L, 18L, 1L, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMReqRespAuth", "dkidc onAutoAuthEnd RedirectIDC");
        if (sr6Var == null || sr6Var.f385954g == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMReqRespAuth", "dkidc onAutoAuthEnd RedirectIDC but NetworkSectResp is null");
        } else {
            r45.vt4 vt4Var2 = vgVar.f343015a.f385954g;
            c01.f9.d(vt4Var2.f388519f, vt4Var2.f388518e, vt4Var2.f388517d, true, vt4Var2.f388520g);
        }
    }
}
