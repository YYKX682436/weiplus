package bw5;

/* loaded from: classes2.dex */
public class iz extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f28727d;

    /* renamed from: e, reason: collision with root package name */
    public float f28728e;

    /* renamed from: f, reason: collision with root package name */
    public float f28729f;

    /* renamed from: g, reason: collision with root package name */
    public float f28730g;

    /* renamed from: h, reason: collision with root package name */
    public float f28731h;

    /* renamed from: i, reason: collision with root package name */
    public float f28732i;

    /* renamed from: m, reason: collision with root package name */
    public float f28733m;

    /* renamed from: n, reason: collision with root package name */
    public float f28734n;

    /* renamed from: o, reason: collision with root package name */
    public float f28735o;

    /* renamed from: p, reason: collision with root package name */
    public float f28736p;

    /* renamed from: q, reason: collision with root package name */
    public float f28737q;

    /* renamed from: r, reason: collision with root package name */
    public float f28738r;

    /* renamed from: s, reason: collision with root package name */
    public float f28739s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f28740t = new boolean[14];

    static {
        new bw5.iz();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.iz parseFrom(byte[] bArr) {
        return (bw5.iz) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.iz)) {
            return false;
        }
        bw5.iz izVar = (bw5.iz) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f28727d), java.lang.Float.valueOf(izVar.f28727d)) && n51.f.a(java.lang.Float.valueOf(this.f28728e), java.lang.Float.valueOf(izVar.f28728e)) && n51.f.a(java.lang.Float.valueOf(this.f28729f), java.lang.Float.valueOf(izVar.f28729f)) && n51.f.a(java.lang.Float.valueOf(this.f28730g), java.lang.Float.valueOf(izVar.f28730g)) && n51.f.a(java.lang.Float.valueOf(this.f28731h), java.lang.Float.valueOf(izVar.f28731h)) && n51.f.a(java.lang.Float.valueOf(this.f28732i), java.lang.Float.valueOf(izVar.f28732i)) && n51.f.a(java.lang.Float.valueOf(this.f28733m), java.lang.Float.valueOf(izVar.f28733m)) && n51.f.a(java.lang.Float.valueOf(this.f28734n), java.lang.Float.valueOf(izVar.f28734n)) && n51.f.a(java.lang.Float.valueOf(this.f28735o), java.lang.Float.valueOf(izVar.f28735o)) && n51.f.a(java.lang.Float.valueOf(this.f28736p), java.lang.Float.valueOf(izVar.f28736p)) && n51.f.a(java.lang.Float.valueOf(this.f28737q), java.lang.Float.valueOf(izVar.f28737q)) && n51.f.a(java.lang.Float.valueOf(this.f28738r), java.lang.Float.valueOf(izVar.f28738r)) && n51.f.a(java.lang.Float.valueOf(this.f28739s), java.lang.Float.valueOf(izVar.f28739s));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.iz();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28740t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f28727d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f28728e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f28729f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f28730g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f28731h);
            }
            if (zArr[6]) {
                fVar.d(6, this.f28732i);
            }
            if (zArr[7]) {
                fVar.d(7, this.f28733m);
            }
            if (zArr[8]) {
                fVar.d(8, this.f28734n);
            }
            if (zArr[9]) {
                fVar.d(9, this.f28735o);
            }
            if (zArr[10]) {
                fVar.d(10, this.f28736p);
            }
            if (zArr[11]) {
                fVar.d(11, this.f28737q);
            }
            if (zArr[12]) {
                fVar.d(12, this.f28738r);
            }
            if (!zArr[13]) {
                return 0;
            }
            fVar.d(13, this.f28739s);
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f28727d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f28728e);
            }
            if (zArr[3]) {
                d17 += b36.f.d(3, this.f28729f);
            }
            if (zArr[4]) {
                d17 += b36.f.d(4, this.f28730g);
            }
            if (zArr[5]) {
                d17 += b36.f.d(5, this.f28731h);
            }
            if (zArr[6]) {
                d17 += b36.f.d(6, this.f28732i);
            }
            if (zArr[7]) {
                d17 += b36.f.d(7, this.f28733m);
            }
            if (zArr[8]) {
                d17 += b36.f.d(8, this.f28734n);
            }
            if (zArr[9]) {
                d17 += b36.f.d(9, this.f28735o);
            }
            if (zArr[10]) {
                d17 += b36.f.d(10, this.f28736p);
            }
            if (zArr[11]) {
                d17 += b36.f.d(11, this.f28737q);
            }
            if (zArr[12]) {
                d17 += b36.f.d(12, this.f28738r);
            }
            return zArr[13] ? d17 + b36.f.d(13, this.f28739s) : d17;
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
                this.f28727d = aVar2.f(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f28728e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f28729f = aVar2.f(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f28730g = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f28731h = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f28732i = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f28733m = aVar2.f(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f28734n = aVar2.f(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f28735o = aVar2.f(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f28736p = aVar2.f(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f28737q = aVar2.f(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f28738r = aVar2.f(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f28739s = aVar2.f(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
