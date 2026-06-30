package bw5;

/* loaded from: classes8.dex */
public class l8 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.m8 f29677d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29678e;

    /* renamed from: f, reason: collision with root package name */
    public long f29679f;

    /* renamed from: g, reason: collision with root package name */
    public int f29680g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f29681h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f29682i = new boolean[6];

    static {
        new bw5.l8();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.l8)) {
            return false;
        }
        bw5.l8 l8Var = (bw5.l8) fVar;
        return n51.f.a(this.f29677d, l8Var.f29677d) && n51.f.a(this.f29678e, l8Var.f29678e) && n51.f.a(java.lang.Long.valueOf(this.f29679f), java.lang.Long.valueOf(l8Var.f29679f)) && n51.f.a(java.lang.Integer.valueOf(this.f29680g), java.lang.Integer.valueOf(l8Var.f29680g)) && n51.f.a(this.f29681h, l8Var.f29681h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.l8();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f29682i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.m8 m8Var = this.f29677d;
            if (m8Var != null && zArr[1]) {
                fVar.e(1, m8Var.f30109d);
            }
            java.lang.String str = this.f29678e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f29679f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f29680g);
            }
            com.tencent.mm.protobuf.g gVar = this.f29681h;
            if (gVar != null && zArr[5]) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.m8 m8Var2 = this.f29677d;
            if (m8Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, m8Var2.f30109d);
            }
            java.lang.String str2 = this.f29678e;
            if (str2 != null && zArr[2]) {
                i18 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f29679f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f29680g);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f29681h;
            return (gVar2 == null || !zArr[5]) ? i18 : i18 + b36.f.b(5, gVar2);
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
            int g17 = aVar2.g(intValue);
            this.f29677d = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.m8.EcsOpenPreloadScene_TouchDown : bw5.m8.EcsOpenPreloadScene_Expose : bw5.m8.EcsOpenPreloadScene_Default;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f29678e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f29679f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f29680g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f29681h = aVar2.d(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.l8) super.parseFrom(bArr);
    }
}
