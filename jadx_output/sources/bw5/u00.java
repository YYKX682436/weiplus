package bw5;

/* loaded from: classes2.dex */
public class u00 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f33684d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33685e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33686f;

    /* renamed from: g, reason: collision with root package name */
    public int f33687g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.q00 f33688h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.e10 f33689i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f33690m = new boolean[8];

    static {
        new bw5.u00();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.u00 parseFrom(byte[] bArr) {
        return (bw5.u00) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.u00)) {
            return false;
        }
        bw5.u00 u00Var = (bw5.u00) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f33684d), java.lang.Boolean.valueOf(u00Var.f33684d)) && n51.f.a(this.f33685e, u00Var.f33685e) && n51.f.a(this.f33686f, u00Var.f33686f) && n51.f.a(java.lang.Integer.valueOf(this.f33687g), java.lang.Integer.valueOf(u00Var.f33687g)) && n51.f.a(this.f33688h, u00Var.f33688h) && n51.f.a(this.f33689i, u00Var.f33689i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.u00();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33690m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f33684d);
            }
            java.lang.String str = this.f33685e;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f33686f;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f33687g);
            }
            bw5.q00 q00Var = this.f33688h;
            if (q00Var != null && zArr[6]) {
                fVar.i(6, q00Var.computeSize());
                this.f33688h.writeFields(fVar);
            }
            bw5.e10 e10Var = this.f33689i;
            if (e10Var != null && zArr[7]) {
                fVar.i(7, e10Var.computeSize());
                this.f33689i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f33684d) : 0;
            java.lang.String str3 = this.f33685e;
            if (str3 != null && zArr[3]) {
                a17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f33686f;
            if (str4 != null && zArr[4]) {
                a17 += b36.f.j(4, str4);
            }
            if (zArr[5]) {
                a17 += b36.f.e(5, this.f33687g);
            }
            bw5.q00 q00Var2 = this.f33688h;
            if (q00Var2 != null && zArr[6]) {
                a17 += b36.f.i(6, q00Var2.computeSize());
            }
            bw5.e10 e10Var2 = this.f33689i;
            return (e10Var2 == null || !zArr[7]) ? a17 : a17 + b36.f.i(7, e10Var2.computeSize());
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
            this.f33684d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f33685e = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f33686f = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue == 5) {
            this.f33687g = aVar2.g(intValue);
            zArr[5] = true;
            return 0;
        }
        if (intValue == 6) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.q00 q00Var3 = new bw5.q00();
                if (bArr != null && bArr.length > 0) {
                    q00Var3.parseFrom(bArr);
                }
                this.f33688h = q00Var3;
            }
            zArr[6] = true;
            return 0;
        }
        if (intValue != 7) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.e10 e10Var3 = new bw5.e10();
            if (bArr2 != null && bArr2.length > 0) {
                e10Var3.parseFrom(bArr2);
            }
            this.f33689i = e10Var3;
        }
        zArr[7] = true;
        return 0;
    }
}
