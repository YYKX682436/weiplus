package ks3;

/* loaded from: classes4.dex */
public class d0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f393185d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f393186e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f393187f;

    public d0(java.util.ArrayList arrayList) {
        this.f393187f = arrayList;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new ks3.c();
        lVar.f152198b = new ks3.d();
        lVar.f152199c = "/cgi-bin/micromsg-bin/checkconversationfile";
        lVar.f152200d = 483;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f393186e = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f393185d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f393186e;
        ks3.c cVar = (ks3.c) oVar.f152243a.f152217a;
        java.util.ArrayList arrayList = this.f393187f;
        cVar.f393175d = arrayList.size();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long longValue = ((java.lang.Long) it.next()).longValue();
            ks3.h hVar = new ks3.h();
            hVar.f393214e = longValue;
            linkedList.add(hVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckConversationFile", "MsgId: %d", java.lang.Long.valueOf(longValue));
        }
        cVar.f393176e = linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckConversationFile", "Count = %d, MsgInfoList.size = %d", java.lang.Integer.valueOf(cVar.f393175d), java.lang.Integer.valueOf(cVar.f393176e.size()));
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 483;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckConversationFile", "onGYNetEnd, netId: %d, errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if ((i18 != 0 || i19 != 0) && (u0Var = this.f393185d) != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = this.f393185d;
        if (u0Var2 != null) {
            u0Var2.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
