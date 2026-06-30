package bw5;

/* loaded from: classes2.dex */
public class np extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30767d;

    /* renamed from: e, reason: collision with root package name */
    public long f30768e;

    /* renamed from: f, reason: collision with root package name */
    public long f30769f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30770g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f30771h;

    /* renamed from: i, reason: collision with root package name */
    public long f30772i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f30773m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f30774n;

    /* renamed from: o, reason: collision with root package name */
    public int f30775o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f30776p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f30777q = new boolean[11];

    static {
        new bw5.np();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.np parseFrom(byte[] bArr) {
        return (bw5.np) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.np)) {
            return false;
        }
        bw5.np npVar = (bw5.np) fVar;
        return n51.f.a(this.f30767d, npVar.f30767d) && n51.f.a(java.lang.Long.valueOf(this.f30768e), java.lang.Long.valueOf(npVar.f30768e)) && n51.f.a(java.lang.Long.valueOf(this.f30769f), java.lang.Long.valueOf(npVar.f30769f)) && n51.f.a(this.f30770g, npVar.f30770g) && n51.f.a(this.f30771h, npVar.f30771h) && n51.f.a(java.lang.Long.valueOf(this.f30772i), java.lang.Long.valueOf(npVar.f30772i)) && n51.f.a(java.lang.Boolean.valueOf(this.f30773m), java.lang.Boolean.valueOf(npVar.f30773m)) && n51.f.a(java.lang.Boolean.valueOf(this.f30774n), java.lang.Boolean.valueOf(npVar.f30774n)) && n51.f.a(java.lang.Integer.valueOf(this.f30775o), java.lang.Integer.valueOf(npVar.f30775o)) && n51.f.a(this.f30776p, npVar.f30776p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.np();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30776p;
        boolean[] zArr = this.f30777q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30767d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f30768e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f30769f);
            }
            java.lang.String str2 = this.f30770g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f30771h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.h(6, this.f30772i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f30773m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f30774n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f30775o);
            }
            fVar.g(10, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f30767d;
            int j17 = (str4 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str4);
            if (zArr[2]) {
                j17 += b36.f.h(2, this.f30768e);
            }
            if (zArr[3]) {
                j17 += b36.f.h(3, this.f30769f);
            }
            java.lang.String str5 = this.f30770g;
            if (str5 != null && zArr[4]) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f30771h;
            if (str6 != null && zArr[5]) {
                j17 += b36.f.j(5, str6);
            }
            if (zArr[6]) {
                j17 += b36.f.h(6, this.f30772i);
            }
            if (zArr[7]) {
                j17 += b36.f.a(7, this.f30773m);
            }
            if (zArr[8]) {
                j17 += b36.f.a(8, this.f30774n);
            }
            if (zArr[9]) {
                j17 += b36.f.e(9, this.f30775o);
            }
            return j17 + b36.f.g(10, 8, linkedList);
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
                this.f30767d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30768e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30769f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30770g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30771h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30772i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30773m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f30774n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f30775o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.mp mpVar = new bw5.mp();
                    if (bArr != null && bArr.length > 0) {
                        mpVar.parseFrom(bArr);
                    }
                    linkedList.add(mpVar);
                }
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
