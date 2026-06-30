package bw5;

/* loaded from: classes2.dex */
public class v extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f34084d;

    /* renamed from: e, reason: collision with root package name */
    public int f34085e;

    /* renamed from: f, reason: collision with root package name */
    public int f34086f;

    /* renamed from: g, reason: collision with root package name */
    public int f34087g;

    /* renamed from: h, reason: collision with root package name */
    public int f34088h;

    /* renamed from: i, reason: collision with root package name */
    public int f34089i;

    /* renamed from: m, reason: collision with root package name */
    public int f34090m;

    /* renamed from: n, reason: collision with root package name */
    public long f34091n;

    /* renamed from: o, reason: collision with root package name */
    public int f34092o;

    /* renamed from: p, reason: collision with root package name */
    public int f34093p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f34094q = new boolean[11];

    static {
        new bw5.v();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.v parseFrom(byte[] bArr) {
        return (bw5.v) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.v)) {
            return false;
        }
        bw5.v vVar = (bw5.v) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f34084d), java.lang.Integer.valueOf(vVar.f34084d)) && n51.f.a(java.lang.Integer.valueOf(this.f34085e), java.lang.Integer.valueOf(vVar.f34085e)) && n51.f.a(java.lang.Integer.valueOf(this.f34086f), java.lang.Integer.valueOf(vVar.f34086f)) && n51.f.a(java.lang.Integer.valueOf(this.f34087g), java.lang.Integer.valueOf(vVar.f34087g)) && n51.f.a(java.lang.Integer.valueOf(this.f34088h), java.lang.Integer.valueOf(vVar.f34088h)) && n51.f.a(java.lang.Integer.valueOf(this.f34089i), java.lang.Integer.valueOf(vVar.f34089i)) && n51.f.a(java.lang.Integer.valueOf(this.f34090m), java.lang.Integer.valueOf(vVar.f34090m)) && n51.f.a(java.lang.Long.valueOf(this.f34091n), java.lang.Long.valueOf(vVar.f34091n)) && n51.f.a(java.lang.Integer.valueOf(this.f34092o), java.lang.Integer.valueOf(vVar.f34092o)) && n51.f.a(java.lang.Integer.valueOf(this.f34093p), java.lang.Integer.valueOf(vVar.f34093p));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.v();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34094q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f34084d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34085e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f34086f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f34087g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f34088h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f34089i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f34090m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f34091n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f34092o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f34093p);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f34084d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f34085e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f34086f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f34087g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f34088h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f34089i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f34090m);
            }
            if (zArr[8]) {
                e17 += b36.f.h(8, this.f34091n);
            }
            if (zArr[9]) {
                e17 += b36.f.e(9, this.f34092o);
            }
            return zArr[10] ? e17 + b36.f.e(10, this.f34093p) : e17;
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
                this.f34084d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34085e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f34086f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34087g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34088h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34089i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f34090m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f34091n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f34092o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f34093p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
