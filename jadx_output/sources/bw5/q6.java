package bw5;

/* loaded from: classes9.dex */
public class q6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.p6 f31972d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f31973e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.o6 f31974f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f31975g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f31976h = new boolean[5];

    static {
        new bw5.q6();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.q6 parseFrom(byte[] bArr) {
        return (bw5.q6) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q6)) {
            return false;
        }
        bw5.q6 q6Var = (bw5.q6) fVar;
        return n51.f.a(this.f31972d, q6Var.f31972d) && n51.f.a(this.f31973e, q6Var.f31973e) && n51.f.a(this.f31974f, q6Var.f31974f) && n51.f.a(this.f31975g, q6Var.f31975g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.q6();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f31976h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.p6 p6Var = this.f31972d;
            if (p6Var != null && zArr[1]) {
                fVar.e(1, p6Var.f31476d);
            }
            java.lang.String str = this.f31973e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            bw5.o6 o6Var = this.f31974f;
            if (o6Var != null && zArr[3]) {
                fVar.e(3, o6Var.f30988d);
            }
            java.lang.String str2 = this.f31975g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.p6 p6Var2 = this.f31972d;
            if (p6Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, p6Var2.f31476d);
            }
            java.lang.String str3 = this.f31973e;
            if (str3 != null && zArr[2]) {
                i18 += b36.f.j(2, str3);
            }
            bw5.o6 o6Var2 = this.f31974f;
            if (o6Var2 != null && zArr[3]) {
                i18 += b36.f.e(3, o6Var2.f30988d);
            }
            java.lang.String str4 = this.f31975g;
            return (str4 == null || !zArr[4]) ? i18 : i18 + b36.f.j(4, str4);
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
        bw5.p6 p6Var3 = null;
        bw5.o6 o6Var3 = null;
        if (intValue == 1) {
            int g17 = aVar2.g(intValue);
            if (g17 == 0) {
                p6Var3 = bw5.p6.EcsDecryptWordRespRet_Failed;
            } else if (g17 == 1) {
                p6Var3 = bw5.p6.EcsDecryptWordRespRet_Success;
            }
            this.f31972d = p6Var3;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f31973e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f31975g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        int g18 = aVar2.g(intValue);
        if (g18 == 0) {
            o6Var3 = bw5.o6.EcsDecryptWordRespFlag_None;
        } else if (g18 == 1) {
            o6Var3 = bw5.o6.EcsDecryptWordRespFlag_IsSelf;
        } else if (g18 == 2) {
            o6Var3 = bw5.o6.EcsDecryptWordRespFlag_IsNotSelf;
        }
        this.f31974f = o6Var3;
        zArr[3] = true;
        return 0;
    }
}
