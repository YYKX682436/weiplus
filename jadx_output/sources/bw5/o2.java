package bw5;

/* loaded from: classes9.dex */
public class o2 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f30898d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30900f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30901g;

    /* renamed from: h, reason: collision with root package name */
    public int f30902h;

    /* renamed from: i, reason: collision with root package name */
    public long f30903i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f30904m;

    /* renamed from: n, reason: collision with root package name */
    public int f30905n;

    /* renamed from: o, reason: collision with root package name */
    public r45.cu5 f30906o;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f30899e = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f30907p = new boolean[11];

    static {
        new bw5.o2();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o2)) {
            return false;
        }
        bw5.o2 o2Var = (bw5.o2) fVar;
        return n51.f.a(this.BaseRequest, o2Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f30898d), java.lang.Integer.valueOf(o2Var.f30898d)) && n51.f.a(this.f30899e, o2Var.f30899e) && n51.f.a(this.f30900f, o2Var.f30900f) && n51.f.a(this.f30901g, o2Var.f30901g) && n51.f.a(java.lang.Integer.valueOf(this.f30902h), java.lang.Integer.valueOf(o2Var.f30902h)) && n51.f.a(java.lang.Long.valueOf(this.f30903i), java.lang.Long.valueOf(o2Var.f30903i)) && n51.f.a(this.f30904m, o2Var.f30904m) && n51.f.a(java.lang.Integer.valueOf(this.f30905n), java.lang.Integer.valueOf(o2Var.f30905n)) && n51.f.a(this.f30906o, o2Var.f30906o);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f30907p[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.o2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f30907p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f30898d);
            }
            fVar.g(3, 8, this.f30899e);
            java.lang.String str = this.f30900f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f30901g;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.e(6, this.f30902h);
            }
            if (zArr[7]) {
                fVar.h(7, this.f30903i);
            }
            java.lang.String str3 = this.f30904m;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            if (zArr[9]) {
                fVar.e(9, this.f30905n);
            }
            r45.cu5 cu5Var = this.f30906o;
            if (cu5Var != null && zArr[10]) {
                fVar.i(10, cu5Var.computeSize());
                this.f30906o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f30898d);
            }
            int g17 = i18 + b36.f.g(3, 8, this.f30899e);
            java.lang.String str4 = this.f30900f;
            if (str4 != null && zArr[4]) {
                g17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f30901g;
            if (str5 != null && zArr[5]) {
                g17 += b36.f.j(5, str5);
            }
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f30902h);
            }
            if (zArr[7]) {
                g17 += b36.f.h(7, this.f30903i);
            }
            java.lang.String str6 = this.f30904m;
            if (str6 != null && zArr[8]) {
                g17 += b36.f.j(8, str6);
            }
            if (zArr[9]) {
                g17 += b36.f.e(9, this.f30905n);
            }
            r45.cu5 cu5Var2 = this.f30906o;
            return (cu5Var2 == null || !zArr[10]) ? g17 : g17 + b36.f.i(10, cu5Var2.computeSize());
        }
        if (i17 == 2) {
            this.f30899e.clear();
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
                this.f30898d = aVar2.g(intValue);
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
                    this.f30899e.add(f4Var);
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f30900f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30901g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30902h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30903i = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f30904m = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f30905n = aVar2.g(intValue);
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
                    this.f30906o = cu5Var3;
                }
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.o2) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f30907p[1] = true;
        return this;
    }
}
