package bw5;

/* loaded from: classes9.dex */
public class q7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f31979d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f31980e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f31981f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f31982g;

    /* renamed from: h, reason: collision with root package name */
    public int f31983h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.p7 f31984i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f31985m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f31986n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f31987o = new boolean[9];

    static {
        new bw5.q7();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.q7 parseFrom(byte[] bArr) {
        return (bw5.q7) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q7)) {
            return false;
        }
        bw5.q7 q7Var = (bw5.q7) fVar;
        return n51.f.a(this.f31979d, q7Var.f31979d) && n51.f.a(this.f31980e, q7Var.f31980e) && n51.f.a(this.f31981f, q7Var.f31981f) && n51.f.a(this.f31982g, q7Var.f31982g) && n51.f.a(java.lang.Integer.valueOf(this.f31983h), java.lang.Integer.valueOf(q7Var.f31983h)) && n51.f.a(this.f31984i, q7Var.f31984i) && n51.f.a(java.lang.Boolean.valueOf(this.f31985m), java.lang.Boolean.valueOf(q7Var.f31985m)) && n51.f.a(this.f31986n, q7Var.f31986n);
    }

    public java.lang.String getAppid() {
        return this.f31987o[1] ? this.f31979d : "";
    }

    public java.lang.String getPath() {
        return this.f31987o[2] ? this.f31980e : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.q7();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f31987o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f31979d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f31980e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f31981f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f31982g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.e(5, this.f31983h);
            }
            bw5.p7 p7Var = this.f31984i;
            if (p7Var != null && zArr[6]) {
                fVar.i(6, p7Var.computeSize());
                this.f31984i.writeFields(fVar);
            }
            if (zArr[7]) {
                fVar.a(7, this.f31985m);
            }
            java.lang.String str5 = this.f31986n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f31979d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f31980e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f31981f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f31982g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f31983h);
            }
            bw5.p7 p7Var2 = this.f31984i;
            if (p7Var2 != null && zArr[6]) {
                i18 += b36.f.i(6, p7Var2.computeSize());
            }
            if (zArr[7]) {
                i18 += b36.f.a(7, this.f31985m);
            }
            java.lang.String str10 = this.f31986n;
            return (str10 == null || !zArr[8]) ? i18 : i18 + b36.f.j(8, str10);
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
                this.f31979d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f31980e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f31981f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f31982g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f31983h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.p7 p7Var3 = new bw5.p7();
                    if (bArr != null && bArr.length > 0) {
                        p7Var3.parseFrom(bArr);
                    }
                    this.f31984i = p7Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f31985m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f31986n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
