package bw5;

/* loaded from: classes2.dex */
public class a70 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f25044e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25045f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f25046g;

    /* renamed from: h, reason: collision with root package name */
    public long f25047h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25048i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f25049m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f25050n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f25051o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.xa0 f25052p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.f90 f25053q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.m40 f25054r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.p90 f25055s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.vb0 f25056t;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f25043d = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f25057u = new boolean[16];

    static {
        new bw5.a70();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.a70 parseFrom(byte[] bArr) {
        return (bw5.a70) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a70)) {
            return false;
        }
        bw5.a70 a70Var = (bw5.a70) fVar;
        return n51.f.a(this.BaseResponse, a70Var.BaseResponse) && n51.f.a(this.f25043d, a70Var.f25043d) && n51.f.a(this.f25044e, a70Var.f25044e) && n51.f.a(java.lang.Boolean.valueOf(this.f25045f), java.lang.Boolean.valueOf(a70Var.f25045f)) && n51.f.a(this.f25046g, a70Var.f25046g) && n51.f.a(java.lang.Long.valueOf(this.f25047h), java.lang.Long.valueOf(a70Var.f25047h)) && n51.f.a(java.lang.Boolean.valueOf(this.f25048i), java.lang.Boolean.valueOf(a70Var.f25048i)) && n51.f.a(java.lang.Boolean.valueOf(this.f25049m), java.lang.Boolean.valueOf(a70Var.f25049m)) && n51.f.a(this.f25050n, a70Var.f25050n) && n51.f.a(java.lang.Boolean.valueOf(this.f25051o), java.lang.Boolean.valueOf(a70Var.f25051o)) && n51.f.a(this.f25052p, a70Var.f25052p) && n51.f.a(this.f25053q, a70Var.f25053q) && n51.f.a(this.f25054r, a70Var.f25054r) && n51.f.a(this.f25055s, a70Var.f25055s) && n51.f.a(this.f25056t, a70Var.f25056t);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f25057u[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.a70();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25043d;
        int i18 = 0;
        boolean[] zArr = this.f25057u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f25044e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.a(4, this.f25045f);
            }
            java.lang.String str = this.f25046g;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            if (zArr[6]) {
                fVar.h(6, this.f25047h);
            }
            if (zArr[7]) {
                fVar.a(7, this.f25048i);
            }
            if (zArr[8]) {
                fVar.a(8, this.f25049m);
            }
            java.lang.String str2 = this.f25050n;
            if (str2 != null && zArr[9]) {
                fVar.j(9, str2);
            }
            if (zArr[10]) {
                fVar.a(10, this.f25051o);
            }
            bw5.xa0 xa0Var = this.f25052p;
            if (xa0Var != null && zArr[11]) {
                fVar.i(11, xa0Var.computeSize());
                this.f25052p.writeFields(fVar);
            }
            bw5.f90 f90Var = this.f25053q;
            if (f90Var != null && zArr[12]) {
                fVar.i(12, f90Var.computeSize());
                this.f25053q.writeFields(fVar);
            }
            bw5.m40 m40Var = this.f25054r;
            if (m40Var != null && zArr[13]) {
                fVar.i(13, m40Var.computeSize());
                this.f25054r.writeFields(fVar);
            }
            bw5.p90 p90Var = this.f25055s;
            if (p90Var != null && zArr[14]) {
                fVar.i(14, p90Var.computeSize());
                this.f25055s.writeFields(fVar);
            }
            bw5.vb0 vb0Var = this.f25056t;
            if (vb0Var != null && zArr[15]) {
                fVar.i(15, vb0Var.computeSize());
                this.f25056t.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = b36.f.i(1, ieVar2.computeSize()) + 0;
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f25044e;
            if (gVar2 != null && zArr[3]) {
                g17 += b36.f.b(3, gVar2);
            }
            if (zArr[4]) {
                g17 += b36.f.a(4, this.f25045f);
            }
            java.lang.String str3 = this.f25046g;
            if (str3 != null && zArr[5]) {
                g17 += b36.f.j(5, str3);
            }
            if (zArr[6]) {
                g17 += b36.f.h(6, this.f25047h);
            }
            if (zArr[7]) {
                g17 += b36.f.a(7, this.f25048i);
            }
            if (zArr[8]) {
                g17 += b36.f.a(8, this.f25049m);
            }
            java.lang.String str4 = this.f25050n;
            if (str4 != null && zArr[9]) {
                g17 += b36.f.j(9, str4);
            }
            if (zArr[10]) {
                g17 += b36.f.a(10, this.f25051o);
            }
            bw5.xa0 xa0Var2 = this.f25052p;
            if (xa0Var2 != null && zArr[11]) {
                g17 += b36.f.i(11, xa0Var2.computeSize());
            }
            bw5.f90 f90Var2 = this.f25053q;
            if (f90Var2 != null && zArr[12]) {
                g17 += b36.f.i(12, f90Var2.computeSize());
            }
            bw5.m40 m40Var2 = this.f25054r;
            if (m40Var2 != null && zArr[13]) {
                g17 += b36.f.i(13, m40Var2.computeSize());
            }
            bw5.p90 p90Var2 = this.f25055s;
            if (p90Var2 != null && zArr[14]) {
                g17 += b36.f.i(14, p90Var2.computeSize());
            }
            bw5.vb0 vb0Var2 = this.f25056t;
            return (vb0Var2 == null || !zArr[15]) ? g17 : g17 + b36.f.i(15, vb0Var2.computeSize());
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
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.t70 t70Var = new bw5.t70();
                    if (bArr2 != null && bArr2.length > 0) {
                        t70Var.parseFrom(bArr2);
                    }
                    linkedList.add(t70Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f25044e = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25045f = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25046g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25047h = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f25048i = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f25049m = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f25050n = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f25051o = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.xa0 xa0Var3 = new bw5.xa0();
                    if (bArr3 != null && bArr3.length > 0) {
                        xa0Var3.parseFrom(bArr3);
                    }
                    this.f25052p = xa0Var3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.f90 f90Var3 = new bw5.f90();
                    if (bArr4 != null && bArr4.length > 0) {
                        f90Var3.parseFrom(bArr4);
                    }
                    this.f25053q = f90Var3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.m40 m40Var3 = new bw5.m40();
                    if (bArr5 != null && bArr5.length > 0) {
                        m40Var3.parseFrom(bArr5);
                    }
                    this.f25054r = m40Var3;
                }
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.p90 p90Var3 = new bw5.p90();
                    if (bArr6 != null && bArr6.length > 0) {
                        p90Var3.parseFrom(bArr6);
                    }
                    this.f25055s = p90Var3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.vb0 vb0Var3 = new bw5.vb0();
                    if (bArr7 != null && bArr7.length > 0) {
                        vb0Var3.parseFrom(bArr7);
                    }
                    this.f25056t = vb0Var3;
                }
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f25057u[1] = true;
        return this;
    }
}
