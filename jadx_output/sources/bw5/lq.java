package bw5;

/* loaded from: classes2.dex */
public class lq extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f29906d;

    /* renamed from: e, reason: collision with root package name */
    public float f29907e;

    /* renamed from: f, reason: collision with root package name */
    public float f29908f;

    /* renamed from: g, reason: collision with root package name */
    public float f29909g;

    /* renamed from: h, reason: collision with root package name */
    public float f29910h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f29911i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f29912m;

    /* renamed from: n, reason: collision with root package name */
    public float f29913n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f29914o = new boolean[9];

    static {
        new bw5.lq();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lq parseFrom(byte[] bArr) {
        return (bw5.lq) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lq)) {
            return false;
        }
        bw5.lq lqVar = (bw5.lq) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f29906d), java.lang.Float.valueOf(lqVar.f29906d)) && n51.f.a(java.lang.Float.valueOf(this.f29907e), java.lang.Float.valueOf(lqVar.f29907e)) && n51.f.a(java.lang.Float.valueOf(this.f29908f), java.lang.Float.valueOf(lqVar.f29908f)) && n51.f.a(java.lang.Float.valueOf(this.f29909g), java.lang.Float.valueOf(lqVar.f29909g)) && n51.f.a(java.lang.Float.valueOf(this.f29910h), java.lang.Float.valueOf(lqVar.f29910h)) && n51.f.a(java.lang.Boolean.valueOf(this.f29911i), java.lang.Boolean.valueOf(lqVar.f29911i)) && n51.f.a(java.lang.Boolean.valueOf(this.f29912m), java.lang.Boolean.valueOf(lqVar.f29912m)) && n51.f.a(java.lang.Float.valueOf(this.f29913n), java.lang.Float.valueOf(lqVar.f29913n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.lq();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29914o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f29906d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f29907e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f29908f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f29909g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f29910h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f29911i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f29912m);
            }
            if (zArr[8]) {
                fVar.d(8, this.f29913n);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f29906d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f29907e);
            }
            if (zArr[3]) {
                d17 += b36.f.d(3, this.f29908f);
            }
            if (zArr[4]) {
                d17 += b36.f.d(4, this.f29909g);
            }
            if (zArr[5]) {
                d17 += b36.f.d(5, this.f29910h);
            }
            if (zArr[6]) {
                d17 += b36.f.a(6, this.f29911i);
            }
            if (zArr[7]) {
                d17 += b36.f.a(7, this.f29912m);
            }
            return zArr[8] ? d17 + b36.f.d(8, this.f29913n) : d17;
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
                this.f29906d = aVar2.f(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29907e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29908f = aVar2.f(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29909g = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f29910h = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f29911i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f29912m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f29913n = aVar2.f(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
