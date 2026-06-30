package bw5;

/* loaded from: classes2.dex */
public class qj0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32133d;

    /* renamed from: e, reason: collision with root package name */
    public int f32134e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f32135f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32136g;

    /* renamed from: h, reason: collision with root package name */
    public int f32137h;

    /* renamed from: i, reason: collision with root package name */
    public int f32138i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f32139m = new boolean[7];

    static {
        new bw5.qj0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qj0 parseFrom(byte[] bArr) {
        return (bw5.qj0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qj0)) {
            return false;
        }
        bw5.qj0 qj0Var = (bw5.qj0) fVar;
        return n51.f.a(this.f32133d, qj0Var.f32133d) && n51.f.a(java.lang.Integer.valueOf(this.f32134e), java.lang.Integer.valueOf(qj0Var.f32134e)) && n51.f.a(this.f32135f, qj0Var.f32135f) && n51.f.a(this.f32136g, qj0Var.f32136g) && n51.f.a(java.lang.Integer.valueOf(this.f32137h), java.lang.Integer.valueOf(qj0Var.f32137h)) && n51.f.a(java.lang.Integer.valueOf(this.f32138i), java.lang.Integer.valueOf(qj0Var.f32138i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.qj0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f32139m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32133d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f32134e);
            }
            java.lang.String str2 = this.f32135f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f32136g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f32137h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f32138i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f32133d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f32134e);
            }
            java.lang.String str5 = this.f32135f;
            if (str5 != null && zArr[3]) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f32136g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f32137h);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f32138i) : i18;
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
                this.f32133d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f32134e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f32135f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f32136g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32137h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f32138i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
