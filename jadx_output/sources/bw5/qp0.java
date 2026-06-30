package bw5;

/* loaded from: classes2.dex */
public class qp0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32215d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.mb0 f32216e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f32217f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f32218g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f32219h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f32220i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f32221m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f32222n = new boolean[8];

    static {
        new bw5.qp0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qp0)) {
            return false;
        }
        bw5.qp0 qp0Var = (bw5.qp0) fVar;
        return n51.f.a(this.f32215d, qp0Var.f32215d) && n51.f.a(this.f32216e, qp0Var.f32216e) && n51.f.a(this.f32217f, qp0Var.f32217f) && n51.f.a(java.lang.Boolean.valueOf(this.f32218g), java.lang.Boolean.valueOf(qp0Var.f32218g)) && n51.f.a(java.lang.Boolean.valueOf(this.f32219h), java.lang.Boolean.valueOf(qp0Var.f32219h)) && n51.f.a(java.lang.Boolean.valueOf(this.f32220i), java.lang.Boolean.valueOf(qp0Var.f32220i)) && n51.f.a(java.lang.Boolean.valueOf(this.f32221m), java.lang.Boolean.valueOf(qp0Var.f32221m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.qp0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f32222n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32215d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.mb0 mb0Var = this.f32216e;
            if (mb0Var != null && zArr[2]) {
                fVar.i(2, mb0Var.computeSize());
                this.f32216e.writeFields(fVar);
            }
            java.lang.String str2 = this.f32217f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.a(4, this.f32218g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f32219h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f32220i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f32221m);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f32215d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            bw5.mb0 mb0Var2 = this.f32216e;
            if (mb0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, mb0Var2.computeSize());
            }
            java.lang.String str4 = this.f32217f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f32218g);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f32219h);
            }
            if (zArr[6]) {
                i18 += b36.f.a(6, this.f32220i);
            }
            return zArr[7] ? i18 + b36.f.a(7, this.f32221m) : i18;
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
        switch (intValue) {
            case 1:
                this.f32215d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.mb0 mb0Var3 = new bw5.mb0();
                    if (bArr != null && bArr.length > 0) {
                        mb0Var3.parseFrom(bArr);
                    }
                    this.f32216e = mb0Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f32217f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f32218g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32219h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f32220i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f32221m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.qp0) super.parseFrom(bArr);
    }
}
