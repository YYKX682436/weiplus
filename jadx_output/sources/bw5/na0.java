package bw5;

/* loaded from: classes2.dex */
public class na0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30591d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.mc0 f30592e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30593f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.mc0 f30594g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f30595h = new boolean[5];

    static {
        new bw5.na0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.na0 parseFrom(byte[] bArr) {
        return (bw5.na0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.na0)) {
            return false;
        }
        bw5.na0 na0Var = (bw5.na0) fVar;
        return n51.f.a(this.f30591d, na0Var.f30591d) && n51.f.a(this.f30592e, na0Var.f30592e) && n51.f.a(java.lang.Boolean.valueOf(this.f30593f), java.lang.Boolean.valueOf(na0Var.f30593f)) && n51.f.a(this.f30594g, na0Var.f30594g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.na0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30595h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30591d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.mc0 mc0Var = this.f30592e;
            if (mc0Var != null && zArr[2]) {
                fVar.i(2, mc0Var.computeSize());
                this.f30592e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.a(3, this.f30593f);
            }
            bw5.mc0 mc0Var2 = this.f30594g;
            if (mc0Var2 != null && zArr[4]) {
                fVar.i(4, mc0Var2.computeSize());
                this.f30594g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f30591d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.mc0 mc0Var3 = this.f30592e;
            if (mc0Var3 != null && zArr[2]) {
                i18 += b36.f.i(2, mc0Var3.computeSize());
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f30593f);
            }
            bw5.mc0 mc0Var4 = this.f30594g;
            return (mc0Var4 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, mc0Var4.computeSize());
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
            this.f30591d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.mc0 mc0Var5 = new bw5.mc0();
                if (bArr != null && bArr.length > 0) {
                    mc0Var5.parseFrom(bArr);
                }
                this.f30592e = mc0Var5;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f30593f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.mc0 mc0Var6 = new bw5.mc0();
            if (bArr2 != null && bArr2.length > 0) {
                mc0Var6.parseFrom(bArr2);
            }
            this.f30594g = mc0Var6;
        }
        zArr[4] = true;
        return 0;
    }
}
