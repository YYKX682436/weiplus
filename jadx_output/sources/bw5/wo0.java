package bw5;

/* loaded from: classes2.dex */
public class wo0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f34801d;

    /* renamed from: e, reason: collision with root package name */
    public int f34802e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34803f;

    /* renamed from: g, reason: collision with root package name */
    public int f34804g;

    /* renamed from: h, reason: collision with root package name */
    public float f34805h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f34806i = new boolean[6];

    static {
        new bw5.wo0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wo0 parseFrom(byte[] bArr) {
        return (bw5.wo0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wo0)) {
            return false;
        }
        bw5.wo0 wo0Var = (bw5.wo0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f34801d), java.lang.Integer.valueOf(wo0Var.f34801d)) && n51.f.a(java.lang.Integer.valueOf(this.f34802e), java.lang.Integer.valueOf(wo0Var.f34802e)) && n51.f.a(this.f34803f, wo0Var.f34803f) && n51.f.a(java.lang.Integer.valueOf(this.f34804g), java.lang.Integer.valueOf(wo0Var.f34804g)) && n51.f.a(java.lang.Float.valueOf(this.f34805h), java.lang.Float.valueOf(wo0Var.f34805h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wo0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34806i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f34801d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34802e);
            }
            java.lang.String str = this.f34803f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.e(4, this.f34804g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f34805h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f34801d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f34802e);
            }
            java.lang.String str2 = this.f34803f;
            if (str2 != null && zArr[3]) {
                e17 += b36.f.j(3, str2);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f34804g);
            }
            return zArr[5] ? e17 + b36.f.d(5, this.f34805h) : e17;
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
            this.f34801d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34802e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f34803f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f34804g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f34805h = aVar2.f(intValue);
        zArr[5] = true;
        return 0;
    }
}
