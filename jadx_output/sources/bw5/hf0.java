package bw5;

/* loaded from: classes9.dex */
public class hf0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f28191d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28192e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.y5 f28193f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f28194g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.gf0 f28195h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f28196i;

    /* renamed from: m, reason: collision with root package name */
    public int f28197m;

    /* renamed from: n, reason: collision with root package name */
    public long f28198n;

    /* renamed from: o, reason: collision with root package name */
    public int f28199o;

    /* renamed from: p, reason: collision with root package name */
    public int f28200p;

    /* renamed from: q, reason: collision with root package name */
    public long f28201q;

    /* renamed from: r, reason: collision with root package name */
    public int f28202r;

    /* renamed from: s, reason: collision with root package name */
    public int f28203s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f28204t = new boolean[15];

    static {
        new bw5.hf0();
    }

    public bw5.hf0 b(int i17) {
        this.f28197m = i17;
        this.f28204t[8] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hf0)) {
            return false;
        }
        bw5.hf0 hf0Var = (bw5.hf0) fVar;
        return n51.f.a(this.BaseRequest, hf0Var.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f28191d), java.lang.Long.valueOf(hf0Var.f28191d)) && n51.f.a(this.f28192e, hf0Var.f28192e) && n51.f.a(this.f28193f, hf0Var.f28193f) && n51.f.a(this.f28194g, hf0Var.f28194g) && n51.f.a(this.f28195h, hf0Var.f28195h) && n51.f.a(this.f28196i, hf0Var.f28196i) && n51.f.a(java.lang.Integer.valueOf(this.f28197m), java.lang.Integer.valueOf(hf0Var.f28197m)) && n51.f.a(java.lang.Long.valueOf(this.f28198n), java.lang.Long.valueOf(hf0Var.f28198n)) && n51.f.a(java.lang.Integer.valueOf(this.f28199o), java.lang.Integer.valueOf(hf0Var.f28199o)) && n51.f.a(java.lang.Integer.valueOf(this.f28200p), java.lang.Integer.valueOf(hf0Var.f28200p)) && n51.f.a(java.lang.Long.valueOf(this.f28201q), java.lang.Long.valueOf(hf0Var.f28201q)) && n51.f.a(java.lang.Integer.valueOf(this.f28202r), java.lang.Integer.valueOf(hf0Var.f28202r)) && n51.f.a(java.lang.Integer.valueOf(this.f28203s), java.lang.Integer.valueOf(hf0Var.f28203s));
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f28204t[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.hf0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28204t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.h(2, this.f28191d);
            }
            java.lang.String str = this.f28192e;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            bw5.y5 y5Var = this.f28193f;
            if (y5Var != null && zArr[4]) {
                fVar.i(4, y5Var.computeSize());
                this.f28193f.writeFields(fVar);
            }
            java.lang.String str2 = this.f28194g;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            bw5.gf0 gf0Var = this.f28195h;
            if (gf0Var != null && zArr[6]) {
                fVar.i(6, gf0Var.computeSize());
                this.f28195h.writeFields(fVar);
            }
            java.lang.String str3 = this.f28196i;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            if (zArr[8]) {
                fVar.e(8, this.f28197m);
            }
            if (zArr[9]) {
                fVar.h(9, this.f28198n);
            }
            if (zArr[10]) {
                fVar.e(10, this.f28199o);
            }
            if (zArr[11]) {
                fVar.e(11, this.f28200p);
            }
            if (zArr[12]) {
                fVar.h(12, this.f28201q);
            }
            if (zArr[13]) {
                fVar.e(13, this.f28202r);
            }
            if (!zArr[14]) {
                return 0;
            }
            fVar.e(14, this.f28203s);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 == null || !zArr[1]) ? 0 : b36.f.i(1, heVar2.computeSize()) + 0;
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f28191d);
            }
            java.lang.String str4 = this.f28192e;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            bw5.y5 y5Var2 = this.f28193f;
            if (y5Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, y5Var2.computeSize());
            }
            java.lang.String str5 = this.f28194g;
            if (str5 != null && zArr[5]) {
                i18 += b36.f.j(5, str5);
            }
            bw5.gf0 gf0Var2 = this.f28195h;
            if (gf0Var2 != null && zArr[6]) {
                i18 += b36.f.i(6, gf0Var2.computeSize());
            }
            java.lang.String str6 = this.f28196i;
            if (str6 != null && zArr[7]) {
                i18 += b36.f.j(7, str6);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f28197m);
            }
            if (zArr[9]) {
                i18 += b36.f.h(9, this.f28198n);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f28199o);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f28200p);
            }
            if (zArr[12]) {
                i18 += b36.f.h(12, this.f28201q);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f28202r);
            }
            return zArr[14] ? i18 + b36.f.e(14, this.f28203s) : i18;
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
                this.f28191d = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f28192e = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.y5 y5Var3 = new bw5.y5();
                    if (bArr2 != null && bArr2.length > 0) {
                        y5Var3.parseFrom(bArr2);
                    }
                    this.f28193f = y5Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f28194g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.gf0 gf0Var3 = new bw5.gf0();
                    if (bArr3 != null && bArr3.length > 0) {
                        gf0Var3.parseFrom(bArr3);
                    }
                    this.f28195h = gf0Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f28196i = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f28197m = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f28198n = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f28199o = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f28200p = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f28201q = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f28202r = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f28203s = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.hf0) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f28204t[1] = true;
        return this;
    }
}
