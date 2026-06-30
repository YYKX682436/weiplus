package bw5;

/* loaded from: classes2.dex */
public class v40 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34136d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f34138f;

    /* renamed from: g, reason: collision with root package name */
    public int f34139g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f34140h;

    /* renamed from: i, reason: collision with root package name */
    public int f34141i;

    /* renamed from: m, reason: collision with root package name */
    public int f34142m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.cc0 f34143n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34144o;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f34137e = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f34145p = new boolean[11];

    static {
        new bw5.v40();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.v40 parseFrom(byte[] bArr) {
        return (bw5.v40) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.v40)) {
            return false;
        }
        bw5.v40 v40Var = (bw5.v40) fVar;
        return n51.f.a(this.BaseResponse, v40Var.BaseResponse) && n51.f.a(this.f34136d, v40Var.f34136d) && n51.f.a(this.f34137e, v40Var.f34137e) && n51.f.a(java.lang.Boolean.valueOf(this.f34138f), java.lang.Boolean.valueOf(v40Var.f34138f)) && n51.f.a(java.lang.Integer.valueOf(this.f34139g), java.lang.Integer.valueOf(v40Var.f34139g)) && n51.f.a(this.f34140h, v40Var.f34140h) && n51.f.a(java.lang.Integer.valueOf(this.f34141i), java.lang.Integer.valueOf(v40Var.f34141i)) && n51.f.a(java.lang.Integer.valueOf(this.f34142m), java.lang.Integer.valueOf(v40Var.f34142m)) && n51.f.a(this.f34143n, v40Var.f34143n) && n51.f.a(this.f34144o, v40Var.f34144o);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f34145p[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.v40();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f34137e;
        int i18 = 0;
        boolean[] zArr = this.f34145p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f34136d;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            fVar.g(3, 8, linkedList);
            if (zArr[4]) {
                fVar.a(4, this.f34138f);
            }
            if (zArr[5]) {
                fVar.e(5, this.f34139g);
            }
            java.lang.String str = this.f34140h;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            if (zArr[7]) {
                fVar.e(7, this.f34141i);
            }
            if (zArr[8]) {
                fVar.e(8, this.f34142m);
            }
            bw5.cc0 cc0Var = this.f34143n;
            if (cc0Var != null && zArr[9]) {
                fVar.i(9, cc0Var.computeSize());
                this.f34143n.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f34144o;
            if (gVar2 != null && zArr[10]) {
                fVar.b(10, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar3 = this.f34136d;
            if (gVar3 != null && zArr[2]) {
                i18 += b36.f.b(2, gVar3);
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            if (zArr[4]) {
                g17 += b36.f.a(4, this.f34138f);
            }
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f34139g);
            }
            java.lang.String str2 = this.f34140h;
            if (str2 != null && zArr[6]) {
                g17 += b36.f.j(6, str2);
            }
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f34141i);
            }
            if (zArr[8]) {
                g17 += b36.f.e(8, this.f34142m);
            }
            bw5.cc0 cc0Var2 = this.f34143n;
            if (cc0Var2 != null && zArr[9]) {
                g17 += b36.f.i(9, cc0Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar4 = this.f34144o;
            return (gVar4 == null || !zArr[10]) ? g17 : g17 + b36.f.b(10, gVar4);
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
                this.f34136d = aVar2.d(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.dc0 dc0Var = new bw5.dc0();
                    if (bArr2 != null && bArr2.length > 0) {
                        dc0Var.parseFrom(bArr2);
                    }
                    linkedList.add(dc0Var);
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f34138f = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34139g = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34140h = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f34141i = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f34142m = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.cc0 cc0Var3 = new bw5.cc0();
                    if (bArr3 != null && bArr3.length > 0) {
                        cc0Var3.parseFrom(bArr3);
                    }
                    this.f34143n = cc0Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f34144o = aVar2.d(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f34145p[1] = true;
        return this;
    }
}
