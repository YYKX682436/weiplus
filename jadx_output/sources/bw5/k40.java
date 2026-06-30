package bw5;

/* loaded from: classes2.dex */
public class k40 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f29234d;

    /* renamed from: e, reason: collision with root package name */
    public int f29235e;

    /* renamed from: f, reason: collision with root package name */
    public int f29236f;

    /* renamed from: g, reason: collision with root package name */
    public int f29237g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f29238h = new boolean[5];

    static {
        new bw5.k40();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.k40 parseFrom(byte[] bArr) {
        return (bw5.k40) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.k40)) {
            return false;
        }
        bw5.k40 k40Var = (bw5.k40) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f29234d), java.lang.Integer.valueOf(k40Var.f29234d)) && n51.f.a(java.lang.Integer.valueOf(this.f29235e), java.lang.Integer.valueOf(k40Var.f29235e)) && n51.f.a(java.lang.Integer.valueOf(this.f29236f), java.lang.Integer.valueOf(k40Var.f29236f)) && n51.f.a(java.lang.Integer.valueOf(this.f29237g), java.lang.Integer.valueOf(k40Var.f29237g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.k40();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29238h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f29234d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f29235e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f29236f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f29237g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f29234d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f29235e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f29236f);
            }
            return zArr[4] ? e17 + b36.f.e(4, this.f29237g) : e17;
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
            this.f29234d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f29235e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f29236f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f29237g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }
}
