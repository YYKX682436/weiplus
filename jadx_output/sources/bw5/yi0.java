package bw5;

/* loaded from: classes4.dex */
public class yi0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35513d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35514e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f35515f;

    /* renamed from: g, reason: collision with root package name */
    public int f35516g;

    /* renamed from: h, reason: collision with root package name */
    public int f35517h;

    /* renamed from: i, reason: collision with root package name */
    public int f35518i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f35519m = new boolean[7];

    static {
        new bw5.yi0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yi0 parseFrom(byte[] bArr) {
        return (bw5.yi0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yi0)) {
            return false;
        }
        bw5.yi0 yi0Var = (bw5.yi0) fVar;
        return n51.f.a(this.f35513d, yi0Var.f35513d) && n51.f.a(this.f35514e, yi0Var.f35514e) && n51.f.a(this.f35515f, yi0Var.f35515f) && n51.f.a(java.lang.Integer.valueOf(this.f35516g), java.lang.Integer.valueOf(yi0Var.f35516g)) && n51.f.a(java.lang.Integer.valueOf(this.f35517h), java.lang.Integer.valueOf(yi0Var.f35517h)) && n51.f.a(java.lang.Integer.valueOf(this.f35518i), java.lang.Integer.valueOf(yi0Var.f35518i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.yi0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f35519m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35513d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f35514e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f35515f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f35516g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f35517h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f35518i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f35513d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f35514e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f35515f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f35516g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f35517h);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f35518i) : i18;
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
                this.f35513d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f35514e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f35515f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35516g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f35517h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f35518i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
