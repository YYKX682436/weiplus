package bw5;

/* loaded from: classes4.dex */
public class a5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f25012d;

    /* renamed from: e, reason: collision with root package name */
    public long f25013e;

    /* renamed from: f, reason: collision with root package name */
    public long f25014f;

    /* renamed from: g, reason: collision with root package name */
    public long f25015g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.z4 f25016h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f25017i;

    /* renamed from: m, reason: collision with root package name */
    public int f25018m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f25019n;

    /* renamed from: o, reason: collision with root package name */
    public long f25020o;

    /* renamed from: p, reason: collision with root package name */
    public long f25021p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f25022q = new boolean[11];

    static {
        new bw5.a5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.a5 parseFrom(byte[] bArr) {
        return (bw5.a5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a5)) {
            return false;
        }
        bw5.a5 a5Var = (bw5.a5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f25012d), java.lang.Long.valueOf(a5Var.f25012d)) && n51.f.a(java.lang.Long.valueOf(this.f25013e), java.lang.Long.valueOf(a5Var.f25013e)) && n51.f.a(java.lang.Long.valueOf(this.f25014f), java.lang.Long.valueOf(a5Var.f25014f)) && n51.f.a(java.lang.Long.valueOf(this.f25015g), java.lang.Long.valueOf(a5Var.f25015g)) && n51.f.a(this.f25016h, a5Var.f25016h) && n51.f.a(this.f25017i, a5Var.f25017i) && n51.f.a(java.lang.Integer.valueOf(this.f25018m), java.lang.Integer.valueOf(a5Var.f25018m)) && n51.f.a(this.f25019n, a5Var.f25019n) && n51.f.a(java.lang.Long.valueOf(this.f25020o), java.lang.Long.valueOf(a5Var.f25020o)) && n51.f.a(java.lang.Long.valueOf(this.f25021p), java.lang.Long.valueOf(a5Var.f25021p));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.a5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25022q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f25012d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f25013e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f25014f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f25015g);
            }
            bw5.z4 z4Var = this.f25016h;
            if (z4Var != null && zArr[5]) {
                fVar.e(5, z4Var.f35813d);
            }
            java.lang.String str = this.f25017i;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            if (zArr[7]) {
                fVar.e(7, this.f25018m);
            }
            java.lang.String str2 = this.f25019n;
            if (str2 != null && zArr[8]) {
                fVar.j(8, str2);
            }
            if (zArr[9]) {
                fVar.h(9, this.f25020o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f25021p);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f25012d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f25013e);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f25014f);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f25015g);
            }
            bw5.z4 z4Var2 = this.f25016h;
            if (z4Var2 != null && zArr[5]) {
                h17 += b36.f.e(5, z4Var2.f35813d);
            }
            java.lang.String str3 = this.f25017i;
            if (str3 != null && zArr[6]) {
                h17 += b36.f.j(6, str3);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f25018m);
            }
            java.lang.String str4 = this.f25019n;
            if (str4 != null && zArr[8]) {
                h17 += b36.f.j(8, str4);
            }
            if (zArr[9]) {
                h17 += b36.f.h(9, this.f25020o);
            }
            return zArr[10] ? h17 + b36.f.h(10, this.f25021p) : h17;
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
                this.f25012d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f25013e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25014f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25015g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25016h = bw5.z4.a(aVar2.g(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                this.f25017i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f25018m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f25019n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f25020o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f25021p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
