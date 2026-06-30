package bw5;

/* loaded from: classes2.dex */
public class rn extends com.tencent.mm.protobuf.f {
    public int A;
    public java.lang.String C;
    public java.lang.String D;
    public int E;

    /* renamed from: d, reason: collision with root package name */
    public int f32587d;

    /* renamed from: e, reason: collision with root package name */
    public int f32588e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f32589f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32590g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f32591h;

    /* renamed from: i, reason: collision with root package name */
    public int f32592i;

    /* renamed from: m, reason: collision with root package name */
    public int f32593m;

    /* renamed from: n, reason: collision with root package name */
    public int f32594n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f32595o;

    /* renamed from: p, reason: collision with root package name */
    public int f32596p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.pn f32597q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f32599s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.mn f32600t;

    /* renamed from: u, reason: collision with root package name */
    public int f32601u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f32602v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.qn f32603w;

    /* renamed from: x, reason: collision with root package name */
    public int f32604x;

    /* renamed from: y, reason: collision with root package name */
    public bw5.on f32605y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f32606z;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f32598r = new java.util.LinkedList();
    public final java.util.LinkedList B = new java.util.LinkedList();
    public final boolean[] F = new boolean[28];

    static {
        new bw5.rn();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rn parseFrom(byte[] bArr) {
        return (bw5.rn) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rn)) {
            return false;
        }
        bw5.rn rnVar = (bw5.rn) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f32587d), java.lang.Integer.valueOf(rnVar.f32587d)) && n51.f.a(java.lang.Integer.valueOf(this.f32588e), java.lang.Integer.valueOf(rnVar.f32588e)) && n51.f.a(this.f32589f, rnVar.f32589f) && n51.f.a(this.f32590g, rnVar.f32590g) && n51.f.a(this.f32591h, rnVar.f32591h) && n51.f.a(java.lang.Integer.valueOf(this.f32592i), java.lang.Integer.valueOf(rnVar.f32592i)) && n51.f.a(java.lang.Integer.valueOf(this.f32593m), java.lang.Integer.valueOf(rnVar.f32593m)) && n51.f.a(java.lang.Integer.valueOf(this.f32594n), java.lang.Integer.valueOf(rnVar.f32594n)) && n51.f.a(this.f32595o, rnVar.f32595o) && n51.f.a(java.lang.Integer.valueOf(this.f32596p), java.lang.Integer.valueOf(rnVar.f32596p)) && n51.f.a(this.f32597q, rnVar.f32597q) && n51.f.a(this.f32598r, rnVar.f32598r) && n51.f.a(this.f32599s, rnVar.f32599s) && n51.f.a(this.f32600t, rnVar.f32600t) && n51.f.a(java.lang.Integer.valueOf(this.f32601u), java.lang.Integer.valueOf(rnVar.f32601u)) && n51.f.a(java.lang.Boolean.valueOf(this.f32602v), java.lang.Boolean.valueOf(rnVar.f32602v)) && n51.f.a(this.f32603w, rnVar.f32603w) && n51.f.a(java.lang.Integer.valueOf(this.f32604x), java.lang.Integer.valueOf(rnVar.f32604x)) && n51.f.a(this.f32605y, rnVar.f32605y) && n51.f.a(java.lang.Boolean.valueOf(this.f32606z), java.lang.Boolean.valueOf(rnVar.f32606z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(rnVar.A)) && n51.f.a(this.B, rnVar.B) && n51.f.a(this.C, rnVar.C) && n51.f.a(this.D, rnVar.D) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(rnVar.E));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.rn();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.F;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f32587d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f32588e);
            }
            java.lang.String str = this.f32589f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f32590g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f32591h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.e(6, this.f32592i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f32593m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f32594n);
            }
            java.lang.String str4 = this.f32595o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            if (zArr[10]) {
                fVar.e(10, this.f32596p);
            }
            bw5.pn pnVar = this.f32597q;
            if (pnVar != null && zArr[11]) {
                fVar.i(11, pnVar.computeSize());
                this.f32597q.writeFields(fVar);
            }
            fVar.g(12, 8, this.f32598r);
            java.lang.String str5 = this.f32599s;
            if (str5 != null && zArr[13]) {
                fVar.j(13, str5);
            }
            bw5.mn mnVar = this.f32600t;
            if (mnVar != null && zArr[14]) {
                fVar.i(14, mnVar.computeSize());
                this.f32600t.writeFields(fVar);
            }
            if (zArr[15]) {
                fVar.e(15, this.f32601u);
            }
            if (zArr[16]) {
                fVar.a(16, this.f32602v);
            }
            bw5.qn qnVar = this.f32603w;
            if (qnVar != null && zArr[17]) {
                fVar.i(17, qnVar.computeSize());
                this.f32603w.writeFields(fVar);
            }
            if (zArr[19]) {
                fVar.e(19, this.f32604x);
            }
            bw5.on onVar = this.f32605y;
            if (onVar != null && zArr[20]) {
                fVar.i(20, onVar.computeSize());
                this.f32605y.writeFields(fVar);
            }
            if (zArr[23]) {
                fVar.a(23, this.f32606z);
            }
            if (zArr[21]) {
                fVar.e(21, this.A);
            }
            fVar.g(22, 1, this.B);
            java.lang.String str6 = this.C;
            if (str6 != null && zArr[24]) {
                fVar.j(24, str6);
            }
            java.lang.String str7 = this.D;
            if (str7 != null && zArr[26]) {
                fVar.j(26, str7);
            }
            if (zArr[27]) {
                fVar.e(27, this.E);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f32587d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f32588e);
            }
            java.lang.String str8 = this.f32589f;
            if (str8 != null && zArr[3]) {
                e17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f32590g;
            if (str9 != null && zArr[4]) {
                e17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f32591h;
            if (str10 != null && zArr[5]) {
                e17 += b36.f.j(5, str10);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f32592i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f32593m);
            }
            if (zArr[8]) {
                e17 += b36.f.e(8, this.f32594n);
            }
            java.lang.String str11 = this.f32595o;
            if (str11 != null && zArr[9]) {
                e17 += b36.f.j(9, str11);
            }
            if (zArr[10]) {
                e17 += b36.f.e(10, this.f32596p);
            }
            bw5.pn pnVar2 = this.f32597q;
            if (pnVar2 != null && zArr[11]) {
                e17 += b36.f.i(11, pnVar2.computeSize());
            }
            int g17 = e17 + b36.f.g(12, 8, this.f32598r);
            java.lang.String str12 = this.f32599s;
            if (str12 != null && zArr[13]) {
                g17 += b36.f.j(13, str12);
            }
            bw5.mn mnVar2 = this.f32600t;
            if (mnVar2 != null && zArr[14]) {
                g17 += b36.f.i(14, mnVar2.computeSize());
            }
            if (zArr[15]) {
                g17 += b36.f.e(15, this.f32601u);
            }
            if (zArr[16]) {
                g17 += b36.f.a(16, this.f32602v);
            }
            bw5.qn qnVar2 = this.f32603w;
            if (qnVar2 != null && zArr[17]) {
                g17 += b36.f.i(17, qnVar2.computeSize());
            }
            if (zArr[19]) {
                g17 += b36.f.e(19, this.f32604x);
            }
            bw5.on onVar2 = this.f32605y;
            if (onVar2 != null && zArr[20]) {
                g17 += b36.f.i(20, onVar2.computeSize());
            }
            if (zArr[23]) {
                g17 += b36.f.a(23, this.f32606z);
            }
            if (zArr[21]) {
                g17 += b36.f.e(21, this.A);
            }
            int g18 = g17 + b36.f.g(22, 1, this.B);
            java.lang.String str13 = this.C;
            if (str13 != null && zArr[24]) {
                g18 += b36.f.j(24, str13);
            }
            java.lang.String str14 = this.D;
            if (str14 != null && zArr[26]) {
                g18 += b36.f.j(26, str14);
            }
            return zArr[27] ? g18 + b36.f.e(27, this.E) : g18;
        }
        if (i17 == 2) {
            this.f32598r.clear();
            this.B.clear();
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
                this.f32587d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f32588e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f32589f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f32590g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32591h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f32592i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f32593m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f32594n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f32595o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f32596p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.pn pnVar3 = new bw5.pn();
                    if (bArr != null && bArr.length > 0) {
                        pnVar3.parseFrom(bArr);
                    }
                    this.f32597q = pnVar3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.nn nnVar = new bw5.nn();
                    if (bArr2 != null && bArr2.length > 0) {
                        nnVar.parseFrom(bArr2);
                    }
                    this.f32598r.add(nnVar);
                }
                zArr[12] = true;
                return 0;
            case 13:
                this.f32599s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.mn mnVar3 = new bw5.mn();
                    if (bArr3 != null && bArr3.length > 0) {
                        mnVar3.parseFrom(bArr3);
                    }
                    this.f32600t = mnVar3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                this.f32601u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f32602v = aVar2.c(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.qn qnVar3 = new bw5.qn();
                    if (bArr4 != null && bArr4.length > 0) {
                        qnVar3.parseFrom(bArr4);
                    }
                    this.f32603w = qnVar3;
                }
                zArr[17] = true;
                return 0;
            case 18:
            case 25:
            default:
                return -1;
            case 19:
                this.f32604x = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.on onVar3 = new bw5.on();
                    if (bArr5 != null && bArr5.length > 0) {
                        onVar3.parseFrom(bArr5);
                    }
                    this.f32605y = onVar3;
                }
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.g(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B.add(aVar2.k(intValue));
                zArr[22] = true;
                return 0;
            case 23:
                this.f32606z = aVar2.c(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.C = aVar2.k(intValue);
                zArr[24] = true;
                return 0;
            case 26:
                this.D = aVar2.k(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                this.E = aVar2.g(intValue);
                zArr[27] = true;
                return 0;
        }
    }
}
