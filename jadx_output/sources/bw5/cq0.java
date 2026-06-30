package bw5;

/* loaded from: classes9.dex */
public class cq0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f26194d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26195e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26196f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.dq0 f26197g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26198h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f26199i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f26200m = new boolean[7];

    static {
        new bw5.cq0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cq0)) {
            return false;
        }
        bw5.cq0 cq0Var = (bw5.cq0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f26194d), java.lang.Boolean.valueOf(cq0Var.f26194d)) && n51.f.a(this.f26195e, cq0Var.f26195e) && n51.f.a(java.lang.Boolean.valueOf(this.f26196f), java.lang.Boolean.valueOf(cq0Var.f26196f)) && n51.f.a(this.f26197g, cq0Var.f26197g) && n51.f.a(java.lang.Boolean.valueOf(this.f26198h), java.lang.Boolean.valueOf(cq0Var.f26198h)) && n51.f.a(java.lang.Boolean.valueOf(this.f26199i), java.lang.Boolean.valueOf(cq0Var.f26199i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.cq0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26200m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f26194d);
            }
            java.lang.String str = this.f26195e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.a(3, this.f26196f);
            }
            bw5.dq0 dq0Var = this.f26197g;
            if (dq0Var != null && zArr[4]) {
                fVar.e(4, dq0Var.f26589d);
            }
            if (zArr[5]) {
                fVar.a(5, this.f26198h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f26199i);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f26194d) : 0;
            java.lang.String str2 = this.f26195e;
            if (str2 != null && zArr[2]) {
                a17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f26196f);
            }
            bw5.dq0 dq0Var2 = this.f26197g;
            if (dq0Var2 != null && zArr[4]) {
                a17 += b36.f.e(4, dq0Var2.f26589d);
            }
            if (zArr[5]) {
                a17 += b36.f.a(5, this.f26198h);
            }
            return zArr[6] ? a17 + b36.f.a(6, this.f26199i) : a17;
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
                this.f26194d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26195e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26196f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                int g17 = aVar2.g(intValue);
                this.f26197g = g17 != 0 ? g17 != 1 ? null : bw5.dq0.FloatBallTypeAudio : bw5.dq0.FloatBallTypeMusic;
                zArr[4] = true;
                return 0;
            case 5:
                this.f26198h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26199i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.cq0) super.parseFrom(bArr);
    }
}
