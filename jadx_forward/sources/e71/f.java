package e71;

/* loaded from: classes4.dex */
public class f extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f331407d;

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.nn3();
        lVar.f152198b = new r45.on3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getsafetyinfo";
        lVar.f152200d = 850;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f331407d = u0Var;
        return mo9409x10f9447a(sVar, a17, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 850;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.util.LinkedList linkedList;
        r45.iu5 iu5Var;
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetSafetyInfo", "errType:%d, errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        }
        r45.on3 on3Var = (r45.on3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 == 0 && i19 == 0) {
            if (on3Var == null || (iu5Var = on3Var.f463910d) == null || (linkedList = iu5Var.f458874d) == null) {
                linkedList = null;
            }
            if (linkedList != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetSafetyInfo", "NetSceneGetSafetyInfo onGYNetEnd get list.size = " + linkedList.size());
                e71.k.wi().m145253xb158737d("SafeDeviceInfo", "delete from SafeDeviceInfo");
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    e71.k.wi().mo51731x24249762(new e71.h((r45.nd4) it.next()), false);
                }
                e71.k.wi().m145262xf35bbb4();
            }
        }
        this.f331407d.mo815x76e0bfae(i18, i19, str, this);
    }
}
