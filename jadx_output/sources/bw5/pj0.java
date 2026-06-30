package bw5;

/* loaded from: classes2.dex */
public class pj0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f31696d;

    /* renamed from: e, reason: collision with root package name */
    public long f31697e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.oj0 f31698f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.oj0 f31699g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f31700h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f31701i = new boolean[6];

    static {
        new bw5.pj0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pj0 parseFrom(byte[] bArr) {
        return (bw5.pj0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pj0)) {
            return false;
        }
        bw5.pj0 pj0Var = (bw5.pj0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f31696d), java.lang.Long.valueOf(pj0Var.f31696d)) && n51.f.a(java.lang.Long.valueOf(this.f31697e), java.lang.Long.valueOf(pj0Var.f31697e)) && n51.f.a(this.f31698f, pj0Var.f31698f) && n51.f.a(this.f31699g, pj0Var.f31699g) && n51.f.a(this.f31700h, pj0Var.f31700h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.pj0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31701i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f31696d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f31697e);
            }
            bw5.oj0 oj0Var = this.f31698f;
            if (oj0Var != null && zArr[3]) {
                fVar.i(3, oj0Var.computeSize());
                this.f31698f.writeFields(fVar);
            }
            bw5.oj0 oj0Var2 = this.f31699g;
            if (oj0Var2 != null && zArr[4]) {
                fVar.i(4, oj0Var2.computeSize());
                this.f31699g.writeFields(fVar);
            }
            java.lang.String str = this.f31700h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f31696d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f31697e);
            }
            bw5.oj0 oj0Var3 = this.f31698f;
            if (oj0Var3 != null && zArr[3]) {
                h17 += b36.f.i(3, oj0Var3.computeSize());
            }
            bw5.oj0 oj0Var4 = this.f31699g;
            if (oj0Var4 != null && zArr[4]) {
                h17 += b36.f.i(4, oj0Var4.computeSize());
            }
            java.lang.String str2 = this.f31700h;
            return (str2 == null || !zArr[5]) ? h17 : h17 + b36.f.j(5, str2);
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
            this.f31696d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f31697e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.oj0 oj0Var5 = new bw5.oj0();
                if (bArr != null && bArr.length > 0) {
                    oj0Var5.parseFrom(bArr);
                }
                this.f31698f = oj0Var5;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            this.f31700h = aVar2.k(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.oj0 oj0Var6 = new bw5.oj0();
            if (bArr2 != null && bArr2.length > 0) {
                oj0Var6.parseFrom(bArr2);
            }
            this.f31699g = oj0Var6;
        }
        zArr[4] = true;
        return 0;
    }
}
