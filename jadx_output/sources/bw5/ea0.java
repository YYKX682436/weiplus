package bw5;

/* loaded from: classes2.dex */
public class ea0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26805d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.da0 f26806e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26807f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f26808g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f26809h = new boolean[5];

    static {
        new bw5.ea0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ea0 parseFrom(byte[] bArr) {
        return (bw5.ea0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ea0)) {
            return false;
        }
        bw5.ea0 ea0Var = (bw5.ea0) fVar;
        return n51.f.a(this.f26805d, ea0Var.f26805d) && n51.f.a(this.f26806e, ea0Var.f26806e) && n51.f.a(this.f26807f, ea0Var.f26807f) && n51.f.a(this.f26808g, ea0Var.f26808g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ea0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        bw5.da0 da0Var;
        int i18 = 0;
        boolean[] zArr = this.f26809h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26805d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.da0 da0Var2 = this.f26806e;
            if (da0Var2 != null && zArr[2]) {
                fVar.e(2, da0Var2.f26415d);
            }
            java.lang.String str2 = this.f26807f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f26808g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f26805d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            bw5.da0 da0Var3 = this.f26806e;
            if (da0Var3 != null && zArr[2]) {
                i18 += b36.f.e(2, da0Var3.f26415d);
            }
            java.lang.String str5 = this.f26807f;
            if (str5 != null && zArr[3]) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f26808g;
            return (str6 == null || !zArr[4]) ? i18 : i18 + b36.f.j(4, str6);
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
            this.f26805d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f26807f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f26808g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        switch (aVar2.g(intValue)) {
            case 0:
                da0Var = bw5.da0.MMLISTEN_PLAY_QUALITY_UNKNOWN;
                break;
            case 1:
                da0Var = bw5.da0.MMLISTEN_PLAY_QUALITY_STANDARD;
                break;
            case 2:
                da0Var = bw5.da0.MMLISTEN_PLAY_QUALITY_HQ;
                break;
            case 3:
                da0Var = bw5.da0.MMLISTEN_PLAY_QUALITY_SQ;
                break;
            case 4:
                da0Var = bw5.da0.MMLISTEN_PLAY_QUALITY_HIRES;
                break;
            case 5:
                da0Var = bw5.da0.MMLISTEN_PLAY_QUALITY_TTS_HLS;
                break;
            case 6:
                da0Var = bw5.da0.MMLISTEN_PLAY_QUALITY_TTS_FULL;
                break;
            default:
                da0Var = null;
                break;
        }
        this.f26806e = da0Var;
        zArr[2] = true;
        return 0;
    }
}
