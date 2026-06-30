package bw5;

/* loaded from: classes2.dex */
public class m80 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30110d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30111e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30112f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30113g;

    /* renamed from: h, reason: collision with root package name */
    public int f30114h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f30115i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f30116m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.lb0 f30117n;

    /* renamed from: o, reason: collision with root package name */
    public long f30118o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.xa0 f30119p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f30120q;

    /* renamed from: r, reason: collision with root package name */
    public int f30121r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f30122s = new boolean[13];

    static {
        new bw5.m80();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.m80 parseFrom(byte[] bArr) {
        return (bw5.m80) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.m80)) {
            return false;
        }
        bw5.m80 m80Var = (bw5.m80) fVar;
        return n51.f.a(this.f30110d, m80Var.f30110d) && n51.f.a(this.f30111e, m80Var.f30111e) && n51.f.a(this.f30112f, m80Var.f30112f) && n51.f.a(this.f30113g, m80Var.f30113g) && n51.f.a(java.lang.Integer.valueOf(this.f30114h), java.lang.Integer.valueOf(m80Var.f30114h)) && n51.f.a(this.f30115i, m80Var.f30115i) && n51.f.a(this.f30116m, m80Var.f30116m) && n51.f.a(this.f30117n, m80Var.f30117n) && n51.f.a(java.lang.Long.valueOf(this.f30118o), java.lang.Long.valueOf(m80Var.f30118o)) && n51.f.a(this.f30119p, m80Var.f30119p) && n51.f.a(this.f30120q, m80Var.f30120q) && n51.f.a(java.lang.Integer.valueOf(this.f30121r), java.lang.Integer.valueOf(m80Var.f30121r));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.m80();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30122s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30110d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f30111e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f30112f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f30113g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.e(5, this.f30114h);
            }
            java.lang.String str5 = this.f30115i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f30116m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            bw5.lb0 lb0Var = this.f30117n;
            if (lb0Var != null && zArr[8]) {
                fVar.i(8, lb0Var.computeSize());
                this.f30117n.writeFields(fVar);
            }
            if (zArr[9]) {
                fVar.h(9, this.f30118o);
            }
            bw5.xa0 xa0Var = this.f30119p;
            if (xa0Var != null && zArr[10]) {
                fVar.i(10, xa0Var.computeSize());
                this.f30119p.writeFields(fVar);
            }
            java.lang.String str7 = this.f30120q;
            if (str7 != null && zArr[11]) {
                fVar.j(11, str7);
            }
            if (!zArr[12]) {
                return 0;
            }
            fVar.e(12, this.f30121r);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f30110d;
            int j17 = (str8 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str8);
            java.lang.String str9 = this.f30111e;
            if (str9 != null && zArr[2]) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f30112f;
            if (str10 != null && zArr[3]) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f30113g;
            if (str11 != null && zArr[4]) {
                j17 += b36.f.j(4, str11);
            }
            if (zArr[5]) {
                j17 += b36.f.e(5, this.f30114h);
            }
            java.lang.String str12 = this.f30115i;
            if (str12 != null && zArr[6]) {
                j17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f30116m;
            if (str13 != null && zArr[7]) {
                j17 += b36.f.j(7, str13);
            }
            bw5.lb0 lb0Var2 = this.f30117n;
            if (lb0Var2 != null && zArr[8]) {
                j17 += b36.f.i(8, lb0Var2.computeSize());
            }
            if (zArr[9]) {
                j17 += b36.f.h(9, this.f30118o);
            }
            bw5.xa0 xa0Var2 = this.f30119p;
            if (xa0Var2 != null && zArr[10]) {
                j17 += b36.f.i(10, xa0Var2.computeSize());
            }
            java.lang.String str14 = this.f30120q;
            if (str14 != null && zArr[11]) {
                j17 += b36.f.j(11, str14);
            }
            return zArr[12] ? j17 + b36.f.e(12, this.f30121r) : j17;
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
                this.f30110d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30111e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30112f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30113g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30114h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30115i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30116m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.lb0 lb0Var3 = new bw5.lb0();
                    if (bArr != null && bArr.length > 0) {
                        lb0Var3.parseFrom(bArr);
                    }
                    this.f30117n = lb0Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f30118o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    bw5.xa0 xa0Var3 = new bw5.xa0();
                    if (bArr2 != null && bArr2.length > 0) {
                        xa0Var3.parseFrom(bArr2);
                    }
                    this.f30119p = xa0Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f30120q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f30121r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
