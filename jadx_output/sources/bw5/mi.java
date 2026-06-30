package bw5;

/* loaded from: classes2.dex */
public class mi extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30245d;

    /* renamed from: e, reason: collision with root package name */
    public int f30246e;

    /* renamed from: f, reason: collision with root package name */
    public int f30247f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30248g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f30249h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f30250i = new boolean[6];

    static {
        new bw5.mi();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.mi parseFrom(byte[] bArr) {
        return (bw5.mi) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mi)) {
            return false;
        }
        bw5.mi miVar = (bw5.mi) fVar;
        return n51.f.a(this.f30245d, miVar.f30245d) && n51.f.a(java.lang.Integer.valueOf(this.f30246e), java.lang.Integer.valueOf(miVar.f30246e)) && n51.f.a(java.lang.Integer.valueOf(this.f30247f), java.lang.Integer.valueOf(miVar.f30247f)) && n51.f.a(this.f30248g, miVar.f30248g) && n51.f.a(this.f30249h, miVar.f30249h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.mi();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f30250i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30245d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f30246e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f30247f);
            }
            java.lang.String str2 = this.f30248g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f30249h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f30245d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f30246e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f30247f);
            }
            java.lang.String str5 = this.f30248g;
            if (str5 != null && zArr[4]) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f30249h;
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
            this.f30245d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f30246e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f30247f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f30248g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f30249h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
