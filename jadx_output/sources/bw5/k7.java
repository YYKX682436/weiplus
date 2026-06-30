package bw5;

/* loaded from: classes8.dex */
public class k7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.j7 f29267d;

    /* renamed from: e, reason: collision with root package name */
    public int f29268e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f29269f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f29270g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f29271h = new boolean[5];

    static {
        new bw5.k7();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.k7)) {
            return false;
        }
        bw5.k7 k7Var = (bw5.k7) fVar;
        return n51.f.a(this.f29267d, k7Var.f29267d) && n51.f.a(java.lang.Integer.valueOf(this.f29268e), java.lang.Integer.valueOf(k7Var.f29268e)) && n51.f.a(this.f29269f, k7Var.f29269f) && n51.f.a(this.f29270g, k7Var.f29270g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.k7();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f29271h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.j7 j7Var = this.f29267d;
            if (j7Var != null && zArr[1]) {
                fVar.i(1, j7Var.computeSize());
                this.f29267d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f29268e);
            }
            java.lang.String str = this.f29269f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f29270g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.j7 j7Var2 = this.f29267d;
            if (j7Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, j7Var2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f29268e);
            }
            java.lang.String str3 = this.f29269f;
            if (str3 != null && zArr[3]) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f29270g;
            return (str4 == null || !zArr[4]) ? i18 : i18 + b36.f.j(4, str4);
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f29268e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f29269f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f29270g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.j7 j7Var3 = new bw5.j7();
            if (bArr != null && bArr.length > 0) {
                j7Var3.parseFrom(bArr);
            }
            this.f29267d = j7Var3;
        }
        zArr[1] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.k7) super.parseFrom(bArr);
    }
}
