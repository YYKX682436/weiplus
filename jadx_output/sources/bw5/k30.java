package bw5;

/* loaded from: classes2.dex */
public class k30 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f29213d;

    /* renamed from: e, reason: collision with root package name */
    public int f29214e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f29216g;

    /* renamed from: h, reason: collision with root package name */
    public int f29217h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f29218i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f29219m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f29221o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f29223q;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f29215f = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f29220n = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f29222p = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f29224r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f29225s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f29226t = new boolean[14];

    static {
        new bw5.k30();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.k30 parseFrom(byte[] bArr) {
        return (bw5.k30) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.k30)) {
            return false;
        }
        bw5.k30 k30Var = (bw5.k30) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f29213d), java.lang.Integer.valueOf(k30Var.f29213d)) && n51.f.a(java.lang.Integer.valueOf(this.f29214e), java.lang.Integer.valueOf(k30Var.f29214e)) && n51.f.a(this.f29215f, k30Var.f29215f) && n51.f.a(this.f29216g, k30Var.f29216g) && n51.f.a(java.lang.Integer.valueOf(this.f29217h), java.lang.Integer.valueOf(k30Var.f29217h)) && n51.f.a(this.f29218i, k30Var.f29218i) && n51.f.a(this.f29219m, k30Var.f29219m) && n51.f.a(this.f29220n, k30Var.f29220n) && n51.f.a(java.lang.Boolean.valueOf(this.f29221o), java.lang.Boolean.valueOf(k30Var.f29221o)) && n51.f.a(this.f29222p, k30Var.f29222p) && n51.f.a(this.f29223q, k30Var.f29223q) && n51.f.a(this.f29224r, k30Var.f29224r) && n51.f.a(this.f29225s, k30Var.f29225s);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.k30();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f29225s;
        java.util.LinkedList linkedList2 = this.f29224r;
        java.util.LinkedList linkedList3 = this.f29222p;
        java.util.LinkedList linkedList4 = this.f29220n;
        java.util.LinkedList linkedList5 = this.f29215f;
        boolean[] zArr = this.f29226t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f29213d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f29214e);
            }
            fVar.g(3, 8, linkedList5);
            java.lang.String str = this.f29216g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.e(5, this.f29217h);
            }
            java.lang.String str2 = this.f29218i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f29219m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            fVar.g(8, 8, linkedList4);
            if (zArr[9]) {
                fVar.a(9, this.f29221o);
            }
            fVar.g(10, 8, linkedList3);
            java.lang.String str4 = this.f29223q;
            if (str4 != null && zArr[11]) {
                fVar.j(11, str4);
            }
            fVar.g(12, 8, linkedList2);
            fVar.g(13, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f29213d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f29214e);
            }
            int g17 = e17 + b36.f.g(3, 8, linkedList5);
            java.lang.String str5 = this.f29216g;
            if (str5 != null && zArr[4]) {
                g17 += b36.f.j(4, str5);
            }
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f29217h);
            }
            java.lang.String str6 = this.f29218i;
            if (str6 != null && zArr[6]) {
                g17 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f29219m;
            if (str7 != null && zArr[7]) {
                g17 += b36.f.j(7, str7);
            }
            int g18 = g17 + b36.f.g(8, 8, linkedList4);
            if (zArr[9]) {
                g18 += b36.f.a(9, this.f29221o);
            }
            int g19 = g18 + b36.f.g(10, 8, linkedList3);
            java.lang.String str8 = this.f29223q;
            if (str8 != null && zArr[11]) {
                g19 += b36.f.j(11, str8);
            }
            return g19 + b36.f.g(12, 8, linkedList2) + b36.f.g(13, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
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
                this.f29213d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29214e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.j30 j30Var = new bw5.j30();
                    if (bArr != null && bArr.length > 0) {
                        j30Var.parseFrom(bArr);
                    }
                    linkedList5.add(j30Var);
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f29216g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f29217h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f29218i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f29219m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.xn xnVar = new bw5.xn();
                    if (bArr2 != null && bArr2.length > 0) {
                        xnVar.parseFrom(bArr2);
                    }
                    linkedList4.add(xnVar);
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f29221o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.xn xnVar2 = new bw5.xn();
                    if (bArr3 != null && bArr3.length > 0) {
                        xnVar2.parseFrom(bArr3);
                    }
                    linkedList3.add(xnVar2);
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f29223q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.wn wnVar = new bw5.wn();
                    if (bArr4 != null && bArr4.length > 0) {
                        wnVar.parseFrom(bArr4);
                    }
                    linkedList2.add(wnVar);
                }
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.wn wnVar2 = new bw5.wn();
                    if (bArr5 != null && bArr5.length > 0) {
                        wnVar2.parseFrom(bArr5);
                    }
                    linkedList.add(wnVar2);
                }
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
