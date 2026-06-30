package bw5;

/* loaded from: classes2.dex */
public class pk extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f31702d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f31703e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f31704f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f31705g;

    /* renamed from: h, reason: collision with root package name */
    public int f31706h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f31707i = new boolean[6];

    static {
        new bw5.pk();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pk parseFrom(byte[] bArr) {
        return (bw5.pk) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pk)) {
            return false;
        }
        bw5.pk pkVar = (bw5.pk) fVar;
        return n51.f.a(this.f31702d, pkVar.f31702d) && n51.f.a(this.f31703e, pkVar.f31703e) && n51.f.a(this.f31704f, pkVar.f31704f) && n51.f.a(java.lang.Boolean.valueOf(this.f31705g), java.lang.Boolean.valueOf(pkVar.f31705g)) && n51.f.a(java.lang.Integer.valueOf(this.f31706h), java.lang.Integer.valueOf(pkVar.f31706h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.pk();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f31707i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f31702d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f31703e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f31704f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.a(4, this.f31705g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f31706h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f31702d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f31703e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f31704f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f31705g);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f31706h) : i18;
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
            this.f31702d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f31703e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f31704f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f31705g = aVar2.c(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f31706h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
