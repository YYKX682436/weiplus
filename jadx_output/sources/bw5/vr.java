package bw5;

/* loaded from: classes2.dex */
public class vr extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f34467d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34468e;

    /* renamed from: f, reason: collision with root package name */
    public int f34469f;

    /* renamed from: g, reason: collision with root package name */
    public int f34470g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f34471h;

    /* renamed from: i, reason: collision with root package name */
    public int f34472i;

    /* renamed from: m, reason: collision with root package name */
    public long f34473m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f34474n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f34475o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f34476p = new boolean[10];

    static {
        new bw5.vr();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vr parseFrom(byte[] bArr) {
        return (bw5.vr) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vr)) {
            return false;
        }
        bw5.vr vrVar = (bw5.vr) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f34467d), java.lang.Long.valueOf(vrVar.f34467d)) && n51.f.a(this.f34468e, vrVar.f34468e) && n51.f.a(java.lang.Integer.valueOf(this.f34469f), java.lang.Integer.valueOf(vrVar.f34469f)) && n51.f.a(java.lang.Integer.valueOf(this.f34470g), java.lang.Integer.valueOf(vrVar.f34470g)) && n51.f.a(java.lang.Boolean.valueOf(this.f34471h), java.lang.Boolean.valueOf(vrVar.f34471h)) && n51.f.a(java.lang.Integer.valueOf(this.f34472i), java.lang.Integer.valueOf(vrVar.f34472i)) && n51.f.a(java.lang.Long.valueOf(this.f34473m), java.lang.Long.valueOf(vrVar.f34473m)) && n51.f.a(java.lang.Boolean.valueOf(this.f34474n), java.lang.Boolean.valueOf(vrVar.f34474n)) && n51.f.a(this.f34475o, vrVar.f34475o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.vr();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34476p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f34467d);
            }
            java.lang.String str = this.f34468e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f34469f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f34470g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f34471h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f34472i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f34473m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f34474n);
            }
            java.lang.String str2 = this.f34475o;
            if (str2 != null && zArr[9]) {
                fVar.j(9, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f34467d) : 0;
            java.lang.String str3 = this.f34468e;
            if (str3 != null && zArr[2]) {
                h17 += b36.f.j(2, str3);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f34469f);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f34470g);
            }
            if (zArr[5]) {
                h17 += b36.f.a(5, this.f34471h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f34472i);
            }
            if (zArr[7]) {
                h17 += b36.f.h(7, this.f34473m);
            }
            if (zArr[8]) {
                h17 += b36.f.a(8, this.f34474n);
            }
            java.lang.String str4 = this.f34475o;
            return (str4 == null || !zArr[9]) ? h17 : h17 + b36.f.j(9, str4);
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
                this.f34467d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34468e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f34469f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34470g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34471h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34472i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f34473m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f34474n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f34475o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
