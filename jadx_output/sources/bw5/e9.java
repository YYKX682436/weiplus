package bw5;

/* loaded from: classes4.dex */
public class e9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26790d;

    /* renamed from: e, reason: collision with root package name */
    public int f26791e;

    /* renamed from: f, reason: collision with root package name */
    public int f26792f;

    /* renamed from: g, reason: collision with root package name */
    public int f26793g;

    /* renamed from: h, reason: collision with root package name */
    public int f26794h;

    /* renamed from: i, reason: collision with root package name */
    public int f26795i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f26796m = new boolean[7];

    static {
        new bw5.e9();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.e9 parseFrom(byte[] bArr) {
        return (bw5.e9) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.e9)) {
            return false;
        }
        bw5.e9 e9Var = (bw5.e9) fVar;
        return n51.f.a(this.f26790d, e9Var.f26790d) && n51.f.a(java.lang.Integer.valueOf(this.f26791e), java.lang.Integer.valueOf(e9Var.f26791e)) && n51.f.a(java.lang.Integer.valueOf(this.f26792f), java.lang.Integer.valueOf(e9Var.f26792f)) && n51.f.a(java.lang.Integer.valueOf(this.f26793g), java.lang.Integer.valueOf(e9Var.f26793g)) && n51.f.a(java.lang.Integer.valueOf(this.f26794h), java.lang.Integer.valueOf(e9Var.f26794h)) && n51.f.a(java.lang.Integer.valueOf(this.f26795i), java.lang.Integer.valueOf(e9Var.f26795i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.e9();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f26796m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26790d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f26791e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f26792f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f26793g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f26794h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f26795i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f26790d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f26791e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f26792f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f26793g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f26794h);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f26795i) : i18;
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
                this.f26790d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26791e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26792f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26793g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26794h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26795i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
