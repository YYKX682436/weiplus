package bw5;

/* loaded from: classes2.dex */
public class zq extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.he f36114d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.sc f36115e;

    /* renamed from: f, reason: collision with root package name */
    public long f36116f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f36117g;

    /* renamed from: h, reason: collision with root package name */
    public int f36118h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f36119i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f36120m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f36122o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f36124q;

    /* renamed from: s, reason: collision with root package name */
    public int f36126s;

    /* renamed from: t, reason: collision with root package name */
    public int f36127t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.sp f36128u;

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f36121n = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f36123p = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public java.util.LinkedList f36125r = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f36129v = new boolean[16];

    static {
        new bw5.zq();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zq)) {
            return false;
        }
        bw5.zq zqVar = (bw5.zq) fVar;
        return n51.f.a(this.f36114d, zqVar.f36114d) && n51.f.a(this.f36115e, zqVar.f36115e) && n51.f.a(java.lang.Long.valueOf(this.f36116f), java.lang.Long.valueOf(zqVar.f36116f)) && n51.f.a(this.f36117g, zqVar.f36117g) && n51.f.a(java.lang.Integer.valueOf(this.f36118h), java.lang.Integer.valueOf(zqVar.f36118h)) && n51.f.a(this.f36119i, zqVar.f36119i) && n51.f.a(this.f36120m, zqVar.f36120m) && n51.f.a(this.f36121n, zqVar.f36121n) && n51.f.a(this.f36122o, zqVar.f36122o) && n51.f.a(this.f36123p, zqVar.f36123p) && n51.f.a(this.f36124q, zqVar.f36124q) && n51.f.a(this.f36125r, zqVar.f36125r) && n51.f.a(java.lang.Integer.valueOf(this.f36126s), java.lang.Integer.valueOf(zqVar.f36126s)) && n51.f.a(java.lang.Integer.valueOf(this.f36127t), java.lang.Integer.valueOf(zqVar.f36127t)) && n51.f.a(this.f36128u, zqVar.f36128u);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.zq();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f36129v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f36114d;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.f36114d.writeFields(fVar);
            }
            bw5.sc scVar = this.f36115e;
            if (scVar != null && zArr[2]) {
                fVar.i(2, scVar.computeSize());
                this.f36115e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.h(3, this.f36116f);
            }
            java.lang.String str = this.f36117g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.e(5, this.f36118h);
            }
            java.lang.String str2 = this.f36119i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f36120m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            fVar.g(8, 1, this.f36121n);
            java.lang.String str4 = this.f36122o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            fVar.g(10, 8, this.f36123p);
            java.lang.String str5 = this.f36124q;
            if (str5 != null && zArr[11]) {
                fVar.j(11, str5);
            }
            fVar.g(12, 1, this.f36125r);
            if (zArr[13]) {
                fVar.e(13, this.f36126s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f36127t);
            }
            bw5.sp spVar = this.f36128u;
            if (spVar != null && zArr[15]) {
                fVar.i(15, spVar.computeSize());
                this.f36128u.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f36114d;
            if (heVar2 != null && zArr[1]) {
                i18 = b36.f.i(1, heVar2.computeSize()) + 0;
            }
            bw5.sc scVar2 = this.f36115e;
            if (scVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, scVar2.computeSize());
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f36116f);
            }
            java.lang.String str6 = this.f36117g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f36118h);
            }
            java.lang.String str7 = this.f36119i;
            if (str7 != null && zArr[6]) {
                i18 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f36120m;
            if (str8 != null && zArr[7]) {
                i18 += b36.f.j(7, str8);
            }
            int g17 = i18 + b36.f.g(8, 1, this.f36121n);
            java.lang.String str9 = this.f36122o;
            if (str9 != null && zArr[9]) {
                g17 += b36.f.j(9, str9);
            }
            int g18 = g17 + b36.f.g(10, 8, this.f36123p);
            java.lang.String str10 = this.f36124q;
            if (str10 != null && zArr[11]) {
                g18 += b36.f.j(11, str10);
            }
            int g19 = g18 + b36.f.g(12, 1, this.f36125r);
            if (zArr[13]) {
                g19 += b36.f.e(13, this.f36126s);
            }
            if (zArr[14]) {
                g19 += b36.f.e(14, this.f36127t);
            }
            bw5.sp spVar2 = this.f36128u;
            return (spVar2 == null || !zArr[15]) ? g19 : g19 + b36.f.i(15, spVar2.computeSize());
        }
        if (i17 == 2) {
            this.f36121n.clear();
            this.f36123p.clear();
            this.f36125r.clear();
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
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    this.f36114d = heVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.sc scVar3 = new bw5.sc();
                    if (bArr2 != null && bArr2.length > 0) {
                        scVar3.parseFrom(bArr2);
                    }
                    this.f36115e = scVar3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f36116f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f36117g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f36118h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f36119i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f36120m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f36121n.add(aVar2.k(intValue));
                zArr[8] = true;
                return 0;
            case 9:
                this.f36122o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.aw awVar = new bw5.aw();
                    if (bArr3 != null && bArr3.length > 0) {
                        awVar.parseFrom(bArr3);
                    }
                    this.f36123p.add(awVar);
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f36124q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f36125r.add(aVar2.k(intValue));
                zArr[12] = true;
                return 0;
            case 13:
                this.f36126s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f36127t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.sp spVar3 = new bw5.sp();
                    if (bArr4 != null && bArr4.length > 0) {
                        spVar3.parseFrom(bArr4);
                    }
                    this.f36128u = spVar3;
                }
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.zq) super.parseFrom(bArr);
    }
}
