package bw5;

/* loaded from: classes2.dex */
public class gq0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f27951d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27952e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f27953f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27954g;

    /* renamed from: h, reason: collision with root package name */
    public int f27955h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f27956i;

    /* renamed from: m, reason: collision with root package name */
    public int f27957m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f27958n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.dc0 f27959o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f27960p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f27961q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f27962r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f27963s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f27964t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f27965u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f27966v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f27967w = new boolean[17];

    static {
        new bw5.gq0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gq0 parseFrom(byte[] bArr) {
        return (bw5.gq0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gq0)) {
            return false;
        }
        bw5.gq0 gq0Var = (bw5.gq0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f27951d), java.lang.Integer.valueOf(gq0Var.f27951d)) && n51.f.a(this.f27952e, gq0Var.f27952e) && n51.f.a(this.f27953f, gq0Var.f27953f) && n51.f.a(java.lang.Boolean.valueOf(this.f27954g), java.lang.Boolean.valueOf(gq0Var.f27954g)) && n51.f.a(java.lang.Integer.valueOf(this.f27955h), java.lang.Integer.valueOf(gq0Var.f27955h)) && n51.f.a(java.lang.Boolean.valueOf(this.f27956i), java.lang.Boolean.valueOf(gq0Var.f27956i)) && n51.f.a(java.lang.Integer.valueOf(this.f27957m), java.lang.Integer.valueOf(gq0Var.f27957m)) && n51.f.a(this.f27958n, gq0Var.f27958n) && n51.f.a(this.f27959o, gq0Var.f27959o) && n51.f.a(java.lang.Boolean.valueOf(this.f27960p), java.lang.Boolean.valueOf(gq0Var.f27960p)) && n51.f.a(this.f27961q, gq0Var.f27961q) && n51.f.a(java.lang.Boolean.valueOf(this.f27962r), java.lang.Boolean.valueOf(gq0Var.f27962r)) && n51.f.a(java.lang.Boolean.valueOf(this.f27963s), java.lang.Boolean.valueOf(gq0Var.f27963s)) && n51.f.a(this.f27964t, gq0Var.f27964t) && n51.f.a(java.lang.Boolean.valueOf(this.f27965u), java.lang.Boolean.valueOf(gq0Var.f27965u)) && n51.f.a(java.lang.Boolean.valueOf(this.f27966v), java.lang.Boolean.valueOf(gq0Var.f27966v));
    }

    public java.lang.String getUrl() {
        return this.f27967w[2] ? this.f27952e : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gq0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27967w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f27951d);
            }
            java.lang.String str = this.f27952e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f27953f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.a(4, this.f27954g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f27955h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f27956i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f27957m);
            }
            java.lang.String str2 = this.f27958n;
            if (str2 != null && zArr[8]) {
                fVar.j(8, str2);
            }
            bw5.dc0 dc0Var = this.f27959o;
            if (dc0Var != null && zArr[9]) {
                fVar.i(9, dc0Var.computeSize());
                this.f27959o.writeFields(fVar);
            }
            if (zArr[10]) {
                fVar.a(10, this.f27960p);
            }
            java.lang.String str3 = this.f27961q;
            if (str3 != null && zArr[11]) {
                fVar.j(11, str3);
            }
            if (zArr[12]) {
                fVar.a(12, this.f27962r);
            }
            if (zArr[13]) {
                fVar.a(13, this.f27963s);
            }
            java.lang.String str4 = this.f27964t;
            if (str4 != null && zArr[14]) {
                fVar.j(14, str4);
            }
            if (zArr[15]) {
                fVar.a(15, this.f27965u);
            }
            if (zArr[16]) {
                fVar.a(16, this.f27966v);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f27951d) + 0 : 0;
            java.lang.String str5 = this.f27952e;
            if (str5 != null && zArr[2]) {
                e17 += b36.f.j(2, str5);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f27953f;
            if (gVar2 != null && zArr[3]) {
                e17 += b36.f.b(3, gVar2);
            }
            if (zArr[4]) {
                e17 += b36.f.a(4, this.f27954g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f27955h);
            }
            if (zArr[6]) {
                e17 += b36.f.a(6, this.f27956i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f27957m);
            }
            java.lang.String str6 = this.f27958n;
            if (str6 != null && zArr[8]) {
                e17 += b36.f.j(8, str6);
            }
            bw5.dc0 dc0Var2 = this.f27959o;
            if (dc0Var2 != null && zArr[9]) {
                e17 += b36.f.i(9, dc0Var2.computeSize());
            }
            if (zArr[10]) {
                e17 += b36.f.a(10, this.f27960p);
            }
            java.lang.String str7 = this.f27961q;
            if (str7 != null && zArr[11]) {
                e17 += b36.f.j(11, str7);
            }
            if (zArr[12]) {
                e17 += b36.f.a(12, this.f27962r);
            }
            if (zArr[13]) {
                e17 += b36.f.a(13, this.f27963s);
            }
            java.lang.String str8 = this.f27964t;
            if (str8 != null && zArr[14]) {
                e17 += b36.f.j(14, str8);
            }
            if (zArr[15]) {
                e17 += b36.f.a(15, this.f27965u);
            }
            return zArr[16] ? e17 + b36.f.a(16, this.f27966v) : e17;
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
                this.f27951d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27952e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27953f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27954g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27955h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27956i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27957m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f27958n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.dc0 dc0Var3 = new bw5.dc0();
                    if (bArr != null && bArr.length > 0) {
                        dc0Var3.parseFrom(bArr);
                    }
                    this.f27959o = dc0Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f27960p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f27961q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f27962r = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f27963s = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f27964t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f27965u = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f27966v = aVar2.c(intValue);
                zArr[16] = true;
                return 0;
            default:
                return -1;
        }
    }
}
