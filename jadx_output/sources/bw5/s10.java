package bw5;

/* loaded from: classes9.dex */
public class s10 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32749d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f32750e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f32751f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32752g;

    /* renamed from: h, reason: collision with root package name */
    public int f32753h;

    /* renamed from: i, reason: collision with root package name */
    public int f32754i;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f32756n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f32757o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f32758p;

    /* renamed from: q, reason: collision with root package name */
    public int f32759q;

    /* renamed from: r, reason: collision with root package name */
    public int f32760r;

    /* renamed from: s, reason: collision with root package name */
    public long f32761s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f32762t;

    /* renamed from: u, reason: collision with root package name */
    public int f32763u;

    /* renamed from: v, reason: collision with root package name */
    public r45.cu5 f32764v;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f32755m = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f32765w = new boolean[18];

    static {
        new bw5.s10();
    }

    public java.lang.String b() {
        return this.f32765w[11] ? this.f32758p : "";
    }

    public java.lang.String c() {
        return this.f32765w[15] ? this.f32762t : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s10)) {
            return false;
        }
        bw5.s10 s10Var = (bw5.s10) fVar;
        return n51.f.a(this.BaseResponse, s10Var.BaseResponse) && n51.f.a(this.f32749d, s10Var.f32749d) && n51.f.a(this.f32750e, s10Var.f32750e) && n51.f.a(this.f32751f, s10Var.f32751f) && n51.f.a(this.f32752g, s10Var.f32752g) && n51.f.a(java.lang.Integer.valueOf(this.f32753h), java.lang.Integer.valueOf(s10Var.f32753h)) && n51.f.a(java.lang.Integer.valueOf(this.f32754i), java.lang.Integer.valueOf(s10Var.f32754i)) && n51.f.a(this.f32755m, s10Var.f32755m) && n51.f.a(this.f32756n, s10Var.f32756n) && n51.f.a(this.f32757o, s10Var.f32757o) && n51.f.a(this.f32758p, s10Var.f32758p) && n51.f.a(java.lang.Integer.valueOf(this.f32759q), java.lang.Integer.valueOf(s10Var.f32759q)) && n51.f.a(java.lang.Integer.valueOf(this.f32760r), java.lang.Integer.valueOf(s10Var.f32760r)) && n51.f.a(java.lang.Long.valueOf(this.f32761s), java.lang.Long.valueOf(s10Var.f32761s)) && n51.f.a(this.f32762t, s10Var.f32762t) && n51.f.a(java.lang.Integer.valueOf(this.f32763u), java.lang.Integer.valueOf(s10Var.f32763u)) && n51.f.a(this.f32764v, s10Var.f32764v);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f32765w[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.s10();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f32755m;
        int i18 = 0;
        boolean[] zArr = this.f32765w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f32749d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            r45.cu5 cu5Var = this.f32750e;
            if (cu5Var != null && zArr[3]) {
                fVar.i(3, cu5Var.computeSize());
                this.f32750e.writeFields(fVar);
            }
            java.lang.String str2 = this.f32751f;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f32752g;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.e(6, this.f32753h);
            }
            if (zArr[7]) {
                fVar.e(7, this.f32754i);
            }
            fVar.g(8, 8, linkedList);
            java.lang.String str4 = this.f32756n;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f32757o;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f32758p;
            if (str6 != null && zArr[11]) {
                fVar.j(11, str6);
            }
            if (zArr[12]) {
                fVar.e(12, this.f32759q);
            }
            if (zArr[13]) {
                fVar.e(13, this.f32760r);
            }
            if (zArr[14]) {
                fVar.h(14, this.f32761s);
            }
            java.lang.String str7 = this.f32762t;
            if (str7 != null && zArr[15]) {
                fVar.j(15, str7);
            }
            if (zArr[16]) {
                fVar.e(16, this.f32763u);
            }
            r45.cu5 cu5Var2 = this.f32764v;
            if (cu5Var2 != null && zArr[17]) {
                fVar.i(17, cu5Var2.computeSize());
                this.f32764v.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = b36.f.i(1, ieVar2.computeSize()) + 0;
            }
            java.lang.String str8 = this.f32749d;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            r45.cu5 cu5Var3 = this.f32750e;
            if (cu5Var3 != null && zArr[3]) {
                i18 += b36.f.i(3, cu5Var3.computeSize());
            }
            java.lang.String str9 = this.f32751f;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f32752g;
            if (str10 != null && zArr[5]) {
                i18 += b36.f.j(5, str10);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f32753h);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f32754i);
            }
            int g17 = i18 + b36.f.g(8, 8, linkedList);
            java.lang.String str11 = this.f32756n;
            if (str11 != null && zArr[9]) {
                g17 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f32757o;
            if (str12 != null && zArr[10]) {
                g17 += b36.f.j(10, str12);
            }
            java.lang.String str13 = this.f32758p;
            if (str13 != null && zArr[11]) {
                g17 += b36.f.j(11, str13);
            }
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f32759q);
            }
            if (zArr[13]) {
                g17 += b36.f.e(13, this.f32760r);
            }
            if (zArr[14]) {
                g17 += b36.f.h(14, this.f32761s);
            }
            java.lang.String str14 = this.f32762t;
            if (str14 != null && zArr[15]) {
                g17 += b36.f.j(15, str14);
            }
            if (zArr[16]) {
                g17 += b36.f.e(16, this.f32763u);
            }
            r45.cu5 cu5Var4 = this.f32764v;
            return (cu5Var4 == null || !zArr[17]) ? g17 : g17 + b36.f.i(17, cu5Var4.computeSize());
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    this.BaseResponse = ieVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f32749d = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    this.f32750e = cu5Var5;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f32751f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32752g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f32753h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f32754i = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.f4 f4Var = new bw5.f4();
                    if (bArr3 != null && bArr3.length > 0) {
                        f4Var.parseFrom(bArr3);
                    }
                    linkedList.add(f4Var);
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f32756n = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f32757o = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f32758p = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f32759q = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f32760r = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f32761s = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f32762t = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f32763u = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var6.b(bArr4);
                    }
                    this.f32764v = cu5Var6;
                }
                zArr[17] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.s10) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f32765w[1] = true;
        return this;
    }
}
