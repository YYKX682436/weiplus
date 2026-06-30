package bw5;

/* loaded from: classes2.dex */
public class ja0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f28889d;

    /* renamed from: e, reason: collision with root package name */
    public int f28890e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28891f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28892g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f28894i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.ia0 f28895m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f28896n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.ga0 f28897o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f28898p;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f28900r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.ea0 f28901s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f28902t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.ha0 f28903u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f28904v;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f28893h = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f28899q = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f28905w = new boolean[18];

    static {
        new bw5.ja0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ja0 parseFrom(byte[] bArr) {
        return (bw5.ja0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ja0)) {
            return false;
        }
        bw5.ja0 ja0Var = (bw5.ja0) fVar;
        return n51.f.a(this.BaseResponse, ja0Var.BaseResponse) && n51.f.a(this.f28889d, ja0Var.f28889d) && n51.f.a(java.lang.Integer.valueOf(this.f28890e), java.lang.Integer.valueOf(ja0Var.f28890e)) && n51.f.a(java.lang.Boolean.valueOf(this.f28891f), java.lang.Boolean.valueOf(ja0Var.f28891f)) && n51.f.a(java.lang.Boolean.valueOf(this.f28892g), java.lang.Boolean.valueOf(ja0Var.f28892g)) && n51.f.a(this.f28893h, ja0Var.f28893h) && n51.f.a(this.f28894i, ja0Var.f28894i) && n51.f.a(this.f28895m, ja0Var.f28895m) && n51.f.a(java.lang.Boolean.valueOf(this.f28896n), java.lang.Boolean.valueOf(ja0Var.f28896n)) && n51.f.a(this.f28897o, ja0Var.f28897o) && n51.f.a(this.f28898p, ja0Var.f28898p) && n51.f.a(this.f28899q, ja0Var.f28899q) && n51.f.a(this.f28900r, ja0Var.f28900r) && n51.f.a(this.f28901s, ja0Var.f28901s) && n51.f.a(this.f28902t, ja0Var.f28902t) && n51.f.a(this.f28903u, ja0Var.f28903u) && n51.f.a(java.lang.Boolean.valueOf(this.f28904v), java.lang.Boolean.valueOf(ja0Var.f28904v));
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f28905w[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ja0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f28899q;
        java.util.LinkedList linkedList2 = this.f28893h;
        int i18 = 0;
        boolean[] zArr = this.f28905w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f28889d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f28890e);
            }
            if (zArr[4]) {
                fVar.a(4, this.f28891f);
            }
            if (zArr[5]) {
                fVar.a(5, this.f28892g);
            }
            fVar.g(6, 8, linkedList2);
            java.lang.String str2 = this.f28894i;
            if (str2 != null && zArr[7]) {
                fVar.j(7, str2);
            }
            bw5.ia0 ia0Var = this.f28895m;
            if (ia0Var != null && zArr[8]) {
                fVar.i(8, ia0Var.computeSize());
                this.f28895m.writeFields(fVar);
            }
            if (zArr[9]) {
                fVar.a(9, this.f28896n);
            }
            bw5.ga0 ga0Var = this.f28897o;
            if (ga0Var != null && zArr[10]) {
                fVar.i(10, ga0Var.computeSize());
                this.f28897o.writeFields(fVar);
            }
            java.lang.String str3 = this.f28898p;
            if (str3 != null && zArr[11]) {
                fVar.j(11, str3);
            }
            fVar.g(12, 8, linkedList);
            java.lang.String str4 = this.f28900r;
            if (str4 != null && zArr[13]) {
                fVar.j(13, str4);
            }
            bw5.ea0 ea0Var = this.f28901s;
            if (ea0Var != null && zArr[14]) {
                fVar.i(14, ea0Var.computeSize());
                this.f28901s.writeFields(fVar);
            }
            java.lang.String str5 = this.f28902t;
            if (str5 != null && zArr[15]) {
                fVar.j(15, str5);
            }
            bw5.ha0 ha0Var = this.f28903u;
            if (ha0Var != null && zArr[16]) {
                fVar.i(16, ha0Var.computeSize());
                this.f28903u.writeFields(fVar);
            }
            if (zArr[17]) {
                fVar.a(17, this.f28904v);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = b36.f.i(1, ieVar2.computeSize()) + 0;
            }
            java.lang.String str6 = this.f28889d;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f28890e);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f28891f);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f28892g);
            }
            int g17 = i18 + b36.f.g(6, 8, linkedList2);
            java.lang.String str7 = this.f28894i;
            if (str7 != null && zArr[7]) {
                g17 += b36.f.j(7, str7);
            }
            bw5.ia0 ia0Var2 = this.f28895m;
            if (ia0Var2 != null && zArr[8]) {
                g17 += b36.f.i(8, ia0Var2.computeSize());
            }
            if (zArr[9]) {
                g17 += b36.f.a(9, this.f28896n);
            }
            bw5.ga0 ga0Var2 = this.f28897o;
            if (ga0Var2 != null && zArr[10]) {
                g17 += b36.f.i(10, ga0Var2.computeSize());
            }
            java.lang.String str8 = this.f28898p;
            if (str8 != null && zArr[11]) {
                g17 += b36.f.j(11, str8);
            }
            int g18 = g17 + b36.f.g(12, 8, linkedList);
            java.lang.String str9 = this.f28900r;
            if (str9 != null && zArr[13]) {
                g18 += b36.f.j(13, str9);
            }
            bw5.ea0 ea0Var2 = this.f28901s;
            if (ea0Var2 != null && zArr[14]) {
                g18 += b36.f.i(14, ea0Var2.computeSize());
            }
            java.lang.String str10 = this.f28902t;
            if (str10 != null && zArr[15]) {
                g18 += b36.f.j(15, str10);
            }
            bw5.ha0 ha0Var2 = this.f28903u;
            if (ha0Var2 != null && zArr[16]) {
                g18 += b36.f.i(16, ha0Var2.computeSize());
            }
            return zArr[17] ? g18 + b36.f.a(17, this.f28904v) : g18;
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
                this.f28889d = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f28890e = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f28891f = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f28892g = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.ea0 ea0Var3 = new bw5.ea0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ea0Var3.parseFrom(bArr2);
                    }
                    linkedList2.add(ea0Var3);
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f28894i = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.ia0 ia0Var3 = new bw5.ia0();
                    if (bArr3 != null && bArr3.length > 0) {
                        ia0Var3.parseFrom(bArr3);
                    }
                    this.f28895m = ia0Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f28896n = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.ga0 ga0Var3 = new bw5.ga0();
                    if (bArr4 != null && bArr4.length > 0) {
                        ga0Var3.parseFrom(bArr4);
                    }
                    this.f28897o = ga0Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f28898p = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.fa0 fa0Var = new bw5.fa0();
                    if (bArr5 != null && bArr5.length > 0) {
                        fa0Var.parseFrom(bArr5);
                    }
                    linkedList.add(fa0Var);
                }
                zArr[12] = true;
                return 0;
            case 13:
                this.f28900r = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.ea0 ea0Var4 = new bw5.ea0();
                    if (bArr6 != null && bArr6.length > 0) {
                        ea0Var4.parseFrom(bArr6);
                    }
                    this.f28901s = ea0Var4;
                }
                zArr[14] = true;
                return 0;
            case 15:
                this.f28902t = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.ha0 ha0Var3 = new bw5.ha0();
                    if (bArr7 != null && bArr7.length > 0) {
                        ha0Var3.parseFrom(bArr7);
                    }
                    this.f28903u = ha0Var3;
                }
                zArr[16] = true;
                return 0;
            case 17:
                this.f28904v = aVar2.c(intValue);
                zArr[17] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f28905w[1] = true;
        return this;
    }
}
