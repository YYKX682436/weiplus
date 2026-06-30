package bw5;

/* loaded from: classes9.dex */
public class r0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32349d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f32350e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f32351f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32352g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f32353h;

    /* renamed from: i, reason: collision with root package name */
    public int f32354i;

    /* renamed from: m, reason: collision with root package name */
    public long f32355m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f32356n = new boolean[8];

    static {
        new bw5.r0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.r0)) {
            return false;
        }
        bw5.r0 r0Var = (bw5.r0) fVar;
        return n51.f.a(this.f32349d, r0Var.f32349d) && n51.f.a(this.f32350e, r0Var.f32350e) && n51.f.a(this.f32351f, r0Var.f32351f) && n51.f.a(this.f32352g, r0Var.f32352g) && n51.f.a(this.f32353h, r0Var.f32353h) && n51.f.a(java.lang.Integer.valueOf(this.f32354i), java.lang.Integer.valueOf(r0Var.f32354i)) && n51.f.a(java.lang.Long.valueOf(this.f32355m), java.lang.Long.valueOf(r0Var.f32355m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.r0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f32356n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32349d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f32350e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f32351f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f32352g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f32353h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f32354i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f32355m);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f32349d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f32350e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f32351f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f32352g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f32353h;
            if (str10 != null && zArr[5]) {
                i18 += b36.f.j(5, str10);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f32354i);
            }
            return zArr[7] ? i18 + b36.f.h(7, this.f32355m) : i18;
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
                this.f32349d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f32350e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f32351f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f32352g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32353h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f32354i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f32355m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.r0) super.parseFrom(bArr);
    }
}
