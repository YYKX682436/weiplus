package bw5;

/* loaded from: classes9.dex */
public class n2 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f30457d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30459f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30460g;

    /* renamed from: h, reason: collision with root package name */
    public int f30461h;

    /* renamed from: i, reason: collision with root package name */
    public long f30462i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f30463m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f30464n;

    /* renamed from: o, reason: collision with root package name */
    public r45.cu5 f30465o;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f30458e = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f30466p = new boolean[11];

    static {
        new bw5.n2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.n2 parseFrom(byte[] bArr) {
        return (bw5.n2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n2)) {
            return false;
        }
        bw5.n2 n2Var = (bw5.n2) fVar;
        return n51.f.a(this.BaseRequest, n2Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f30457d), java.lang.Integer.valueOf(n2Var.f30457d)) && n51.f.a(this.f30458e, n2Var.f30458e) && n51.f.a(this.f30459f, n2Var.f30459f) && n51.f.a(this.f30460g, n2Var.f30460g) && n51.f.a(java.lang.Integer.valueOf(this.f30461h), java.lang.Integer.valueOf(n2Var.f30461h)) && n51.f.a(java.lang.Long.valueOf(this.f30462i), java.lang.Long.valueOf(n2Var.f30462i)) && n51.f.a(this.f30463m, n2Var.f30463m) && n51.f.a(this.f30464n, n2Var.f30464n) && n51.f.a(this.f30465o, n2Var.f30465o);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f30466p[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.n2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f30466p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f30457d);
            }
            fVar.g(3, 8, this.f30458e);
            java.lang.String str = this.f30459f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f30460g;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.e(6, this.f30461h);
            }
            if (zArr[7]) {
                fVar.h(7, this.f30462i);
            }
            java.lang.String str3 = this.f30463m;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f30464n;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            r45.cu5 cu5Var = this.f30465o;
            if (cu5Var != null && zArr[10]) {
                fVar.i(10, cu5Var.computeSize());
                this.f30465o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f30457d);
            }
            int g17 = i18 + b36.f.g(3, 8, this.f30458e);
            java.lang.String str5 = this.f30459f;
            if (str5 != null && zArr[4]) {
                g17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f30460g;
            if (str6 != null && zArr[5]) {
                g17 += b36.f.j(5, str6);
            }
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f30461h);
            }
            if (zArr[7]) {
                g17 += b36.f.h(7, this.f30462i);
            }
            java.lang.String str7 = this.f30463m;
            if (str7 != null && zArr[8]) {
                g17 += b36.f.j(8, str7);
            }
            java.lang.String str8 = this.f30464n;
            if (str8 != null && zArr[9]) {
                g17 += b36.f.j(9, str8);
            }
            r45.cu5 cu5Var2 = this.f30465o;
            return (cu5Var2 == null || !zArr[10]) ? g17 : g17 + b36.f.i(10, cu5Var2.computeSize());
        }
        if (i17 == 2) {
            this.f30458e.clear();
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
                this.f30457d = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.f4 f4Var = new bw5.f4();
                    if (bArr2 != null && bArr2.length > 0) {
                        f4Var.parseFrom(bArr2);
                    }
                    this.f30458e.add(f4Var);
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f30459f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30460g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30461h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30462i = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f30463m = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f30464n = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var3.b(bArr3);
                    }
                    this.f30465o = cu5Var3;
                }
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f30466p[1] = true;
        return this;
    }
}
