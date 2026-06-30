package bw5;

/* loaded from: classes2.dex */
public class f70 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27179d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27180e;

    /* renamed from: f, reason: collision with root package name */
    public int f27181f;

    /* renamed from: g, reason: collision with root package name */
    public float f27182g;

    /* renamed from: h, reason: collision with root package name */
    public float f27183h;

    /* renamed from: i, reason: collision with root package name */
    public float f27184i;

    /* renamed from: m, reason: collision with root package name */
    public float f27185m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f27186n = new boolean[8];

    static {
        new bw5.f70();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.f70 parseFrom(byte[] bArr) {
        return (bw5.f70) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.f70)) {
            return false;
        }
        bw5.f70 f70Var = (bw5.f70) fVar;
        return n51.f.a(this.f27179d, f70Var.f27179d) && n51.f.a(java.lang.Boolean.valueOf(this.f27180e), java.lang.Boolean.valueOf(f70Var.f27180e)) && n51.f.a(java.lang.Integer.valueOf(this.f27181f), java.lang.Integer.valueOf(f70Var.f27181f)) && n51.f.a(java.lang.Float.valueOf(this.f27182g), java.lang.Float.valueOf(f70Var.f27182g)) && n51.f.a(java.lang.Float.valueOf(this.f27183h), java.lang.Float.valueOf(f70Var.f27183h)) && n51.f.a(java.lang.Float.valueOf(this.f27184i), java.lang.Float.valueOf(f70Var.f27184i)) && n51.f.a(java.lang.Float.valueOf(this.f27185m), java.lang.Float.valueOf(f70Var.f27185m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.f70();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f27186n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27179d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.a(2, this.f27180e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f27181f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f27182g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f27183h);
            }
            if (zArr[6]) {
                fVar.d(6, this.f27184i);
            }
            if (zArr[7]) {
                fVar.d(7, this.f27185m);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f27179d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f27180e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f27181f);
            }
            if (zArr[4]) {
                i18 += b36.f.d(4, this.f27182g);
            }
            if (zArr[5]) {
                i18 += b36.f.d(5, this.f27183h);
            }
            if (zArr[6]) {
                i18 += b36.f.d(6, this.f27184i);
            }
            return zArr[7] ? i18 + b36.f.d(7, this.f27185m) : i18;
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
                this.f27179d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27180e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27181f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27182g = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27183h = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27184i = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27185m = aVar2.f(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
