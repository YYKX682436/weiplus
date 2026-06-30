package bw5;

/* loaded from: classes2.dex */
public class x70 extends r45.mr5 {

    /* renamed from: e, reason: collision with root package name */
    public int f34986e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.z90 f34987f;

    /* renamed from: g, reason: collision with root package name */
    public int f34988g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f34989h;

    /* renamed from: i, reason: collision with root package name */
    public int f34990i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.v70 f34991m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.xa0 f34992n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f34993o;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f34985d = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f34994p = new boolean[11];

    static {
        new bw5.x70();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.x70)) {
            return false;
        }
        bw5.x70 x70Var = (bw5.x70) fVar;
        return n51.f.a(this.BaseRequest, x70Var.BaseRequest) && n51.f.a(this.f34985d, x70Var.f34985d) && n51.f.a(java.lang.Integer.valueOf(this.f34986e), java.lang.Integer.valueOf(x70Var.f34986e)) && n51.f.a(this.f34987f, x70Var.f34987f) && n51.f.a(java.lang.Integer.valueOf(this.f34988g), java.lang.Integer.valueOf(x70Var.f34988g)) && n51.f.a(this.f34989h, x70Var.f34989h) && n51.f.a(java.lang.Integer.valueOf(this.f34990i), java.lang.Integer.valueOf(x70Var.f34990i)) && n51.f.a(this.f34991m, x70Var.f34991m) && n51.f.a(this.f34992n, x70Var.f34992n) && n51.f.a(java.lang.Boolean.valueOf(this.f34993o), java.lang.Boolean.valueOf(x70Var.f34993o));
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f34994p[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.x70();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f34985d;
        int i18 = 0;
        boolean[] zArr = this.f34994p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.g(2, 1, linkedList);
            if (zArr[3]) {
                fVar.e(3, this.f34986e);
            }
            bw5.z90 z90Var = this.f34987f;
            if (z90Var != null && zArr[4]) {
                fVar.i(4, z90Var.computeSize());
                this.f34987f.writeFields(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f34988g);
            }
            java.lang.String str = this.f34989h;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            if (zArr[7]) {
                fVar.e(7, this.f34990i);
            }
            bw5.v70 v70Var = this.f34991m;
            if (v70Var != null && zArr[8]) {
                fVar.i(8, v70Var.computeSize());
                this.f34991m.writeFields(fVar);
            }
            bw5.xa0 xa0Var = this.f34992n;
            if (xa0Var != null && zArr[9]) {
                fVar.i(9, xa0Var.computeSize());
                this.f34992n.writeFields(fVar);
            }
            if (zArr[10]) {
                fVar.a(10, this.f34993o);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.computeSize());
            }
            int g17 = i18 + b36.f.g(2, 1, linkedList);
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f34986e);
            }
            bw5.z90 z90Var2 = this.f34987f;
            if (z90Var2 != null && zArr[4]) {
                g17 += b36.f.i(4, z90Var2.computeSize());
            }
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f34988g);
            }
            java.lang.String str2 = this.f34989h;
            if (str2 != null && zArr[6]) {
                g17 += b36.f.j(6, str2);
            }
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f34990i);
            }
            bw5.v70 v70Var2 = this.f34991m;
            if (v70Var2 != null && zArr[8]) {
                g17 += b36.f.i(8, v70Var2.computeSize());
            }
            bw5.xa0 xa0Var2 = this.f34992n;
            if (xa0Var2 != null && zArr[9]) {
                g17 += b36.f.i(9, xa0Var2.computeSize());
            }
            return zArr[10] ? g17 + b36.f.a(10, this.f34993o) : g17;
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
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    this.BaseRequest = heVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                linkedList.add(aVar2.k(intValue));
                zArr[2] = true;
                return 0;
            case 3:
                this.f34986e = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.z90 z90Var3 = new bw5.z90();
                    if (bArr2 != null && bArr2.length > 0) {
                        z90Var3.parseFrom(bArr2);
                    }
                    this.f34987f = z90Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f34988g = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34989h = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f34990i = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.v70 v70Var3 = new bw5.v70();
                    if (bArr3 != null && bArr3.length > 0) {
                        v70Var3.parseFrom(bArr3);
                    }
                    this.f34991m = v70Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.xa0 xa0Var3 = new bw5.xa0();
                    if (bArr4 != null && bArr4.length > 0) {
                        xa0Var3.parseFrom(bArr4);
                    }
                    this.f34992n = xa0Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f34993o = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.x70) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f34994p[1] = true;
        return this;
    }
}
