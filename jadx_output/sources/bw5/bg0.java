package bw5;

/* loaded from: classes2.dex */
public class bg0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25644d;

    /* renamed from: e, reason: collision with root package name */
    public int f25645e;

    /* renamed from: f, reason: collision with root package name */
    public int f25646f;

    /* renamed from: g, reason: collision with root package name */
    public int f25647g;

    /* renamed from: h, reason: collision with root package name */
    public int f25648h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f25649i = new boolean[6];

    static {
        new bw5.bg0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bg0 parseFrom(byte[] bArr) {
        return (bw5.bg0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bg0)) {
            return false;
        }
        bw5.bg0 bg0Var = (bw5.bg0) fVar;
        return n51.f.a(this.f25644d, bg0Var.f25644d) && n51.f.a(java.lang.Integer.valueOf(this.f25645e), java.lang.Integer.valueOf(bg0Var.f25645e)) && n51.f.a(java.lang.Integer.valueOf(this.f25646f), java.lang.Integer.valueOf(bg0Var.f25646f)) && n51.f.a(java.lang.Integer.valueOf(this.f25647g), java.lang.Integer.valueOf(bg0Var.f25647g)) && n51.f.a(java.lang.Integer.valueOf(this.f25648h), java.lang.Integer.valueOf(bg0Var.f25648h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.bg0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f25649i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25644d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f25645e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f25646f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f25647g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f25648h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f25644d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f25645e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f25646f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f25647g);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f25648h) : i18;
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
            this.f25644d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25645e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f25646f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f25647g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f25648h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
