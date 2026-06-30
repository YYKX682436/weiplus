package bw5;

/* loaded from: classes2.dex */
public class nr extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f30789d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30790e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30791f;

    /* renamed from: g, reason: collision with root package name */
    public int f30792g;

    /* renamed from: h, reason: collision with root package name */
    public int f30793h;

    /* renamed from: i, reason: collision with root package name */
    public long f30794i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f30795m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f30796n;

    /* renamed from: o, reason: collision with root package name */
    public int f30797o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f30798p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f30799q = new boolean[11];

    static {
        new bw5.nr();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nr parseFrom(byte[] bArr) {
        return (bw5.nr) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nr)) {
            return false;
        }
        bw5.nr nrVar = (bw5.nr) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f30789d), java.lang.Long.valueOf(nrVar.f30789d)) && n51.f.a(this.f30790e, nrVar.f30790e) && n51.f.a(this.f30791f, nrVar.f30791f) && n51.f.a(java.lang.Integer.valueOf(this.f30792g), java.lang.Integer.valueOf(nrVar.f30792g)) && n51.f.a(java.lang.Integer.valueOf(this.f30793h), java.lang.Integer.valueOf(nrVar.f30793h)) && n51.f.a(java.lang.Long.valueOf(this.f30794i), java.lang.Long.valueOf(nrVar.f30794i)) && n51.f.a(this.f30795m, nrVar.f30795m) && n51.f.a(this.f30796n, nrVar.f30796n) && n51.f.a(java.lang.Integer.valueOf(this.f30797o), java.lang.Integer.valueOf(nrVar.f30797o)) && n51.f.a(this.f30798p, nrVar.f30798p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.nr();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30799q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f30789d);
            }
            java.lang.String str = this.f30790e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f30791f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f30792g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f30793h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f30794i);
            }
            java.lang.String str3 = this.f30795m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f30796n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            if (zArr[9]) {
                fVar.e(9, this.f30797o);
            }
            java.lang.String str5 = this.f30798p;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f30789d) : 0;
            java.lang.String str6 = this.f30790e;
            if (str6 != null && zArr[2]) {
                h17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f30791f;
            if (str7 != null && zArr[3]) {
                h17 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f30792g);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f30793h);
            }
            if (zArr[6]) {
                h17 += b36.f.h(6, this.f30794i);
            }
            java.lang.String str8 = this.f30795m;
            if (str8 != null && zArr[7]) {
                h17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f30796n;
            if (str9 != null && zArr[8]) {
                h17 += b36.f.j(8, str9);
            }
            if (zArr[9]) {
                h17 += b36.f.e(9, this.f30797o);
            }
            java.lang.String str10 = this.f30798p;
            return (str10 == null || !zArr[10]) ? h17 : h17 + b36.f.j(10, str10);
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
                this.f30789d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30790e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30791f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30792g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30793h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30794i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30795m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f30796n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f30797o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f30798p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
