package bw5;

/* loaded from: classes15.dex */
public class bi0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25679d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.io0 f25680e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25681f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.f30 f25682g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.vi0 f25683h;

    /* renamed from: i, reason: collision with root package name */
    public int f25684i;

    /* renamed from: m, reason: collision with root package name */
    public int f25685m;

    /* renamed from: p, reason: collision with root package name */
    public int f25688p;

    /* renamed from: q, reason: collision with root package name */
    public int f25689q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f25690r;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f25686n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f25687o = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f25691s = new boolean[13];

    static {
        new bw5.bi0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bi0 parseFrom(byte[] bArr) {
        return (bw5.bi0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bi0)) {
            return false;
        }
        bw5.bi0 bi0Var = (bw5.bi0) fVar;
        return n51.f.a(this.f25679d, bi0Var.f25679d) && n51.f.a(this.f25680e, bi0Var.f25680e) && n51.f.a(this.f25681f, bi0Var.f25681f) && n51.f.a(this.f25682g, bi0Var.f25682g) && n51.f.a(this.f25683h, bi0Var.f25683h) && n51.f.a(java.lang.Integer.valueOf(this.f25684i), java.lang.Integer.valueOf(bi0Var.f25684i)) && n51.f.a(java.lang.Integer.valueOf(this.f25685m), java.lang.Integer.valueOf(bi0Var.f25685m)) && n51.f.a(this.f25686n, bi0Var.f25686n) && n51.f.a(this.f25687o, bi0Var.f25687o) && n51.f.a(java.lang.Integer.valueOf(this.f25688p), java.lang.Integer.valueOf(bi0Var.f25688p)) && n51.f.a(java.lang.Integer.valueOf(this.f25689q), java.lang.Integer.valueOf(bi0Var.f25689q)) && n51.f.a(this.f25690r, bi0Var.f25690r);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.bi0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25687o;
        java.util.LinkedList linkedList2 = this.f25686n;
        boolean[] zArr = this.f25691s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25679d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.io0 io0Var = this.f25680e;
            if (io0Var != null && zArr[2]) {
                fVar.e(2, io0Var.f28657d);
            }
            java.lang.String str2 = this.f25681f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.f30 f30Var = this.f25682g;
            if (f30Var != null && zArr[4]) {
                fVar.e(4, f30Var.f27141d);
            }
            bw5.vi0 vi0Var = this.f25683h;
            if (vi0Var != null && zArr[5]) {
                fVar.e(5, vi0Var.f34376d);
            }
            if (zArr[6]) {
                fVar.e(6, this.f25684i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f25685m);
            }
            fVar.g(8, 8, linkedList2);
            fVar.g(9, 8, linkedList);
            if (zArr[10]) {
                fVar.e(10, this.f25688p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f25689q);
            }
            java.lang.String str3 = this.f25690r;
            if (str3 == null || !zArr[12]) {
                return 0;
            }
            fVar.j(12, str3);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f25679d;
            int j17 = (str4 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str4);
            bw5.io0 io0Var2 = this.f25680e;
            if (io0Var2 != null && zArr[2]) {
                j17 += b36.f.e(2, io0Var2.f28657d);
            }
            java.lang.String str5 = this.f25681f;
            if (str5 != null && zArr[3]) {
                j17 += b36.f.j(3, str5);
            }
            bw5.f30 f30Var2 = this.f25682g;
            if (f30Var2 != null && zArr[4]) {
                j17 += b36.f.e(4, f30Var2.f27141d);
            }
            bw5.vi0 vi0Var2 = this.f25683h;
            if (vi0Var2 != null && zArr[5]) {
                j17 += b36.f.e(5, vi0Var2.f34376d);
            }
            if (zArr[6]) {
                j17 += b36.f.e(6, this.f25684i);
            }
            if (zArr[7]) {
                j17 += b36.f.e(7, this.f25685m);
            }
            int g17 = j17 + b36.f.g(8, 8, linkedList2) + b36.f.g(9, 8, linkedList);
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f25688p);
            }
            if (zArr[11]) {
                g17 += b36.f.e(11, this.f25689q);
            }
            java.lang.String str6 = this.f25690r;
            return (str6 == null || !zArr[12]) ? g17 : g17 + b36.f.j(12, str6);
        }
        if (i17 == 2) {
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
        bw5.io0 io0Var3 = null;
        bw5.vi0 vi0Var3 = null;
        switch (intValue) {
            case 1:
                this.f25679d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                int g18 = aVar2.g(intValue);
                if (g18 == 0) {
                    io0Var3 = bw5.io0.PREVIEW_RUNNING;
                } else if (g18 == 1) {
                    io0Var3 = bw5.io0.PREVIEW_SUCCESS;
                } else if (g18 == 2) {
                    io0Var3 = bw5.io0.PREVIEW_NEED_PASSWORD;
                } else if (g18 == 3) {
                    io0Var3 = bw5.io0.PREVIEW_ERROR;
                }
                this.f25680e = io0Var3;
                zArr[2] = true;
                return 0;
            case 3:
                this.f25681f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25682g = bw5.f30.a(aVar2.g(intValue));
                zArr[4] = true;
                return 0;
            case 5:
                int g19 = aVar2.g(intValue);
                if (g19 == 0) {
                    vi0Var3 = bw5.vi0.PAGES;
                } else if (g19 == 1) {
                    vi0Var3 = bw5.vi0.SHEETS;
                }
                this.f25683h = vi0Var3;
                zArr[5] = true;
                return 0;
            case 6:
                this.f25684i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f25685m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.di0 di0Var = new bw5.di0();
                    if (bArr != null && bArr.length > 0) {
                        di0Var.parseFrom(bArr);
                    }
                    linkedList2.add(di0Var);
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    bw5.ij0 ij0Var = new bw5.ij0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ij0Var.parseFrom(bArr2);
                    }
                    linkedList.add(ij0Var);
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f25688p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f25689q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f25690r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
