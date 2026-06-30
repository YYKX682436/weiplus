package bw5;

/* loaded from: classes2.dex */
public class x40 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34954d;

    /* renamed from: e, reason: collision with root package name */
    public int f34955e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.v70 f34956f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.n40 f34957g;

    /* renamed from: h, reason: collision with root package name */
    public long f34958h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f34959i = new boolean[6];

    static {
        new bw5.x40();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.x40 parseFrom(byte[] bArr) {
        return (bw5.x40) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.x40)) {
            return false;
        }
        bw5.x40 x40Var = (bw5.x40) fVar;
        return n51.f.a(this.f34954d, x40Var.f34954d) && n51.f.a(java.lang.Integer.valueOf(this.f34955e), java.lang.Integer.valueOf(x40Var.f34955e)) && n51.f.a(this.f34956f, x40Var.f34956f) && n51.f.a(this.f34957g, x40Var.f34957g) && n51.f.a(java.lang.Long.valueOf(this.f34958h), java.lang.Long.valueOf(x40Var.f34958h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.x40();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f34959i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34954d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34955e);
            }
            bw5.v70 v70Var = this.f34956f;
            if (v70Var != null && zArr[3]) {
                fVar.i(3, v70Var.computeSize());
                this.f34956f.writeFields(fVar);
            }
            bw5.n40 n40Var = this.f34957g;
            if (n40Var != null && zArr[4]) {
                fVar.i(4, n40Var.computeSize());
                this.f34957g.writeFields(fVar);
            }
            if (zArr[5]) {
                fVar.h(5, this.f34958h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f34954d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f34955e);
            }
            bw5.v70 v70Var2 = this.f34956f;
            if (v70Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, v70Var2.computeSize());
            }
            bw5.n40 n40Var2 = this.f34957g;
            if (n40Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, n40Var2.computeSize());
            }
            return zArr[5] ? i18 + b36.f.h(5, this.f34958h) : i18;
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
            this.f34954d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34955e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.v70 v70Var3 = new bw5.v70();
                if (bArr != null && bArr.length > 0) {
                    v70Var3.parseFrom(bArr);
                }
                this.f34956f = v70Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            this.f34958h = aVar2.i(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.n40 n40Var3 = new bw5.n40();
            if (bArr2 != null && bArr2.length > 0) {
                n40Var3.parseFrom(bArr2);
            }
            this.f34957g = n40Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
