package bw5;

/* loaded from: classes2.dex */
public class k50 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f29253d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f29254e;

    /* renamed from: f, reason: collision with root package name */
    public int f29255f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f29256g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f29257h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f29258i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f29259m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f29260n = new boolean[8];

    static {
        new bw5.k50();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.k50 parseFrom(byte[] bArr) {
        return (bw5.k50) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.k50)) {
            return false;
        }
        bw5.k50 k50Var = (bw5.k50) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f29253d), java.lang.Integer.valueOf(k50Var.f29253d)) && n51.f.a(java.lang.Boolean.valueOf(this.f29254e), java.lang.Boolean.valueOf(k50Var.f29254e)) && n51.f.a(java.lang.Integer.valueOf(this.f29255f), java.lang.Integer.valueOf(k50Var.f29255f)) && n51.f.a(this.f29256g, k50Var.f29256g) && n51.f.a(java.lang.Boolean.valueOf(this.f29257h), java.lang.Boolean.valueOf(k50Var.f29257h)) && n51.f.a(java.lang.Boolean.valueOf(this.f29258i), java.lang.Boolean.valueOf(k50Var.f29258i)) && n51.f.a(this.f29259m, k50Var.f29259m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.k50();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29260n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f29253d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f29254e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f29255f);
            }
            java.lang.String str = this.f29256g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.a(5, this.f29257h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f29258i);
            }
            java.lang.String str2 = this.f29259m;
            if (str2 != null && zArr[7]) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f29253d) : 0;
            if (zArr[2]) {
                e17 += b36.f.a(2, this.f29254e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f29255f);
            }
            java.lang.String str3 = this.f29256g;
            if (str3 != null && zArr[4]) {
                e17 += b36.f.j(4, str3);
            }
            if (zArr[5]) {
                e17 += b36.f.a(5, this.f29257h);
            }
            if (zArr[6]) {
                e17 += b36.f.a(6, this.f29258i);
            }
            java.lang.String str4 = this.f29259m;
            return (str4 == null || !zArr[7]) ? e17 : e17 + b36.f.j(7, str4);
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
                this.f29253d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29254e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29255f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29256g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f29257h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f29258i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f29259m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
