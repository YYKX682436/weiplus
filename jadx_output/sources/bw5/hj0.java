package bw5;

/* loaded from: classes2.dex */
public class hj0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f28238d;

    /* renamed from: e, reason: collision with root package name */
    public int f28239e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.v f28240f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.ya f28241g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.g3 f28242h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f28243i;

    /* renamed from: m, reason: collision with root package name */
    public int f28244m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f28245n;

    /* renamed from: o, reason: collision with root package name */
    public int f28246o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f28247p;

    /* renamed from: q, reason: collision with root package name */
    public int f28248q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f28249r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f28250s = new boolean[13];

    static {
        new bw5.hj0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hj0 parseFrom(byte[] bArr) {
        return (bw5.hj0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hj0)) {
            return false;
        }
        bw5.hj0 hj0Var = (bw5.hj0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f28238d), java.lang.Integer.valueOf(hj0Var.f28238d)) && n51.f.a(java.lang.Integer.valueOf(this.f28239e), java.lang.Integer.valueOf(hj0Var.f28239e)) && n51.f.a(this.f28240f, hj0Var.f28240f) && n51.f.a(this.f28241g, hj0Var.f28241g) && n51.f.a(this.f28242h, hj0Var.f28242h) && n51.f.a(java.lang.Boolean.valueOf(this.f28243i), java.lang.Boolean.valueOf(hj0Var.f28243i)) && n51.f.a(java.lang.Integer.valueOf(this.f28244m), java.lang.Integer.valueOf(hj0Var.f28244m)) && n51.f.a(java.lang.Boolean.valueOf(this.f28245n), java.lang.Boolean.valueOf(hj0Var.f28245n)) && n51.f.a(java.lang.Integer.valueOf(this.f28246o), java.lang.Integer.valueOf(hj0Var.f28246o)) && n51.f.a(java.lang.Boolean.valueOf(this.f28247p), java.lang.Boolean.valueOf(hj0Var.f28247p)) && n51.f.a(java.lang.Integer.valueOf(this.f28248q), java.lang.Integer.valueOf(hj0Var.f28248q)) && n51.f.a(this.f28249r, hj0Var.f28249r);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.hj0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28250s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f28238d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f28239e);
            }
            bw5.v vVar = this.f28240f;
            if (vVar != null && zArr[3]) {
                fVar.i(3, vVar.computeSize());
                this.f28240f.writeFields(fVar);
            }
            bw5.ya yaVar = this.f28241g;
            if (yaVar != null && zArr[4]) {
                fVar.i(4, yaVar.computeSize());
                this.f28241g.writeFields(fVar);
            }
            bw5.g3 g3Var = this.f28242h;
            if (g3Var != null && zArr[5]) {
                fVar.i(5, g3Var.computeSize());
                this.f28242h.writeFields(fVar);
            }
            if (zArr[6]) {
                fVar.a(6, this.f28243i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f28244m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f28245n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f28246o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f28247p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f28248q);
            }
            java.lang.String str = this.f28249r;
            if (str == null || !zArr[12]) {
                return 0;
            }
            fVar.j(12, str);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f28238d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f28239e);
            }
            bw5.v vVar2 = this.f28240f;
            if (vVar2 != null && zArr[3]) {
                e17 += b36.f.i(3, vVar2.computeSize());
            }
            bw5.ya yaVar2 = this.f28241g;
            if (yaVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, yaVar2.computeSize());
            }
            bw5.g3 g3Var2 = this.f28242h;
            if (g3Var2 != null && zArr[5]) {
                e17 += b36.f.i(5, g3Var2.computeSize());
            }
            if (zArr[6]) {
                e17 += b36.f.a(6, this.f28243i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f28244m);
            }
            if (zArr[8]) {
                e17 += b36.f.a(8, this.f28245n);
            }
            if (zArr[9]) {
                e17 += b36.f.e(9, this.f28246o);
            }
            if (zArr[10]) {
                e17 += b36.f.a(10, this.f28247p);
            }
            if (zArr[11]) {
                e17 += b36.f.e(11, this.f28248q);
            }
            java.lang.String str2 = this.f28249r;
            return (str2 == null || !zArr[12]) ? e17 : e17 + b36.f.j(12, str2);
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
                this.f28238d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f28239e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.v vVar3 = new bw5.v();
                    if (bArr != null && bArr.length > 0) {
                        vVar3.parseFrom(bArr);
                    }
                    this.f28240f = vVar3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.ya yaVar3 = new bw5.ya();
                    if (bArr2 != null && bArr2.length > 0) {
                        yaVar3.parseFrom(bArr2);
                    }
                    this.f28241g = yaVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.g3 g3Var3 = new bw5.g3();
                    if (bArr3 != null && bArr3.length > 0) {
                        g3Var3.parseFrom(bArr3);
                    }
                    this.f28242h = g3Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f28243i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f28244m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f28245n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f28246o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f28247p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f28248q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f28249r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
