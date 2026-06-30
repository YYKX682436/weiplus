package bw5;

/* loaded from: classes2.dex */
public class vo0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f34437d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.lp0 f34438e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.kq0 f34439f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f34440g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f34441h = new boolean[5];

    static {
        new bw5.vo0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vo0)) {
            return false;
        }
        bw5.vo0 vo0Var = (bw5.vo0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f34437d), java.lang.Integer.valueOf(vo0Var.f34437d)) && n51.f.a(this.f34438e, vo0Var.f34438e) && n51.f.a(this.f34439f, vo0Var.f34439f) && n51.f.a(this.f34440g, vo0Var.f34440g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.vo0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34441h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f34437d);
            }
            bw5.lp0 lp0Var = this.f34438e;
            if (lp0Var != null && zArr[2]) {
                fVar.i(2, lp0Var.computeSize());
                this.f34438e.writeFields(fVar);
            }
            bw5.kq0 kq0Var = this.f34439f;
            if (kq0Var != null && zArr[3]) {
                fVar.i(3, kq0Var.computeSize());
                this.f34439f.writeFields(fVar);
            }
            java.lang.String str = this.f34440g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f34437d) : 0;
            bw5.lp0 lp0Var2 = this.f34438e;
            if (lp0Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, lp0Var2.computeSize());
            }
            bw5.kq0 kq0Var2 = this.f34439f;
            if (kq0Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, kq0Var2.computeSize());
            }
            java.lang.String str2 = this.f34440g;
            return (str2 == null || !zArr[4]) ? e17 : e17 + b36.f.j(4, str2);
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
            this.f34437d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.lp0 lp0Var3 = new bw5.lp0();
                if (bArr != null && bArr.length > 0) {
                    lp0Var3.parseFrom(bArr);
                }
                this.f34438e = lp0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f34440g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.kq0 kq0Var3 = new bw5.kq0();
            if (bArr2 != null && bArr2.length > 0) {
                kq0Var3.parseFrom(bArr2);
            }
            this.f34439f = kq0Var3;
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.vo0) super.parseFrom(bArr);
    }
}
