package bw5;

/* loaded from: classes2.dex */
public class rp0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f32647d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.dp0 f32648e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.sp0 f32649f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f32650g = new boolean[4];

    static {
        new bw5.rp0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rp0 parseFrom(byte[] bArr) {
        return (bw5.rp0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rp0)) {
            return false;
        }
        bw5.rp0 rp0Var = (bw5.rp0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f32647d), java.lang.Boolean.valueOf(rp0Var.f32647d)) && n51.f.a(this.f32648e, rp0Var.f32648e) && n51.f.a(this.f32649f, rp0Var.f32649f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.rp0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32650g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f32647d);
            }
            bw5.dp0 dp0Var = this.f32648e;
            if (dp0Var != null && zArr[2]) {
                fVar.i(2, dp0Var.computeSize());
                this.f32648e.writeFields(fVar);
            }
            bw5.sp0 sp0Var = this.f32649f;
            if (sp0Var != null && zArr[3]) {
                fVar.i(3, sp0Var.computeSize());
                this.f32649f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f32647d) : 0;
            bw5.dp0 dp0Var2 = this.f32648e;
            if (dp0Var2 != null && zArr[2]) {
                a17 += b36.f.i(2, dp0Var2.computeSize());
            }
            bw5.sp0 sp0Var2 = this.f32649f;
            return (sp0Var2 == null || !zArr[3]) ? a17 : a17 + b36.f.i(3, sp0Var2.computeSize());
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
            this.f32647d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.dp0 dp0Var3 = new bw5.dp0();
                if (bArr != null && bArr.length > 0) {
                    dp0Var3.parseFrom(bArr);
                }
                this.f32648e = dp0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.sp0 sp0Var3 = new bw5.sp0();
            if (bArr2 != null && bArr2.length > 0) {
                sp0Var3.parseFrom(bArr2);
            }
            this.f32649f = sp0Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
