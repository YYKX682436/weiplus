package bw5;

/* loaded from: classes4.dex */
public class yr0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35675d;

    /* renamed from: e, reason: collision with root package name */
    public long f35676e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f35677f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f35678g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f35679h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f35680i;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f35682n;

    /* renamed from: o, reason: collision with root package name */
    public long f35683o;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f35681m = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f35684p = new boolean[10];

    static {
        new bw5.yr0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yr0 parseFrom(byte[] bArr) {
        return (bw5.yr0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yr0)) {
            return false;
        }
        bw5.yr0 yr0Var = (bw5.yr0) fVar;
        return n51.f.a(this.f35675d, yr0Var.f35675d) && n51.f.a(java.lang.Long.valueOf(this.f35676e), java.lang.Long.valueOf(yr0Var.f35676e)) && n51.f.a(this.f35677f, yr0Var.f35677f) && n51.f.a(this.f35678g, yr0Var.f35678g) && n51.f.a(this.f35679h, yr0Var.f35679h) && n51.f.a(this.f35680i, yr0Var.f35680i) && n51.f.a(this.f35681m, yr0Var.f35681m) && n51.f.a(this.f35682n, yr0Var.f35682n) && n51.f.a(java.lang.Long.valueOf(this.f35683o), java.lang.Long.valueOf(yr0Var.f35683o));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.yr0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f35681m;
        int i18 = 0;
        boolean[] zArr = this.f35684p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35675d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f35676e);
            }
            java.lang.String str2 = this.f35677f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f35678g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f35679h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            com.tencent.mm.protobuf.g gVar = this.f35680i;
            if (gVar != null && zArr[6]) {
                fVar.b(6, gVar);
            }
            fVar.g(7, 8, linkedList);
            java.lang.String str5 = this.f35682n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            if (zArr[9]) {
                fVar.h(9, this.f35683o);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f35675d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f35676e);
            }
            java.lang.String str7 = this.f35677f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f35678g;
            if (str8 != null && zArr[4]) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f35679h;
            if (str9 != null && zArr[5]) {
                i18 += b36.f.j(5, str9);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f35680i;
            if (gVar2 != null && zArr[6]) {
                i18 += b36.f.b(6, gVar2);
            }
            int g17 = i18 + b36.f.g(7, 8, linkedList);
            java.lang.String str10 = this.f35682n;
            if (str10 != null && zArr[8]) {
                g17 += b36.f.j(8, str10);
            }
            return zArr[9] ? g17 + b36.f.h(9, this.f35683o) : g17;
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
                this.f35675d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f35676e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f35677f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35678g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f35679h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f35680i = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.zr0 zr0Var = new bw5.zr0();
                    if (bArr != null && bArr.length > 0) {
                        zr0Var.parseFrom(bArr);
                    }
                    linkedList.add(zr0Var);
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f35682n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f35683o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
