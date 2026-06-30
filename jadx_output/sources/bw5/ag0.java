package bw5;

/* loaded from: classes2.dex */
public class ag0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25187d;

    /* renamed from: e, reason: collision with root package name */
    public long f25188e;

    /* renamed from: f, reason: collision with root package name */
    public long f25189f;

    /* renamed from: g, reason: collision with root package name */
    public int f25190g;

    /* renamed from: h, reason: collision with root package name */
    public int f25191h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f25192i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f25193m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f25194n = new boolean[8];

    static {
        new bw5.ag0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ag0 parseFrom(byte[] bArr) {
        return (bw5.ag0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ag0)) {
            return false;
        }
        bw5.ag0 ag0Var = (bw5.ag0) fVar;
        return n51.f.a(this.f25187d, ag0Var.f25187d) && n51.f.a(java.lang.Long.valueOf(this.f25188e), java.lang.Long.valueOf(ag0Var.f25188e)) && n51.f.a(java.lang.Long.valueOf(this.f25189f), java.lang.Long.valueOf(ag0Var.f25189f)) && n51.f.a(java.lang.Integer.valueOf(this.f25190g), java.lang.Integer.valueOf(ag0Var.f25190g)) && n51.f.a(java.lang.Integer.valueOf(this.f25191h), java.lang.Integer.valueOf(ag0Var.f25191h)) && n51.f.a(this.f25192i, ag0Var.f25192i) && n51.f.a(this.f25193m, ag0Var.f25193m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ag0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f25194n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25187d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f25188e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f25189f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f25190g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f25191h);
            }
            java.lang.String str2 = this.f25192i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f25193m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f25187d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f25188e);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f25189f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f25190g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f25191h);
            }
            java.lang.String str5 = this.f25192i;
            if (str5 != null && zArr[6]) {
                i18 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f25193m;
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
                this.f25187d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f25188e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25189f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25190g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25191h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25192i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f25193m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
