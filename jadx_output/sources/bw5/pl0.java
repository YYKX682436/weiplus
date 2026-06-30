package bw5;

/* loaded from: classes11.dex */
public class pl0 extends com.tencent.mm.protobuf.f {

    /* renamed from: x, reason: collision with root package name */
    public static final bw5.pl0 f31726x = new bw5.pl0();

    /* renamed from: d, reason: collision with root package name */
    public int f31727d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f31728e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f31729f;

    /* renamed from: g, reason: collision with root package name */
    public long f31730g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f31731h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f31732i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f31733m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f31734n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f31735o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f31736p;

    /* renamed from: q, reason: collision with root package name */
    public long f31737q;

    /* renamed from: r, reason: collision with root package name */
    public int f31738r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f31739s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f31740t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.ql0 f31741u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f31742v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f31743w = new boolean[17];

    public java.lang.String b() {
        return this.f31743w[2] ? this.f31728e : "";
    }

    public java.lang.String c() {
        return this.f31743w[5] ? this.f31731h : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pl0)) {
            return false;
        }
        bw5.pl0 pl0Var = (bw5.pl0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f31727d), java.lang.Integer.valueOf(pl0Var.f31727d)) && n51.f.a(this.f31728e, pl0Var.f31728e) && n51.f.a(this.f31729f, pl0Var.f31729f) && n51.f.a(java.lang.Long.valueOf(this.f31730g), java.lang.Long.valueOf(pl0Var.f31730g)) && n51.f.a(this.f31731h, pl0Var.f31731h) && n51.f.a(this.f31732i, pl0Var.f31732i) && n51.f.a(this.f31733m, pl0Var.f31733m) && n51.f.a(this.f31734n, pl0Var.f31734n) && n51.f.a(java.lang.Boolean.valueOf(this.f31735o), java.lang.Boolean.valueOf(pl0Var.f31735o)) && n51.f.a(java.lang.Boolean.valueOf(this.f31736p), java.lang.Boolean.valueOf(pl0Var.f31736p)) && n51.f.a(java.lang.Long.valueOf(this.f31737q), java.lang.Long.valueOf(pl0Var.f31737q)) && n51.f.a(java.lang.Integer.valueOf(this.f31738r), java.lang.Integer.valueOf(pl0Var.f31738r)) && n51.f.a(this.f31739s, pl0Var.f31739s) && n51.f.a(this.f31740t, pl0Var.f31740t) && n51.f.a(this.f31741u, pl0Var.f31741u) && n51.f.a(java.lang.Boolean.valueOf(this.f31742v), java.lang.Boolean.valueOf(pl0Var.f31742v));
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.pl0 parseFrom(byte[] bArr) {
        return (bw5.pl0) super.parseFrom(bArr);
    }

    public java.lang.String getStatusId() {
        return this.f31743w[3] ? this.f31729f : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.pl0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31743w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f31727d);
            }
            java.lang.String str = this.f31728e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f31729f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.h(4, this.f31730g);
            }
            java.lang.String str3 = this.f31731h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f31732i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f31733m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f31734n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            if (zArr[9]) {
                fVar.a(9, this.f31735o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f31736p);
            }
            if (zArr[11]) {
                fVar.h(11, this.f31737q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f31738r);
            }
            java.lang.String str7 = this.f31739s;
            if (str7 != null && zArr[13]) {
                fVar.j(13, str7);
            }
            java.lang.String str8 = this.f31740t;
            if (str8 != null && zArr[14]) {
                fVar.j(14, str8);
            }
            bw5.ql0 ql0Var = this.f31741u;
            if (ql0Var != null && zArr[15]) {
                fVar.i(15, ql0Var.computeSize());
                this.f31741u.writeFields(fVar);
            }
            if (zArr[16]) {
                fVar.a(16, this.f31742v);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f31727d) + 0 : 0;
            java.lang.String str9 = this.f31728e;
            if (str9 != null && zArr[2]) {
                e17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f31729f;
            if (str10 != null && zArr[3]) {
                e17 += b36.f.j(3, str10);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f31730g);
            }
            java.lang.String str11 = this.f31731h;
            if (str11 != null && zArr[5]) {
                e17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f31732i;
            if (str12 != null && zArr[6]) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f31733m;
            if (str13 != null && zArr[7]) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f31734n;
            if (str14 != null && zArr[8]) {
                e17 += b36.f.j(8, str14);
            }
            if (zArr[9]) {
                e17 += b36.f.a(9, this.f31735o);
            }
            if (zArr[10]) {
                e17 += b36.f.a(10, this.f31736p);
            }
            if (zArr[11]) {
                e17 += b36.f.h(11, this.f31737q);
            }
            if (zArr[12]) {
                e17 += b36.f.e(12, this.f31738r);
            }
            java.lang.String str15 = this.f31739s;
            if (str15 != null && zArr[13]) {
                e17 += b36.f.j(13, str15);
            }
            java.lang.String str16 = this.f31740t;
            if (str16 != null && zArr[14]) {
                e17 += b36.f.j(14, str16);
            }
            bw5.ql0 ql0Var2 = this.f31741u;
            if (ql0Var2 != null && zArr[15]) {
                e17 += b36.f.i(15, ql0Var2.computeSize());
            }
            return zArr[16] ? e17 + b36.f.a(16, this.f31742v) : e17;
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
                this.f31727d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f31728e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f31729f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f31730g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f31731h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f31732i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f31733m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f31734n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f31735o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f31736p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f31737q = aVar2.i(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f31738r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f31739s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f31740t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.ql0 ql0Var3 = new bw5.ql0();
                    if (bArr != null && bArr.length > 0) {
                        ql0Var3.parseFrom(bArr);
                    }
                    this.f31741u = ql0Var3;
                }
                zArr[15] = true;
                return 0;
            case 16:
                this.f31742v = aVar2.c(intValue);
                zArr[16] = true;
                return 0;
            default:
                return -1;
        }
    }
}
