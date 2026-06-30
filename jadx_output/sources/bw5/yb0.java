package bw5;

/* loaded from: classes2.dex */
public class yb0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f35425d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35426e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.o50 f35427f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.l60 f35428g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f35429h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f35430i = new boolean[6];

    static {
        new bw5.yb0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yb0 parseFrom(byte[] bArr) {
        return (bw5.yb0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yb0)) {
            return false;
        }
        bw5.yb0 yb0Var = (bw5.yb0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f35425d), java.lang.Integer.valueOf(yb0Var.f35425d)) && n51.f.a(this.f35426e, yb0Var.f35426e) && n51.f.a(this.f35427f, yb0Var.f35427f) && n51.f.a(this.f35428g, yb0Var.f35428g) && n51.f.a(this.f35429h, yb0Var.f35429h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.yb0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35430i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f35425d);
            }
            java.lang.String str = this.f35426e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            bw5.o50 o50Var = this.f35427f;
            if (o50Var != null && zArr[3]) {
                fVar.i(3, o50Var.computeSize());
                this.f35427f.writeFields(fVar);
            }
            bw5.l60 l60Var = this.f35428g;
            if (l60Var != null && zArr[4]) {
                fVar.i(4, l60Var.computeSize());
                this.f35428g.writeFields(fVar);
            }
            java.lang.String str2 = this.f35429h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f35425d) : 0;
            java.lang.String str3 = this.f35426e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            bw5.o50 o50Var2 = this.f35427f;
            if (o50Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, o50Var2.computeSize());
            }
            bw5.l60 l60Var2 = this.f35428g;
            if (l60Var2 != null && zArr[4]) {
                e17 += b36.f.i(4, l60Var2.computeSize());
            }
            java.lang.String str4 = this.f35429h;
            return (str4 == null || !zArr[5]) ? e17 : e17 + b36.f.j(5, str4);
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
            this.f35425d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f35426e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.o50 o50Var3 = new bw5.o50();
                if (bArr != null && bArr.length > 0) {
                    o50Var3.parseFrom(bArr);
                }
                this.f35427f = o50Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            this.f35429h = aVar2.k(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.l60 l60Var3 = new bw5.l60();
            if (bArr2 != null && bArr2.length > 0) {
                l60Var3.parseFrom(bArr2);
            }
            this.f35428g = l60Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
