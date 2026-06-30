package bw5;

/* loaded from: classes2.dex */
public class ly extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f30003d;

    /* renamed from: e, reason: collision with root package name */
    public int f30004e;

    /* renamed from: f, reason: collision with root package name */
    public int f30005f;

    /* renamed from: g, reason: collision with root package name */
    public int f30006g;

    /* renamed from: h, reason: collision with root package name */
    public int f30007h;

    /* renamed from: i, reason: collision with root package name */
    public int f30008i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f30009m = new boolean[7];

    static {
        new bw5.ly();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ly parseFrom(byte[] bArr) {
        return (bw5.ly) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ly)) {
            return false;
        }
        bw5.ly lyVar = (bw5.ly) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f30003d), java.lang.Integer.valueOf(lyVar.f30003d)) && n51.f.a(java.lang.Integer.valueOf(this.f30004e), java.lang.Integer.valueOf(lyVar.f30004e)) && n51.f.a(java.lang.Integer.valueOf(this.f30005f), java.lang.Integer.valueOf(lyVar.f30005f)) && n51.f.a(java.lang.Integer.valueOf(this.f30006g), java.lang.Integer.valueOf(lyVar.f30006g)) && n51.f.a(java.lang.Integer.valueOf(this.f30007h), java.lang.Integer.valueOf(lyVar.f30007h)) && n51.f.a(java.lang.Integer.valueOf(this.f30008i), java.lang.Integer.valueOf(lyVar.f30008i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ly();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30009m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f30003d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f30004e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f30005f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f30006g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f30007h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f30008i);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f30003d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f30004e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f30005f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f30006g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f30007h);
            }
            return zArr[6] ? e17 + b36.f.e(6, this.f30008i) : e17;
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
                this.f30003d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30004e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30005f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30006g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30007h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30008i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
