package bw5;

/* loaded from: classes2.dex */
public class m10 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30039d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30040e;

    /* renamed from: f, reason: collision with root package name */
    public int f30041f;

    /* renamed from: g, reason: collision with root package name */
    public int f30042g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f30043h;

    /* renamed from: i, reason: collision with root package name */
    public int f30044i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f30045m;

    /* renamed from: n, reason: collision with root package name */
    public int f30046n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f30047o = new boolean[9];

    static {
        new bw5.m10();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.m10 parseFrom(byte[] bArr) {
        return (bw5.m10) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.m10)) {
            return false;
        }
        bw5.m10 m10Var = (bw5.m10) fVar;
        return n51.f.a(this.f30039d, m10Var.f30039d) && n51.f.a(this.f30040e, m10Var.f30040e) && n51.f.a(java.lang.Integer.valueOf(this.f30041f), java.lang.Integer.valueOf(m10Var.f30041f)) && n51.f.a(java.lang.Integer.valueOf(this.f30042g), java.lang.Integer.valueOf(m10Var.f30042g)) && n51.f.a(this.f30043h, m10Var.f30043h) && n51.f.a(java.lang.Integer.valueOf(this.f30044i), java.lang.Integer.valueOf(m10Var.f30044i)) && n51.f.a(this.f30045m, m10Var.f30045m) && n51.f.a(java.lang.Integer.valueOf(this.f30046n), java.lang.Integer.valueOf(m10Var.f30046n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.m10();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f30047o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30039d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f30040e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f30041f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f30042g);
            }
            java.lang.String str3 = this.f30043h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.e(6, this.f30044i);
            }
            java.lang.String str4 = this.f30045m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            if (zArr[8]) {
                fVar.e(8, this.f30046n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f30039d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f30040e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f30041f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f30042g);
            }
            java.lang.String str7 = this.f30043h;
            if (str7 != null && zArr[5]) {
                i18 += b36.f.j(5, str7);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f30044i);
            }
            java.lang.String str8 = this.f30045m;
            if (str8 != null && zArr[7]) {
                i18 += b36.f.j(7, str8);
            }
            return zArr[8] ? i18 + b36.f.e(8, this.f30046n) : i18;
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
                this.f30039d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30040e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30041f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30042g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30043h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30044i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30045m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f30046n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
