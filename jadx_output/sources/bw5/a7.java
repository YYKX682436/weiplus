package bw5;

/* loaded from: classes8.dex */
public class a7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f25036d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f25037e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25038f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f25039g;

    /* renamed from: h, reason: collision with root package name */
    public int f25040h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f25041i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f25042m = new boolean[7];

    static {
        new bw5.a7();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.a7 parseFrom(byte[] bArr) {
        return (bw5.a7) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a7)) {
            return false;
        }
        bw5.a7 a7Var = (bw5.a7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f25036d), java.lang.Integer.valueOf(a7Var.f25036d)) && n51.f.a(this.f25037e, a7Var.f25037e) && n51.f.a(this.f25038f, a7Var.f25038f) && n51.f.a(this.f25039g, a7Var.f25039g) && n51.f.a(java.lang.Integer.valueOf(this.f25040h), java.lang.Integer.valueOf(a7Var.f25040h)) && n51.f.a(this.f25041i, a7Var.f25041i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.a7();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25042m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f25036d);
            }
            java.lang.String str = this.f25037e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f25038f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f25039g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f25040h);
            }
            java.lang.String str4 = this.f25041i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f25036d) : 0;
            java.lang.String str5 = this.f25037e;
            if (str5 != null && zArr[2]) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f25038f;
            if (str6 != null && zArr[3]) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f25039g;
            if (str7 != null && zArr[4]) {
                e17 += b36.f.j(4, str7);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f25040h);
            }
            java.lang.String str8 = this.f25041i;
            return (str8 == null || !zArr[6]) ? e17 : e17 + b36.f.j(6, str8);
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
                this.f25036d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f25037e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25038f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25039g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25040h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25041i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
