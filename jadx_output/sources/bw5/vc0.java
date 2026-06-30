package bw5;

/* loaded from: classes2.dex */
public class vc0 extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public int B;
    public int C;
    public int D;
    public java.lang.String E;
    public final boolean[] F = new boolean[26];

    /* renamed from: d, reason: collision with root package name */
    public long f34288d;

    /* renamed from: e, reason: collision with root package name */
    public int f34289e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.xc0 f34290f;

    /* renamed from: g, reason: collision with root package name */
    public int f34291g;

    /* renamed from: h, reason: collision with root package name */
    public int f34292h;

    /* renamed from: i, reason: collision with root package name */
    public int f34293i;

    /* renamed from: m, reason: collision with root package name */
    public int f34294m;

    /* renamed from: n, reason: collision with root package name */
    public int f34295n;

    /* renamed from: o, reason: collision with root package name */
    public int f34296o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f34297p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f34298q;

    /* renamed from: r, reason: collision with root package name */
    public int f34299r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f34300s;

    /* renamed from: t, reason: collision with root package name */
    public int f34301t;

    /* renamed from: u, reason: collision with root package name */
    public int f34302u;

    /* renamed from: v, reason: collision with root package name */
    public int f34303v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f34304w;

    /* renamed from: x, reason: collision with root package name */
    public int f34305x;

    /* renamed from: y, reason: collision with root package name */
    public bw5.bd0 f34306y;

    /* renamed from: z, reason: collision with root package name */
    public int f34307z;

    static {
        new bw5.vc0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vc0 parseFrom(byte[] bArr) {
        return (bw5.vc0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vc0)) {
            return false;
        }
        bw5.vc0 vc0Var = (bw5.vc0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f34288d), java.lang.Long.valueOf(vc0Var.f34288d)) && n51.f.a(java.lang.Integer.valueOf(this.f34289e), java.lang.Integer.valueOf(vc0Var.f34289e)) && n51.f.a(this.f34290f, vc0Var.f34290f) && n51.f.a(java.lang.Integer.valueOf(this.f34291g), java.lang.Integer.valueOf(vc0Var.f34291g)) && n51.f.a(java.lang.Integer.valueOf(this.f34292h), java.lang.Integer.valueOf(vc0Var.f34292h)) && n51.f.a(java.lang.Integer.valueOf(this.f34293i), java.lang.Integer.valueOf(vc0Var.f34293i)) && n51.f.a(java.lang.Integer.valueOf(this.f34294m), java.lang.Integer.valueOf(vc0Var.f34294m)) && n51.f.a(java.lang.Integer.valueOf(this.f34295n), java.lang.Integer.valueOf(vc0Var.f34295n)) && n51.f.a(java.lang.Integer.valueOf(this.f34296o), java.lang.Integer.valueOf(vc0Var.f34296o)) && n51.f.a(this.f34297p, vc0Var.f34297p) && n51.f.a(java.lang.Boolean.valueOf(this.f34298q), java.lang.Boolean.valueOf(vc0Var.f34298q)) && n51.f.a(java.lang.Integer.valueOf(this.f34299r), java.lang.Integer.valueOf(vc0Var.f34299r)) && n51.f.a(this.f34300s, vc0Var.f34300s) && n51.f.a(java.lang.Integer.valueOf(this.f34301t), java.lang.Integer.valueOf(vc0Var.f34301t)) && n51.f.a(java.lang.Integer.valueOf(this.f34302u), java.lang.Integer.valueOf(vc0Var.f34302u)) && n51.f.a(java.lang.Integer.valueOf(this.f34303v), java.lang.Integer.valueOf(vc0Var.f34303v)) && n51.f.a(this.f34304w, vc0Var.f34304w) && n51.f.a(java.lang.Integer.valueOf(this.f34305x), java.lang.Integer.valueOf(vc0Var.f34305x)) && n51.f.a(this.f34306y, vc0Var.f34306y) && n51.f.a(java.lang.Integer.valueOf(this.f34307z), java.lang.Integer.valueOf(vc0Var.f34307z)) && n51.f.a(this.A, vc0Var.A) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(vc0Var.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(vc0Var.C)) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(vc0Var.D)) && n51.f.a(this.E, vc0Var.E);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.vc0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.F;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f34288d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34289e);
            }
            bw5.xc0 xc0Var = this.f34290f;
            if (xc0Var != null && zArr[3]) {
                fVar.i(3, xc0Var.computeSize());
                this.f34290f.writeFields(fVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f34291g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f34292h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f34293i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f34294m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f34295n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f34296o);
            }
            java.lang.String str = this.f34297p;
            if (str != null && zArr[10]) {
                fVar.j(10, str);
            }
            if (zArr[11]) {
                fVar.a(11, this.f34298q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f34299r);
            }
            java.lang.String str2 = this.f34300s;
            if (str2 != null && zArr[13]) {
                fVar.j(13, str2);
            }
            if (zArr[14]) {
                fVar.e(14, this.f34301t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f34302u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f34303v);
            }
            java.lang.String str3 = this.f34304w;
            if (str3 != null && zArr[17]) {
                fVar.j(17, str3);
            }
            if (zArr[18]) {
                fVar.e(18, this.f34305x);
            }
            bw5.bd0 bd0Var = this.f34306y;
            if (bd0Var != null && zArr[19]) {
                fVar.i(19, bd0Var.computeSize());
                this.f34306y.writeFields(fVar);
            }
            if (zArr[20]) {
                fVar.e(20, this.f34307z);
            }
            java.lang.String str4 = this.A;
            if (str4 != null && zArr[21]) {
                fVar.j(21, str4);
            }
            if (zArr[22]) {
                fVar.e(22, this.B);
            }
            if (zArr[23]) {
                fVar.e(23, this.C);
            }
            if (zArr[24]) {
                fVar.e(24, this.D);
            }
            java.lang.String str5 = this.E;
            if (str5 != null && zArr[25]) {
                fVar.j(25, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f34288d) + 0 : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f34289e);
            }
            bw5.xc0 xc0Var2 = this.f34290f;
            if (xc0Var2 != null && zArr[3]) {
                h17 += b36.f.i(3, xc0Var2.computeSize());
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f34291g);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f34292h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f34293i);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f34294m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f34295n);
            }
            if (zArr[9]) {
                h17 += b36.f.e(9, this.f34296o);
            }
            java.lang.String str6 = this.f34297p;
            if (str6 != null && zArr[10]) {
                h17 += b36.f.j(10, str6);
            }
            if (zArr[11]) {
                h17 += b36.f.a(11, this.f34298q);
            }
            if (zArr[12]) {
                h17 += b36.f.e(12, this.f34299r);
            }
            java.lang.String str7 = this.f34300s;
            if (str7 != null && zArr[13]) {
                h17 += b36.f.j(13, str7);
            }
            if (zArr[14]) {
                h17 += b36.f.e(14, this.f34301t);
            }
            if (zArr[15]) {
                h17 += b36.f.e(15, this.f34302u);
            }
            if (zArr[16]) {
                h17 += b36.f.e(16, this.f34303v);
            }
            java.lang.String str8 = this.f34304w;
            if (str8 != null && zArr[17]) {
                h17 += b36.f.j(17, str8);
            }
            if (zArr[18]) {
                h17 += b36.f.e(18, this.f34305x);
            }
            bw5.bd0 bd0Var2 = this.f34306y;
            if (bd0Var2 != null && zArr[19]) {
                h17 += b36.f.i(19, bd0Var2.computeSize());
            }
            if (zArr[20]) {
                h17 += b36.f.e(20, this.f34307z);
            }
            java.lang.String str9 = this.A;
            if (str9 != null && zArr[21]) {
                h17 += b36.f.j(21, str9);
            }
            if (zArr[22]) {
                h17 += b36.f.e(22, this.B);
            }
            if (zArr[23]) {
                h17 += b36.f.e(23, this.C);
            }
            if (zArr[24]) {
                h17 += b36.f.e(24, this.D);
            }
            java.lang.String str10 = this.E;
            return (str10 == null || !zArr[25]) ? h17 : h17 + b36.f.j(25, str10);
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
                this.f34288d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34289e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.xc0 xc0Var3 = new bw5.xc0();
                    if (bArr != null && bArr.length > 0) {
                        xc0Var3.parseFrom(bArr);
                    }
                    this.f34290f = xc0Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f34291g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34292h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34293i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f34294m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f34295n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f34296o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f34297p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f34298q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f34299r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f34300s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f34301t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f34302u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f34303v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f34304w = aVar2.k(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f34305x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.bd0 bd0Var3 = new bw5.bd0();
                    if (bArr2 != null && bArr2.length > 0) {
                        bd0Var3.parseFrom(bArr2);
                    }
                    this.f34306y = bd0Var3;
                }
                zArr[19] = true;
                return 0;
            case 20:
                this.f34307z = aVar2.g(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.k(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.g(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.g(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.g(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.k(intValue);
                zArr[25] = true;
                return 0;
            default:
                return -1;
        }
    }
}
