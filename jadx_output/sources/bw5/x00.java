package bw5;

/* loaded from: classes2.dex */
public class x00 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f34890d;

    /* renamed from: e, reason: collision with root package name */
    public long f34891e;

    /* renamed from: f, reason: collision with root package name */
    public int f34892f;

    /* renamed from: g, reason: collision with root package name */
    public int f34893g;

    /* renamed from: h, reason: collision with root package name */
    public long f34894h;

    /* renamed from: i, reason: collision with root package name */
    public int f34895i;

    /* renamed from: m, reason: collision with root package name */
    public int f34896m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f34897n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f34898o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f34899p = new boolean[10];

    static {
        new bw5.x00();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.x00 parseFrom(byte[] bArr) {
        return (bw5.x00) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.x00)) {
            return false;
        }
        bw5.x00 x00Var = (bw5.x00) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f34890d), java.lang.Long.valueOf(x00Var.f34890d)) && n51.f.a(java.lang.Long.valueOf(this.f34891e), java.lang.Long.valueOf(x00Var.f34891e)) && n51.f.a(java.lang.Integer.valueOf(this.f34892f), java.lang.Integer.valueOf(x00Var.f34892f)) && n51.f.a(java.lang.Integer.valueOf(this.f34893g), java.lang.Integer.valueOf(x00Var.f34893g)) && n51.f.a(java.lang.Long.valueOf(this.f34894h), java.lang.Long.valueOf(x00Var.f34894h)) && n51.f.a(java.lang.Integer.valueOf(this.f34895i), java.lang.Integer.valueOf(x00Var.f34895i)) && n51.f.a(java.lang.Integer.valueOf(this.f34896m), java.lang.Integer.valueOf(x00Var.f34896m)) && n51.f.a(this.f34897n, x00Var.f34897n) && n51.f.a(this.f34898o, x00Var.f34898o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.x00();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34899p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f34890d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f34891e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f34892f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f34893g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f34894h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f34895i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f34896m);
            }
            java.lang.String str = this.f34897n;
            if (str != null && zArr[8]) {
                fVar.j(8, str);
            }
            java.lang.String str2 = this.f34898o;
            if (str2 != null && zArr[9]) {
                fVar.j(9, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f34890d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f34891e);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f34892f);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f34893g);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f34894h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f34895i);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f34896m);
            }
            java.lang.String str3 = this.f34897n;
            if (str3 != null && zArr[8]) {
                h17 += b36.f.j(8, str3);
            }
            java.lang.String str4 = this.f34898o;
            return (str4 == null || !zArr[9]) ? h17 : h17 + b36.f.j(9, str4);
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
                this.f34890d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34891e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f34892f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34893g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34894h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34895i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f34896m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f34897n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f34898o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
