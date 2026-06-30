package bw5;

/* loaded from: classes2.dex */
public class t3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33227d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33228e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33229f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33230g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f33231h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ri0 f33232i;

    /* renamed from: m, reason: collision with root package name */
    public int f33233m;

    /* renamed from: n, reason: collision with root package name */
    public int f33234n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f33235o = new boolean[9];

    static {
        new bw5.t3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.t3 parseFrom(byte[] bArr) {
        return (bw5.t3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.t3)) {
            return false;
        }
        bw5.t3 t3Var = (bw5.t3) fVar;
        return n51.f.a(this.f33227d, t3Var.f33227d) && n51.f.a(this.f33228e, t3Var.f33228e) && n51.f.a(this.f33229f, t3Var.f33229f) && n51.f.a(this.f33230g, t3Var.f33230g) && n51.f.a(this.f33231h, t3Var.f33231h) && n51.f.a(this.f33232i, t3Var.f33232i) && n51.f.a(java.lang.Integer.valueOf(this.f33233m), java.lang.Integer.valueOf(t3Var.f33233m)) && n51.f.a(java.lang.Integer.valueOf(this.f33234n), java.lang.Integer.valueOf(t3Var.f33234n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.t3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f33235o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33227d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f33228e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f33229f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f33230g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f33231h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            r45.ri0 ri0Var = this.f33232i;
            if (ri0Var != null && zArr[6]) {
                fVar.i(6, ri0Var.computeSize());
                this.f33232i.writeFields(fVar);
            }
            if (zArr[7]) {
                fVar.e(7, this.f33233m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f33234n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f33227d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f33228e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f33229f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f33230g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f33231h;
            if (str10 != null && zArr[5]) {
                i18 += b36.f.j(5, str10);
            }
            r45.ri0 ri0Var2 = this.f33232i;
            if (ri0Var2 != null && zArr[6]) {
                i18 += b36.f.i(6, ri0Var2.computeSize());
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f33233m);
            }
            return zArr[8] ? i18 + b36.f.e(8, this.f33234n) : i18;
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
                this.f33227d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33228e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33229f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33230g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33231h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ri0 ri0Var3 = new r45.ri0();
                    if (bArr != null && bArr.length > 0) {
                        ri0Var3.parseFrom(bArr);
                    }
                    this.f33232i = ri0Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f33233m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f33234n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
