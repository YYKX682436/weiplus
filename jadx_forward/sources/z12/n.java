package z12;

/* loaded from: classes4.dex */
public class n extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f550866d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f550867e;

    /* renamed from: f, reason: collision with root package name */
    public final int f550868f;

    /* renamed from: g, reason: collision with root package name */
    public final int f550869g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f550870h;

    /* renamed from: i, reason: collision with root package name */
    public final int f550871i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f550872m;

    /* renamed from: n, reason: collision with root package name */
    public final int f550873n;

    public n(int i17, int i18, int i19, java.lang.String str, int i27, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.be3();
        lVar.f152198b = new r45.ce3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmgetdesigneremojilist";
        lVar.f152200d = gd1.h.f69799x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f550866d = lVar.a();
        this.f550868f = i17;
        this.f550869g = i18;
        this.f550871i = i19;
        this.f550872m = str;
        this.f550870h = bArr;
        this.f550873n = i27;
    }

    public r45.ce3 H() {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f550866d;
        if (oVar == null) {
            return null;
        }
        return (r45.ce3) oVar.f152244b.f152233a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f550867e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f550866d;
        r45.be3 be3Var = (r45.be3) oVar.f152243a.f152217a;
        byte[] bArr = this.f550870h;
        if (bArr != null) {
            be3Var.f452222f = x51.j1.a(bArr);
        } else {
            be3Var.f452222f = new r45.cu5();
        }
        r45.cu5 cu5Var = be3Var.f452222f;
        if (cu5Var != null) {
            cu5Var.m161592x9616526c();
        }
        be3Var.f452221e = this.f550869g;
        be3Var.f452220d = this.f550868f;
        be3Var.f452223g = this.f550871i;
        be3Var.f452224h = this.f550872m;
        be3Var.f452225i = this.f550873n;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return gd1.h.f69799x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        byte[] bArr2;
        int i27;
        z85.r rVar;
        if (((i18 == 0 && i19 == 0) || (i18 == 4 && (i19 == 2 || i19 == 3))) && (((bArr2 = this.f550870h) == null || bArr2.length <= 0) && this.f550868f != 3 && (i27 = this.f550869g) != 0)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n5 Ai = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai();
            synchronized (Ai.f276696a) {
                rVar = Ai.f276705j;
            }
            java.lang.String str2 = i27 + "";
            r45.ce3 H = H();
            rVar.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || H == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerEmojiListResponseByUIN failed. designerID or response is null.");
            } else {
                try {
                    z85.q qVar = new z85.q();
                    qVar.f69297x137f2586 = str2 + 2;
                    qVar.f69296xad49e234 = H.mo14344x5f01b1f6();
                    if (rVar.f552352d.m("EmotionDesignerInfo", "designerIDAndType", qVar.mo9763xeb27878e()) > 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmotionDesignerInfo", "savePersonalDesignerResponseByUIN success. designerID:%s", str2);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmotionDesignerInfo", "savePersonalDesignerResponseByUIN failed. designerID:%s", str2);
                    }
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
            }
        }
        r45.cu5 cu5Var = ((r45.ce3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a).f453030e;
        if (cu5Var != null) {
            this.f550870h = x51.j1.d(cu5Var);
        }
        this.f550867e.mo815x76e0bfae(i18, i19, str, this);
    }
}
