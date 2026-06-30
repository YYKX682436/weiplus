package bw5;

/* loaded from: classes14.dex */
public class b2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.y1 f25484d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25485e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25486f;

    /* renamed from: g, reason: collision with root package name */
    public int f25487g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25488h;

    /* renamed from: i, reason: collision with root package name */
    public int f25489i;

    /* renamed from: m, reason: collision with root package name */
    public int f25490m;

    /* renamed from: n, reason: collision with root package name */
    public int f25491n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f25492o;

    /* renamed from: p, reason: collision with root package name */
    public float f25493p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f25494q = new boolean[11];

    static {
        new bw5.b2();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.b2)) {
            return false;
        }
        bw5.b2 b2Var = (bw5.b2) fVar;
        return n51.f.a(this.f25484d, b2Var.f25484d) && n51.f.a(java.lang.Boolean.valueOf(this.f25485e), java.lang.Boolean.valueOf(b2Var.f25485e)) && n51.f.a(java.lang.Boolean.valueOf(this.f25486f), java.lang.Boolean.valueOf(b2Var.f25486f)) && n51.f.a(java.lang.Integer.valueOf(this.f25487g), java.lang.Integer.valueOf(b2Var.f25487g)) && n51.f.a(java.lang.Boolean.valueOf(this.f25488h), java.lang.Boolean.valueOf(b2Var.f25488h)) && n51.f.a(java.lang.Integer.valueOf(this.f25489i), java.lang.Integer.valueOf(b2Var.f25489i)) && n51.f.a(java.lang.Integer.valueOf(this.f25490m), java.lang.Integer.valueOf(b2Var.f25490m)) && n51.f.a(java.lang.Integer.valueOf(this.f25491n), java.lang.Integer.valueOf(b2Var.f25491n)) && n51.f.a(java.lang.Boolean.valueOf(this.f25492o), java.lang.Boolean.valueOf(b2Var.f25492o)) && n51.f.a(java.lang.Float.valueOf(this.f25493p), java.lang.Float.valueOf(b2Var.f25493p));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.b2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f25494q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.y1 y1Var = this.f25484d;
            if (y1Var != null && zArr[1]) {
                fVar.i(1, y1Var.computeSize());
                this.f25484d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.a(2, this.f25485e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f25486f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f25487g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f25488h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f25489i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f25490m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f25491n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f25492o);
            }
            if (zArr[10]) {
                fVar.d(10, this.f25493p);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.y1 y1Var2 = this.f25484d;
            if (y1Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, y1Var2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f25485e);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f25486f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f25487g);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f25488h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f25489i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f25490m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f25491n);
            }
            if (zArr[9]) {
                i18 += b36.f.a(9, this.f25492o);
            }
            return zArr[10] ? i18 + b36.f.d(10, this.f25493p) : i18;
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.y1 y1Var3 = new bw5.y1();
                    if (bArr != null && bArr.length > 0) {
                        y1Var3.parseFrom(bArr);
                    }
                    this.f25484d = y1Var3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f25485e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25486f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25487g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25488h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25489i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f25490m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f25491n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f25492o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f25493p = aVar2.f(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.b2) super.parseFrom(bArr);
    }
}
