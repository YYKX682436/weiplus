package bw5;

/* loaded from: classes2.dex */
public class zz extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f36209d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f36210e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f36211f;

    /* renamed from: g, reason: collision with root package name */
    public int f36212g;

    /* renamed from: h, reason: collision with root package name */
    public int f36213h;

    /* renamed from: i, reason: collision with root package name */
    public int f36214i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f36215m = new boolean[7];

    static {
        new bw5.zz();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zz parseFrom(byte[] bArr) {
        return (bw5.zz) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zz)) {
            return false;
        }
        bw5.zz zzVar = (bw5.zz) fVar;
        return n51.f.a(this.f36209d, zzVar.f36209d) && n51.f.a(java.lang.Boolean.valueOf(this.f36210e), java.lang.Boolean.valueOf(zzVar.f36210e)) && n51.f.a(java.lang.Boolean.valueOf(this.f36211f), java.lang.Boolean.valueOf(zzVar.f36211f)) && n51.f.a(java.lang.Integer.valueOf(this.f36212g), java.lang.Integer.valueOf(zzVar.f36212g)) && n51.f.a(java.lang.Integer.valueOf(this.f36213h), java.lang.Integer.valueOf(zzVar.f36213h)) && n51.f.a(java.lang.Integer.valueOf(this.f36214i), java.lang.Integer.valueOf(zzVar.f36214i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.zz();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f36215m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36209d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.a(2, this.f36210e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f36211f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f36212g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f36213h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f36214i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f36209d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f36210e);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f36211f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f36212g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f36213h);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f36214i) : i18;
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
                this.f36209d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f36210e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f36211f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f36212g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f36213h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f36214i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
