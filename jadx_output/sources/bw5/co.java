package bw5;

/* loaded from: classes2.dex */
public class co extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f26176d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26177e;

    /* renamed from: f, reason: collision with root package name */
    public int f26178f;

    /* renamed from: g, reason: collision with root package name */
    public long f26179g;

    /* renamed from: h, reason: collision with root package name */
    public int f26180h;

    /* renamed from: i, reason: collision with root package name */
    public int f26181i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f26182m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f26183n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f26184o = new boolean[9];

    static {
        new bw5.co();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.co parseFrom(byte[] bArr) {
        return (bw5.co) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.co)) {
            return false;
        }
        bw5.co coVar = (bw5.co) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f26176d), java.lang.Integer.valueOf(coVar.f26176d)) && n51.f.a(java.lang.Boolean.valueOf(this.f26177e), java.lang.Boolean.valueOf(coVar.f26177e)) && n51.f.a(java.lang.Integer.valueOf(this.f26178f), java.lang.Integer.valueOf(coVar.f26178f)) && n51.f.a(java.lang.Long.valueOf(this.f26179g), java.lang.Long.valueOf(coVar.f26179g)) && n51.f.a(java.lang.Integer.valueOf(this.f26180h), java.lang.Integer.valueOf(coVar.f26180h)) && n51.f.a(java.lang.Integer.valueOf(this.f26181i), java.lang.Integer.valueOf(coVar.f26181i)) && n51.f.a(this.f26182m, coVar.f26182m) && n51.f.a(this.f26183n, coVar.f26183n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.co();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26184o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f26176d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f26177e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f26178f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f26179g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f26180h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f26181i);
            }
            com.tencent.mm.protobuf.g gVar = this.f26182m;
            if (gVar != null && zArr[7]) {
                fVar.b(7, gVar);
            }
            java.lang.String str = this.f26183n;
            if (str != null && zArr[8]) {
                fVar.j(8, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f26176d) : 0;
            if (zArr[2]) {
                e17 += b36.f.a(2, this.f26177e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f26178f);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f26179g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f26180h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f26181i);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f26182m;
            if (gVar2 != null && zArr[7]) {
                e17 += b36.f.b(7, gVar2);
            }
            java.lang.String str2 = this.f26183n;
            return (str2 == null || !zArr[8]) ? e17 : e17 + b36.f.j(8, str2);
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
                this.f26176d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26177e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26178f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26179g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26180h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26181i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26182m = aVar2.d(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f26183n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
