package bw5;

/* loaded from: classes4.dex */
public class lb extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29707d;

    /* renamed from: e, reason: collision with root package name */
    public double f29708e;

    /* renamed from: f, reason: collision with root package name */
    public double f29709f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f29710g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f29711h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f29712i = new boolean[6];

    static {
        new bw5.lb();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lb parseFrom(byte[] bArr) {
        return (bw5.lb) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lb)) {
            return false;
        }
        bw5.lb lbVar = (bw5.lb) fVar;
        return n51.f.a(this.f29707d, lbVar.f29707d) && n51.f.a(java.lang.Double.valueOf(this.f29708e), java.lang.Double.valueOf(lbVar.f29708e)) && n51.f.a(java.lang.Double.valueOf(this.f29709f), java.lang.Double.valueOf(lbVar.f29709f)) && n51.f.a(this.f29710g, lbVar.f29710g) && n51.f.a(this.f29711h, lbVar.f29711h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.lb();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f29712i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29707d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.c(2, this.f29708e);
            }
            if (zArr[3]) {
                fVar.c(3, this.f29709f);
            }
            java.lang.String str2 = this.f29710g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f29711h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f29707d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            if (zArr[2]) {
                i18 += b36.f.c(2, this.f29708e);
            }
            if (zArr[3]) {
                i18 += b36.f.c(3, this.f29709f);
            }
            java.lang.String str5 = this.f29710g;
            if (str5 != null && zArr[4]) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f29711h;
            return (str6 == null || !zArr[5]) ? i18 : i18 + b36.f.j(5, str6);
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
            this.f29707d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f29708e = aVar2.e(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f29709f = aVar2.e(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f29710g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f29711h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
