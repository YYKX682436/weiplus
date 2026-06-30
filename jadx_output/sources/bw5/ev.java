package bw5;

/* loaded from: classes2.dex */
public class ev extends com.tencent.mm.protobuf.f {
    public bw5.l3 A;
    public com.tencent.mm.protobuf.g B;

    /* renamed from: d, reason: collision with root package name */
    public int f27064d;

    /* renamed from: e, reason: collision with root package name */
    public int f27065e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f27066f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f27068h;

    /* renamed from: i, reason: collision with root package name */
    public int f27069i;

    /* renamed from: m, reason: collision with root package name */
    public int f27070m;

    /* renamed from: n, reason: collision with root package name */
    public int f27071n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f27072o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f27073p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f27074q;

    /* renamed from: r, reason: collision with root package name */
    public int f27075r;

    /* renamed from: s, reason: collision with root package name */
    public int f27076s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f27077t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f27078u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f27079v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f27080w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f27081x;

    /* renamed from: y, reason: collision with root package name */
    public int f27082y;

    /* renamed from: z, reason: collision with root package name */
    public int f27083z;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f27067g = new java.util.LinkedList();
    public final boolean[] C = new boolean[24];

    static {
        new bw5.ev();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ev parseFrom(byte[] bArr) {
        return (bw5.ev) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ev)) {
            return false;
        }
        bw5.ev evVar = (bw5.ev) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f27064d), java.lang.Integer.valueOf(evVar.f27064d)) && n51.f.a(java.lang.Integer.valueOf(this.f27065e), java.lang.Integer.valueOf(evVar.f27065e)) && n51.f.a(this.f27066f, evVar.f27066f) && n51.f.a(this.f27067g, evVar.f27067g) && n51.f.a(this.f27068h, evVar.f27068h) && n51.f.a(java.lang.Integer.valueOf(this.f27069i), java.lang.Integer.valueOf(evVar.f27069i)) && n51.f.a(java.lang.Integer.valueOf(this.f27070m), java.lang.Integer.valueOf(evVar.f27070m)) && n51.f.a(java.lang.Integer.valueOf(this.f27071n), java.lang.Integer.valueOf(evVar.f27071n)) && n51.f.a(java.lang.Boolean.valueOf(this.f27072o), java.lang.Boolean.valueOf(evVar.f27072o)) && n51.f.a(this.f27073p, evVar.f27073p) && n51.f.a(this.f27074q, evVar.f27074q) && n51.f.a(java.lang.Integer.valueOf(this.f27075r), java.lang.Integer.valueOf(evVar.f27075r)) && n51.f.a(java.lang.Integer.valueOf(this.f27076s), java.lang.Integer.valueOf(evVar.f27076s)) && n51.f.a(this.f27077t, evVar.f27077t) && n51.f.a(this.f27078u, evVar.f27078u) && n51.f.a(this.f27079v, evVar.f27079v) && n51.f.a(this.f27080w, evVar.f27080w) && n51.f.a(this.f27081x, evVar.f27081x) && n51.f.a(java.lang.Integer.valueOf(this.f27082y), java.lang.Integer.valueOf(evVar.f27082y)) && n51.f.a(java.lang.Integer.valueOf(this.f27083z), java.lang.Integer.valueOf(evVar.f27083z)) && n51.f.a(this.A, evVar.A) && n51.f.a(this.B, evVar.B);
    }

    public java.lang.String getTipsUuid() {
        return this.C[19] ? this.f27081x : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ev();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.C;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f27064d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27065e);
            }
            com.tencent.mm.protobuf.g gVar = this.f27066f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            fVar.g(4, 8, this.f27067g);
            java.lang.String str = this.f27068h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            if (zArr[6]) {
                fVar.e(6, this.f27069i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f27070m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f27071n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f27072o);
            }
            java.lang.String str2 = this.f27073p;
            if (str2 != null && zArr[10]) {
                fVar.j(10, str2);
            }
            java.lang.String str3 = this.f27074q;
            if (str3 != null && zArr[11]) {
                fVar.j(11, str3);
            }
            if (zArr[12]) {
                fVar.e(12, this.f27075r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f27076s);
            }
            java.lang.String str4 = this.f27077t;
            if (str4 != null && zArr[14]) {
                fVar.j(14, str4);
            }
            java.lang.String str5 = this.f27078u;
            if (str5 != null && zArr[15]) {
                fVar.j(15, str5);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f27079v;
            if (gVar2 != null && zArr[16]) {
                fVar.b(16, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f27080w;
            if (gVar3 != null && zArr[18]) {
                fVar.b(18, gVar3);
            }
            java.lang.String str6 = this.f27081x;
            if (str6 != null && zArr[19]) {
                fVar.j(19, str6);
            }
            if (zArr[20]) {
                fVar.e(20, this.f27082y);
            }
            if (zArr[21]) {
                fVar.e(21, this.f27083z);
            }
            bw5.l3 l3Var = this.A;
            if (l3Var != null && zArr[22]) {
                fVar.i(22, l3Var.computeSize());
                this.A.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar4 = this.B;
            if (gVar4 != null && zArr[23]) {
                fVar.b(23, gVar4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f27064d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f27065e);
            }
            com.tencent.mm.protobuf.g gVar5 = this.f27066f;
            if (gVar5 != null && zArr[3]) {
                e17 += b36.f.b(3, gVar5);
            }
            int g17 = e17 + b36.f.g(4, 8, this.f27067g);
            java.lang.String str7 = this.f27068h;
            if (str7 != null && zArr[5]) {
                g17 += b36.f.j(5, str7);
            }
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f27069i);
            }
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f27070m);
            }
            if (zArr[8]) {
                g17 += b36.f.e(8, this.f27071n);
            }
            if (zArr[9]) {
                g17 += b36.f.a(9, this.f27072o);
            }
            java.lang.String str8 = this.f27073p;
            if (str8 != null && zArr[10]) {
                g17 += b36.f.j(10, str8);
            }
            java.lang.String str9 = this.f27074q;
            if (str9 != null && zArr[11]) {
                g17 += b36.f.j(11, str9);
            }
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f27075r);
            }
            if (zArr[13]) {
                g17 += b36.f.e(13, this.f27076s);
            }
            java.lang.String str10 = this.f27077t;
            if (str10 != null && zArr[14]) {
                g17 += b36.f.j(14, str10);
            }
            java.lang.String str11 = this.f27078u;
            if (str11 != null && zArr[15]) {
                g17 += b36.f.j(15, str11);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f27079v;
            if (gVar6 != null && zArr[16]) {
                g17 += b36.f.b(16, gVar6);
            }
            com.tencent.mm.protobuf.g gVar7 = this.f27080w;
            if (gVar7 != null && zArr[18]) {
                g17 += b36.f.b(18, gVar7);
            }
            java.lang.String str12 = this.f27081x;
            if (str12 != null && zArr[19]) {
                g17 += b36.f.j(19, str12);
            }
            if (zArr[20]) {
                g17 += b36.f.e(20, this.f27082y);
            }
            if (zArr[21]) {
                g17 += b36.f.e(21, this.f27083z);
            }
            bw5.l3 l3Var2 = this.A;
            if (l3Var2 != null && zArr[22]) {
                g17 += b36.f.i(22, l3Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar8 = this.B;
            return (gVar8 == null || !zArr[23]) ? g17 : g17 + b36.f.b(23, gVar8);
        }
        if (i17 == 2) {
            this.f27067g.clear();
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
                this.f27064d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27065e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27066f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.vy vyVar = new bw5.vy();
                    if (bArr != null && bArr.length > 0) {
                        vyVar.parseFrom(bArr);
                    }
                    this.f27067g.add(vyVar);
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f27068h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27069i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27070m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f27071n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f27072o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f27073p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f27074q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f27075r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f27076s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f27077t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f27078u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f27079v = aVar2.d(intValue);
                zArr[16] = true;
                return 0;
            case 17:
            default:
                return -1;
            case 18:
                this.f27080w = aVar2.d(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f27081x = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f27082y = aVar2.g(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.f27083z = aVar2.g(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.l3 l3Var3 = new bw5.l3();
                    if (bArr2 != null && bArr2.length > 0) {
                        l3Var3.parseFrom(bArr2);
                    }
                    this.A = l3Var3;
                }
                zArr[22] = true;
                return 0;
            case 23:
                this.B = aVar2.d(intValue);
                zArr[23] = true;
                return 0;
        }
    }
}
