package bw5;

/* loaded from: classes11.dex */
public class wk0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f34756d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.dj0 f34757e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34758f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f34759g;

    /* renamed from: h, reason: collision with root package name */
    public int f34760h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f34761i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f34762m;

    /* renamed from: n, reason: collision with root package name */
    public int f34763n;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f34765p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f34766q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f34767r;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f34764o = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f34768s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f34769t = new boolean[15];

    static {
        new bw5.wk0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wk0 parseFrom(byte[] bArr) {
        return (bw5.wk0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wk0)) {
            return false;
        }
        bw5.wk0 wk0Var = (bw5.wk0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f34756d), java.lang.Long.valueOf(wk0Var.f34756d)) && n51.f.a(this.f34757e, wk0Var.f34757e) && n51.f.a(this.f34758f, wk0Var.f34758f) && n51.f.a(this.f34759g, wk0Var.f34759g) && n51.f.a(java.lang.Integer.valueOf(this.f34760h), java.lang.Integer.valueOf(wk0Var.f34760h)) && n51.f.a(this.f34761i, wk0Var.f34761i) && n51.f.a(this.f34762m, wk0Var.f34762m) && n51.f.a(java.lang.Integer.valueOf(this.f34763n), java.lang.Integer.valueOf(wk0Var.f34763n)) && n51.f.a(this.f34764o, wk0Var.f34764o) && n51.f.a(this.f34765p, wk0Var.f34765p) && n51.f.a(this.f34766q, wk0Var.f34766q) && n51.f.a(this.f34767r, wk0Var.f34767r) && n51.f.a(this.f34768s, wk0Var.f34768s);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wk0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f34768s;
        java.util.LinkedList linkedList2 = this.f34764o;
        boolean[] zArr = this.f34769t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f34756d);
            }
            bw5.dj0 dj0Var = this.f34757e;
            if (dj0Var != null && zArr[2]) {
                fVar.i(2, dj0Var.computeSize());
                this.f34757e.writeFields(fVar);
            }
            java.lang.String str = this.f34758f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f34759g;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.e(6, this.f34760h);
            }
            java.lang.String str3 = this.f34761i;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f34762m;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            if (zArr[9]) {
                fVar.e(9, this.f34763n);
            }
            fVar.g(10, 8, linkedList2);
            java.lang.String str5 = this.f34765p;
            if (str5 != null && zArr[11]) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f34766q;
            if (str6 != null && zArr[12]) {
                fVar.j(12, str6);
            }
            java.lang.String str7 = this.f34767r;
            if (str7 != null && zArr[13]) {
                fVar.j(13, str7);
            }
            fVar.g(14, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f34756d) + 0 : 0;
            bw5.dj0 dj0Var2 = this.f34757e;
            if (dj0Var2 != null && zArr[2]) {
                h17 += b36.f.i(2, dj0Var2.computeSize());
            }
            java.lang.String str8 = this.f34758f;
            if (str8 != null && zArr[4]) {
                h17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f34759g;
            if (str9 != null && zArr[5]) {
                h17 += b36.f.j(5, str9);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f34760h);
            }
            java.lang.String str10 = this.f34761i;
            if (str10 != null && zArr[7]) {
                h17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f34762m;
            if (str11 != null && zArr[8]) {
                h17 += b36.f.j(8, str11);
            }
            if (zArr[9]) {
                h17 += b36.f.e(9, this.f34763n);
            }
            int g17 = h17 + b36.f.g(10, 8, linkedList2);
            java.lang.String str12 = this.f34765p;
            if (str12 != null && zArr[11]) {
                g17 += b36.f.j(11, str12);
            }
            java.lang.String str13 = this.f34766q;
            if (str13 != null && zArr[12]) {
                g17 += b36.f.j(12, str13);
            }
            java.lang.String str14 = this.f34767r;
            if (str14 != null && zArr[13]) {
                g17 += b36.f.j(13, str14);
            }
            return g17 + b36.f.g(14, 8, linkedList);
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
        switch (intValue) {
            case 1:
                this.f34756d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.dj0 dj0Var3 = new bw5.dj0();
                    if (bArr != null && bArr.length > 0) {
                        dj0Var3.parseFrom(bArr);
                    }
                    this.f34757e = dj0Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
            default:
                return -1;
            case 4:
                this.f34758f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34759g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34760h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f34761i = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f34762m = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f34763n = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.gj0 gj0Var = new bw5.gj0();
                    if (bArr2 != null && bArr2.length > 0) {
                        gj0Var.parseFrom(bArr2);
                    }
                    linkedList2.add(gj0Var);
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f34765p = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f34766q = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f34767r = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.gj0 gj0Var2 = new bw5.gj0();
                    if (bArr3 != null && bArr3.length > 0) {
                        gj0Var2.parseFrom(bArr3);
                    }
                    linkedList.add(gj0Var2);
                }
                zArr[14] = true;
                return 0;
        }
    }
}
