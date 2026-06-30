package bw5;

/* loaded from: classes4.dex */
public class a3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f24982d;

    /* renamed from: e, reason: collision with root package name */
    public int f24983e;

    /* renamed from: f, reason: collision with root package name */
    public int f24984f;

    /* renamed from: g, reason: collision with root package name */
    public int f24985g;

    /* renamed from: h, reason: collision with root package name */
    public int f24986h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f24988m;

    /* renamed from: n, reason: collision with root package name */
    public r45.cu5 f24989n;

    /* renamed from: o, reason: collision with root package name */
    public int f24990o;

    /* renamed from: p, reason: collision with root package name */
    public int f24991p;

    /* renamed from: t, reason: collision with root package name */
    public int f24995t;

    /* renamed from: u, reason: collision with root package name */
    public int f24996u;

    /* renamed from: v, reason: collision with root package name */
    public int f24997v;

    /* renamed from: w, reason: collision with root package name */
    public r45.cu5 f24998w;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f24987i = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f24992q = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f24993r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f24994s = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f24999x = new boolean[18];

    static {
        new bw5.a3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.a3 parseFrom(byte[] bArr) {
        return (bw5.a3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a3)) {
            return false;
        }
        bw5.a3 a3Var = (bw5.a3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f24982d), java.lang.Integer.valueOf(a3Var.f24982d)) && n51.f.a(java.lang.Integer.valueOf(this.f24983e), java.lang.Integer.valueOf(a3Var.f24983e)) && n51.f.a(java.lang.Integer.valueOf(this.f24984f), java.lang.Integer.valueOf(a3Var.f24984f)) && n51.f.a(java.lang.Integer.valueOf(this.f24985g), java.lang.Integer.valueOf(a3Var.f24985g)) && n51.f.a(java.lang.Integer.valueOf(this.f24986h), java.lang.Integer.valueOf(a3Var.f24986h)) && n51.f.a(this.f24987i, a3Var.f24987i) && n51.f.a(this.f24988m, a3Var.f24988m) && n51.f.a(this.f24989n, a3Var.f24989n) && n51.f.a(java.lang.Integer.valueOf(this.f24990o), java.lang.Integer.valueOf(a3Var.f24990o)) && n51.f.a(java.lang.Integer.valueOf(this.f24991p), java.lang.Integer.valueOf(a3Var.f24991p)) && n51.f.a(this.f24992q, a3Var.f24992q) && n51.f.a(this.f24993r, a3Var.f24993r) && n51.f.a(this.f24994s, a3Var.f24994s) && n51.f.a(java.lang.Integer.valueOf(this.f24995t), java.lang.Integer.valueOf(a3Var.f24995t)) && n51.f.a(java.lang.Integer.valueOf(this.f24996u), java.lang.Integer.valueOf(a3Var.f24996u)) && n51.f.a(java.lang.Integer.valueOf(this.f24997v), java.lang.Integer.valueOf(a3Var.f24997v)) && n51.f.a(this.f24998w, a3Var.f24998w);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.a3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f24994s;
        java.util.LinkedList linkedList2 = this.f24993r;
        java.util.LinkedList linkedList3 = this.f24992q;
        java.util.LinkedList linkedList4 = this.f24987i;
        boolean[] zArr = this.f24999x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f24982d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f24983e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f24984f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f24985g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f24986h);
            }
            fVar.g(6, 8, linkedList4);
            java.lang.String str = this.f24988m;
            if (str != null && zArr[7]) {
                fVar.j(7, str);
            }
            r45.cu5 cu5Var = this.f24989n;
            if (cu5Var != null && zArr[8]) {
                fVar.i(8, cu5Var.computeSize());
                this.f24989n.writeFields(fVar);
            }
            if (zArr[9]) {
                fVar.e(9, this.f24990o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f24991p);
            }
            fVar.g(11, 8, linkedList3);
            fVar.g(12, 8, linkedList2);
            fVar.g(13, 8, linkedList);
            if (zArr[14]) {
                fVar.e(14, this.f24995t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f24996u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f24997v);
            }
            r45.cu5 cu5Var2 = this.f24998w;
            if (cu5Var2 != null && zArr[17]) {
                fVar.i(17, cu5Var2.computeSize());
                this.f24998w.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f24982d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f24983e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f24984f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f24985g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f24986h);
            }
            int g17 = e17 + b36.f.g(6, 8, linkedList4);
            java.lang.String str2 = this.f24988m;
            if (str2 != null && zArr[7]) {
                g17 += b36.f.j(7, str2);
            }
            r45.cu5 cu5Var3 = this.f24989n;
            if (cu5Var3 != null && zArr[8]) {
                g17 += b36.f.i(8, cu5Var3.computeSize());
            }
            if (zArr[9]) {
                g17 += b36.f.e(9, this.f24990o);
            }
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f24991p);
            }
            int g18 = g17 + b36.f.g(11, 8, linkedList3) + b36.f.g(12, 8, linkedList2) + b36.f.g(13, 8, linkedList);
            if (zArr[14]) {
                g18 += b36.f.e(14, this.f24995t);
            }
            if (zArr[15]) {
                g18 += b36.f.e(15, this.f24996u);
            }
            if (zArr[16]) {
                g18 += b36.f.e(16, this.f24997v);
            }
            r45.cu5 cu5Var4 = this.f24998w;
            return (cu5Var4 == null || !zArr[17]) ? g18 : g18 + b36.f.i(17, cu5Var4.computeSize());
        }
        if (i17 == 2) {
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
                this.f24982d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f24983e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f24984f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f24985g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f24986h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var.b(bArr);
                    }
                    linkedList4.add(du5Var);
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f24988m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    this.f24989n = cu5Var5;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f24990o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f24991p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.du5 du5Var2 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var2.b(bArr3);
                    }
                    linkedList3.add(du5Var2);
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.b3 b3Var = new bw5.b3();
                    if (bArr4 != null && bArr4.length > 0) {
                        b3Var.parseFrom(bArr4);
                    }
                    linkedList2.add(b3Var);
                }
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.b3 b3Var2 = new bw5.b3();
                    if (bArr5 != null && bArr5.length > 0) {
                        b3Var2.parseFrom(bArr5);
                    }
                    linkedList.add(b3Var2);
                }
                zArr[13] = true;
                return 0;
            case 14:
                this.f24995t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f24996u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f24997v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr6 != null && bArr6.length > 0) {
                        cu5Var6.b(bArr6);
                    }
                    this.f24998w = cu5Var6;
                }
                zArr[17] = true;
                return 0;
            default:
                return -1;
        }
    }
}
