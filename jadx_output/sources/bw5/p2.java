package bw5;

/* loaded from: classes4.dex */
public class p2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f31437d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f31438e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f31439f;

    /* renamed from: g, reason: collision with root package name */
    public int f31440g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f31441h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f31442i = new boolean[6];

    static {
        new bw5.p2();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.p2)) {
            return false;
        }
        bw5.p2 p2Var = (bw5.p2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f31437d), java.lang.Integer.valueOf(p2Var.f31437d)) && n51.f.a(this.f31438e, p2Var.f31438e) && n51.f.a(this.f31439f, p2Var.f31439f) && n51.f.a(java.lang.Integer.valueOf(this.f31440g), java.lang.Integer.valueOf(p2Var.f31440g)) && n51.f.a(this.f31441h, p2Var.f31441h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.p2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31442i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f31437d);
            }
            r45.cu5 cu5Var = this.f31438e;
            if (cu5Var != null && zArr[2]) {
                fVar.i(2, cu5Var.computeSize());
                this.f31438e.writeFields(fVar);
            }
            java.lang.String str = this.f31439f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.e(4, this.f31440g);
            }
            java.lang.String str2 = this.f31441h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f31437d) : 0;
            r45.cu5 cu5Var2 = this.f31438e;
            if (cu5Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, cu5Var2.computeSize());
            }
            java.lang.String str3 = this.f31439f;
            if (str3 != null && zArr[3]) {
                e17 += b36.f.j(3, str3);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f31440g);
            }
            java.lang.String str4 = this.f31441h;
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
            this.f31437d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f31439f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue == 4) {
                this.f31440g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f31441h = aVar2.k(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr != null && bArr.length > 0) {
                cu5Var3.b(bArr);
            }
            this.f31438e = cu5Var3;
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.p2) super.parseFrom(bArr);
    }
}
