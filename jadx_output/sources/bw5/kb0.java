package bw5;

/* loaded from: classes2.dex */
public class kb0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f29329d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29330e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f29331f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f29332g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f29333h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.mc0 f29334i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.mc0 f29335m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f29336n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.v70 f29337o;

    /* renamed from: p, reason: collision with root package name */
    public int f29338p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f29339q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f29340r = new boolean[12];

    static {
        new bw5.kb0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kb0)) {
            return false;
        }
        bw5.kb0 kb0Var = (bw5.kb0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f29329d), java.lang.Integer.valueOf(kb0Var.f29329d)) && n51.f.a(this.f29330e, kb0Var.f29330e) && n51.f.a(this.f29331f, kb0Var.f29331f) && n51.f.a(this.f29332g, kb0Var.f29332g) && n51.f.a(this.f29333h, kb0Var.f29333h) && n51.f.a(this.f29334i, kb0Var.f29334i) && n51.f.a(this.f29335m, kb0Var.f29335m) && n51.f.a(this.f29336n, kb0Var.f29336n) && n51.f.a(this.f29337o, kb0Var.f29337o) && n51.f.a(java.lang.Integer.valueOf(this.f29338p), java.lang.Integer.valueOf(kb0Var.f29338p)) && n51.f.a(java.lang.Boolean.valueOf(this.f29339q), java.lang.Boolean.valueOf(kb0Var.f29339q));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.kb0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29340r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f29329d);
            }
            java.lang.String str = this.f29330e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f29331f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f29332g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f29333h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            bw5.mc0 mc0Var = this.f29334i;
            if (mc0Var != null && zArr[6]) {
                fVar.i(6, mc0Var.computeSize());
                this.f29334i.writeFields(fVar);
            }
            bw5.mc0 mc0Var2 = this.f29335m;
            if (mc0Var2 != null && zArr[7]) {
                fVar.i(7, mc0Var2.computeSize());
                this.f29335m.writeFields(fVar);
            }
            java.lang.String str5 = this.f29336n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            bw5.v70 v70Var = this.f29337o;
            if (v70Var != null && zArr[9]) {
                fVar.i(9, v70Var.computeSize());
                this.f29337o.writeFields(fVar);
            }
            if (zArr[10]) {
                fVar.e(10, this.f29338p);
            }
            if (zArr[11]) {
                fVar.a(11, this.f29339q);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f29329d) : 0;
            java.lang.String str6 = this.f29330e;
            if (str6 != null && zArr[2]) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f29331f;
            if (str7 != null && zArr[3]) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f29332g;
            if (str8 != null && zArr[4]) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f29333h;
            if (str9 != null && zArr[5]) {
                e17 += b36.f.j(5, str9);
            }
            bw5.mc0 mc0Var3 = this.f29334i;
            if (mc0Var3 != null && zArr[6]) {
                e17 += b36.f.i(6, mc0Var3.computeSize());
            }
            bw5.mc0 mc0Var4 = this.f29335m;
            if (mc0Var4 != null && zArr[7]) {
                e17 += b36.f.i(7, mc0Var4.computeSize());
            }
            java.lang.String str10 = this.f29336n;
            if (str10 != null && zArr[8]) {
                e17 += b36.f.j(8, str10);
            }
            bw5.v70 v70Var2 = this.f29337o;
            if (v70Var2 != null && zArr[9]) {
                e17 += b36.f.i(9, v70Var2.computeSize());
            }
            if (zArr[10]) {
                e17 += b36.f.e(10, this.f29338p);
            }
            return zArr[11] ? e17 + b36.f.a(11, this.f29339q) : e17;
        }
        if (i17 == 2) {
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
                this.f29329d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29330e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29331f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29332g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f29333h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.mc0 mc0Var5 = new bw5.mc0();
                    if (bArr != null && bArr.length > 0) {
                        mc0Var5.parseFrom(bArr);
                    }
                    this.f29334i = mc0Var5;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.mc0 mc0Var6 = new bw5.mc0();
                    if (bArr2 != null && bArr2.length > 0) {
                        mc0Var6.parseFrom(bArr2);
                    }
                    this.f29335m = mc0Var6;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f29336n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.v70 v70Var3 = new bw5.v70();
                    if (bArr3 != null && bArr3.length > 0) {
                        v70Var3.parseFrom(bArr3);
                    }
                    this.f29337o = v70Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f29338p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f29339q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.kb0) super.parseFrom(bArr);
    }
}
