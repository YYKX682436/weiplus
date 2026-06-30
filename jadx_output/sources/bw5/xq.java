package bw5;

/* loaded from: classes2.dex */
public class xq extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35244d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35245e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f35246f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f35247g;

    /* renamed from: h, reason: collision with root package name */
    public int f35248h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f35249i = new boolean[6];

    static {
        new bw5.xq();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.xq parseFrom(byte[] bArr) {
        return (bw5.xq) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xq)) {
            return false;
        }
        bw5.xq xqVar = (bw5.xq) fVar;
        return n51.f.a(this.f35244d, xqVar.f35244d) && n51.f.a(this.f35245e, xqVar.f35245e) && n51.f.a(this.f35246f, xqVar.f35246f) && n51.f.a(this.f35247g, xqVar.f35247g) && n51.f.a(java.lang.Integer.valueOf(this.f35248h), java.lang.Integer.valueOf(xqVar.f35248h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.xq();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f35249i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35244d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f35245e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f35246f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f35247g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.e(5, this.f35248h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f35244d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f35245e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f35246f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f35247g;
            if (str8 != null && zArr[4]) {
                i18 += b36.f.j(4, str8);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f35248h) : i18;
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
            this.f35244d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f35245e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f35246f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f35247g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f35248h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
