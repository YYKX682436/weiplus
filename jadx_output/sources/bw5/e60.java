package bw5;

/* loaded from: classes2.dex */
public class e60 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f26745d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.mc0 f26746e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26747f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26748g;

    /* renamed from: h, reason: collision with root package name */
    public int f26749h;

    /* renamed from: i, reason: collision with root package name */
    public int f26750i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f26751m;

    /* renamed from: n, reason: collision with root package name */
    public int f26752n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.w50 f26753o;

    /* renamed from: p, reason: collision with root package name */
    public int f26754p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f26755q = new boolean[11];

    static {
        new bw5.e60();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.e60 parseFrom(byte[] bArr) {
        return (bw5.e60) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.e60)) {
            return false;
        }
        bw5.e60 e60Var = (bw5.e60) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f26745d), java.lang.Long.valueOf(e60Var.f26745d)) && n51.f.a(this.f26746e, e60Var.f26746e) && n51.f.a(java.lang.Boolean.valueOf(this.f26747f), java.lang.Boolean.valueOf(e60Var.f26747f)) && n51.f.a(java.lang.Boolean.valueOf(this.f26748g), java.lang.Boolean.valueOf(e60Var.f26748g)) && n51.f.a(java.lang.Integer.valueOf(this.f26749h), java.lang.Integer.valueOf(e60Var.f26749h)) && n51.f.a(java.lang.Integer.valueOf(this.f26750i), java.lang.Integer.valueOf(e60Var.f26750i)) && n51.f.a(this.f26751m, e60Var.f26751m) && n51.f.a(java.lang.Integer.valueOf(this.f26752n), java.lang.Integer.valueOf(e60Var.f26752n)) && n51.f.a(this.f26753o, e60Var.f26753o) && n51.f.a(java.lang.Integer.valueOf(this.f26754p), java.lang.Integer.valueOf(e60Var.f26754p));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.e60();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26755q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f26745d);
            }
            bw5.mc0 mc0Var = this.f26746e;
            if (mc0Var != null && zArr[2]) {
                fVar.i(2, mc0Var.computeSize());
                this.f26746e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.a(3, this.f26747f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f26748g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f26749h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f26750i);
            }
            java.lang.String str = this.f26751m;
            if (str != null && zArr[7]) {
                fVar.j(7, str);
            }
            if (zArr[8]) {
                fVar.e(8, this.f26752n);
            }
            bw5.w50 w50Var = this.f26753o;
            if (w50Var != null && zArr[9]) {
                fVar.i(9, w50Var.computeSize());
                this.f26753o.writeFields(fVar);
            }
            if (zArr[10]) {
                fVar.e(10, this.f26754p);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f26745d) : 0;
            bw5.mc0 mc0Var2 = this.f26746e;
            if (mc0Var2 != null && zArr[2]) {
                h17 += b36.f.i(2, mc0Var2.computeSize());
            }
            if (zArr[3]) {
                h17 += b36.f.a(3, this.f26747f);
            }
            if (zArr[4]) {
                h17 += b36.f.a(4, this.f26748g);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f26749h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f26750i);
            }
            java.lang.String str2 = this.f26751m;
            if (str2 != null && zArr[7]) {
                h17 += b36.f.j(7, str2);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f26752n);
            }
            bw5.w50 w50Var2 = this.f26753o;
            if (w50Var2 != null && zArr[9]) {
                h17 += b36.f.i(9, w50Var2.computeSize());
            }
            return zArr[10] ? h17 + b36.f.e(10, this.f26754p) : h17;
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
                this.f26745d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.mc0 mc0Var3 = new bw5.mc0();
                    if (bArr != null && bArr.length > 0) {
                        mc0Var3.parseFrom(bArr);
                    }
                    this.f26746e = mc0Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f26747f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26748g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26749h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26750i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26751m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f26752n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.w50 w50Var3 = new bw5.w50();
                    if (bArr2 != null && bArr2.length > 0) {
                        w50Var3.parseFrom(bArr2);
                    }
                    this.f26753o = w50Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f26754p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
