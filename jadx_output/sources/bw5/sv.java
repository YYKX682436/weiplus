package bw5;

/* loaded from: classes2.dex */
public class sv extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f33141d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33142e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33143f;

    /* renamed from: g, reason: collision with root package name */
    public float f33144g;

    /* renamed from: h, reason: collision with root package name */
    public float f33145h;

    /* renamed from: i, reason: collision with root package name */
    public int f33146i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f33147m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f33148n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f33149o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f33150p = new boolean[10];

    static {
        new bw5.sv();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sv parseFrom(byte[] bArr) {
        return (bw5.sv) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sv)) {
            return false;
        }
        bw5.sv svVar = (bw5.sv) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f33141d), java.lang.Integer.valueOf(svVar.f33141d)) && n51.f.a(this.f33142e, svVar.f33142e) && n51.f.a(this.f33143f, svVar.f33143f) && n51.f.a(java.lang.Float.valueOf(this.f33144g), java.lang.Float.valueOf(svVar.f33144g)) && n51.f.a(java.lang.Float.valueOf(this.f33145h), java.lang.Float.valueOf(svVar.f33145h)) && n51.f.a(java.lang.Integer.valueOf(this.f33146i), java.lang.Integer.valueOf(svVar.f33146i)) && n51.f.a(this.f33147m, svVar.f33147m) && n51.f.a(this.f33148n, svVar.f33148n) && n51.f.a(this.f33149o, svVar.f33149o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sv();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33150p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f33141d);
            }
            java.lang.String str = this.f33142e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f33143f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.d(4, this.f33144g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f33145h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f33146i);
            }
            java.lang.String str3 = this.f33147m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f33148n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f33149o;
            if (str5 != null && zArr[9]) {
                fVar.j(9, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f33141d) : 0;
            java.lang.String str6 = this.f33142e;
            if (str6 != null && zArr[2]) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f33143f;
            if (str7 != null && zArr[3]) {
                e17 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                e17 += b36.f.d(4, this.f33144g);
            }
            if (zArr[5]) {
                e17 += b36.f.d(5, this.f33145h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f33146i);
            }
            java.lang.String str8 = this.f33147m;
            if (str8 != null && zArr[7]) {
                e17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f33148n;
            if (str9 != null && zArr[8]) {
                e17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f33149o;
            return (str10 == null || !zArr[9]) ? e17 : e17 + b36.f.j(9, str10);
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
                this.f33141d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33142e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33143f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33144g = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33145h = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33146i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33147m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f33148n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f33149o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
