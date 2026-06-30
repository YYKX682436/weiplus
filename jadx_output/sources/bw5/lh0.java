package bw5;

/* loaded from: classes2.dex */
public class lh0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f29781d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29782e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f29783f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f29784g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f29785h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f29786i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.x7 f29787m;

    /* renamed from: n, reason: collision with root package name */
    public int f29788n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f29789o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f29790p = new boolean[10];

    static {
        new bw5.lh0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lh0 parseFrom(byte[] bArr) {
        return (bw5.lh0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lh0)) {
            return false;
        }
        bw5.lh0 lh0Var = (bw5.lh0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f29781d), java.lang.Integer.valueOf(lh0Var.f29781d)) && n51.f.a(this.f29782e, lh0Var.f29782e) && n51.f.a(this.f29783f, lh0Var.f29783f) && n51.f.a(this.f29784g, lh0Var.f29784g) && n51.f.a(this.f29785h, lh0Var.f29785h) && n51.f.a(this.f29786i, lh0Var.f29786i) && n51.f.a(this.f29787m, lh0Var.f29787m) && n51.f.a(java.lang.Integer.valueOf(this.f29788n), java.lang.Integer.valueOf(lh0Var.f29788n)) && n51.f.a(this.f29789o, lh0Var.f29789o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.lh0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29790p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f29781d);
            }
            java.lang.String str = this.f29782e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f29783f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f29784g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f29785h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f29786i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            bw5.x7 x7Var = this.f29787m;
            if (x7Var != null && zArr[7]) {
                fVar.i(7, x7Var.computeSize());
                this.f29787m.writeFields(fVar);
            }
            if (zArr[8]) {
                fVar.e(8, this.f29788n);
            }
            java.lang.String str6 = this.f29789o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f29781d) : 0;
            java.lang.String str7 = this.f29782e;
            if (str7 != null && zArr[2]) {
                e17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f29783f;
            if (str8 != null && zArr[3]) {
                e17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f29784g;
            if (str9 != null && zArr[4]) {
                e17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f29785h;
            if (str10 != null && zArr[5]) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f29786i;
            if (str11 != null && zArr[6]) {
                e17 += b36.f.j(6, str11);
            }
            bw5.x7 x7Var2 = this.f29787m;
            if (x7Var2 != null && zArr[7]) {
                e17 += b36.f.i(7, x7Var2.computeSize());
            }
            if (zArr[8]) {
                e17 += b36.f.e(8, this.f29788n);
            }
            java.lang.String str12 = this.f29789o;
            return (str12 == null || !zArr[9]) ? e17 : e17 + b36.f.j(9, str12);
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
                this.f29781d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29782e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29783f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29784g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f29785h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f29786i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.x7 x7Var3 = new bw5.x7();
                    if (bArr != null && bArr.length > 0) {
                        x7Var3.parseFrom(bArr);
                    }
                    this.f29787m = x7Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f29788n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f29789o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
