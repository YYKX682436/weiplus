package bw5;

/* loaded from: classes9.dex */
public class mb0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30150d;

    /* renamed from: e, reason: collision with root package name */
    public int f30151e;

    /* renamed from: f, reason: collision with root package name */
    public int f30152f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30153g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f30154h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f30155i;

    /* renamed from: m, reason: collision with root package name */
    public int f30156m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f30157n;

    /* renamed from: o, reason: collision with root package name */
    public int f30158o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f30159p = new boolean[10];

    static {
        new bw5.mb0();
    }

    public java.lang.String b() {
        return this.f30159p[1] ? this.f30150d : "";
    }

    public java.lang.String c() {
        return this.f30159p[5] ? this.f30154h : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mb0)) {
            return false;
        }
        bw5.mb0 mb0Var = (bw5.mb0) fVar;
        return n51.f.a(this.f30150d, mb0Var.f30150d) && n51.f.a(java.lang.Integer.valueOf(this.f30151e), java.lang.Integer.valueOf(mb0Var.f30151e)) && n51.f.a(java.lang.Integer.valueOf(this.f30152f), java.lang.Integer.valueOf(mb0Var.f30152f)) && n51.f.a(this.f30153g, mb0Var.f30153g) && n51.f.a(this.f30154h, mb0Var.f30154h) && n51.f.a(this.f30155i, mb0Var.f30155i) && n51.f.a(java.lang.Integer.valueOf(this.f30156m), java.lang.Integer.valueOf(mb0Var.f30156m)) && n51.f.a(this.f30157n, mb0Var.f30157n) && n51.f.a(java.lang.Integer.valueOf(this.f30158o), java.lang.Integer.valueOf(mb0Var.f30158o));
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.mb0 parseFrom(byte[] bArr) {
        return (bw5.mb0) super.parseFrom(bArr);
    }

    public java.lang.String getName() {
        return this.f30159p[4] ? this.f30153g : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.mb0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f30159p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30150d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f30151e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f30152f);
            }
            java.lang.String str2 = this.f30153g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f30154h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f30155i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            if (zArr[7]) {
                fVar.e(7, this.f30156m);
            }
            com.tencent.mm.protobuf.g gVar = this.f30157n;
            if (gVar != null && zArr[8]) {
                fVar.b(8, gVar);
            }
            if (zArr[9]) {
                fVar.e(9, this.f30158o);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f30150d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f30151e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f30152f);
            }
            java.lang.String str6 = this.f30153g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f30154h;
            if (str7 != null && zArr[5]) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f30155i;
            if (str8 != null && zArr[6]) {
                i18 += b36.f.j(6, str8);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f30156m);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f30157n;
            if (gVar2 != null && zArr[8]) {
                i18 += b36.f.b(8, gVar2);
            }
            return zArr[9] ? i18 + b36.f.e(9, this.f30158o) : i18;
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
                this.f30150d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30151e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30152f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30153g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30154h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30155i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30156m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f30157n = aVar2.d(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f30158o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
