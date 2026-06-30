package bw5;

/* loaded from: classes2.dex */
public class tr0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f33587d;

    /* renamed from: e, reason: collision with root package name */
    public int f33588e;

    /* renamed from: f, reason: collision with root package name */
    public long f33589f;

    /* renamed from: g, reason: collision with root package name */
    public long f33590g;

    /* renamed from: h, reason: collision with root package name */
    public long f33591h;

    /* renamed from: i, reason: collision with root package name */
    public long f33592i;

    /* renamed from: m, reason: collision with root package name */
    public long f33593m;

    /* renamed from: n, reason: collision with root package name */
    public long f33594n;

    /* renamed from: o, reason: collision with root package name */
    public long f33595o;

    /* renamed from: p, reason: collision with root package name */
    public long f33596p;

    /* renamed from: q, reason: collision with root package name */
    public int f33597q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f33598r = new boolean[12];

    static {
        new bw5.tr0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tr0 parseFrom(byte[] bArr) {
        return (bw5.tr0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tr0)) {
            return false;
        }
        bw5.tr0 tr0Var = (bw5.tr0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f33587d), java.lang.Integer.valueOf(tr0Var.f33587d)) && n51.f.a(java.lang.Integer.valueOf(this.f33588e), java.lang.Integer.valueOf(tr0Var.f33588e)) && n51.f.a(java.lang.Long.valueOf(this.f33589f), java.lang.Long.valueOf(tr0Var.f33589f)) && n51.f.a(java.lang.Long.valueOf(this.f33590g), java.lang.Long.valueOf(tr0Var.f33590g)) && n51.f.a(java.lang.Long.valueOf(this.f33591h), java.lang.Long.valueOf(tr0Var.f33591h)) && n51.f.a(java.lang.Long.valueOf(this.f33592i), java.lang.Long.valueOf(tr0Var.f33592i)) && n51.f.a(java.lang.Long.valueOf(this.f33593m), java.lang.Long.valueOf(tr0Var.f33593m)) && n51.f.a(java.lang.Long.valueOf(this.f33594n), java.lang.Long.valueOf(tr0Var.f33594n)) && n51.f.a(java.lang.Long.valueOf(this.f33595o), java.lang.Long.valueOf(tr0Var.f33595o)) && n51.f.a(java.lang.Long.valueOf(this.f33596p), java.lang.Long.valueOf(tr0Var.f33596p)) && n51.f.a(java.lang.Integer.valueOf(this.f33597q), java.lang.Integer.valueOf(tr0Var.f33597q));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.tr0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33598r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f33587d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f33588e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f33589f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f33590g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f33591h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f33592i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f33593m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f33594n);
            }
            if (zArr[9]) {
                fVar.h(9, this.f33595o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f33596p);
            }
            if (!zArr[11]) {
                return 0;
            }
            fVar.e(11, this.f33597q);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f33587d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f33588e);
            }
            if (zArr[3]) {
                e17 += b36.f.h(3, this.f33589f);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f33590g);
            }
            if (zArr[5]) {
                e17 += b36.f.h(5, this.f33591h);
            }
            if (zArr[6]) {
                e17 += b36.f.h(6, this.f33592i);
            }
            if (zArr[7]) {
                e17 += b36.f.h(7, this.f33593m);
            }
            if (zArr[8]) {
                e17 += b36.f.h(8, this.f33594n);
            }
            if (zArr[9]) {
                e17 += b36.f.h(9, this.f33595o);
            }
            if (zArr[10]) {
                e17 += b36.f.h(10, this.f33596p);
            }
            return zArr[11] ? e17 + b36.f.e(11, this.f33597q) : e17;
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
                this.f33587d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33588e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33589f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33590g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33591h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33592i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33593m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f33594n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f33595o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f33596p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f33597q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
