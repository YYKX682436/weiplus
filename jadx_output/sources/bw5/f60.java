package bw5;

/* loaded from: classes2.dex */
public class f60 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27170d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27171e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27172f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f27173g;

    /* renamed from: h, reason: collision with root package name */
    public int f27174h;

    /* renamed from: i, reason: collision with root package name */
    public int f27175i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f27176m = new boolean[7];

    static {
        new bw5.f60();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.f60 parseFrom(byte[] bArr) {
        return (bw5.f60) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.f60)) {
            return false;
        }
        bw5.f60 f60Var = (bw5.f60) fVar;
        return n51.f.a(this.f27170d, f60Var.f27170d) && n51.f.a(this.f27171e, f60Var.f27171e) && n51.f.a(this.f27172f, f60Var.f27172f) && n51.f.a(this.f27173g, f60Var.f27173g) && n51.f.a(java.lang.Integer.valueOf(this.f27174h), java.lang.Integer.valueOf(f60Var.f27174h)) && n51.f.a(java.lang.Integer.valueOf(this.f27175i), java.lang.Integer.valueOf(f60Var.f27175i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.f60();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f27176m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27170d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f27171e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f27172f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f27173g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.e(5, this.f27174h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f27175i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f27170d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f27171e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f27172f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f27173g;
            if (str8 != null && zArr[4]) {
                i18 += b36.f.j(4, str8);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f27174h);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f27175i) : i18;
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
                this.f27170d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27171e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27172f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27173g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27174h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27175i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
