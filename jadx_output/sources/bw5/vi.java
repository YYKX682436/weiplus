package bw5;

/* loaded from: classes2.dex */
public class vi extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34367d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34368e;

    /* renamed from: f, reason: collision with root package name */
    public long f34369f;

    /* renamed from: g, reason: collision with root package name */
    public long f34370g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f34371h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f34372i = new boolean[6];

    static {
        new bw5.vi();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vi parseFrom(byte[] bArr) {
        return (bw5.vi) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vi)) {
            return false;
        }
        bw5.vi viVar = (bw5.vi) fVar;
        return n51.f.a(this.f34367d, viVar.f34367d) && n51.f.a(this.f34368e, viVar.f34368e) && n51.f.a(java.lang.Long.valueOf(this.f34369f), java.lang.Long.valueOf(viVar.f34369f)) && n51.f.a(java.lang.Long.valueOf(this.f34370g), java.lang.Long.valueOf(viVar.f34370g)) && n51.f.a(this.f34371h, viVar.f34371h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.vi();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f34372i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34367d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f34368e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.h(3, this.f34369f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f34370g);
            }
            java.lang.String str3 = this.f34371h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f34367d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f34368e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f34369f);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f34370g);
            }
            java.lang.String str6 = this.f34371h;
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
            this.f34367d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34368e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f34369f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f34370g = aVar2.i(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f34371h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
