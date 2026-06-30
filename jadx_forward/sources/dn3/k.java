package dn3;

/* loaded from: classes14.dex */
public class k extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.Vector f323556p = new java.util.Vector();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f323557d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f323558e;

    /* renamed from: f, reason: collision with root package name */
    public final int f323559f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f323560g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f323561h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f323562i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f323563m;

    /* renamed from: n, reason: collision with root package name */
    public int f323564n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f323565o;

    public k(int i17, int i18, float f17, float f18, int i19, int i27, java.lang.String str, java.lang.String str2, r45.cu5 cu5Var, java.lang.String str3, int i28, boolean z17, boolean z18, boolean z19) {
        this.f323559f = 0;
        this.f323560g = "";
        this.f323561h = "";
        this.f323562i = "";
        this.f323560g = str3;
        if (i17 != 0 && i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetLbsLifeList", "OpCode Error :" + i17);
        }
        this.f323559f = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.sh3();
        lVar.f152198b = new r45.th3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getlbslifelist";
        lVar.f152200d = 603;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f323558e = a17;
        r45.sh3 sh3Var = (r45.sh3) a17.f152243a.f152217a;
        r45.d64 d64Var = new r45.d64();
        d64Var.f453711h = str2;
        d64Var.f453712i = i27;
        d64Var.f453708e = f18;
        d64Var.f453707d = f17;
        d64Var.f453710g = str;
        d64Var.f453709f = i19;
        sh3Var.f467250g = d64Var;
        sh3Var.f467251h = str3;
        sh3Var.f467248e = i18;
        sh3Var.f467252i = i28;
        if (cu5Var == null) {
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(new byte[0]);
            sh3Var.f467249f = cu5Var2;
        } else {
            sh3Var.f467249f = cu5Var;
        }
        sh3Var.f467247d = i17;
        sh3Var.f467253m = z18 ? 1 : 0;
        sh3Var.f467256p = z19 ? 1 : 0;
        this.f323565o = z17;
        int i29 = sh3Var.f467249f.f453372d;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f323557d = u0Var;
        return mo9409x10f9447a(sVar, this.f323558e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 603;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.th3 th3Var = (r45.th3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f323562i = th3Var.f467965n;
        this.f323564n = th3Var.f467966o;
        boolean z17 = i19 == 0 || i19 == 101;
        if (i18 != 0 && !z17) {
            this.f323557d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        java.lang.String str2 = th3Var.f467964m;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        this.f323561h = str2;
        this.f323563m = new java.util.ArrayList();
        java.util.LinkedList linkedList = th3Var.f467962h;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            this.f323563m.add(new dn3.i(th3Var.f467965n, (r45.c64) it.next()));
        }
        if (th3Var.f467961g > 0) {
            r45.c64 c64Var = (r45.c64) linkedList.get(0);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(" Bid " + c64Var.f452843d);
            stringBuffer.append(" title " + c64Var.f452844e);
            stringBuffer.append(" link " + c64Var.f452851o);
            stringBuffer.append(" price " + c64Var.f452845f);
            stringBuffer.append(" rate " + c64Var.f452850n);
            stringBuffer.append(" type " + c64Var.f452852p);
            stringBuffer.append(" desc : ");
            java.util.Iterator it6 = c64Var.f452849m.iterator();
            while (it6.hasNext()) {
                stringBuffer.append(((r45.du5) it6.next()).f454289d + "-");
            }
        }
        this.f323557d.mo815x76e0bfae(i18, i19, str, this);
    }

    public k(int i17, int i18, r45.d64 d64Var) {
        this.f323559f = 0;
        this.f323560g = "";
        this.f323561h = "";
        this.f323562i = "";
        if (i17 != 0 && i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetLbsLifeList", "OpCode Error :" + i17);
        }
        this.f323559f = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.sh3();
        lVar.f152198b = new r45.th3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getlbslifelist";
        lVar.f152200d = 603;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f323558e = a17;
        r45.sh3 sh3Var = (r45.sh3) a17.f152243a.f152217a;
        sh3Var.f467250g = d64Var;
        sh3Var.f467251h = "";
        sh3Var.f467248e = i18;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(new byte[0]);
        sh3Var.f467249f = cu5Var;
        sh3Var.f467247d = i17;
    }
}
