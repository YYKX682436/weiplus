package bw5;

/* loaded from: classes2.dex */
public class dc extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26422d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26423e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26424f;

    /* renamed from: g, reason: collision with root package name */
    public int f26425g;

    /* renamed from: h, reason: collision with root package name */
    public long f26426h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f26427i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f26428m = new boolean[7];

    static {
        new bw5.dc();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dc parseFrom(byte[] bArr) {
        return (bw5.dc) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dc)) {
            return false;
        }
        bw5.dc dcVar = (bw5.dc) fVar;
        return n51.f.a(this.f26422d, dcVar.f26422d) && n51.f.a(this.f26423e, dcVar.f26423e) && n51.f.a(this.f26424f, dcVar.f26424f) && n51.f.a(java.lang.Integer.valueOf(this.f26425g), java.lang.Integer.valueOf(dcVar.f26425g)) && n51.f.a(java.lang.Long.valueOf(this.f26426h), java.lang.Long.valueOf(dcVar.f26426h)) && n51.f.a(this.f26427i, dcVar.f26427i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.dc();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f26428m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26422d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f26423e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f26424f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f26425g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f26426h);
            }
            java.lang.String str4 = this.f26427i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f26422d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f26423e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f26424f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f26425g);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f26426h);
            }
            java.lang.String str8 = this.f26427i;
            return (str8 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str8);
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
                this.f26422d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26423e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26424f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26425g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26426h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26427i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
