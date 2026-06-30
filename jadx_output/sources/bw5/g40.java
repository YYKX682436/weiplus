package bw5;

/* loaded from: classes2.dex */
public class g40 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f27676d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.v70 f27677e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27678f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f27679g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27680h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.j70 f27681i;

    /* renamed from: m, reason: collision with root package name */
    public long f27682m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.l40 f27683n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f27684o = new boolean[10];

    static {
        new bw5.g40();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.g40)) {
            return false;
        }
        bw5.g40 g40Var = (bw5.g40) fVar;
        return n51.f.a(this.BaseRequest, g40Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f27676d), java.lang.Integer.valueOf(g40Var.f27676d)) && n51.f.a(this.f27677e, g40Var.f27677e) && n51.f.a(this.f27678f, g40Var.f27678f) && n51.f.a(this.f27679g, g40Var.f27679g) && n51.f.a(java.lang.Boolean.valueOf(this.f27680h), java.lang.Boolean.valueOf(g40Var.f27680h)) && n51.f.a(this.f27681i, g40Var.f27681i) && n51.f.a(java.lang.Long.valueOf(this.f27682m), java.lang.Long.valueOf(g40Var.f27682m)) && n51.f.a(this.f27683n, g40Var.f27683n);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f27684o[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.g40();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f27684o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            if (zArr[7]) {
                fVar.e(7, this.f27676d);
            }
            bw5.v70 v70Var = this.f27677e;
            if (v70Var != null && zArr[2]) {
                fVar.i(2, v70Var.computeSize());
                this.f27677e.writeFields(fVar);
            }
            java.lang.String str = this.f27678f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f27679g;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            if (zArr[4]) {
                fVar.a(4, this.f27680h);
            }
            bw5.j70 j70Var = this.f27681i;
            if (j70Var != null && zArr[5]) {
                fVar.i(5, j70Var.computeSize());
                this.f27681i.writeFields(fVar);
            }
            if (zArr[8]) {
                fVar.h(8, this.f27682m);
            }
            bw5.l40 l40Var = this.f27683n;
            if (l40Var != null && zArr[9]) {
                fVar.i(9, l40Var.computeSize());
                this.f27683n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.computeSize());
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f27676d);
            }
            bw5.v70 v70Var2 = this.f27677e;
            if (v70Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, v70Var2.computeSize());
            }
            java.lang.String str3 = this.f27678f;
            if (str3 != null && zArr[3]) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f27679g;
            if (str4 != null && zArr[6]) {
                i18 += b36.f.j(6, str4);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f27680h);
            }
            bw5.j70 j70Var2 = this.f27681i;
            if (j70Var2 != null && zArr[5]) {
                i18 += b36.f.i(5, j70Var2.computeSize());
            }
            if (zArr[8]) {
                i18 += b36.f.h(8, this.f27682m);
            }
            bw5.l40 l40Var2 = this.f27683n;
            return (l40Var2 == null || !zArr[9]) ? i18 : i18 + b36.f.i(9, l40Var2.computeSize());
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
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.v70 v70Var3 = new bw5.v70();
                    if (bArr2 != null && bArr2.length > 0) {
                        v70Var3.parseFrom(bArr2);
                    }
                    this.f27677e = v70Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f27678f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27680h = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.j70 j70Var3 = new bw5.j70();
                    if (bArr3 != null && bArr3.length > 0) {
                        j70Var3.parseFrom(bArr3);
                    }
                    this.f27681i = j70Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f27679g = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27676d = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f27682m = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.l40 l40Var3 = new bw5.l40();
                    if (bArr4 != null && bArr4.length > 0) {
                        l40Var3.parseFrom(bArr4);
                    }
                    this.f27683n = l40Var3;
                }
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.g40) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f27684o[1] = true;
        return this;
    }
}
