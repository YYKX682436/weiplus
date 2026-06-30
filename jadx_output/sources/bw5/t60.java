package bw5;

/* loaded from: classes2.dex */
public class t60 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33273d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33274e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33275f;

    /* renamed from: g, reason: collision with root package name */
    public int f33276g;

    /* renamed from: h, reason: collision with root package name */
    public int f33277h;

    /* renamed from: i, reason: collision with root package name */
    public int f33278i;

    /* renamed from: n, reason: collision with root package name */
    public boolean f33280n;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f33279m = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f33281o = new boolean[9];

    static {
        new bw5.t60();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.t60 parseFrom(byte[] bArr) {
        return (bw5.t60) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.t60)) {
            return false;
        }
        bw5.t60 t60Var = (bw5.t60) fVar;
        return n51.f.a(this.f33273d, t60Var.f33273d) && n51.f.a(this.f33274e, t60Var.f33274e) && n51.f.a(this.f33275f, t60Var.f33275f) && n51.f.a(java.lang.Integer.valueOf(this.f33276g), java.lang.Integer.valueOf(t60Var.f33276g)) && n51.f.a(java.lang.Integer.valueOf(this.f33277h), java.lang.Integer.valueOf(t60Var.f33277h)) && n51.f.a(java.lang.Integer.valueOf(this.f33278i), java.lang.Integer.valueOf(t60Var.f33278i)) && n51.f.a(this.f33279m, t60Var.f33279m) && n51.f.a(java.lang.Boolean.valueOf(this.f33280n), java.lang.Boolean.valueOf(t60Var.f33280n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.t60();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f33279m;
        int i18 = 0;
        boolean[] zArr = this.f33281o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33273d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f33274e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f33275f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f33276g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f33277h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f33278i);
            }
            fVar.g(7, 2, linkedList);
            if (zArr[8]) {
                fVar.a(8, this.f33280n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f33273d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f33274e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f33275f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f33276g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f33277h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f33278i);
            }
            int g17 = i18 + b36.f.g(7, 2, linkedList);
            return zArr[8] ? g17 + b36.f.a(8, this.f33280n) : g17;
        }
        if (i17 == 2) {
            linkedList.clear();
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
                this.f33273d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33274e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33275f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33276g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33277h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33278i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[7] = true;
                return 0;
            case 8:
                this.f33280n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
