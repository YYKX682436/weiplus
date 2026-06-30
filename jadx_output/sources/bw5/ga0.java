package bw5;

/* loaded from: classes2.dex */
public class ga0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27768d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27769e;

    /* renamed from: f, reason: collision with root package name */
    public int f27770f;

    /* renamed from: g, reason: collision with root package name */
    public int f27771g;

    /* renamed from: h, reason: collision with root package name */
    public int f27772h;

    /* renamed from: i, reason: collision with root package name */
    public int f27773i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f27774m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f27775n = new boolean[8];

    static {
        new bw5.ga0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ga0 parseFrom(byte[] bArr) {
        return (bw5.ga0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ga0)) {
            return false;
        }
        bw5.ga0 ga0Var = (bw5.ga0) fVar;
        return n51.f.a(this.f27768d, ga0Var.f27768d) && n51.f.a(this.f27769e, ga0Var.f27769e) && n51.f.a(java.lang.Integer.valueOf(this.f27770f), java.lang.Integer.valueOf(ga0Var.f27770f)) && n51.f.a(java.lang.Integer.valueOf(this.f27771g), java.lang.Integer.valueOf(ga0Var.f27771g)) && n51.f.a(java.lang.Integer.valueOf(this.f27772h), java.lang.Integer.valueOf(ga0Var.f27772h)) && n51.f.a(java.lang.Integer.valueOf(this.f27773i), java.lang.Integer.valueOf(ga0Var.f27773i)) && n51.f.a(this.f27774m, ga0Var.f27774m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ga0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f27775n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27768d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f27769e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f27770f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f27771g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f27772h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f27773i);
            }
            java.lang.String str3 = this.f27774m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f27768d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f27769e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f27770f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f27771g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f27772h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f27773i);
            }
            java.lang.String str6 = this.f27774m;
            return (str6 == null || !zArr[7]) ? i18 : i18 + b36.f.j(7, str6);
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
                this.f27768d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27769e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27770f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27771g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27772h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27773i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27774m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
