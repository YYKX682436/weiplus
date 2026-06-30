package bw5;

/* loaded from: classes2.dex */
public class z1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35768d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.a2 f35769e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f35770f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f35771g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.xa0 f35772h;

    /* renamed from: m, reason: collision with root package name */
    public bw5.i60 f35774m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f35775n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f35776o;

    /* renamed from: p, reason: collision with root package name */
    public int f35777p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.h2 f35778q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.o60 f35779r;

    /* renamed from: s, reason: collision with root package name */
    public int f35780s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f35781t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f35782u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f35783v;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f35773i = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f35784w = new boolean[17];

    static {
        new bw5.z1();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.z1)) {
            return false;
        }
        bw5.z1 z1Var = (bw5.z1) fVar;
        return n51.f.a(this.f35768d, z1Var.f35768d) && n51.f.a(this.f35769e, z1Var.f35769e) && n51.f.a(this.f35770f, z1Var.f35770f) && n51.f.a(this.f35771g, z1Var.f35771g) && n51.f.a(this.f35772h, z1Var.f35772h) && n51.f.a(this.f35773i, z1Var.f35773i) && n51.f.a(this.f35774m, z1Var.f35774m) && n51.f.a(java.lang.Boolean.valueOf(this.f35775n), java.lang.Boolean.valueOf(z1Var.f35775n)) && n51.f.a(this.f35776o, z1Var.f35776o) && n51.f.a(java.lang.Integer.valueOf(this.f35777p), java.lang.Integer.valueOf(z1Var.f35777p)) && n51.f.a(this.f35778q, z1Var.f35778q) && n51.f.a(this.f35779r, z1Var.f35779r) && n51.f.a(java.lang.Integer.valueOf(this.f35780s), java.lang.Integer.valueOf(z1Var.f35780s)) && n51.f.a(java.lang.Boolean.valueOf(this.f35781t), java.lang.Boolean.valueOf(z1Var.f35781t)) && n51.f.a(java.lang.Boolean.valueOf(this.f35782u), java.lang.Boolean.valueOf(z1Var.f35782u)) && n51.f.a(java.lang.Boolean.valueOf(this.f35783v), java.lang.Boolean.valueOf(z1Var.f35783v));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.z1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f35773i;
        int i18 = 0;
        boolean[] zArr = this.f35784w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35768d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.a2 a2Var = this.f35769e;
            if (a2Var != null && zArr[2]) {
                fVar.e(2, a2Var.f24976d);
            }
            java.lang.String str2 = this.f35770f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f35771g;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            bw5.xa0 xa0Var = this.f35772h;
            if (xa0Var != null && zArr[5]) {
                fVar.i(5, xa0Var.computeSize());
                this.f35772h.writeFields(fVar);
            }
            fVar.g(6, 8, linkedList);
            bw5.i60 i60Var = this.f35774m;
            if (i60Var != null && zArr[7]) {
                fVar.i(7, i60Var.computeSize());
                this.f35774m.writeFields(fVar);
            }
            if (zArr[8]) {
                fVar.a(8, this.f35775n);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f35776o;
            if (gVar2 != null && zArr[9]) {
                fVar.b(9, gVar2);
            }
            if (zArr[10]) {
                fVar.e(10, this.f35777p);
            }
            bw5.h2 h2Var = this.f35778q;
            if (h2Var != null && zArr[11]) {
                fVar.e(11, h2Var.f28053d);
            }
            bw5.o60 o60Var = this.f35779r;
            if (o60Var != null && zArr[12]) {
                fVar.i(12, o60Var.computeSize());
                this.f35779r.writeFields(fVar);
            }
            if (zArr[13]) {
                fVar.e(13, this.f35780s);
            }
            if (zArr[14]) {
                fVar.a(14, this.f35781t);
            }
            if (zArr[15]) {
                fVar.a(15, this.f35782u);
            }
            if (zArr[16]) {
                fVar.a(16, this.f35783v);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f35768d;
            if (str3 != null && zArr[1]) {
                i18 = b36.f.j(1, str3) + 0;
            }
            bw5.a2 a2Var2 = this.f35769e;
            if (a2Var2 != null && zArr[2]) {
                i18 += b36.f.e(2, a2Var2.f24976d);
            }
            java.lang.String str4 = this.f35770f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f35771g;
            if (gVar3 != null && zArr[4]) {
                i18 += b36.f.b(4, gVar3);
            }
            bw5.xa0 xa0Var2 = this.f35772h;
            if (xa0Var2 != null && zArr[5]) {
                i18 += b36.f.i(5, xa0Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(6, 8, linkedList);
            bw5.i60 i60Var2 = this.f35774m;
            if (i60Var2 != null && zArr[7]) {
                g17 += b36.f.i(7, i60Var2.computeSize());
            }
            if (zArr[8]) {
                g17 += b36.f.a(8, this.f35775n);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f35776o;
            if (gVar4 != null && zArr[9]) {
                g17 += b36.f.b(9, gVar4);
            }
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f35777p);
            }
            bw5.h2 h2Var2 = this.f35778q;
            if (h2Var2 != null && zArr[11]) {
                g17 += b36.f.e(11, h2Var2.f28053d);
            }
            bw5.o60 o60Var2 = this.f35779r;
            if (o60Var2 != null && zArr[12]) {
                g17 += b36.f.i(12, o60Var2.computeSize());
            }
            if (zArr[13]) {
                g17 += b36.f.e(13, this.f35780s);
            }
            if (zArr[14]) {
                g17 += b36.f.a(14, this.f35781t);
            }
            if (zArr[15]) {
                g17 += b36.f.a(15, this.f35782u);
            }
            return zArr[16] ? g17 + b36.f.a(16, this.f35783v) : g17;
        }
        if (i17 == 2) {
            linkedList.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        bw5.a2 a2Var3 = null;
        bw5.h2 h2Var3 = null;
        switch (intValue) {
            case 1:
                this.f35768d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                int g18 = aVar2.g(intValue);
                if (g18 == 0) {
                    a2Var3 = bw5.a2.AudioMixReqInfoAction_None;
                } else if (g18 == 21) {
                    a2Var3 = bw5.a2.AudioMixReqInfoAction_LoadMore;
                } else if (g18 == 31) {
                    a2Var3 = bw5.a2.AudioMixReqInfoAction_PullRefresh;
                } else if (g18 == 41) {
                    a2Var3 = bw5.a2.AudioMixReqInfoAction_RedDotPreload;
                } else if (g18 == 11) {
                    a2Var3 = bw5.a2.AudioMixReqInfoAction_FirstScreen;
                } else if (g18 == 12) {
                    a2Var3 = bw5.a2.AudioMixReqInfoAction_FirstScreen_Force;
                }
                this.f35769e = a2Var3;
                zArr[2] = true;
                return 0;
            case 3:
                this.f35770f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35771g = aVar2.d(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.xa0 xa0Var3 = new bw5.xa0();
                    if (bArr != null && bArr.length > 0) {
                        xa0Var3.parseFrom(bArr);
                    }
                    this.f35772h = xa0Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.v70 v70Var = new bw5.v70();
                    if (bArr2 != null && bArr2.length > 0) {
                        v70Var.parseFrom(bArr2);
                    }
                    linkedList.add(v70Var);
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.i60 i60Var3 = new bw5.i60();
                    if (bArr3 != null && bArr3.length > 0) {
                        i60Var3.parseFrom(bArr3);
                    }
                    this.f35774m = i60Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f35775n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f35776o = aVar2.d(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f35777p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                int g19 = aVar2.g(intValue);
                if (g19 == 0) {
                    h2Var3 = bw5.h2.UnKnown;
                } else if (g19 == 1) {
                    h2Var3 = bw5.h2.RedDotLoad;
                } else if (g19 == 2) {
                    h2Var3 = bw5.h2.ReLoad;
                } else if (g19 == 3) {
                    h2Var3 = bw5.h2.NormalInitLoad;
                }
                this.f35778q = h2Var3;
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.o60 o60Var3 = new bw5.o60();
                    if (bArr4 != null && bArr4.length > 0) {
                        o60Var3.parseFrom(bArr4);
                    }
                    this.f35779r = o60Var3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                this.f35780s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f35781t = aVar2.c(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f35782u = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f35783v = aVar2.c(intValue);
                zArr[16] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.z1) super.parseFrom(bArr);
    }
}
