package bw5;

/* loaded from: classes4.dex */
public class vh0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34362d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.x7 f34363e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34364f;

    /* renamed from: g, reason: collision with root package name */
    public int f34365g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f34366h = new boolean[5];

    static {
        new bw5.vh0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vh0 parseFrom(byte[] bArr) {
        return (bw5.vh0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vh0)) {
            return false;
        }
        bw5.vh0 vh0Var = (bw5.vh0) fVar;
        return n51.f.a(this.f34362d, vh0Var.f34362d) && n51.f.a(this.f34363e, vh0Var.f34363e) && n51.f.a(this.f34364f, vh0Var.f34364f) && n51.f.a(java.lang.Integer.valueOf(this.f34365g), java.lang.Integer.valueOf(vh0Var.f34365g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.vh0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f34366h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34362d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.x7 x7Var = this.f34363e;
            if (x7Var != null && zArr[2]) {
                fVar.i(2, x7Var.computeSize());
                this.f34363e.writeFields(fVar);
            }
            java.lang.String str2 = this.f34364f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f34365g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f34362d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            bw5.x7 x7Var2 = this.f34363e;
            if (x7Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, x7Var2.computeSize());
            }
            java.lang.String str4 = this.f34364f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f34365g) : i18;
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
            this.f34362d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f34364f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f34365g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.x7 x7Var3 = new bw5.x7();
            if (bArr != null && bArr.length > 0) {
                x7Var3.parseFrom(bArr);
            }
            this.f34363e = x7Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
