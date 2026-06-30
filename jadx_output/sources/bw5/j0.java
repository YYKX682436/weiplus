package bw5;

/* loaded from: classes12.dex */
public class j0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f28745d;

    /* renamed from: e, reason: collision with root package name */
    public long f28746e;

    /* renamed from: f, reason: collision with root package name */
    public long f28747f;

    /* renamed from: g, reason: collision with root package name */
    public long f28748g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f28749h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f28750i = new boolean[6];

    static {
        new bw5.j0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.j0)) {
            return false;
        }
        bw5.j0 j0Var = (bw5.j0) fVar;
        return n51.f.a(this.f28745d, j0Var.f28745d) && n51.f.a(java.lang.Long.valueOf(this.f28746e), java.lang.Long.valueOf(j0Var.f28746e)) && n51.f.a(java.lang.Long.valueOf(this.f28747f), java.lang.Long.valueOf(j0Var.f28747f)) && n51.f.a(java.lang.Long.valueOf(this.f28748g), java.lang.Long.valueOf(j0Var.f28748g)) && n51.f.a(this.f28749h, j0Var.f28749h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.j0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f28750i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f28745d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f28746e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f28747f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f28748g);
            }
            java.lang.String str2 = this.f28749h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f28745d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f28746e);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f28747f);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f28748g);
            }
            java.lang.String str4 = this.f28749h;
            return (str4 == null || !zArr[5]) ? i18 : i18 + b36.f.j(5, str4);
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
            this.f28745d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f28746e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f28747f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f28748g = aVar2.i(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f28749h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.j0) super.parseFrom(bArr);
    }
}
