package bw5;

/* loaded from: classes9.dex */
public class t8 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.s8 f33306d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.s8 f33307e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.r8 f33308f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f33309g = new boolean[5];

    static {
        new bw5.t8();
    }

    public bw5.s8 b() {
        return this.f33309g[2] ? this.f33307e : new bw5.s8();
    }

    public bw5.s8 c() {
        return this.f33309g[1] ? this.f33306d : new bw5.s8();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.t8)) {
            return false;
        }
        bw5.t8 t8Var = (bw5.t8) fVar;
        return n51.f.a(this.f33306d, t8Var.f33306d) && n51.f.a(this.f33307e, t8Var.f33307e) && n51.f.a(this.f33308f, t8Var.f33308f);
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.t8 parseFrom(byte[] bArr) {
        return (bw5.t8) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.t8();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33309g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.s8 s8Var = this.f33306d;
            if (s8Var != null && zArr[1]) {
                fVar.i(1, s8Var.computeSize());
                this.f33306d.writeFields(fVar);
            }
            bw5.s8 s8Var2 = this.f33307e;
            if (s8Var2 != null && zArr[2]) {
                fVar.i(2, s8Var2.computeSize());
                this.f33307e.writeFields(fVar);
            }
            bw5.r8 r8Var = this.f33308f;
            if (r8Var != null && zArr[4]) {
                fVar.i(4, r8Var.computeSize());
                this.f33308f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.s8 s8Var3 = this.f33306d;
            if (s8Var3 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, s8Var3.computeSize());
            }
            bw5.s8 s8Var4 = this.f33307e;
            if (s8Var4 != null && zArr[2]) {
                i18 += b36.f.i(2, s8Var4.computeSize());
            }
            bw5.r8 r8Var2 = this.f33308f;
            return (r8Var2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, r8Var2.computeSize());
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.s8 s8Var5 = new bw5.s8();
                if (bArr != null && bArr.length > 0) {
                    s8Var5.parseFrom(bArr);
                }
                this.f33306d = s8Var5;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.s8 s8Var6 = new bw5.s8();
                if (bArr2 != null && bArr2.length > 0) {
                    s8Var6.parseFrom(bArr2);
                }
                this.f33307e = s8Var6;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.r8 r8Var3 = new bw5.r8();
            if (bArr3 != null && bArr3.length > 0) {
                r8Var3.parseFrom(bArr3);
            }
            this.f33308f = r8Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
