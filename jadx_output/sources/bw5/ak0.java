package bw5;

/* loaded from: classes2.dex */
public class ak0 extends com.tencent.mm.protobuf.f {

    /* renamed from: n, reason: collision with root package name */
    public static final bw5.ak0 f25247n = new bw5.ak0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25248d;

    /* renamed from: e, reason: collision with root package name */
    public long f25249e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.to0 f25250f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.fk0 f25251g;

    /* renamed from: h, reason: collision with root package name */
    public long f25252h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25253i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f25254m = new boolean[7];

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ak0 parseFrom(byte[] bArr) {
        return (bw5.ak0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ak0)) {
            return false;
        }
        bw5.ak0 ak0Var = (bw5.ak0) fVar;
        return n51.f.a(this.f25248d, ak0Var.f25248d) && n51.f.a(java.lang.Long.valueOf(this.f25249e), java.lang.Long.valueOf(ak0Var.f25249e)) && n51.f.a(this.f25250f, ak0Var.f25250f) && n51.f.a(this.f25251g, ak0Var.f25251g) && n51.f.a(java.lang.Long.valueOf(this.f25252h), java.lang.Long.valueOf(ak0Var.f25252h)) && n51.f.a(java.lang.Boolean.valueOf(this.f25253i), java.lang.Boolean.valueOf(ak0Var.f25253i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ak0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f25254m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25248d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f25249e);
            }
            bw5.to0 to0Var = this.f25250f;
            if (to0Var != null && zArr[3]) {
                fVar.i(3, to0Var.computeSize());
                this.f25250f.writeFields(fVar);
            }
            bw5.fk0 fk0Var = this.f25251g;
            if (fk0Var != null && zArr[4]) {
                fVar.i(4, fk0Var.computeSize());
                this.f25251g.writeFields(fVar);
            }
            if (zArr[5]) {
                fVar.h(5, this.f25252h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f25253i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f25248d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f25249e);
            }
            bw5.to0 to0Var2 = this.f25250f;
            if (to0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, to0Var2.computeSize());
            }
            bw5.fk0 fk0Var2 = this.f25251g;
            if (fk0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, fk0Var2.computeSize());
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f25252h);
            }
            return zArr[6] ? i18 + b36.f.a(6, this.f25253i) : i18;
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
                this.f25248d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f25249e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.to0 to0Var3 = new bw5.to0();
                    if (bArr != null && bArr.length > 0) {
                        to0Var3.parseFrom(bArr);
                    }
                    this.f25250f = to0Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.fk0 fk0Var3 = new bw5.fk0();
                    if (bArr2 != null && bArr2.length > 0) {
                        fk0Var3.parseFrom(bArr2);
                    }
                    this.f25251g = fk0Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f25252h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25253i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
