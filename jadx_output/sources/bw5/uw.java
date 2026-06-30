package bw5;

/* loaded from: classes2.dex */
public class uw extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f34061d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f34062e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f34063f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f34064g;

    /* renamed from: h, reason: collision with root package name */
    public int f34065h;

    /* renamed from: i, reason: collision with root package name */
    public int f34066i;

    /* renamed from: m, reason: collision with root package name */
    public int f34067m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f34068n = new boolean[8];

    static {
        new bw5.uw();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.uw parseFrom(byte[] bArr) {
        return (bw5.uw) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.uw)) {
            return false;
        }
        bw5.uw uwVar = (bw5.uw) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f34061d), java.lang.Boolean.valueOf(uwVar.f34061d)) && n51.f.a(java.lang.Boolean.valueOf(this.f34062e), java.lang.Boolean.valueOf(uwVar.f34062e)) && n51.f.a(java.lang.Boolean.valueOf(this.f34063f), java.lang.Boolean.valueOf(uwVar.f34063f)) && n51.f.a(java.lang.Boolean.valueOf(this.f34064g), java.lang.Boolean.valueOf(uwVar.f34064g)) && n51.f.a(java.lang.Integer.valueOf(this.f34065h), java.lang.Integer.valueOf(uwVar.f34065h)) && n51.f.a(java.lang.Integer.valueOf(this.f34066i), java.lang.Integer.valueOf(uwVar.f34066i)) && n51.f.a(java.lang.Integer.valueOf(this.f34067m), java.lang.Integer.valueOf(uwVar.f34067m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.uw();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34068n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f34061d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f34062e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f34063f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f34064g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f34065h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f34066i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f34067m);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f34061d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f34062e);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f34063f);
            }
            if (zArr[4]) {
                a17 += b36.f.a(4, this.f34064g);
            }
            if (zArr[5]) {
                a17 += b36.f.e(5, this.f34065h);
            }
            if (zArr[6]) {
                a17 += b36.f.e(6, this.f34066i);
            }
            return zArr[7] ? a17 + b36.f.e(7, this.f34067m) : a17;
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
                this.f34061d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34062e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f34063f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34064g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34065h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34066i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f34067m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
