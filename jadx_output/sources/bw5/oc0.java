package bw5;

/* loaded from: classes2.dex */
public class oc0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f31049d;

    /* renamed from: e, reason: collision with root package name */
    public int f31050e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f31051f;

    /* renamed from: g, reason: collision with root package name */
    public int f31052g;

    /* renamed from: h, reason: collision with root package name */
    public int f31053h;

    /* renamed from: i, reason: collision with root package name */
    public int f31054i;

    /* renamed from: m, reason: collision with root package name */
    public int f31055m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f31056n;

    /* renamed from: o, reason: collision with root package name */
    public int f31057o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f31058p;

    /* renamed from: q, reason: collision with root package name */
    public int f31059q;

    /* renamed from: r, reason: collision with root package name */
    public int f31060r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f31061s = new boolean[13];

    static {
        new bw5.oc0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.oc0 parseFrom(byte[] bArr) {
        return (bw5.oc0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.oc0)) {
            return false;
        }
        bw5.oc0 oc0Var = (bw5.oc0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f31049d), java.lang.Integer.valueOf(oc0Var.f31049d)) && n51.f.a(java.lang.Integer.valueOf(this.f31050e), java.lang.Integer.valueOf(oc0Var.f31050e)) && n51.f.a(this.f31051f, oc0Var.f31051f) && n51.f.a(java.lang.Integer.valueOf(this.f31052g), java.lang.Integer.valueOf(oc0Var.f31052g)) && n51.f.a(java.lang.Integer.valueOf(this.f31053h), java.lang.Integer.valueOf(oc0Var.f31053h)) && n51.f.a(java.lang.Integer.valueOf(this.f31054i), java.lang.Integer.valueOf(oc0Var.f31054i)) && n51.f.a(java.lang.Integer.valueOf(this.f31055m), java.lang.Integer.valueOf(oc0Var.f31055m)) && n51.f.a(this.f31056n, oc0Var.f31056n) && n51.f.a(java.lang.Integer.valueOf(this.f31057o), java.lang.Integer.valueOf(oc0Var.f31057o)) && n51.f.a(this.f31058p, oc0Var.f31058p) && n51.f.a(java.lang.Integer.valueOf(this.f31059q), java.lang.Integer.valueOf(oc0Var.f31059q)) && n51.f.a(java.lang.Integer.valueOf(this.f31060r), java.lang.Integer.valueOf(oc0Var.f31060r));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.oc0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31061s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f31049d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f31050e);
            }
            java.lang.String str = this.f31051f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.e(4, this.f31052g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f31053h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f31054i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f31055m);
            }
            java.lang.String str2 = this.f31056n;
            if (str2 != null && zArr[8]) {
                fVar.j(8, str2);
            }
            if (zArr[9]) {
                fVar.e(9, this.f31057o);
            }
            java.lang.String str3 = this.f31058p;
            if (str3 != null && zArr[10]) {
                fVar.j(10, str3);
            }
            if (zArr[11]) {
                fVar.e(11, this.f31059q);
            }
            if (!zArr[12]) {
                return 0;
            }
            fVar.e(12, this.f31060r);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f31049d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f31050e);
            }
            java.lang.String str4 = this.f31051f;
            if (str4 != null && zArr[3]) {
                e17 += b36.f.j(3, str4);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f31052g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f31053h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f31054i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f31055m);
            }
            java.lang.String str5 = this.f31056n;
            if (str5 != null && zArr[8]) {
                e17 += b36.f.j(8, str5);
            }
            if (zArr[9]) {
                e17 += b36.f.e(9, this.f31057o);
            }
            java.lang.String str6 = this.f31058p;
            if (str6 != null && zArr[10]) {
                e17 += b36.f.j(10, str6);
            }
            if (zArr[11]) {
                e17 += b36.f.e(11, this.f31059q);
            }
            return zArr[12] ? e17 + b36.f.e(12, this.f31060r) : e17;
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
                this.f31049d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f31050e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f31051f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f31052g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f31053h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f31054i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f31055m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f31056n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f31057o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f31058p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f31059q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f31060r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
