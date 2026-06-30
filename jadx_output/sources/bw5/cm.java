package bw5;

/* loaded from: classes2.dex */
public class cm extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26144d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.am f26145e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.am f26146f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.am f26147g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.am f26148h;

    /* renamed from: i, reason: collision with root package name */
    public float f26149i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f26150m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f26151n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f26152o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f26153p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f26154q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f26155r;

    /* renamed from: s, reason: collision with root package name */
    public int f26156s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.am f26157t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.am f26158u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.am f26159v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.am f26160w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.am f26161x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f26162y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean[] f26163z = new boolean[20];

    static {
        new bw5.cm();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cm parseFrom(byte[] bArr) {
        return (bw5.cm) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cm)) {
            return false;
        }
        bw5.cm cmVar = (bw5.cm) fVar;
        return n51.f.a(this.f26144d, cmVar.f26144d) && n51.f.a(this.f26145e, cmVar.f26145e) && n51.f.a(this.f26146f, cmVar.f26146f) && n51.f.a(this.f26147g, cmVar.f26147g) && n51.f.a(this.f26148h, cmVar.f26148h) && n51.f.a(java.lang.Float.valueOf(this.f26149i), java.lang.Float.valueOf(cmVar.f26149i)) && n51.f.a(this.f26150m, cmVar.f26150m) && n51.f.a(java.lang.Boolean.valueOf(this.f26151n), java.lang.Boolean.valueOf(cmVar.f26151n)) && n51.f.a(java.lang.Boolean.valueOf(this.f26152o), java.lang.Boolean.valueOf(cmVar.f26152o)) && n51.f.a(this.f26153p, cmVar.f26153p) && n51.f.a(this.f26154q, cmVar.f26154q) && n51.f.a(this.f26155r, cmVar.f26155r) && n51.f.a(java.lang.Integer.valueOf(this.f26156s), java.lang.Integer.valueOf(cmVar.f26156s)) && n51.f.a(this.f26157t, cmVar.f26157t) && n51.f.a(this.f26158u, cmVar.f26158u) && n51.f.a(this.f26159v, cmVar.f26159v) && n51.f.a(this.f26160w, cmVar.f26160w) && n51.f.a(this.f26161x, cmVar.f26161x) && n51.f.a(this.f26162y, cmVar.f26162y);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.cm();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f26163z;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26144d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.am amVar = this.f26145e;
            if (amVar != null && zArr[2]) {
                fVar.i(2, amVar.computeSize());
                this.f26145e.writeFields(fVar);
            }
            bw5.am amVar2 = this.f26146f;
            if (amVar2 != null && zArr[3]) {
                fVar.i(3, amVar2.computeSize());
                this.f26146f.writeFields(fVar);
            }
            bw5.am amVar3 = this.f26147g;
            if (amVar3 != null && zArr[4]) {
                fVar.i(4, amVar3.computeSize());
                this.f26147g.writeFields(fVar);
            }
            bw5.am amVar4 = this.f26148h;
            if (amVar4 != null && zArr[5]) {
                fVar.i(5, amVar4.computeSize());
                this.f26148h.writeFields(fVar);
            }
            if (zArr[6]) {
                fVar.d(6, this.f26149i);
            }
            java.lang.String str2 = this.f26150m;
            if (str2 != null && zArr[7]) {
                fVar.j(7, str2);
            }
            if (zArr[8]) {
                fVar.a(8, this.f26151n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f26152o);
            }
            java.lang.String str3 = this.f26153p;
            if (str3 != null && zArr[10]) {
                fVar.j(10, str3);
            }
            java.lang.String str4 = this.f26154q;
            if (str4 != null && zArr[11]) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f26155r;
            if (str5 != null && zArr[12]) {
                fVar.j(12, str5);
            }
            if (zArr[13]) {
                fVar.e(13, this.f26156s);
            }
            bw5.am amVar5 = this.f26157t;
            if (amVar5 != null && zArr[14]) {
                fVar.i(14, amVar5.computeSize());
                this.f26157t.writeFields(fVar);
            }
            bw5.am amVar6 = this.f26158u;
            if (amVar6 != null && zArr[15]) {
                fVar.i(15, amVar6.computeSize());
                this.f26158u.writeFields(fVar);
            }
            bw5.am amVar7 = this.f26159v;
            if (amVar7 != null && zArr[16]) {
                fVar.i(16, amVar7.computeSize());
                this.f26159v.writeFields(fVar);
            }
            bw5.am amVar8 = this.f26160w;
            if (amVar8 != null && zArr[17]) {
                fVar.i(17, amVar8.computeSize());
                this.f26160w.writeFields(fVar);
            }
            bw5.am amVar9 = this.f26161x;
            if (amVar9 != null && zArr[18]) {
                fVar.i(18, amVar9.computeSize());
                this.f26161x.writeFields(fVar);
            }
            java.lang.String str6 = this.f26162y;
            if (str6 != null && zArr[19]) {
                fVar.j(19, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f26144d;
            if (str7 != null && zArr[1]) {
                i18 = b36.f.j(1, str7) + 0;
            }
            bw5.am amVar10 = this.f26145e;
            if (amVar10 != null && zArr[2]) {
                i18 += b36.f.i(2, amVar10.computeSize());
            }
            bw5.am amVar11 = this.f26146f;
            if (amVar11 != null && zArr[3]) {
                i18 += b36.f.i(3, amVar11.computeSize());
            }
            bw5.am amVar12 = this.f26147g;
            if (amVar12 != null && zArr[4]) {
                i18 += b36.f.i(4, amVar12.computeSize());
            }
            bw5.am amVar13 = this.f26148h;
            if (amVar13 != null && zArr[5]) {
                i18 += b36.f.i(5, amVar13.computeSize());
            }
            if (zArr[6]) {
                i18 += b36.f.d(6, this.f26149i);
            }
            java.lang.String str8 = this.f26150m;
            if (str8 != null && zArr[7]) {
                i18 += b36.f.j(7, str8);
            }
            if (zArr[8]) {
                i18 += b36.f.a(8, this.f26151n);
            }
            if (zArr[9]) {
                i18 += b36.f.a(9, this.f26152o);
            }
            java.lang.String str9 = this.f26153p;
            if (str9 != null && zArr[10]) {
                i18 += b36.f.j(10, str9);
            }
            java.lang.String str10 = this.f26154q;
            if (str10 != null && zArr[11]) {
                i18 += b36.f.j(11, str10);
            }
            java.lang.String str11 = this.f26155r;
            if (str11 != null && zArr[12]) {
                i18 += b36.f.j(12, str11);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f26156s);
            }
            bw5.am amVar14 = this.f26157t;
            if (amVar14 != null && zArr[14]) {
                i18 += b36.f.i(14, amVar14.computeSize());
            }
            bw5.am amVar15 = this.f26158u;
            if (amVar15 != null && zArr[15]) {
                i18 += b36.f.i(15, amVar15.computeSize());
            }
            bw5.am amVar16 = this.f26159v;
            if (amVar16 != null && zArr[16]) {
                i18 += b36.f.i(16, amVar16.computeSize());
            }
            bw5.am amVar17 = this.f26160w;
            if (amVar17 != null && zArr[17]) {
                i18 += b36.f.i(17, amVar17.computeSize());
            }
            bw5.am amVar18 = this.f26161x;
            if (amVar18 != null && zArr[18]) {
                i18 += b36.f.i(18, amVar18.computeSize());
            }
            java.lang.String str12 = this.f26162y;
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
                this.f26144d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.am amVar19 = new bw5.am();
                    if (bArr != null && bArr.length > 0) {
                        amVar19.parseFrom(bArr);
                    }
                    this.f26145e = amVar19;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.am amVar20 = new bw5.am();
                    if (bArr2 != null && bArr2.length > 0) {
                        amVar20.parseFrom(bArr2);
                    }
                    this.f26146f = amVar20;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.am amVar21 = new bw5.am();
                    if (bArr3 != null && bArr3.length > 0) {
                        amVar21.parseFrom(bArr3);
                    }
                    this.f26147g = amVar21;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.am amVar22 = new bw5.am();
                    if (bArr4 != null && bArr4.length > 0) {
                        amVar22.parseFrom(bArr4);
                    }
                    this.f26148h = amVar22;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f26149i = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26150m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f26151n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f26152o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f26153p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f26154q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f26155r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f26156s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.am amVar23 = new bw5.am();
                    if (bArr5 != null && bArr5.length > 0) {
                        amVar23.parseFrom(bArr5);
                    }
                    this.f26157t = amVar23;
                }
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.am amVar24 = new bw5.am();
                    if (bArr6 != null && bArr6.length > 0) {
                        amVar24.parseFrom(bArr6);
                    }
                    this.f26158u = amVar24;
                }
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.am amVar25 = new bw5.am();
                    if (bArr7 != null && bArr7.length > 0) {
                        amVar25.parseFrom(bArr7);
                    }
                    this.f26159v = amVar25;
                }
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.am amVar26 = new bw5.am();
                    if (bArr8 != null && bArr8.length > 0) {
                        amVar26.parseFrom(bArr8);
                    }
                    this.f26160w = amVar26;
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.am amVar27 = new bw5.am();
                    if (bArr9 != null && bArr9.length > 0) {
                        amVar27.parseFrom(bArr9);
                    }
                    this.f26161x = amVar27;
                }
                zArr[18] = true;
                return 0;
            case 19:
                this.f26162y = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            default:
                return -1;
        }
    }
}
