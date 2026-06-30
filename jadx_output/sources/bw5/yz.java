package bw5;

/* loaded from: classes2.dex */
public class yz extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35732d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35733e;

    /* renamed from: f, reason: collision with root package name */
    public int f35734f;

    /* renamed from: g, reason: collision with root package name */
    public int f35735g;

    /* renamed from: h, reason: collision with root package name */
    public float f35736h;

    /* renamed from: i, reason: collision with root package name */
    public float f35737i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f35738m;

    /* renamed from: n, reason: collision with root package name */
    public int f35739n;

    /* renamed from: o, reason: collision with root package name */
    public int f35740o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f35741p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f35742q = new boolean[11];

    static {
        new bw5.yz();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yz parseFrom(byte[] bArr) {
        return (bw5.yz) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yz)) {
            return false;
        }
        bw5.yz yzVar = (bw5.yz) fVar;
        return n51.f.a(this.f35732d, yzVar.f35732d) && n51.f.a(this.f35733e, yzVar.f35733e) && n51.f.a(java.lang.Integer.valueOf(this.f35734f), java.lang.Integer.valueOf(yzVar.f35734f)) && n51.f.a(java.lang.Integer.valueOf(this.f35735g), java.lang.Integer.valueOf(yzVar.f35735g)) && n51.f.a(java.lang.Float.valueOf(this.f35736h), java.lang.Float.valueOf(yzVar.f35736h)) && n51.f.a(java.lang.Float.valueOf(this.f35737i), java.lang.Float.valueOf(yzVar.f35737i)) && n51.f.a(this.f35738m, yzVar.f35738m) && n51.f.a(java.lang.Integer.valueOf(this.f35739n), java.lang.Integer.valueOf(yzVar.f35739n)) && n51.f.a(java.lang.Integer.valueOf(this.f35740o), java.lang.Integer.valueOf(yzVar.f35740o)) && n51.f.a(this.f35741p, yzVar.f35741p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.yz();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f35742q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35732d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f35733e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f35734f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f35735g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f35736h);
            }
            if (zArr[6]) {
                fVar.d(6, this.f35737i);
            }
            java.lang.String str3 = this.f35738m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            if (zArr[8]) {
                fVar.e(8, this.f35739n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f35740o);
            }
            java.lang.String str4 = this.f35741p;
            if (str4 != null && zArr[10]) {
                fVar.j(10, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f35732d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f35733e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f35734f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f35735g);
            }
            if (zArr[5]) {
                i18 += b36.f.d(5, this.f35736h);
            }
            if (zArr[6]) {
                i18 += b36.f.d(6, this.f35737i);
            }
            java.lang.String str7 = this.f35738m;
            if (str7 != null && zArr[7]) {
                i18 += b36.f.j(7, str7);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f35739n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f35740o);
            }
            java.lang.String str8 = this.f35741p;
            return (str8 == null || !zArr[10]) ? i18 : i18 + b36.f.j(10, str8);
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
                this.f35732d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f35733e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f35734f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35735g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f35736h = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f35737i = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f35738m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f35739n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f35740o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f35741p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
