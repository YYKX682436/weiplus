package bw5;

/* loaded from: classes2.dex */
public class ah extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f25195d;

    /* renamed from: e, reason: collision with root package name */
    public int f25196e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25197f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f25198g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f25199h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f25200i = new boolean[6];

    static {
        new bw5.ah();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ah parseFrom(byte[] bArr) {
        return (bw5.ah) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ah)) {
            return false;
        }
        bw5.ah ahVar = (bw5.ah) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f25195d), java.lang.Integer.valueOf(ahVar.f25195d)) && n51.f.a(java.lang.Integer.valueOf(this.f25196e), java.lang.Integer.valueOf(ahVar.f25196e)) && n51.f.a(this.f25197f, ahVar.f25197f) && n51.f.a(this.f25198g, ahVar.f25198g) && n51.f.a(this.f25199h, ahVar.f25199h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ah();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25200i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f25195d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f25196e);
            }
            java.lang.String str = this.f25197f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f25198g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f25199h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f25195d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f25196e);
            }
            java.lang.String str4 = this.f25197f;
            if (str4 != null && zArr[3]) {
                e17 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f25198g;
            if (str5 != null && zArr[4]) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f25199h;
            return (str6 == null || !zArr[5]) ? e17 : e17 + b36.f.j(5, str6);
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
            this.f25195d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25196e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f25197f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f25198g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f25199h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
