package bw5;

/* loaded from: classes2.dex */
public class t70 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33288d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.xa0 f33289e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33290f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33291g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.v70 f33292h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.v70 f33293i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.gb0 f33294m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.lb0 f33295n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.q50 f33296o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f33297p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.u50 f33298q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.u70 f33299r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.fc0 f33300s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f33301t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.s70 f33302u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f33303v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f33304w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f33305x = new boolean[20];

    static {
        new bw5.t70();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.t70 parseFrom(byte[] bArr) {
        return (bw5.t70) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.t70)) {
            return false;
        }
        bw5.t70 t70Var = (bw5.t70) fVar;
        return n51.f.a(this.f33288d, t70Var.f33288d) && n51.f.a(this.f33289e, t70Var.f33289e) && n51.f.a(this.f33290f, t70Var.f33290f) && n51.f.a(this.f33291g, t70Var.f33291g) && n51.f.a(this.f33292h, t70Var.f33292h) && n51.f.a(this.f33293i, t70Var.f33293i) && n51.f.a(this.f33294m, t70Var.f33294m) && n51.f.a(this.f33295n, t70Var.f33295n) && n51.f.a(this.f33296o, t70Var.f33296o) && n51.f.a(this.f33297p, t70Var.f33297p) && n51.f.a(this.f33298q, t70Var.f33298q) && n51.f.a(this.f33299r, t70Var.f33299r) && n51.f.a(this.f33300s, t70Var.f33300s) && n51.f.a(java.lang.Boolean.valueOf(this.f33301t), java.lang.Boolean.valueOf(t70Var.f33301t)) && n51.f.a(this.f33302u, t70Var.f33302u) && n51.f.a(this.f33303v, t70Var.f33303v) && n51.f.a(this.f33304w, t70Var.f33304w);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.t70();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f33305x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33288d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.xa0 xa0Var = this.f33289e;
            if (xa0Var != null && zArr[2]) {
                fVar.i(2, xa0Var.computeSize());
                this.f33289e.writeFields(fVar);
            }
            java.lang.String str2 = this.f33290f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f33291g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            bw5.v70 v70Var = this.f33292h;
            if (v70Var != null && zArr[6]) {
                fVar.i(6, v70Var.computeSize());
                this.f33292h.writeFields(fVar);
            }
            bw5.v70 v70Var2 = this.f33293i;
            if (v70Var2 != null && zArr[7]) {
                fVar.i(7, v70Var2.computeSize());
                this.f33293i.writeFields(fVar);
            }
            bw5.gb0 gb0Var = this.f33294m;
            if (gb0Var != null && zArr[8]) {
                fVar.i(8, gb0Var.computeSize());
                this.f33294m.writeFields(fVar);
            }
            bw5.lb0 lb0Var = this.f33295n;
            if (lb0Var != null && zArr[9]) {
                fVar.i(9, lb0Var.computeSize());
                this.f33295n.writeFields(fVar);
            }
            bw5.q50 q50Var = this.f33296o;
            if (q50Var != null && zArr[10]) {
                fVar.i(10, q50Var.computeSize());
                this.f33296o.writeFields(fVar);
            }
            java.lang.String str4 = this.f33297p;
            if (str4 != null && zArr[11]) {
                fVar.j(11, str4);
            }
            bw5.u50 u50Var = this.f33298q;
            if (u50Var != null && zArr[12]) {
                fVar.i(12, u50Var.computeSize());
                this.f33298q.writeFields(fVar);
            }
            bw5.u70 u70Var = this.f33299r;
            if (u70Var != null && zArr[14]) {
                fVar.i(14, u70Var.computeSize());
                this.f33299r.writeFields(fVar);
            }
            bw5.fc0 fc0Var = this.f33300s;
            if (fc0Var != null && zArr[15]) {
                fVar.i(15, fc0Var.computeSize());
                this.f33300s.writeFields(fVar);
            }
            if (zArr[16]) {
                fVar.a(16, this.f33301t);
            }
            bw5.s70 s70Var = this.f33302u;
            if (s70Var != null && zArr[17]) {
                fVar.i(17, s70Var.computeSize());
                this.f33302u.writeFields(fVar);
            }
            java.lang.String str5 = this.f33303v;
            if (str5 != null && zArr[18]) {
                fVar.j(18, str5);
            }
            java.lang.String str6 = this.f33304w;
            if (str6 != null && zArr[19]) {
                fVar.j(19, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f33288d;
            if (str7 != null && zArr[1]) {
                i18 = b36.f.j(1, str7) + 0;
            }
            bw5.xa0 xa0Var2 = this.f33289e;
            if (xa0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, xa0Var2.computeSize());
            }
            java.lang.String str8 = this.f33290f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f33291g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            bw5.v70 v70Var3 = this.f33292h;
            if (v70Var3 != null && zArr[6]) {
                i18 += b36.f.i(6, v70Var3.computeSize());
            }
            bw5.v70 v70Var4 = this.f33293i;
            if (v70Var4 != null && zArr[7]) {
                i18 += b36.f.i(7, v70Var4.computeSize());
            }
            bw5.gb0 gb0Var2 = this.f33294m;
            if (gb0Var2 != null && zArr[8]) {
                i18 += b36.f.i(8, gb0Var2.computeSize());
            }
            bw5.lb0 lb0Var2 = this.f33295n;
            if (lb0Var2 != null && zArr[9]) {
                i18 += b36.f.i(9, lb0Var2.computeSize());
            }
            bw5.q50 q50Var2 = this.f33296o;
            if (q50Var2 != null && zArr[10]) {
                i18 += b36.f.i(10, q50Var2.computeSize());
            }
            java.lang.String str10 = this.f33297p;
            if (str10 != null && zArr[11]) {
                i18 += b36.f.j(11, str10);
            }
            bw5.u50 u50Var2 = this.f33298q;
            if (u50Var2 != null && zArr[12]) {
                i18 += b36.f.i(12, u50Var2.computeSize());
            }
            bw5.u70 u70Var2 = this.f33299r;
            if (u70Var2 != null && zArr[14]) {
                i18 += b36.f.i(14, u70Var2.computeSize());
            }
            bw5.fc0 fc0Var2 = this.f33300s;
            if (fc0Var2 != null && zArr[15]) {
                i18 += b36.f.i(15, fc0Var2.computeSize());
            }
            if (zArr[16]) {
                i18 += b36.f.a(16, this.f33301t);
            }
            bw5.s70 s70Var2 = this.f33302u;
            if (s70Var2 != null && zArr[17]) {
                i18 += b36.f.i(17, s70Var2.computeSize());
            }
            java.lang.String str11 = this.f33303v;
            if (str11 != null && zArr[18]) {
                i18 += b36.f.j(18, str11);
            }
            java.lang.String str12 = this.f33304w;
            return (str12 == null || !zArr[19]) ? i18 : i18 + b36.f.j(19, str12);
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
                this.f33288d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.xa0 xa0Var3 = new bw5.xa0();
                    if (bArr != null && bArr.length > 0) {
                        xa0Var3.parseFrom(bArr);
                    }
                    this.f33289e = xa0Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f33290f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33291g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
            case 13:
            default:
                return -1;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.v70 v70Var5 = new bw5.v70();
                    if (bArr2 != null && bArr2.length > 0) {
                        v70Var5.parseFrom(bArr2);
                    }
                    this.f33292h = v70Var5;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.v70 v70Var6 = new bw5.v70();
                    if (bArr3 != null && bArr3.length > 0) {
                        v70Var6.parseFrom(bArr3);
                    }
                    this.f33293i = v70Var6;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.gb0 gb0Var3 = new bw5.gb0();
                    if (bArr4 != null && bArr4.length > 0) {
                        gb0Var3.parseFrom(bArr4);
                    }
                    this.f33294m = gb0Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.lb0 lb0Var3 = new bw5.lb0();
                    if (bArr5 != null && bArr5.length > 0) {
                        lb0Var3.parseFrom(bArr5);
                    }
                    this.f33295n = lb0Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.q50 q50Var3 = new bw5.q50();
                    if (bArr6 != null && bArr6.length > 0) {
                        q50Var3.parseFrom(bArr6);
                    }
                    this.f33296o = q50Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f33297p = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.u50 u50Var3 = new bw5.u50();
                    if (bArr7 != null && bArr7.length > 0) {
                        u50Var3.parseFrom(bArr7);
                    }
                    this.f33298q = u50Var3;
                }
                zArr[12] = true;
                return 0;
            case 14:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.u70 u70Var3 = new bw5.u70();
                    if (bArr8 != null && bArr8.length > 0) {
                        u70Var3.parseFrom(bArr8);
                    }
                    this.f33299r = u70Var3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.fc0 fc0Var3 = new bw5.fc0();
                    if (bArr9 != null && bArr9.length > 0) {
                        fc0Var3.parseFrom(bArr9);
                    }
                    this.f33300s = fc0Var3;
                }
                zArr[15] = true;
                return 0;
            case 16:
                this.f33301t = aVar2.c(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    bw5.s70 s70Var3 = new bw5.s70();
                    if (bArr10 != null && bArr10.length > 0) {
                        s70Var3.parseFrom(bArr10);
                    }
                    this.f33302u = s70Var3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                this.f33303v = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f33304w = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
        }
    }
}
