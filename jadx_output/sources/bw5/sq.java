package bw5;

/* loaded from: classes2.dex */
public class sq extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33108d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33109e;

    /* renamed from: f, reason: collision with root package name */
    public int f33110f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33111g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f33112h = new boolean[5];

    static {
        new bw5.sq();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sq parseFrom(byte[] bArr) {
        return (bw5.sq) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sq)) {
            return false;
        }
        bw5.sq sqVar = (bw5.sq) fVar;
        return n51.f.a(this.f33108d, sqVar.f33108d) && n51.f.a(this.f33109e, sqVar.f33109e) && n51.f.a(java.lang.Integer.valueOf(this.f33110f), java.lang.Integer.valueOf(sqVar.f33110f)) && n51.f.a(this.f33111g, sqVar.f33111g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sq();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f33112h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33108d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f33109e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f33110f);
            }
            java.lang.String str3 = this.f33111g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f33108d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f33109e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f33110f);
            }
            java.lang.String str6 = this.f33111g;
            return (str6 == null || !zArr[4]) ? i18 : i18 + b36.f.j(4, str6);
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
        if (intValue == 1) {
            this.f33108d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f33109e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f33110f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f33111g = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }
}
