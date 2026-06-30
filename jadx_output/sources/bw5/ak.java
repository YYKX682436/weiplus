package bw5;

/* loaded from: classes2.dex */
public class ak extends com.tencent.mm.protobuf.f {
    public bw5.py A;
    public int B;
    public bw5.pj C;
    public int D;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25227d;

    /* renamed from: e, reason: collision with root package name */
    public int f25228e;

    /* renamed from: f, reason: collision with root package name */
    public int f25229f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f25231h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f25232i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f25233m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f25235o;

    /* renamed from: r, reason: collision with root package name */
    public bw5.oy f25238r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f25239s;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f25241u;

    /* renamed from: x, reason: collision with root package name */
    public bw5.ek f25244x;

    /* renamed from: y, reason: collision with root package name */
    public int f25245y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.fk f25246z;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f25230g = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f25234n = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f25236p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f25237q = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f25240t = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f25242v = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f25243w = new java.util.LinkedList();
    public final boolean[] E = new boolean[25];

    static {
        new bw5.ak();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ak parseFrom(byte[] bArr) {
        return (bw5.ak) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ak)) {
            return false;
        }
        bw5.ak akVar = (bw5.ak) fVar;
        return n51.f.a(this.f25227d, akVar.f25227d) && n51.f.a(java.lang.Integer.valueOf(this.f25228e), java.lang.Integer.valueOf(akVar.f25228e)) && n51.f.a(java.lang.Integer.valueOf(this.f25229f), java.lang.Integer.valueOf(akVar.f25229f)) && n51.f.a(this.f25230g, akVar.f25230g) && n51.f.a(this.f25231h, akVar.f25231h) && n51.f.a(this.f25232i, akVar.f25232i) && n51.f.a(this.f25233m, akVar.f25233m) && n51.f.a(this.f25234n, akVar.f25234n) && n51.f.a(this.f25235o, akVar.f25235o) && n51.f.a(this.f25236p, akVar.f25236p) && n51.f.a(this.f25237q, akVar.f25237q) && n51.f.a(this.f25238r, akVar.f25238r) && n51.f.a(this.f25239s, akVar.f25239s) && n51.f.a(this.f25240t, akVar.f25240t) && n51.f.a(this.f25241u, akVar.f25241u) && n51.f.a(this.f25242v, akVar.f25242v) && n51.f.a(this.f25243w, akVar.f25243w) && n51.f.a(this.f25244x, akVar.f25244x) && n51.f.a(java.lang.Integer.valueOf(this.f25245y), java.lang.Integer.valueOf(akVar.f25245y)) && n51.f.a(this.f25246z, akVar.f25246z) && n51.f.a(this.A, akVar.A) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(akVar.B)) && n51.f.a(this.C, akVar.C) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(akVar.D));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ak();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25234n;
        java.util.LinkedList linkedList2 = this.f25230g;
        int i18 = 0;
        boolean[] zArr = this.E;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25227d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f25228e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f25229f);
            }
            fVar.g(4, 1, linkedList2);
            java.lang.String str2 = this.f25231h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f25232i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f25233m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            fVar.g(8, 1, linkedList);
            java.lang.String str5 = this.f25235o;
            if (str5 != null && zArr[9]) {
                fVar.j(9, str5);
            }
            fVar.g(10, 8, this.f25236p);
            fVar.g(11, 1, this.f25237q);
            bw5.oy oyVar = this.f25238r;
            if (oyVar != null && zArr[12]) {
                fVar.i(12, oyVar.computeSize());
                this.f25238r.writeFields(fVar);
            }
            java.lang.String str6 = this.f25239s;
            if (str6 != null && zArr[13]) {
                fVar.j(13, str6);
            }
            fVar.g(14, 1, this.f25240t);
            com.tencent.mm.protobuf.g gVar = this.f25241u;
            if (gVar != null && zArr[15]) {
                fVar.b(15, gVar);
            }
            fVar.g(16, 8, this.f25242v);
            fVar.g(17, 8, this.f25243w);
            bw5.ek ekVar = this.f25244x;
            if (ekVar != null && zArr[18]) {
                fVar.i(18, ekVar.computeSize());
                this.f25244x.writeFields(fVar);
            }
            if (zArr[19]) {
                fVar.e(19, this.f25245y);
            }
            bw5.fk fkVar = this.f25246z;
            if (fkVar != null && zArr[20]) {
                fVar.i(20, fkVar.computeSize());
                this.f25246z.writeFields(fVar);
            }
            bw5.py pyVar = this.A;
            if (pyVar != null && zArr[21]) {
                fVar.i(21, pyVar.computeSize());
                this.A.writeFields(fVar);
            }
            if (zArr[22]) {
                fVar.e(22, this.B);
            }
            bw5.pj pjVar = this.C;
            if (pjVar != null && zArr[23]) {
                fVar.i(23, pjVar.computeSize());
                this.C.writeFields(fVar);
            }
            if (zArr[24]) {
                fVar.e(24, this.D);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f25227d;
            if (str7 != null && zArr[1]) {
                i18 = b36.f.j(1, str7) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f25228e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f25229f);
            }
            int g17 = i18 + b36.f.g(4, 1, linkedList2);
            java.lang.String str8 = this.f25231h;
            if (str8 != null && zArr[5]) {
                g17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f25232i;
            if (str9 != null && zArr[6]) {
                g17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f25233m;
            if (str10 != null && zArr[7]) {
                g17 += b36.f.j(7, str10);
            }
            int g18 = g17 + b36.f.g(8, 1, linkedList);
            java.lang.String str11 = this.f25235o;
            if (str11 != null && zArr[9]) {
                g18 += b36.f.j(9, str11);
            }
            int g19 = g18 + b36.f.g(10, 8, this.f25236p) + b36.f.g(11, 1, this.f25237q);
            bw5.oy oyVar2 = this.f25238r;
            if (oyVar2 != null && zArr[12]) {
                g19 += b36.f.i(12, oyVar2.computeSize());
            }
            java.lang.String str12 = this.f25239s;
            if (str12 != null && zArr[13]) {
                g19 += b36.f.j(13, str12);
            }
            int g27 = g19 + b36.f.g(14, 1, this.f25240t);
            com.tencent.mm.protobuf.g gVar2 = this.f25241u;
            if (gVar2 != null && zArr[15]) {
                g27 += b36.f.b(15, gVar2);
            }
            int g28 = g27 + b36.f.g(16, 8, this.f25242v) + b36.f.g(17, 8, this.f25243w);
            bw5.ek ekVar2 = this.f25244x;
            if (ekVar2 != null && zArr[18]) {
                g28 += b36.f.i(18, ekVar2.computeSize());
            }
            if (zArr[19]) {
                g28 += b36.f.e(19, this.f25245y);
            }
            bw5.fk fkVar2 = this.f25246z;
            if (fkVar2 != null && zArr[20]) {
                g28 += b36.f.i(20, fkVar2.computeSize());
            }
            bw5.py pyVar2 = this.A;
            if (pyVar2 != null && zArr[21]) {
                g28 += b36.f.i(21, pyVar2.computeSize());
            }
            if (zArr[22]) {
                g28 += b36.f.e(22, this.B);
            }
            bw5.pj pjVar2 = this.C;
            if (pjVar2 != null && zArr[23]) {
                g28 += b36.f.i(23, pjVar2.computeSize());
            }
            return zArr[24] ? g28 + b36.f.e(24, this.D) : g28;
        }
        if (i17 == 2) {
            linkedList2.clear();
            linkedList.clear();
            this.f25236p.clear();
            this.f25237q.clear();
            this.f25240t.clear();
            this.f25242v.clear();
            this.f25243w.clear();
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
                this.f25227d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f25228e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25229f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                linkedList2.add(aVar2.k(intValue));
                zArr[4] = true;
                return 0;
            case 5:
                this.f25231h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25232i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f25233m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                linkedList.add(aVar2.k(intValue));
                zArr[8] = true;
                return 0;
            case 9:
                this.f25235o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.gk gkVar = new bw5.gk();
                    if (bArr != null && bArr.length > 0) {
                        gkVar.parseFrom(bArr);
                    }
                    this.f25236p.add(gkVar);
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f25237q.add(aVar2.k(intValue));
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.oy oyVar3 = new bw5.oy();
                    if (bArr2 != null && bArr2.length > 0) {
                        oyVar3.parseFrom(bArr2);
                    }
                    this.f25238r = oyVar3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                this.f25239s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f25240t.add(aVar2.k(intValue));
                zArr[14] = true;
                return 0;
            case 15:
                this.f25241u = aVar2.d(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.ck ckVar = new bw5.ck();
                    if (bArr3 != null && bArr3.length > 0) {
                        ckVar.parseFrom(bArr3);
                    }
                    this.f25242v.add(ckVar);
                }
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.ik ikVar = new bw5.ik();
                    if (bArr4 != null && bArr4.length > 0) {
                        ikVar.parseFrom(bArr4);
                    }
                    this.f25243w.add(ikVar);
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.ek ekVar3 = new bw5.ek();
                    if (bArr5 != null && bArr5.length > 0) {
                        ekVar3.parseFrom(bArr5);
                    }
                    this.f25244x = ekVar3;
                }
                zArr[18] = true;
                return 0;
            case 19:
                this.f25245y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.fk fkVar3 = new bw5.fk();
                    if (bArr6 != null && bArr6.length > 0) {
                        fkVar3.parseFrom(bArr6);
                    }
                    this.f25246z = fkVar3;
                }
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.py pyVar3 = new bw5.py();
                    if (bArr7 != null && bArr7.length > 0) {
                        pyVar3.parseFrom(bArr7);
                    }
                    this.A = pyVar3;
                }
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.g(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.pj pjVar3 = new bw5.pj();
                    if (bArr8 != null && bArr8.length > 0) {
                        pjVar3.parseFrom(bArr8);
                    }
                    this.C = pjVar3;
                }
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.g(intValue);
                zArr[24] = true;
                return 0;
            default:
                return -1;
        }
    }
}
