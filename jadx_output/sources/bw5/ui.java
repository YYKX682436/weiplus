package bw5;

/* loaded from: classes2.dex */
public class ui extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33911d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33912e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33913f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33914g;

    /* renamed from: h, reason: collision with root package name */
    public int f33915h;

    /* renamed from: i, reason: collision with root package name */
    public float f33916i;

    /* renamed from: m, reason: collision with root package name */
    public int f33917m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f33918n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f33919o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f33920p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f33921q;

    /* renamed from: r, reason: collision with root package name */
    public int f33922r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f33923s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f33924t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f33925u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f33926v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f33927w = new boolean[17];

    static {
        new bw5.ui();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ui parseFrom(byte[] bArr) {
        return (bw5.ui) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ui)) {
            return false;
        }
        bw5.ui uiVar = (bw5.ui) fVar;
        return n51.f.a(this.f33911d, uiVar.f33911d) && n51.f.a(this.f33912e, uiVar.f33912e) && n51.f.a(this.f33913f, uiVar.f33913f) && n51.f.a(this.f33914g, uiVar.f33914g) && n51.f.a(java.lang.Integer.valueOf(this.f33915h), java.lang.Integer.valueOf(uiVar.f33915h)) && n51.f.a(java.lang.Float.valueOf(this.f33916i), java.lang.Float.valueOf(uiVar.f33916i)) && n51.f.a(java.lang.Integer.valueOf(this.f33917m), java.lang.Integer.valueOf(uiVar.f33917m)) && n51.f.a(java.lang.Boolean.valueOf(this.f33918n), java.lang.Boolean.valueOf(uiVar.f33918n)) && n51.f.a(java.lang.Boolean.valueOf(this.f33919o), java.lang.Boolean.valueOf(uiVar.f33919o)) && n51.f.a(this.f33920p, uiVar.f33920p) && n51.f.a(this.f33921q, uiVar.f33921q) && n51.f.a(java.lang.Integer.valueOf(this.f33922r), java.lang.Integer.valueOf(uiVar.f33922r)) && n51.f.a(java.lang.Boolean.valueOf(this.f33923s), java.lang.Boolean.valueOf(uiVar.f33923s)) && n51.f.a(java.lang.Boolean.valueOf(this.f33924t), java.lang.Boolean.valueOf(uiVar.f33924t)) && n51.f.a(this.f33925u, uiVar.f33925u) && n51.f.a(java.lang.Boolean.valueOf(this.f33926v), java.lang.Boolean.valueOf(uiVar.f33926v));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ui();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f33927w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33911d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f33912e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f33913f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f33914g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.e(5, this.f33915h);
            }
            if (zArr[6]) {
                fVar.d(6, this.f33916i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f33917m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f33918n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f33919o);
            }
            com.tencent.mm.protobuf.g gVar = this.f33920p;
            if (gVar != null && zArr[10]) {
                fVar.b(10, gVar);
            }
            java.lang.String str5 = this.f33921q;
            if (str5 != null && zArr[11]) {
                fVar.j(11, str5);
            }
            if (zArr[12]) {
                fVar.e(12, this.f33922r);
            }
            if (zArr[13]) {
                fVar.a(13, this.f33923s);
            }
            if (zArr[14]) {
                fVar.a(14, this.f33924t);
            }
            java.lang.String str6 = this.f33925u;
            if (str6 != null && zArr[15]) {
                fVar.j(15, str6);
            }
            if (zArr[16]) {
                fVar.a(16, this.f33926v);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f33911d;
            if (str7 != null && zArr[1]) {
                i18 = b36.f.j(1, str7) + 0;
            }
            java.lang.String str8 = this.f33912e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f33913f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f33914g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f33915h);
            }
            if (zArr[6]) {
                i18 += b36.f.d(6, this.f33916i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f33917m);
            }
            if (zArr[8]) {
                i18 += b36.f.a(8, this.f33918n);
            }
            if (zArr[9]) {
                i18 += b36.f.a(9, this.f33919o);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f33920p;
            if (gVar2 != null && zArr[10]) {
                i18 += b36.f.b(10, gVar2);
            }
            java.lang.String str11 = this.f33921q;
            if (str11 != null && zArr[11]) {
                i18 += b36.f.j(11, str11);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f33922r);
            }
            if (zArr[13]) {
                i18 += b36.f.a(13, this.f33923s);
            }
            if (zArr[14]) {
                i18 += b36.f.a(14, this.f33924t);
            }
            java.lang.String str12 = this.f33925u;
            if (str12 != null && zArr[15]) {
                i18 += b36.f.j(15, str12);
            }
            return zArr[16] ? i18 + b36.f.a(16, this.f33926v) : i18;
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
                this.f33911d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33912e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33913f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33914g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33915h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33916i = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33917m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f33918n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f33919o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f33920p = aVar2.d(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f33921q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f33922r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f33923s = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f33924t = aVar2.c(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f33925u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f33926v = aVar2.c(intValue);
                zArr[16] = true;
                return 0;
            default:
                return -1;
        }
    }
}
