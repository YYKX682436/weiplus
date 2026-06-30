package bw5;

/* loaded from: classes2.dex */
public class gf extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27827d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27828e;

    /* renamed from: f, reason: collision with root package name */
    public int f27829f;

    /* renamed from: g, reason: collision with root package name */
    public int f27830g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f27831h = new boolean[5];

    static {
        new bw5.gf();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gf parseFrom(byte[] bArr) {
        return (bw5.gf) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gf)) {
            return false;
        }
        bw5.gf gfVar = (bw5.gf) fVar;
        return n51.f.a(this.f27827d, gfVar.f27827d) && n51.f.a(this.f27828e, gfVar.f27828e) && n51.f.a(java.lang.Integer.valueOf(this.f27829f), java.lang.Integer.valueOf(gfVar.f27829f)) && n51.f.a(java.lang.Integer.valueOf(this.f27830g), java.lang.Integer.valueOf(gfVar.f27830g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gf();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f27831h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27827d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f27828e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f27829f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f27830g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f27827d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f27828e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f27829f);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f27830g) : i18;
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
            this.f27827d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f27828e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f27829f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f27830g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }
}
