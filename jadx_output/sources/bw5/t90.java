package bw5;

/* loaded from: classes2.dex */
public class t90 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33319d;

    /* renamed from: e, reason: collision with root package name */
    public int f33320e;

    /* renamed from: f, reason: collision with root package name */
    public int f33321f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f33322g = new boolean[4];

    static {
        new bw5.t90();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.t90 parseFrom(byte[] bArr) {
        return (bw5.t90) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.t90)) {
            return false;
        }
        bw5.t90 t90Var = (bw5.t90) fVar;
        return n51.f.a(this.f33319d, t90Var.f33319d) && n51.f.a(java.lang.Integer.valueOf(this.f33320e), java.lang.Integer.valueOf(t90Var.f33320e)) && n51.f.a(java.lang.Integer.valueOf(this.f33321f), java.lang.Integer.valueOf(t90Var.f33321f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.t90();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33322g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33319d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f33320e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f33321f);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f33319d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f33320e);
            }
            return zArr[3] ? i18 + b36.f.e(3, this.f33321f) : i18;
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
            this.f33319d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f33320e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f33321f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }
}
