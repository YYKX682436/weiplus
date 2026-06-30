package bw5;

/* loaded from: classes2.dex */
public class l40 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f29633d;

    /* renamed from: e, reason: collision with root package name */
    public int f29634e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.u40 f29635f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.y60 f29636g;

    /* renamed from: h, reason: collision with root package name */
    public int f29637h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f29638i = new boolean[6];

    static {
        new bw5.l40();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.l40 parseFrom(byte[] bArr) {
        return (bw5.l40) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.l40)) {
            return false;
        }
        bw5.l40 l40Var = (bw5.l40) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f29633d), java.lang.Integer.valueOf(l40Var.f29633d)) && n51.f.a(java.lang.Integer.valueOf(this.f29634e), java.lang.Integer.valueOf(l40Var.f29634e)) && n51.f.a(this.f29635f, l40Var.f29635f) && n51.f.a(this.f29636g, l40Var.f29636g) && n51.f.a(java.lang.Integer.valueOf(this.f29637h), java.lang.Integer.valueOf(l40Var.f29637h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.l40();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29638i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f29633d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f29634e);
            }
            bw5.u40 u40Var = this.f29635f;
            if (u40Var != null && zArr[3]) {
                fVar.i(3, u40Var.computeSize());
                this.f29635f.writeFields(fVar);
            }
            bw5.y60 y60Var = this.f29636g;
            if (y60Var != null && zArr[4]) {
                fVar.i(4, y60Var.computeSize());
                this.f29636g.writeFields(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f29637h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f29633d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f29634e);
            }
            bw5.u40 u40Var2 = this.f29635f;
            if (u40Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, u40Var2.computeSize());
            }
            bw5.y60 y60Var2 = this.f29636g;
            if (y60Var2 != null && zArr[4]) {
                e17 += b36.f.i(4, y60Var2.computeSize());
            }
            return zArr[5] ? e17 + b36.f.e(5, this.f29637h) : e17;
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
            this.f29633d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f29634e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.u40 u40Var3 = new bw5.u40();
                if (bArr != null && bArr.length > 0) {
                    u40Var3.parseFrom(bArr);
                }
                this.f29635f = u40Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            this.f29637h = aVar2.g(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.y60 y60Var3 = new bw5.y60();
            if (bArr2 != null && bArr2.length > 0) {
                y60Var3.parseFrom(bArr2);
            }
            this.f29636g = y60Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
