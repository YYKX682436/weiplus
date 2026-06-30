package bw5;

/* loaded from: classes8.dex */
public class a8 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f25058d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.k9 f25059e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25060f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f25061g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f25062h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f25063i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f25064m;

    /* renamed from: n, reason: collision with root package name */
    public int f25065n;

    /* renamed from: o, reason: collision with root package name */
    public int f25066o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f25067p = new boolean[10];

    static {
        new bw5.a8();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.a8 parseFrom(byte[] bArr) {
        return (bw5.a8) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a8)) {
            return false;
        }
        bw5.a8 a8Var = (bw5.a8) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f25058d), java.lang.Long.valueOf(a8Var.f25058d)) && n51.f.a(this.f25059e, a8Var.f25059e) && n51.f.a(this.f25060f, a8Var.f25060f) && n51.f.a(this.f25061g, a8Var.f25061g) && n51.f.a(this.f25062h, a8Var.f25062h) && n51.f.a(this.f25063i, a8Var.f25063i) && n51.f.a(this.f25064m, a8Var.f25064m) && n51.f.a(java.lang.Integer.valueOf(this.f25065n), java.lang.Integer.valueOf(a8Var.f25065n)) && n51.f.a(java.lang.Integer.valueOf(this.f25066o), java.lang.Integer.valueOf(a8Var.f25066o));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.a8();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25067p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f25058d);
            }
            bw5.k9 k9Var = this.f25059e;
            if (k9Var != null && zArr[2]) {
                fVar.i(2, k9Var.computeSize());
                this.f25059e.writeFields(fVar);
            }
            java.lang.String str = this.f25060f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f25061g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f25062h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f25063i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f25064m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            if (zArr[8]) {
                fVar.e(8, this.f25065n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f25066o);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f25058d) : 0;
            bw5.k9 k9Var2 = this.f25059e;
            if (k9Var2 != null && zArr[2]) {
                h17 += b36.f.i(2, k9Var2.computeSize());
            }
            java.lang.String str6 = this.f25060f;
            if (str6 != null && zArr[3]) {
                h17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f25061g;
            if (str7 != null && zArr[4]) {
                h17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f25062h;
            if (str8 != null && zArr[5]) {
                h17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f25063i;
            if (str9 != null && zArr[6]) {
                h17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f25064m;
            if (str10 != null && zArr[7]) {
                h17 += b36.f.j(7, str10);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f25065n);
            }
            return zArr[9] ? h17 + b36.f.e(9, this.f25066o) : h17;
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
                this.f25058d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.k9 k9Var3 = new bw5.k9();
                    if (bArr != null && bArr.length > 0) {
                        k9Var3.parseFrom(bArr);
                    }
                    this.f25059e = k9Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f25060f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25061g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25062h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25063i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f25064m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f25065n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f25066o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
