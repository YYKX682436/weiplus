package bw5;

/* loaded from: classes2.dex */
public class mh extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30234d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30235e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30236f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.ls0 f30237g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f30238h = new boolean[5];

    static {
        new bw5.mh();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.mh parseFrom(byte[] bArr) {
        return (bw5.mh) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mh)) {
            return false;
        }
        bw5.mh mhVar = (bw5.mh) fVar;
        return n51.f.a(this.f30234d, mhVar.f30234d) && n51.f.a(this.f30235e, mhVar.f30235e) && n51.f.a(this.f30236f, mhVar.f30236f) && n51.f.a(this.f30237g, mhVar.f30237g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.mh();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f30238h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30234d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f30235e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f30236f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            bw5.ls0 ls0Var = this.f30237g;
            if (ls0Var != null && zArr[4]) {
                fVar.e(4, ls0Var.f29956d);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f30234d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f30235e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f30236f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            bw5.ls0 ls0Var2 = this.f30237g;
            return (ls0Var2 == null || !zArr[4]) ? i18 : i18 + b36.f.e(4, ls0Var2.f29956d);
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
            this.f30234d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f30235e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f30236f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        int g17 = aVar2.g(intValue);
        this.f30237g = g17 != 1 ? g17 != 2 ? null : bw5.ls0.emFinderBannerStyleType_Remind : bw5.ls0.emFinderBannerStyleType_Warning;
        zArr[4] = true;
        return 0;
    }
}
