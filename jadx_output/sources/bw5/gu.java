package bw5;

/* loaded from: classes2.dex */
public class gu extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f28002d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28003e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28004f;

    /* renamed from: g, reason: collision with root package name */
    public int f28005g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f28006h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f28007i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f28008m = new boolean[7];

    static {
        new bw5.gu();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gu parseFrom(byte[] bArr) {
        return (bw5.gu) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gu)) {
            return false;
        }
        bw5.gu guVar = (bw5.gu) fVar;
        return n51.f.a(this.f28002d, guVar.f28002d) && n51.f.a(this.f28003e, guVar.f28003e) && n51.f.a(this.f28004f, guVar.f28004f) && n51.f.a(java.lang.Integer.valueOf(this.f28005g), java.lang.Integer.valueOf(guVar.f28005g)) && n51.f.a(this.f28006h, guVar.f28006h) && n51.f.a(this.f28007i, guVar.f28007i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gu();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f28008m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f28002d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f28003e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f28004f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f28005g);
            }
            java.lang.String str4 = this.f28006h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f28007i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f28002d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f28003e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f28004f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f28005g);
            }
            java.lang.String str9 = this.f28006h;
            if (str9 != null && zArr[5]) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f28007i;
            return (str10 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str10);
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
                this.f28002d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f28003e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f28004f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f28005g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f28006h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f28007i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
