package bw5;

/* loaded from: classes2.dex */
public class fq extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f27436d;

    /* renamed from: e, reason: collision with root package name */
    public int f27437e;

    /* renamed from: f, reason: collision with root package name */
    public long f27438f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f27439g;

    /* renamed from: h, reason: collision with root package name */
    public long f27440h;

    /* renamed from: i, reason: collision with root package name */
    public int f27441i;

    /* renamed from: m, reason: collision with root package name */
    public int f27442m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.aq f27443n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.ae f27444o;

    /* renamed from: p, reason: collision with root package name */
    public float f27445p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f27446q;

    /* renamed from: s, reason: collision with root package name */
    public int f27448s;

    /* renamed from: t, reason: collision with root package name */
    public int f27449t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.gq f27450u;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f27447r = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f27451v = new boolean[16];

    static {
        new bw5.fq();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fq parseFrom(byte[] bArr) {
        return (bw5.fq) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fq)) {
            return false;
        }
        bw5.fq fqVar = (bw5.fq) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f27436d), java.lang.Long.valueOf(fqVar.f27436d)) && n51.f.a(java.lang.Integer.valueOf(this.f27437e), java.lang.Integer.valueOf(fqVar.f27437e)) && n51.f.a(java.lang.Long.valueOf(this.f27438f), java.lang.Long.valueOf(fqVar.f27438f)) && n51.f.a(this.f27439g, fqVar.f27439g) && n51.f.a(java.lang.Long.valueOf(this.f27440h), java.lang.Long.valueOf(fqVar.f27440h)) && n51.f.a(java.lang.Integer.valueOf(this.f27441i), java.lang.Integer.valueOf(fqVar.f27441i)) && n51.f.a(java.lang.Integer.valueOf(this.f27442m), java.lang.Integer.valueOf(fqVar.f27442m)) && n51.f.a(this.f27443n, fqVar.f27443n) && n51.f.a(this.f27444o, fqVar.f27444o) && n51.f.a(java.lang.Float.valueOf(this.f27445p), java.lang.Float.valueOf(fqVar.f27445p)) && n51.f.a(this.f27446q, fqVar.f27446q) && n51.f.a(this.f27447r, fqVar.f27447r) && n51.f.a(java.lang.Integer.valueOf(this.f27448s), java.lang.Integer.valueOf(fqVar.f27448s)) && n51.f.a(java.lang.Integer.valueOf(this.f27449t), java.lang.Integer.valueOf(fqVar.f27449t)) && n51.f.a(this.f27450u, fqVar.f27450u);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fq();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f27447r;
        boolean[] zArr = this.f27451v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f27436d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27437e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f27438f);
            }
            java.lang.String str = this.f27439g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.h(5, this.f27440h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f27441i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f27442m);
            }
            bw5.aq aqVar = this.f27443n;
            if (aqVar != null && zArr[8]) {
                fVar.i(8, aqVar.computeSize());
                this.f27443n.writeFields(fVar);
            }
            bw5.ae aeVar = this.f27444o;
            if (aeVar != null && zArr[9]) {
                fVar.i(9, aeVar.computeSize());
                this.f27444o.writeFields(fVar);
            }
            if (zArr[10]) {
                fVar.d(10, this.f27445p);
            }
            java.lang.String str2 = this.f27446q;
            if (str2 != null && zArr[11]) {
                fVar.j(11, str2);
            }
            fVar.g(12, 2, linkedList);
            if (zArr[13]) {
                fVar.e(13, this.f27448s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f27449t);
            }
            bw5.gq gqVar = this.f27450u;
            if (gqVar != null && zArr[15]) {
                fVar.i(15, gqVar.computeSize());
                this.f27450u.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f27436d) + 0 : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f27437e);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f27438f);
            }
            java.lang.String str3 = this.f27439g;
            if (str3 != null && zArr[4]) {
                h17 += b36.f.j(4, str3);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f27440h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f27441i);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f27442m);
            }
            bw5.aq aqVar2 = this.f27443n;
            if (aqVar2 != null && zArr[8]) {
                h17 += b36.f.i(8, aqVar2.computeSize());
            }
            bw5.ae aeVar2 = this.f27444o;
            if (aeVar2 != null && zArr[9]) {
                h17 += b36.f.i(9, aeVar2.computeSize());
            }
            if (zArr[10]) {
                h17 += b36.f.d(10, this.f27445p);
            }
            java.lang.String str4 = this.f27446q;
            if (str4 != null && zArr[11]) {
                h17 += b36.f.j(11, str4);
            }
            int g17 = h17 + b36.f.g(12, 2, linkedList);
            if (zArr[13]) {
                g17 += b36.f.e(13, this.f27448s);
            }
            if (zArr[14]) {
                g17 += b36.f.e(14, this.f27449t);
            }
            bw5.gq gqVar2 = this.f27450u;
            return (gqVar2 == null || !zArr[15]) ? g17 : g17 + b36.f.i(15, gqVar2.computeSize());
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
                this.f27436d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27437e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27438f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27439g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27440h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27441i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27442m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.aq aqVar3 = new bw5.aq();
                    if (bArr != null && bArr.length > 0) {
                        aqVar3.parseFrom(bArr);
                    }
                    this.f27443n = aqVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.ae aeVar3 = new bw5.ae();
                    if (bArr2 != null && bArr2.length > 0) {
                        aeVar3.parseFrom(bArr2);
                    }
                    this.f27444o = aeVar3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f27445p = aVar2.f(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f27446q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[12] = true;
                return 0;
            case 13:
                this.f27448s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f27449t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.gq gqVar3 = new bw5.gq();
                    if (bArr3 != null && bArr3.length > 0) {
                        gqVar3.parseFrom(bArr3);
                    }
                    this.f27450u = gqVar3;
                }
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }
}
