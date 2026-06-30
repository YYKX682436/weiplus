package va3;

/* loaded from: classes9.dex */
public class b0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f515795d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f515796e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f515797f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f515798g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f515799h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public byte[] f515800i = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f515801m = false;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f515802n;

    /* renamed from: o, reason: collision with root package name */
    public int f515803o;

    public b0(r45.nk3 nk3Var, java.lang.String str) {
        this.f515802n = "";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = nk3Var;
        lVar.f152198b = new r45.ok3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getpoilist";
        lVar.f152200d = 457;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f515796e = a17;
        r45.nk3 nk3Var2 = (r45.nk3) a17.f152243a.f152217a;
        int i17 = nk3Var2.f462992e;
        this.f515802n = str;
        boolean z17 = nk3Var2.f462994g.f453372d == 0;
        this.f515797f = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetPoiList", "lat: %f lng: %f scene: %d opcode: %d oriLat： %f oriLng: %f isAutoQuery: %s isFirst:%s, indoorSwitch:%s, buildingId:%s, poiFloor: %s", java.lang.Double.valueOf(nk3Var2.f462996i), java.lang.Double.valueOf(nk3Var2.f462995h), java.lang.Integer.valueOf(nk3Var2.f462991d), java.lang.Integer.valueOf(nk3Var2.f462992e), java.lang.Double.valueOf(nk3Var2.f462998n), java.lang.Double.valueOf(nk3Var2.f462997m), java.lang.Integer.valueOf(nk3Var2.f462999o), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(nk3Var2.f463002r), nk3Var2.f463003s, nk3Var2.f463004t);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetPoiList", "NetSceneGetPoiList done.");
        this.f515795d = u0Var;
        return mo9409x10f9447a(sVar, this.f515796e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 457;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.ok3 ok3Var = (r45.ok3) this.f515796e.f152244b.f152233a;
        java.util.List list = this.f515799h;
        ((java.util.ArrayList) list).clear();
        java.lang.String str2 = ok3Var.f463858m;
        this.f515798g = ok3Var.f463862q;
        this.f515803o = ok3Var.f463861p;
        java.util.LinkedList linkedList = ok3Var.f463853e;
        if (linkedList != null) {
            linkedList.size();
            if (linkedList.size() > 0) {
                java.lang.String str3 = ((r45.d35) linkedList.get(0)).f453568e;
                java.lang.String str4 = ((r45.d35) linkedList.get(0)).f453574n;
                java.lang.String str5 = ((r45.d35) linkedList.get(0)).f453577q;
                java.lang.String str6 = ((r45.d35) linkedList.get(0)).f453575o;
            }
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((java.util.ArrayList) list).add(new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0((r45.d35) it.next(), this.f515798g));
            }
        }
        r45.cu5 cu5Var = ok3Var.f463856h;
        if (cu5Var != null) {
            this.f515800i = x51.j1.d(cu5Var);
        }
        this.f515801m = ok3Var.f463855g == 1;
        this.f515795d.mo815x76e0bfae(i18, i19, str, this);
    }
}
