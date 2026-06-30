package bw5;

/* loaded from: classes4.dex */
public class uk extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33948d;

    /* renamed from: e, reason: collision with root package name */
    public int f33949e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33950f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33951g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f33952h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f33953i = new boolean[6];

    static {
        new bw5.uk();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.uk parseFrom(byte[] bArr) {
        return (bw5.uk) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.uk)) {
            return false;
        }
        bw5.uk ukVar = (bw5.uk) fVar;
        return n51.f.a(this.f33948d, ukVar.f33948d) && n51.f.a(java.lang.Integer.valueOf(this.f33949e), java.lang.Integer.valueOf(ukVar.f33949e)) && n51.f.a(this.f33950f, ukVar.f33950f) && n51.f.a(this.f33951g, ukVar.f33951g) && n51.f.a(this.f33952h, ukVar.f33952h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.uk();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f33953i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33948d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f33949e);
            }
            java.lang.String str2 = this.f33950f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f33951g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f33952h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f33948d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f33949e);
            }
            java.lang.String str6 = this.f33950f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f33951g;
            if (str7 != null && zArr[4]) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f33952h;
            return (str8 == null || !zArr[5]) ? i18 : i18 + b36.f.j(5, str8);
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
            this.f33948d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f33949e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f33950f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f33951g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f33952h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
