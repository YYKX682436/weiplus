package bw5;

/* loaded from: classes2.dex */
public class g0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27589d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27590e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f27591f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f27592g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f27593h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f27594i = new boolean[6];

    static {
        new bw5.g0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.g0 parseFrom(byte[] bArr) {
        return (bw5.g0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.g0)) {
            return false;
        }
        bw5.g0 g0Var = (bw5.g0) fVar;
        return n51.f.a(this.f27589d, g0Var.f27589d) && n51.f.a(this.f27590e, g0Var.f27590e) && n51.f.a(this.f27591f, g0Var.f27591f) && n51.f.a(this.f27592g, g0Var.f27592g) && n51.f.a(this.f27593h, g0Var.f27593h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.g0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f27594i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27589d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f27590e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f27591f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            java.lang.String str3 = this.f27592g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f27593h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f27589d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f27590e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f27591f;
            if (gVar2 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            java.lang.String str7 = this.f27592g;
            if (str7 != null && zArr[4]) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f27593h;
            return (str8 == null || !zArr[5]) ? i18 : i18 + b36.f.j(5, str8);
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
        if (intValue == 1) {
            this.f27589d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f27590e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f27591f = aVar2.d(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f27592g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f27593h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
