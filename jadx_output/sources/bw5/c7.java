package bw5;

/* loaded from: classes9.dex */
public class c7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25953d;

    /* renamed from: e, reason: collision with root package name */
    public int f25954e;

    /* renamed from: f, reason: collision with root package name */
    public int f25955f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f25956g;

    /* renamed from: h, reason: collision with root package name */
    public int f25957h;

    /* renamed from: i, reason: collision with root package name */
    public int f25958i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f25959m = new boolean[7];

    static {
        new bw5.c7();
    }

    public java.lang.String b() {
        return this.f25959m[1] ? this.f25953d : "";
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.c7 parseFrom(byte[] bArr) {
        return (bw5.c7) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c7)) {
            return false;
        }
        bw5.c7 c7Var = (bw5.c7) fVar;
        return n51.f.a(this.f25953d, c7Var.f25953d) && n51.f.a(java.lang.Integer.valueOf(this.f25954e), java.lang.Integer.valueOf(c7Var.f25954e)) && n51.f.a(java.lang.Integer.valueOf(this.f25955f), java.lang.Integer.valueOf(c7Var.f25955f)) && n51.f.a(this.f25956g, c7Var.f25956g) && n51.f.a(java.lang.Integer.valueOf(this.f25957h), java.lang.Integer.valueOf(c7Var.f25957h)) && n51.f.a(java.lang.Integer.valueOf(this.f25958i), java.lang.Integer.valueOf(c7Var.f25958i));
    }

    public bw5.c7 d(java.lang.String str) {
        this.f25953d = str;
        this.f25959m[1] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.c7();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f25959m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25953d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f25954e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f25955f);
            }
            java.lang.String str2 = this.f25956g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f25957h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f25958i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f25953d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f25954e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f25955f);
            }
            java.lang.String str4 = this.f25956g;
            if (str4 != null && zArr[4]) {
                i18 += b36.f.j(4, str4);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f25957h);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f25958i) : i18;
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
                this.f25953d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f25954e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25955f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25956g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25957h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25958i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
