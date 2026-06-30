package bw5;

/* loaded from: classes2.dex */
public class ii extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f28591d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28592e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28593f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f28594g;

    /* renamed from: h, reason: collision with root package name */
    public int f28595h;

    /* renamed from: i, reason: collision with root package name */
    public int f28596i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f28597m = new boolean[7];

    static {
        new bw5.ii();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ii parseFrom(byte[] bArr) {
        return (bw5.ii) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ii)) {
            return false;
        }
        bw5.ii iiVar = (bw5.ii) fVar;
        return n51.f.a(this.f28591d, iiVar.f28591d) && n51.f.a(this.f28592e, iiVar.f28592e) && n51.f.a(this.f28593f, iiVar.f28593f) && n51.f.a(this.f28594g, iiVar.f28594g) && n51.f.a(java.lang.Integer.valueOf(this.f28595h), java.lang.Integer.valueOf(iiVar.f28595h)) && n51.f.a(java.lang.Integer.valueOf(this.f28596i), java.lang.Integer.valueOf(iiVar.f28596i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ii();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f28597m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f28591d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f28592e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f28593f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f28594g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.e(5, this.f28595h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f28596i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f28591d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f28592e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f28593f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f28594g;
            if (str8 != null && zArr[4]) {
                i18 += b36.f.j(4, str8);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f28595h);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f28596i) : i18;
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
                this.f28591d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f28592e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f28593f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f28594g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f28595h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f28596i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
