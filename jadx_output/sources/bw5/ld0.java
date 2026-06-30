package bw5;

/* loaded from: classes2.dex */
public class ld0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29755d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29756e;

    /* renamed from: f, reason: collision with root package name */
    public float f29757f;

    /* renamed from: g, reason: collision with root package name */
    public float f29758g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f29759h;

    /* renamed from: i, reason: collision with root package name */
    public int f29760i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f29761m = new boolean[7];

    static {
        new bw5.ld0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ld0 parseFrom(byte[] bArr) {
        return (bw5.ld0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ld0)) {
            return false;
        }
        bw5.ld0 ld0Var = (bw5.ld0) fVar;
        return n51.f.a(this.f29755d, ld0Var.f29755d) && n51.f.a(this.f29756e, ld0Var.f29756e) && n51.f.a(java.lang.Float.valueOf(this.f29757f), java.lang.Float.valueOf(ld0Var.f29757f)) && n51.f.a(java.lang.Float.valueOf(this.f29758g), java.lang.Float.valueOf(ld0Var.f29758g)) && n51.f.a(this.f29759h, ld0Var.f29759h) && n51.f.a(java.lang.Integer.valueOf(this.f29760i), java.lang.Integer.valueOf(ld0Var.f29760i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ld0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f29761m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29755d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f29756e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.d(3, this.f29757f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f29758g);
            }
            java.lang.String str3 = this.f29759h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.e(6, this.f29760i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f29755d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f29756e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            if (zArr[3]) {
                i18 += b36.f.d(3, this.f29757f);
            }
            if (zArr[4]) {
                i18 += b36.f.d(4, this.f29758g);
            }
            java.lang.String str6 = this.f29759h;
            if (str6 != null && zArr[5]) {
                i18 += b36.f.j(5, str6);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f29760i) : i18;
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
                this.f29755d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29756e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29757f = aVar2.f(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29758g = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f29759h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f29760i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
