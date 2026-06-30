package bw5;

/* loaded from: classes2.dex */
public class d50 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f26327d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26328e;

    /* renamed from: f, reason: collision with root package name */
    public int f26329f;

    /* renamed from: g, reason: collision with root package name */
    public int f26330g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f26331h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f26332i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.xa0 f26333m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.l40 f26334n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.e90 f26335o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f26336p = new boolean[12];

    static {
        new bw5.d50();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.d50)) {
            return false;
        }
        bw5.d50 d50Var = (bw5.d50) fVar;
        return n51.f.a(this.BaseRequest, d50Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f26327d), java.lang.Integer.valueOf(d50Var.f26327d)) && n51.f.a(this.f26328e, d50Var.f26328e) && n51.f.a(java.lang.Integer.valueOf(this.f26329f), java.lang.Integer.valueOf(d50Var.f26329f)) && n51.f.a(java.lang.Integer.valueOf(this.f26330g), java.lang.Integer.valueOf(d50Var.f26330g)) && n51.f.a(this.f26331h, d50Var.f26331h) && n51.f.a(java.lang.Boolean.valueOf(this.f26332i), java.lang.Boolean.valueOf(d50Var.f26332i)) && n51.f.a(this.f26333m, d50Var.f26333m) && n51.f.a(this.f26334n, d50Var.f26334n) && n51.f.a(this.f26335o, d50Var.f26335o);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f26336p[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.d50();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f26336p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f26327d);
            }
            java.lang.String str = this.f26328e;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.e(5, this.f26329f);
            }
            if (zArr[6]) {
                fVar.e(6, this.f26330g);
            }
            com.tencent.mm.protobuf.g gVar = this.f26331h;
            if (gVar != null && zArr[7]) {
                fVar.b(7, gVar);
            }
            if (zArr[8]) {
                fVar.a(8, this.f26332i);
            }
            bw5.xa0 xa0Var = this.f26333m;
            if (xa0Var != null && zArr[9]) {
                fVar.i(9, xa0Var.computeSize());
                this.f26333m.writeFields(fVar);
            }
            bw5.l40 l40Var = this.f26334n;
            if (l40Var != null && zArr[10]) {
                fVar.i(10, l40Var.computeSize());
                this.f26334n.writeFields(fVar);
            }
            bw5.e90 e90Var = this.f26335o;
            if (e90Var != null && zArr[11]) {
                fVar.i(11, e90Var.computeSize());
                this.f26335o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.computeSize());
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f26327d);
            }
            java.lang.String str2 = this.f26328e;
            if (str2 != null && zArr[4]) {
                i18 += b36.f.j(4, str2);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f26329f);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f26330g);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f26331h;
            if (gVar2 != null && zArr[7]) {
                i18 += b36.f.b(7, gVar2);
            }
            if (zArr[8]) {
                i18 += b36.f.a(8, this.f26332i);
            }
            bw5.xa0 xa0Var2 = this.f26333m;
            if (xa0Var2 != null && zArr[9]) {
                i18 += b36.f.i(9, xa0Var2.computeSize());
            }
            bw5.l40 l40Var2 = this.f26334n;
            if (l40Var2 != null && zArr[10]) {
                i18 += b36.f.i(10, l40Var2.computeSize());
            }
            bw5.e90 e90Var2 = this.f26335o;
            return (e90Var2 == null || !zArr[11]) ? i18 : i18 + b36.f.i(11, e90Var2.computeSize());
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    this.BaseRequest = heVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
            default:
                return -1;
            case 3:
                this.f26327d = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26328e = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26329f = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26330g = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26331h = aVar2.d(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f26332i = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.xa0 xa0Var3 = new bw5.xa0();
                    if (bArr2 != null && bArr2.length > 0) {
                        xa0Var3.parseFrom(bArr2);
                    }
                    this.f26333m = xa0Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.l40 l40Var3 = new bw5.l40();
                    if (bArr3 != null && bArr3.length > 0) {
                        l40Var3.parseFrom(bArr3);
                    }
                    this.f26334n = l40Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.e90 e90Var3 = new bw5.e90();
                    if (bArr4 != null && bArr4.length > 0) {
                        e90Var3.parseFrom(bArr4);
                    }
                    this.f26335o = e90Var3;
                }
                zArr[11] = true;
                return 0;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.d50) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f26336p[1] = true;
        return this;
    }
}
