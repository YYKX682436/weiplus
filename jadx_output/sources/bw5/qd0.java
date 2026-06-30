package bw5;

/* loaded from: classes2.dex */
public class qd0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f32048d;

    /* renamed from: e, reason: collision with root package name */
    public long f32049e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f32050f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.pd0 f32051g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f32052h;

    /* renamed from: i, reason: collision with root package name */
    public long f32053i;

    /* renamed from: m, reason: collision with root package name */
    public int f32054m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f32055n = new boolean[8];

    static {
        new bw5.qd0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qd0 parseFrom(byte[] bArr) {
        return (bw5.qd0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qd0)) {
            return false;
        }
        bw5.qd0 qd0Var = (bw5.qd0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f32048d), java.lang.Long.valueOf(qd0Var.f32048d)) && n51.f.a(java.lang.Long.valueOf(this.f32049e), java.lang.Long.valueOf(qd0Var.f32049e)) && n51.f.a(this.f32050f, qd0Var.f32050f) && n51.f.a(this.f32051g, qd0Var.f32051g) && n51.f.a(java.lang.Boolean.valueOf(this.f32052h), java.lang.Boolean.valueOf(qd0Var.f32052h)) && n51.f.a(java.lang.Long.valueOf(this.f32053i), java.lang.Long.valueOf(qd0Var.f32053i)) && n51.f.a(java.lang.Integer.valueOf(this.f32054m), java.lang.Integer.valueOf(qd0Var.f32054m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.qd0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32055n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f32048d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f32049e);
            }
            java.lang.String str = this.f32050f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            bw5.pd0 pd0Var = this.f32051g;
            if (pd0Var != null && zArr[4]) {
                fVar.i(4, pd0Var.computeSize());
                this.f32051g.writeFields(fVar);
            }
            if (zArr[5]) {
                fVar.a(5, this.f32052h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f32053i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f32054m);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f32048d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f32049e);
            }
            java.lang.String str2 = this.f32050f;
            if (str2 != null && zArr[3]) {
                h17 += b36.f.j(3, str2);
            }
            bw5.pd0 pd0Var2 = this.f32051g;
            if (pd0Var2 != null && zArr[4]) {
                h17 += b36.f.i(4, pd0Var2.computeSize());
            }
            if (zArr[5]) {
                h17 += b36.f.a(5, this.f32052h);
            }
            if (zArr[6]) {
                h17 += b36.f.h(6, this.f32053i);
            }
            return zArr[7] ? h17 + b36.f.e(7, this.f32054m) : h17;
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
                this.f32048d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f32049e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f32050f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.pd0 pd0Var3 = new bw5.pd0();
                    if (bArr != null && bArr.length > 0) {
                        pd0Var3.parseFrom(bArr);
                    }
                    this.f32051g = pd0Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f32052h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f32053i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f32054m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
