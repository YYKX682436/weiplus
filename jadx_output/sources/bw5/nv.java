package bw5;

/* loaded from: classes2.dex */
public class nv extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30828d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30829e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30830f;

    /* renamed from: g, reason: collision with root package name */
    public int f30831g;

    /* renamed from: h, reason: collision with root package name */
    public int f30832h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f30833i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f30834m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f30835n;

    /* renamed from: o, reason: collision with root package name */
    public int f30836o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.rg f30837p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.tw f30838q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.qg f30839r;

    /* renamed from: s, reason: collision with root package name */
    public int f30840s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f30841t = new boolean[14];

    static {
        new bw5.nv();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nv parseFrom(byte[] bArr) {
        return (bw5.nv) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nv)) {
            return false;
        }
        bw5.nv nvVar = (bw5.nv) fVar;
        return n51.f.a(this.f30828d, nvVar.f30828d) && n51.f.a(this.f30829e, nvVar.f30829e) && n51.f.a(this.f30830f, nvVar.f30830f) && n51.f.a(java.lang.Integer.valueOf(this.f30831g), java.lang.Integer.valueOf(nvVar.f30831g)) && n51.f.a(java.lang.Integer.valueOf(this.f30832h), java.lang.Integer.valueOf(nvVar.f30832h)) && n51.f.a(this.f30833i, nvVar.f30833i) && n51.f.a(this.f30834m, nvVar.f30834m) && n51.f.a(this.f30835n, nvVar.f30835n) && n51.f.a(java.lang.Integer.valueOf(this.f30836o), java.lang.Integer.valueOf(nvVar.f30836o)) && n51.f.a(this.f30837p, nvVar.f30837p) && n51.f.a(this.f30838q, nvVar.f30838q) && n51.f.a(this.f30839r, nvVar.f30839r) && n51.f.a(java.lang.Integer.valueOf(this.f30840s), java.lang.Integer.valueOf(nvVar.f30840s));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.nv();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30841t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30828d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f30829e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f30830f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f30831g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f30832h);
            }
            java.lang.String str4 = this.f30833i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f30834m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f30835n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            if (zArr[9]) {
                fVar.e(9, this.f30836o);
            }
            bw5.rg rgVar = this.f30837p;
            if (rgVar != null && zArr[10]) {
                fVar.i(10, rgVar.computeSize());
                this.f30837p.writeFields(fVar);
            }
            bw5.tw twVar = this.f30838q;
            if (twVar != null && zArr[11]) {
                fVar.i(11, twVar.computeSize());
                this.f30838q.writeFields(fVar);
            }
            bw5.qg qgVar = this.f30839r;
            if (qgVar != null && zArr[12]) {
                fVar.i(12, qgVar.computeSize());
                this.f30839r.writeFields(fVar);
            }
            if (!zArr[13]) {
                return 0;
            }
            fVar.e(13, this.f30840s);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f30828d;
            int j17 = (str7 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str7);
            java.lang.String str8 = this.f30829e;
            if (str8 != null && zArr[2]) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f30830f;
            if (str9 != null && zArr[3]) {
                j17 += b36.f.j(3, str9);
            }
            if (zArr[4]) {
                j17 += b36.f.e(4, this.f30831g);
            }
            if (zArr[5]) {
                j17 += b36.f.e(5, this.f30832h);
            }
            java.lang.String str10 = this.f30833i;
            if (str10 != null && zArr[6]) {
                j17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f30834m;
            if (str11 != null && zArr[7]) {
                j17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f30835n;
            if (str12 != null && zArr[8]) {
                j17 += b36.f.j(8, str12);
            }
            if (zArr[9]) {
                j17 += b36.f.e(9, this.f30836o);
            }
            bw5.rg rgVar2 = this.f30837p;
            if (rgVar2 != null && zArr[10]) {
                j17 += b36.f.i(10, rgVar2.computeSize());
            }
            bw5.tw twVar2 = this.f30838q;
            if (twVar2 != null && zArr[11]) {
                j17 += b36.f.i(11, twVar2.computeSize());
            }
            bw5.qg qgVar2 = this.f30839r;
            if (qgVar2 != null && zArr[12]) {
                j17 += b36.f.i(12, qgVar2.computeSize());
            }
            return zArr[13] ? j17 + b36.f.e(13, this.f30840s) : j17;
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
                this.f30828d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30829e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30830f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30831g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30832h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30833i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30834m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f30835n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f30836o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.rg rgVar3 = new bw5.rg();
                    if (bArr != null && bArr.length > 0) {
                        rgVar3.parseFrom(bArr);
                    }
                    this.f30837p = rgVar3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    bw5.tw twVar3 = new bw5.tw();
                    if (bArr2 != null && bArr2.length > 0) {
                        twVar3.parseFrom(bArr2);
                    }
                    this.f30838q = twVar3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    bw5.qg qgVar3 = new bw5.qg();
                    if (bArr3 != null && bArr3.length > 0) {
                        qgVar3.parseFrom(bArr3);
                    }
                    this.f30839r = qgVar3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                this.f30840s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
