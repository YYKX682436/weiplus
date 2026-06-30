package bw5;

/* loaded from: classes2.dex */
public class gj extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f27869d;

    /* renamed from: e, reason: collision with root package name */
    public int f27870e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27871f;

    /* renamed from: g, reason: collision with root package name */
    public long f27872g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f27873h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f27874i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f27875m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f27876n = new boolean[8];

    static {
        new bw5.gj();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gj parseFrom(byte[] bArr) {
        return (bw5.gj) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gj)) {
            return false;
        }
        bw5.gj gjVar = (bw5.gj) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f27869d), java.lang.Integer.valueOf(gjVar.f27869d)) && n51.f.a(java.lang.Integer.valueOf(this.f27870e), java.lang.Integer.valueOf(gjVar.f27870e)) && n51.f.a(this.f27871f, gjVar.f27871f) && n51.f.a(java.lang.Long.valueOf(this.f27872g), java.lang.Long.valueOf(gjVar.f27872g)) && n51.f.a(this.f27873h, gjVar.f27873h) && n51.f.a(this.f27874i, gjVar.f27874i) && n51.f.a(this.f27875m, gjVar.f27875m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gj();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f27875m;
        boolean[] zArr = this.f27876n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f27869d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27870e);
            }
            java.lang.String str = this.f27871f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.h(4, this.f27872g);
            }
            java.lang.String str2 = this.f27873h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f27874i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            fVar.g(7, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f27869d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f27870e);
            }
            java.lang.String str4 = this.f27871f;
            if (str4 != null && zArr[3]) {
                e17 += b36.f.j(3, str4);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f27872g);
            }
            java.lang.String str5 = this.f27873h;
            if (str5 != null && zArr[5]) {
                e17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f27874i;
            if (str6 != null && zArr[6]) {
                e17 += b36.f.j(6, str6);
            }
            return e17 + b36.f.g(7, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList.clear();
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
                this.f27869d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27870e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27871f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27872g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27873h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27874i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.hj hjVar = new bw5.hj();
                    if (bArr != null && bArr.length > 0) {
                        hjVar.parseFrom(bArr);
                    }
                    linkedList.add(hjVar);
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
