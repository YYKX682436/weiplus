package bw5;

/* loaded from: classes2.dex */
public class xp extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35216d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f35218f;

    /* renamed from: g, reason: collision with root package name */
    public int f35219g;

    /* renamed from: h, reason: collision with root package name */
    public long f35220h;

    /* renamed from: i, reason: collision with root package name */
    public int f35221i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f35222m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f35223n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.pi0 f35224o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f35225p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f35226q;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f35217e = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f35227r = new boolean[12];

    static {
        new bw5.xp();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.xp parseFrom(byte[] bArr) {
        return (bw5.xp) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xp)) {
            return false;
        }
        bw5.xp xpVar = (bw5.xp) fVar;
        return n51.f.a(this.f35216d, xpVar.f35216d) && n51.f.a(this.f35217e, xpVar.f35217e) && n51.f.a(this.f35218f, xpVar.f35218f) && n51.f.a(java.lang.Integer.valueOf(this.f35219g), java.lang.Integer.valueOf(xpVar.f35219g)) && n51.f.a(java.lang.Long.valueOf(this.f35220h), java.lang.Long.valueOf(xpVar.f35220h)) && n51.f.a(java.lang.Integer.valueOf(this.f35221i), java.lang.Integer.valueOf(xpVar.f35221i)) && n51.f.a(this.f35222m, xpVar.f35222m) && n51.f.a(this.f35223n, xpVar.f35223n) && n51.f.a(this.f35224o, xpVar.f35224o) && n51.f.a(this.f35225p, xpVar.f35225p) && n51.f.a(java.lang.Boolean.valueOf(this.f35226q), java.lang.Boolean.valueOf(xpVar.f35226q));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.xp();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f35217e;
        boolean[] zArr = this.f35227r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35216d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str2 = this.f35218f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f35219g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f35220h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f35221i);
            }
            java.lang.String str3 = this.f35222m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f35223n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            bw5.pi0 pi0Var = this.f35224o;
            if (pi0Var != null && zArr[9]) {
                fVar.i(9, pi0Var.computeSize());
                this.f35224o.writeFields(fVar);
            }
            java.lang.String str5 = this.f35225p;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            if (!zArr[11]) {
                return 0;
            }
            fVar.a(11, this.f35226q);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f35216d;
            int j17 = ((str6 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str6)) + b36.f.g(2, 8, linkedList);
            java.lang.String str7 = this.f35218f;
            if (str7 != null && zArr[3]) {
                j17 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                j17 += b36.f.e(4, this.f35219g);
            }
            if (zArr[5]) {
                j17 += b36.f.h(5, this.f35220h);
            }
            if (zArr[6]) {
                j17 += b36.f.e(6, this.f35221i);
            }
            java.lang.String str8 = this.f35222m;
            if (str8 != null && zArr[7]) {
                j17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f35223n;
            if (str9 != null && zArr[8]) {
                j17 += b36.f.j(8, str9);
            }
            bw5.pi0 pi0Var2 = this.f35224o;
            if (pi0Var2 != null && zArr[9]) {
                j17 += b36.f.i(9, pi0Var2.computeSize());
            }
            java.lang.String str10 = this.f35225p;
            if (str10 != null && zArr[10]) {
                j17 += b36.f.j(10, str10);
            }
            return zArr[11] ? j17 + b36.f.a(11, this.f35226q) : j17;
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
                this.f35216d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.yr yrVar = new bw5.yr();
                    if (bArr != null && bArr.length > 0) {
                        yrVar.parseFrom(bArr);
                    }
                    linkedList.add(yrVar);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f35218f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35219g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f35220h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f35221i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f35222m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f35223n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    bw5.pi0 pi0Var3 = new bw5.pi0();
                    if (bArr2 != null && bArr2.length > 0) {
                        pi0Var3.parseFrom(bArr2);
                    }
                    this.f35224o = pi0Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f35225p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f35226q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
