package bw5;

/* loaded from: classes2.dex */
public class eq extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26994d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26995e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26996f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f26997g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f26998h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f26999i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f27000m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f27001n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f27002o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f27003p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f27004q;

    /* renamed from: r, reason: collision with root package name */
    public long f27005r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f27006s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f27007t;

    /* renamed from: u, reason: collision with root package name */
    public int f27008u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f27009v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f27010w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.dq f27011x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f27012y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean[] f27013z = new boolean[20];

    static {
        new bw5.eq();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.eq parseFrom(byte[] bArr) {
        return (bw5.eq) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.eq)) {
            return false;
        }
        bw5.eq eqVar = (bw5.eq) fVar;
        return n51.f.a(this.f26994d, eqVar.f26994d) && n51.f.a(this.f26995e, eqVar.f26995e) && n51.f.a(this.f26996f, eqVar.f26996f) && n51.f.a(this.f26997g, eqVar.f26997g) && n51.f.a(this.f26998h, eqVar.f26998h) && n51.f.a(this.f26999i, eqVar.f26999i) && n51.f.a(this.f27000m, eqVar.f27000m) && n51.f.a(this.f27001n, eqVar.f27001n) && n51.f.a(this.f27002o, eqVar.f27002o) && n51.f.a(this.f27003p, eqVar.f27003p) && n51.f.a(this.f27004q, eqVar.f27004q) && n51.f.a(java.lang.Long.valueOf(this.f27005r), java.lang.Long.valueOf(eqVar.f27005r)) && n51.f.a(this.f27006s, eqVar.f27006s) && n51.f.a(this.f27007t, eqVar.f27007t) && n51.f.a(java.lang.Integer.valueOf(this.f27008u), java.lang.Integer.valueOf(eqVar.f27008u)) && n51.f.a(java.lang.Boolean.valueOf(this.f27009v), java.lang.Boolean.valueOf(eqVar.f27009v)) && n51.f.a(this.f27010w, eqVar.f27010w) && n51.f.a(this.f27011x, eqVar.f27011x) && n51.f.a(this.f27012y, eqVar.f27012y);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.eq();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f27013z;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26994d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f26995e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f26996f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f26997g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f26998h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f26999i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f27000m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f27001n;
            if (str8 != null && zArr[8]) {
                fVar.j(8, str8);
            }
            java.lang.String str9 = this.f27002o;
            if (str9 != null && zArr[9]) {
                fVar.j(9, str9);
            }
            java.lang.String str10 = this.f27003p;
            if (str10 != null && zArr[10]) {
                fVar.j(10, str10);
            }
            java.lang.String str11 = this.f27004q;
            if (str11 != null && zArr[11]) {
                fVar.j(11, str11);
            }
            if (zArr[12]) {
                fVar.h(12, this.f27005r);
            }
            java.lang.String str12 = this.f27006s;
            if (str12 != null && zArr[13]) {
                fVar.j(13, str12);
            }
            java.lang.String str13 = this.f27007t;
            if (str13 != null && zArr[14]) {
                fVar.j(14, str13);
            }
            if (zArr[15]) {
                fVar.e(15, this.f27008u);
            }
            if (zArr[16]) {
                fVar.a(16, this.f27009v);
            }
            java.lang.String str14 = this.f27010w;
            if (str14 != null && zArr[17]) {
                fVar.j(17, str14);
            }
            bw5.dq dqVar = this.f27011x;
            if (dqVar != null && zArr[18]) {
                fVar.i(18, dqVar.computeSize());
                this.f27011x.writeFields(fVar);
            }
            java.lang.String str15 = this.f27012y;
            if (str15 != null && zArr[19]) {
                fVar.j(19, str15);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str16 = this.f26994d;
            if (str16 != null && zArr[1]) {
                i18 = b36.f.j(1, str16) + 0;
            }
            java.lang.String str17 = this.f26995e;
            if (str17 != null && zArr[2]) {
                i18 += b36.f.j(2, str17);
            }
            java.lang.String str18 = this.f26996f;
            if (str18 != null && zArr[3]) {
                i18 += b36.f.j(3, str18);
            }
            java.lang.String str19 = this.f26997g;
            if (str19 != null && zArr[4]) {
                i18 += b36.f.j(4, str19);
            }
            java.lang.String str20 = this.f26998h;
            if (str20 != null && zArr[5]) {
                i18 += b36.f.j(5, str20);
            }
            java.lang.String str21 = this.f26999i;
            if (str21 != null && zArr[6]) {
                i18 += b36.f.j(6, str21);
            }
            java.lang.String str22 = this.f27000m;
            if (str22 != null && zArr[7]) {
                i18 += b36.f.j(7, str22);
            }
            java.lang.String str23 = this.f27001n;
            if (str23 != null && zArr[8]) {
                i18 += b36.f.j(8, str23);
            }
            java.lang.String str24 = this.f27002o;
            if (str24 != null && zArr[9]) {
                i18 += b36.f.j(9, str24);
            }
            java.lang.String str25 = this.f27003p;
            if (str25 != null && zArr[10]) {
                i18 += b36.f.j(10, str25);
            }
            java.lang.String str26 = this.f27004q;
            if (str26 != null && zArr[11]) {
                i18 += b36.f.j(11, str26);
            }
            if (zArr[12]) {
                i18 += b36.f.h(12, this.f27005r);
            }
            java.lang.String str27 = this.f27006s;
            if (str27 != null && zArr[13]) {
                i18 += b36.f.j(13, str27);
            }
            java.lang.String str28 = this.f27007t;
            if (str28 != null && zArr[14]) {
                i18 += b36.f.j(14, str28);
            }
            if (zArr[15]) {
                i18 += b36.f.e(15, this.f27008u);
            }
            if (zArr[16]) {
                i18 += b36.f.a(16, this.f27009v);
            }
            java.lang.String str29 = this.f27010w;
            if (str29 != null && zArr[17]) {
                i18 += b36.f.j(17, str29);
            }
            bw5.dq dqVar2 = this.f27011x;
            if (dqVar2 != null && zArr[18]) {
                i18 += b36.f.i(18, dqVar2.computeSize());
            }
            java.lang.String str30 = this.f27012y;
            return (str30 == null || !zArr[19]) ? i18 : i18 + b36.f.j(19, str30);
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
                this.f26994d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26995e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26996f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26997g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26998h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26999i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27000m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f27001n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f27002o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f27003p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f27004q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f27005r = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f27006s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f27007t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f27008u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f27009v = aVar2.c(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f27010w = aVar2.k(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.dq dqVar3 = new bw5.dq();
                    if (bArr != null && bArr.length > 0) {
                        dqVar3.parseFrom(bArr);
                    }
                    this.f27011x = dqVar3;
                }
                zArr[18] = true;
                return 0;
            case 19:
                this.f27012y = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            default:
                return -1;
        }
    }
}
