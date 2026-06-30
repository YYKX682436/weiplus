package bw5;

/* loaded from: classes2.dex */
public class un extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33989d;

    /* renamed from: e, reason: collision with root package name */
    public float f33990e;

    /* renamed from: f, reason: collision with root package name */
    public float f33991f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33992g;

    /* renamed from: h, reason: collision with root package name */
    public long f33993h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f33994i;

    /* renamed from: m, reason: collision with root package name */
    public int f33995m;

    /* renamed from: n, reason: collision with root package name */
    public int f33996n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f33997o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f33998p = new boolean[10];

    static {
        new bw5.un();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.un parseFrom(byte[] bArr) {
        return (bw5.un) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.un)) {
            return false;
        }
        bw5.un unVar = (bw5.un) fVar;
        return n51.f.a(this.f33989d, unVar.f33989d) && n51.f.a(java.lang.Float.valueOf(this.f33990e), java.lang.Float.valueOf(unVar.f33990e)) && n51.f.a(java.lang.Float.valueOf(this.f33991f), java.lang.Float.valueOf(unVar.f33991f)) && n51.f.a(this.f33992g, unVar.f33992g) && n51.f.a(java.lang.Long.valueOf(this.f33993h), java.lang.Long.valueOf(unVar.f33993h)) && n51.f.a(this.f33994i, unVar.f33994i) && n51.f.a(java.lang.Integer.valueOf(this.f33995m), java.lang.Integer.valueOf(unVar.f33995m)) && n51.f.a(java.lang.Integer.valueOf(this.f33996n), java.lang.Integer.valueOf(unVar.f33996n)) && n51.f.a(this.f33997o, unVar.f33997o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.un();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f33998p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33989d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.d(2, this.f33990e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f33991f);
            }
            java.lang.String str2 = this.f33992g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.h(5, this.f33993h);
            }
            java.lang.String str3 = this.f33994i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            if (zArr[7]) {
                fVar.e(7, this.f33995m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f33996n);
            }
            java.lang.String str4 = this.f33997o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f33989d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            if (zArr[2]) {
                i18 += b36.f.d(2, this.f33990e);
            }
            if (zArr[3]) {
                i18 += b36.f.d(3, this.f33991f);
            }
            java.lang.String str6 = this.f33992g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f33993h);
            }
            java.lang.String str7 = this.f33994i;
            if (str7 != null && zArr[6]) {
                i18 += b36.f.j(6, str7);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f33995m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f33996n);
            }
            java.lang.String str8 = this.f33997o;
            return (str8 == null || !zArr[9]) ? i18 : i18 + b36.f.j(9, str8);
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
                this.f33989d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33990e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33991f = aVar2.f(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33992g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33993h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33994i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33995m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f33996n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f33997o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
