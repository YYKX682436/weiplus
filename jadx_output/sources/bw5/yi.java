package bw5;

/* loaded from: classes2.dex */
public class yi extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35508d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35509e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f35510f;

    /* renamed from: g, reason: collision with root package name */
    public int f35511g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f35512h = new boolean[5];

    static {
        new bw5.yi();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yi parseFrom(byte[] bArr) {
        return (bw5.yi) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yi)) {
            return false;
        }
        bw5.yi yiVar = (bw5.yi) fVar;
        return n51.f.a(this.f35508d, yiVar.f35508d) && n51.f.a(this.f35509e, yiVar.f35509e) && n51.f.a(this.f35510f, yiVar.f35510f) && n51.f.a(java.lang.Integer.valueOf(this.f35511g), java.lang.Integer.valueOf(yiVar.f35511g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.yi();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f35512h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35508d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f35509e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f35510f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f35511g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f35508d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f35509e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f35510f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f35511g) : i18;
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
            this.f35508d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f35509e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f35510f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f35511g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }
}
