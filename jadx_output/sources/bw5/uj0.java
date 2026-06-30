package bw5;

/* loaded from: classes2.dex */
public class uj0 extends com.tencent.mm.protobuf.f {

    /* renamed from: q, reason: collision with root package name */
    public static final bw5.uj0 f33937q = new bw5.uj0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33938d;

    /* renamed from: e, reason: collision with root package name */
    public long f33939e;

    /* renamed from: f, reason: collision with root package name */
    public int f33940f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.tc0 f33941g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.tv f33942h;

    /* renamed from: i, reason: collision with root package name */
    public long f33943i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f33944m;

    /* renamed from: n, reason: collision with root package name */
    public int f33945n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f33946o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f33947p = new boolean[10];

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.uj0 parseFrom(byte[] bArr) {
        return (bw5.uj0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.uj0)) {
            return false;
        }
        bw5.uj0 uj0Var = (bw5.uj0) fVar;
        return n51.f.a(this.f33938d, uj0Var.f33938d) && n51.f.a(java.lang.Long.valueOf(this.f33939e), java.lang.Long.valueOf(uj0Var.f33939e)) && n51.f.a(java.lang.Integer.valueOf(this.f33940f), java.lang.Integer.valueOf(uj0Var.f33940f)) && n51.f.a(this.f33941g, uj0Var.f33941g) && n51.f.a(this.f33942h, uj0Var.f33942h) && n51.f.a(java.lang.Long.valueOf(this.f33943i), java.lang.Long.valueOf(uj0Var.f33943i)) && n51.f.a(java.lang.Boolean.valueOf(this.f33944m), java.lang.Boolean.valueOf(uj0Var.f33944m)) && n51.f.a(java.lang.Integer.valueOf(this.f33945n), java.lang.Integer.valueOf(uj0Var.f33945n)) && n51.f.a(this.f33946o, uj0Var.f33946o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.uj0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f33947p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33938d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f33939e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f33940f);
            }
            bw5.tc0 tc0Var = this.f33941g;
            if (tc0Var != null && zArr[4]) {
                fVar.i(4, tc0Var.computeSize());
                this.f33941g.writeFields(fVar);
            }
            bw5.tv tvVar = this.f33942h;
            if (tvVar != null && zArr[5]) {
                fVar.i(5, tvVar.computeSize());
                this.f33942h.writeFields(fVar);
            }
            if (zArr[6]) {
                fVar.h(6, this.f33943i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f33944m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f33945n);
            }
            java.lang.String str2 = this.f33946o;
            if (str2 != null && zArr[9]) {
                fVar.j(9, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f33938d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f33939e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f33940f);
            }
            bw5.tc0 tc0Var2 = this.f33941g;
            if (tc0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, tc0Var2.computeSize());
            }
            bw5.tv tvVar2 = this.f33942h;
            if (tvVar2 != null && zArr[5]) {
                i18 += b36.f.i(5, tvVar2.computeSize());
            }
            if (zArr[6]) {
                i18 += b36.f.h(6, this.f33943i);
            }
            if (zArr[7]) {
                i18 += b36.f.a(7, this.f33944m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f33945n);
            }
            java.lang.String str4 = this.f33946o;
            return (str4 == null || !zArr[9]) ? i18 : i18 + b36.f.j(9, str4);
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
                this.f33938d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33939e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33940f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.tc0 tc0Var3 = new bw5.tc0();
                    if (bArr != null && bArr.length > 0) {
                        tc0Var3.parseFrom(bArr);
                    }
                    this.f33941g = tc0Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.tv tvVar3 = new bw5.tv();
                    if (bArr2 != null && bArr2.length > 0) {
                        tvVar3.parseFrom(bArr2);
                    }
                    this.f33942h = tvVar3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f33943i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33944m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f33945n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f33946o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
