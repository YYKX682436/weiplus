package bw5;

/* loaded from: classes2.dex */
public class dk0 extends com.tencent.mm.protobuf.f {

    /* renamed from: m, reason: collision with root package name */
    public static final bw5.dk0 f26512m = new bw5.dk0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26513d;

    /* renamed from: e, reason: collision with root package name */
    public long f26514e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26515f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.pj0 f26516g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26517h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f26518i = new boolean[6];

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dk0 parseFrom(byte[] bArr) {
        return (bw5.dk0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dk0)) {
            return false;
        }
        bw5.dk0 dk0Var = (bw5.dk0) fVar;
        return n51.f.a(this.f26513d, dk0Var.f26513d) && n51.f.a(java.lang.Long.valueOf(this.f26514e), java.lang.Long.valueOf(dk0Var.f26514e)) && n51.f.a(java.lang.Boolean.valueOf(this.f26515f), java.lang.Boolean.valueOf(dk0Var.f26515f)) && n51.f.a(this.f26516g, dk0Var.f26516g) && n51.f.a(java.lang.Boolean.valueOf(this.f26517h), java.lang.Boolean.valueOf(dk0Var.f26517h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.dk0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f26518i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26513d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f26514e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f26515f);
            }
            bw5.pj0 pj0Var = this.f26516g;
            if (pj0Var != null && zArr[4]) {
                fVar.i(4, pj0Var.computeSize());
                this.f26516g.writeFields(fVar);
            }
            if (zArr[5]) {
                fVar.a(5, this.f26517h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f26513d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f26514e);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f26515f);
            }
            bw5.pj0 pj0Var2 = this.f26516g;
            if (pj0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, pj0Var2.computeSize());
            }
            return zArr[5] ? i18 + b36.f.a(5, this.f26517h) : i18;
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
            this.f26513d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f26514e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f26515f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            this.f26517h = aVar2.c(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.pj0 pj0Var3 = new bw5.pj0();
            if (bArr != null && bArr.length > 0) {
                pj0Var3.parseFrom(bArr);
            }
            this.f26516g = pj0Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
