package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

/* loaded from: classes8.dex */
public class w implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f241545a;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.x xVar, km5.b bVar) {
        this.f241545a = bVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        java.util.LinkedList linkedList;
        km5.b bVar = this.f241545a;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FetchQRCodeInfoService", "fetchQRCodeInfo errType:%d errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            bVar.c(null);
            return;
        }
        r45.zf zfVar = (r45.zf) oVar.f152244b.f152233a;
        if (zfVar == null || (linkedList = zfVar.f473500e) == null || linkedList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FetchQRCodeInfoService", "resp error");
            bVar.c(null);
        } else {
            r45.aq3 aq3Var = (r45.aq3) linkedList.getFirst();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FetchQRCodeInfoService", "fetchQRCodeInfo success, ret:%s name:%s url:%s urlType:%s", java.lang.Integer.valueOf(aq3Var.f451731d), aq3Var.f451736i, aq3Var.f451732e, java.lang.Integer.valueOf(aq3Var.f451734g));
            bVar.c(aq3Var);
        }
    }
}
