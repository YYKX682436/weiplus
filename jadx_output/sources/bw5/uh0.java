package bw5;

/* loaded from: classes9.dex */
public class uh0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33902d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33903e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33904f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33905g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f33906h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f33907i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f33908m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f33909n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f33910o = new boolean[9];

    static {
        new bw5.uh0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.uh0 parseFrom(byte[] bArr) {
        return (bw5.uh0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.uh0)) {
            return false;
        }
        bw5.uh0 uh0Var = (bw5.uh0) fVar;
        return n51.f.a(this.f33902d, uh0Var.f33902d) && n51.f.a(this.f33903e, uh0Var.f33903e) && n51.f.a(this.f33904f, uh0Var.f33904f) && n51.f.a(this.f33905g, uh0Var.f33905g) && n51.f.a(this.f33906h, uh0Var.f33906h) && n51.f.a(java.lang.Boolean.valueOf(this.f33907i), java.lang.Boolean.valueOf(uh0Var.f33907i)) && n51.f.a(java.lang.Boolean.valueOf(this.f33908m), java.lang.Boolean.valueOf(uh0Var.f33908m)) && n51.f.a(java.lang.Boolean.valueOf(this.f33909n), java.lang.Boolean.valueOf(uh0Var.f33909n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.uh0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f33910o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33902d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f33903e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f33904f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f33905g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f33906h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.a(6, this.f33907i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f33908m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f33909n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f33902d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f33903e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f33904f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f33905g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f33906h;
            if (str10 != null && zArr[5]) {
                i18 += b36.f.j(5, str10);
            }
            if (zArr[6]) {
                i18 += b36.f.a(6, this.f33907i);
            }
            if (zArr[7]) {
                i18 += b36.f.a(7, this.f33908m);
            }
            return zArr[8] ? i18 + b36.f.a(8, this.f33909n) : i18;
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
                this.f33902d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33903e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33904f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33905g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33906h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33907i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33908m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f33909n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
