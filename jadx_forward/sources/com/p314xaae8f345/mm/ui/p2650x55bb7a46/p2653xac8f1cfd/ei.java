package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes4.dex */
public final class ei implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f280506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280507b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hi f280508c;

    public ei(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, java.lang.String str, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hi hiVar) {
        this.f280506a = u3Var;
        this.f280507b = str;
        this.f280508c = hiVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f280506a;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(fVar.f152148a);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(fVar.f152149b);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
        java.lang.String str = this.f280507b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMArchiveComponent", "doubleBtnClick callback errType:%s, errCode:%s, reqTalkerName:%s rsp:%s", valueOf, valueOf2, str, fVar2);
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hi hiVar = this.f280508c;
        if (i17 == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = hiVar.f280701f;
            if (z2Var != null) {
                z2Var.B();
            }
            i41.l lVar = (i41.l) ((j41.c0) i95.n0.c(j41.c0.class));
            lVar.getClass();
            lVar.Bi().mo9951xb06685ab(new u41.e(str, null), new java.lang.String[0]);
        } else {
            java.lang.String str2 = fVar.f152150c;
            if (!(str2 == null || str2.length() == 0)) {
                yb5.d dVar = hiVar.f280113d;
                db5.e1.y(dVar != null ? dVar.g() : null, fVar.f152150c, "", hiVar.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), null);
            }
        }
        return jz5.f0.f384359a;
    }
}
