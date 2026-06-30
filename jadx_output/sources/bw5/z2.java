package bw5;

/* loaded from: classes4.dex */
public class z2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f35790d;

    /* renamed from: e, reason: collision with root package name */
    public int f35791e;

    /* renamed from: f, reason: collision with root package name */
    public int f35792f;

    /* renamed from: g, reason: collision with root package name */
    public int f35793g;

    /* renamed from: h, reason: collision with root package name */
    public int f35794h;

    /* renamed from: i, reason: collision with root package name */
    public int f35795i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f35796m = new boolean[7];

    static {
        new bw5.z2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.z2 parseFrom(byte[] bArr) {
        return (bw5.z2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.z2)) {
            return false;
        }
        bw5.z2 z2Var = (bw5.z2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f35790d), java.lang.Integer.valueOf(z2Var.f35790d)) && n51.f.a(java.lang.Integer.valueOf(this.f35791e), java.lang.Integer.valueOf(z2Var.f35791e)) && n51.f.a(java.lang.Integer.valueOf(this.f35792f), java.lang.Integer.valueOf(z2Var.f35792f)) && n51.f.a(java.lang.Integer.valueOf(this.f35793g), java.lang.Integer.valueOf(z2Var.f35793g)) && n51.f.a(java.lang.Integer.valueOf(this.f35794h), java.lang.Integer.valueOf(z2Var.f35794h)) && n51.f.a(java.lang.Integer.valueOf(this.f35795i), java.lang.Integer.valueOf(z2Var.f35795i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.z2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35796m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f35790d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f35791e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f35792f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f35793g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f35794h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f35795i);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f35790d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f35791e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f35792f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f35793g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f35794h);
            }
            return zArr[6] ? e17 + b36.f.e(6, this.f35795i) : e17;
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
                this.f35790d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f35791e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f35792f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35793g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f35794h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f35795i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
