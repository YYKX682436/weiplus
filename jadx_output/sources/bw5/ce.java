package bw5;

/* loaded from: classes2.dex */
public class ce extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26059d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26060e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26061f;

    /* renamed from: g, reason: collision with root package name */
    public int f26062g;

    /* renamed from: h, reason: collision with root package name */
    public int f26063h;

    /* renamed from: i, reason: collision with root package name */
    public int f26064i;

    /* renamed from: m, reason: collision with root package name */
    public int f26065m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f26066n = new boolean[8];

    static {
        new bw5.ce();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ce parseFrom(byte[] bArr) {
        return (bw5.ce) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ce)) {
            return false;
        }
        bw5.ce ceVar = (bw5.ce) fVar;
        return n51.f.a(this.f26059d, ceVar.f26059d) && n51.f.a(this.f26060e, ceVar.f26060e) && n51.f.a(this.f26061f, ceVar.f26061f) && n51.f.a(java.lang.Integer.valueOf(this.f26062g), java.lang.Integer.valueOf(ceVar.f26062g)) && n51.f.a(java.lang.Integer.valueOf(this.f26063h), java.lang.Integer.valueOf(ceVar.f26063h)) && n51.f.a(java.lang.Integer.valueOf(this.f26064i), java.lang.Integer.valueOf(ceVar.f26064i)) && n51.f.a(java.lang.Integer.valueOf(this.f26065m), java.lang.Integer.valueOf(ceVar.f26065m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ce();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f26066n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26059d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f26060e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f26061f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f26062g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f26063h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f26064i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f26065m);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f26059d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f26060e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f26061f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f26062g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f26063h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f26064i);
            }
            return zArr[7] ? i18 + b36.f.e(7, this.f26065m) : i18;
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
                this.f26059d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26060e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26061f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26062g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26063h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26064i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26065m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
