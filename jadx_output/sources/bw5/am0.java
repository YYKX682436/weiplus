package bw5;

/* loaded from: classes2.dex */
public class am0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25266d;

    /* renamed from: e, reason: collision with root package name */
    public long f25267e;

    /* renamed from: f, reason: collision with root package name */
    public int f25268f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.cm0 f25269g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.fn0 f25270h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f25271i = new boolean[6];

    static {
        new bw5.am0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.am0)) {
            return false;
        }
        bw5.am0 am0Var = (bw5.am0) fVar;
        return n51.f.a(this.f25266d, am0Var.f25266d) && n51.f.a(java.lang.Long.valueOf(this.f25267e), java.lang.Long.valueOf(am0Var.f25267e)) && n51.f.a(java.lang.Integer.valueOf(this.f25268f), java.lang.Integer.valueOf(am0Var.f25268f)) && n51.f.a(this.f25269g, am0Var.f25269g) && n51.f.a(this.f25270h, am0Var.f25270h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.am0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f25271i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25266d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f25267e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f25268f);
            }
            bw5.cm0 cm0Var = this.f25269g;
            if (cm0Var != null && zArr[4]) {
                fVar.e(4, cm0Var.f26167d);
            }
            bw5.fn0 fn0Var = this.f25270h;
            if (fn0Var != null && zArr[5]) {
                fVar.i(5, fn0Var.computeSize());
                this.f25270h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f25266d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f25267e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f25268f);
            }
            bw5.cm0 cm0Var2 = this.f25269g;
            if (cm0Var2 != null && zArr[4]) {
                i18 += b36.f.e(4, cm0Var2.f26167d);
            }
            bw5.fn0 fn0Var2 = this.f25270h;
            return (fn0Var2 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, fn0Var2.computeSize());
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
            this.f25266d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25267e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f25268f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            int g17 = aVar2.g(intValue);
            this.f25269g = g17 != 0 ? g17 != 1 ? null : bw5.cm0.STATUS_THUMB : bw5.cm0.STATUS_MEDIA;
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.fn0 fn0Var3 = new bw5.fn0();
            if (bArr != null && bArr.length > 0) {
                fn0Var3.parseFrom(bArr);
            }
            this.f25270h = fn0Var3;
        }
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.am0) super.parseFrom(bArr);
    }
}
