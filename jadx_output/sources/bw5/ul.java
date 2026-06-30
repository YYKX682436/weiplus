package bw5;

/* loaded from: classes2.dex */
public class ul extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f33959d;

    /* renamed from: e, reason: collision with root package name */
    public long f33960e;

    /* renamed from: f, reason: collision with root package name */
    public int f33961f;

    /* renamed from: g, reason: collision with root package name */
    public long f33962g;

    /* renamed from: h, reason: collision with root package name */
    public int f33963h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f33964i;

    /* renamed from: m, reason: collision with root package name */
    public float f33965m;

    /* renamed from: n, reason: collision with root package name */
    public int f33966n;

    /* renamed from: o, reason: collision with root package name */
    public int f33967o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f33968p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f33969q = new boolean[11];

    static {
        new bw5.ul();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ul parseFrom(byte[] bArr) {
        return (bw5.ul) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ul)) {
            return false;
        }
        bw5.ul ulVar = (bw5.ul) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f33959d), java.lang.Boolean.valueOf(ulVar.f33959d)) && n51.f.a(java.lang.Long.valueOf(this.f33960e), java.lang.Long.valueOf(ulVar.f33960e)) && n51.f.a(java.lang.Integer.valueOf(this.f33961f), java.lang.Integer.valueOf(ulVar.f33961f)) && n51.f.a(java.lang.Long.valueOf(this.f33962g), java.lang.Long.valueOf(ulVar.f33962g)) && n51.f.a(java.lang.Integer.valueOf(this.f33963h), java.lang.Integer.valueOf(ulVar.f33963h)) && n51.f.a(this.f33964i, ulVar.f33964i) && n51.f.a(java.lang.Float.valueOf(this.f33965m), java.lang.Float.valueOf(ulVar.f33965m)) && n51.f.a(java.lang.Integer.valueOf(this.f33966n), java.lang.Integer.valueOf(ulVar.f33966n)) && n51.f.a(java.lang.Integer.valueOf(this.f33967o), java.lang.Integer.valueOf(ulVar.f33967o)) && n51.f.a(this.f33968p, ulVar.f33968p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ul();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33969q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f33959d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f33960e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f33961f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f33962g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f33963h);
            }
            com.tencent.mm.protobuf.g gVar = this.f33964i;
            if (gVar != null && zArr[6]) {
                fVar.b(6, gVar);
            }
            if (zArr[7]) {
                fVar.d(7, this.f33965m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f33966n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f33967o);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f33968p;
            if (gVar2 != null && zArr[10]) {
                fVar.b(10, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f33959d) : 0;
            if (zArr[2]) {
                a17 += b36.f.h(2, this.f33960e);
            }
            if (zArr[3]) {
                a17 += b36.f.e(3, this.f33961f);
            }
            if (zArr[4]) {
                a17 += b36.f.h(4, this.f33962g);
            }
            if (zArr[5]) {
                a17 += b36.f.e(5, this.f33963h);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f33964i;
            if (gVar3 != null && zArr[6]) {
                a17 += b36.f.b(6, gVar3);
            }
            if (zArr[7]) {
                a17 += b36.f.d(7, this.f33965m);
            }
            if (zArr[8]) {
                a17 += b36.f.e(8, this.f33966n);
            }
            if (zArr[9]) {
                a17 += b36.f.e(9, this.f33967o);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f33968p;
            return (gVar4 == null || !zArr[10]) ? a17 : a17 + b36.f.b(10, gVar4);
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
                this.f33959d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33960e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33961f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33962g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33963h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33964i = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33965m = aVar2.f(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f33966n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f33967o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f33968p = aVar2.d(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
