package bw5;

/* loaded from: classes9.dex */
public class p9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f31502d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.d9 f31503e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.c7 f31504f;

    /* renamed from: g, reason: collision with root package name */
    public int f31505g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f31506h = new boolean[5];

    static {
        new bw5.p9();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.p9 parseFrom(byte[] bArr) {
        return (bw5.p9) super.parseFrom(bArr);
    }

    public bw5.p9 c(bw5.d9 d9Var) {
        this.f31503e = d9Var;
        this.f31506h[2] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.p9)) {
            return false;
        }
        bw5.p9 p9Var = (bw5.p9) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f31502d), java.lang.Integer.valueOf(p9Var.f31502d)) && n51.f.a(this.f31503e, p9Var.f31503e) && n51.f.a(this.f31504f, p9Var.f31504f) && n51.f.a(java.lang.Integer.valueOf(this.f31505g), java.lang.Integer.valueOf(p9Var.f31505g));
    }

    public bw5.p9 d(int i17) {
        this.f31502d = i17;
        this.f31506h[1] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.p9();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31506h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f31502d);
            }
            bw5.d9 d9Var = this.f31503e;
            if (d9Var != null && zArr[2]) {
                fVar.i(2, d9Var.computeSize());
                this.f31503e.writeFields(fVar);
            }
            bw5.c7 c7Var = this.f31504f;
            if (c7Var != null && zArr[3]) {
                fVar.i(3, c7Var.computeSize());
                this.f31504f.writeFields(fVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f31505g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f31502d) : 0;
            bw5.d9 d9Var2 = this.f31503e;
            if (d9Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, d9Var2.computeSize());
            }
            bw5.c7 c7Var2 = this.f31504f;
            if (c7Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, c7Var2.computeSize());
            }
            return zArr[4] ? e17 + b36.f.e(4, this.f31505g) : e17;
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
            this.f31502d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.d9 d9Var3 = new bw5.d9();
                if (bArr != null && bArr.length > 0) {
                    d9Var3.parseFrom(bArr);
                }
                this.f31503e = d9Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f31505g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.c7 c7Var3 = new bw5.c7();
            if (bArr2 != null && bArr2.length > 0) {
                c7Var3.parseFrom(bArr2);
            }
            this.f31504f = c7Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
