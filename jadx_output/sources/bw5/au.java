package bw5;

/* loaded from: classes10.dex */
public class au extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25434d;

    /* renamed from: e, reason: collision with root package name */
    public int f25435e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25436f;

    /* renamed from: g, reason: collision with root package name */
    public int f25437g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f25438h = new boolean[5];

    static {
        new bw5.au();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.au parseFrom(byte[] bArr) {
        return (bw5.au) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.au)) {
            return false;
        }
        bw5.au auVar = (bw5.au) fVar;
        return n51.f.a(this.f25434d, auVar.f25434d) && n51.f.a(java.lang.Integer.valueOf(this.f25435e), java.lang.Integer.valueOf(auVar.f25435e)) && n51.f.a(this.f25436f, auVar.f25436f) && n51.f.a(java.lang.Integer.valueOf(this.f25437g), java.lang.Integer.valueOf(auVar.f25437g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.au();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f25438h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25434d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f25435e);
            }
            java.lang.String str2 = this.f25436f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f25437g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f25434d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f25435e);
            }
            java.lang.String str4 = this.f25436f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f25437g) : i18;
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
            this.f25434d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25435e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f25436f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f25437g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }
}
