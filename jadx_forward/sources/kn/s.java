package kn;

/* loaded from: classes11.dex */
public class s extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f390984d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f390985e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390986f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390987g;

    /* renamed from: h, reason: collision with root package name */
    public int f390988h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390989i;

    /* renamed from: m, reason: collision with root package name */
    public int f390990m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f390991n;

    public s(java.lang.String str) {
        this.f390991n = "";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        this.f390991n = str;
        r45.sc3 sc3Var = new r45.sc3();
        sc3Var.f467156d = str;
        lVar.f152197a = sc3Var;
        lVar.f152198b = new r45.tc3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getchatroominfodetail";
        lVar.f152200d = 223;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f390984d = lVar.a();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str == null ? "" : str;
        objArr[1] = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetChatRoomInfoDetail", "chatRoomName:%s stack:%s", objArr);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f390985e = u0Var;
        return mo9409x10f9447a(sVar, this.f390984d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 223;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x032c  */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r23, int r24, int r25, java.lang.String r26, com.p314xaae8f345.mm.p971x6de15a2e.v0 r27, byte[] r28) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kn.s.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }
}
