package bw5;

/* loaded from: classes2.dex */
public class fg0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f27260d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27261e;

    /* renamed from: f, reason: collision with root package name */
    public long f27262f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f27263g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f27265i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f27266m;

    /* renamed from: n, reason: collision with root package name */
    public int f27267n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f27268o;

    /* renamed from: p, reason: collision with root package name */
    public int f27269p;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f27264h = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f27270q = new boolean[12];

    static {
        new bw5.fg0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fg0 parseFrom(byte[] bArr) {
        return (bw5.fg0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fg0)) {
            return false;
        }
        bw5.fg0 fg0Var = (bw5.fg0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f27260d), java.lang.Long.valueOf(fg0Var.f27260d)) && n51.f.a(this.f27261e, fg0Var.f27261e) && n51.f.a(java.lang.Long.valueOf(this.f27262f), java.lang.Long.valueOf(fg0Var.f27262f)) && n51.f.a(this.f27263g, fg0Var.f27263g) && n51.f.a(this.f27264h, fg0Var.f27264h) && n51.f.a(this.f27265i, fg0Var.f27265i) && n51.f.a(this.f27266m, fg0Var.f27266m) && n51.f.a(java.lang.Integer.valueOf(this.f27267n), java.lang.Integer.valueOf(fg0Var.f27267n)) && n51.f.a(this.f27268o, fg0Var.f27268o) && n51.f.a(java.lang.Integer.valueOf(this.f27269p), java.lang.Integer.valueOf(fg0Var.f27269p));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fg0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f27264h;
        boolean[] zArr = this.f27270q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f27260d);
            }
            java.lang.String str = this.f27261e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f27262f);
            }
            java.lang.String str2 = this.f27263g;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            fVar.g(6, 1, linkedList);
            java.lang.String str3 = this.f27265i;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f27266m;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            if (zArr[9]) {
                fVar.e(9, this.f27267n);
            }
            java.lang.String str5 = this.f27268o;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            if (zArr[11]) {
                fVar.e(11, this.f27269p);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f27260d) : 0;
            java.lang.String str6 = this.f27261e;
            if (str6 != null && zArr[2]) {
                h17 += b36.f.j(2, str6);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f27262f);
            }
            java.lang.String str7 = this.f27263g;
            if (str7 != null && zArr[5]) {
                h17 += b36.f.j(5, str7);
            }
            int g17 = h17 + b36.f.g(6, 1, linkedList);
            java.lang.String str8 = this.f27265i;
            if (str8 != null && zArr[7]) {
                g17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f27266m;
            if (str9 != null && zArr[8]) {
                g17 += b36.f.j(8, str9);
            }
            if (zArr[9]) {
                g17 += b36.f.e(9, this.f27267n);
            }
            java.lang.String str10 = this.f27268o;
            if (str10 != null && zArr[10]) {
                g17 += b36.f.j(10, str10);
            }
            return zArr[11] ? g17 + b36.f.e(11, this.f27269p) : g17;
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
                this.f27260d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27261e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27262f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
            default:
                return -1;
            case 5:
                this.f27263g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                linkedList.add(aVar2.k(intValue));
                zArr[6] = true;
                return 0;
            case 7:
                this.f27265i = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f27266m = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f27267n = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f27268o = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f27269p = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
        }
    }
}
