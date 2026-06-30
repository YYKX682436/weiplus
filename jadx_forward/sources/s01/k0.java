package s01;

/* loaded from: classes4.dex */
public class k0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f483425d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f483426e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f483427f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f483428g;

    public k0(java.util.LinkedList linkedList, java.lang.Object obj) {
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.ao aoVar = (r45.ao) it.next();
            java.util.LinkedList linkedList2 = aoVar.f451695e;
            java.lang.String str = aoVar.f451694d;
            if (str != null && linkedList2 != null && linkedList2.size() > 0) {
                java.util.Iterator it6 = linkedList2.iterator();
                while (it6.hasNext()) {
                    this.f483427f.put((java.lang.String) it6.next(), str);
                }
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.db3();
        lVar.f152198b = new r45.eb3();
        lVar.f152199c = "/cgi-bin/mmocbiz-bin/getbizchatuserinfolist";
        lVar.f152200d = od1.b.f73036x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f483426e = a17;
        ((r45.db3) a17.f152243a.f152217a).f453816d = linkedList;
        this.f483428g = obj;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f483425d = u0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.brandservice.NetSceneGetBizChatUserInfoList", "do scene");
        return mo9409x10f9447a(sVar, this.f483426e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return od1.b.f73036x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f483425d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
