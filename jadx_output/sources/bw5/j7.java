package bw5;

/* loaded from: classes9.dex */
public class j7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.i7 f28845d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.h7 f28846e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28847f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f28848g = new boolean[4];

    static {
        new bw5.j7();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.j7 parseFrom(byte[] bArr) {
        return (bw5.j7) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.j7)) {
            return false;
        }
        bw5.j7 j7Var = (bw5.j7) fVar;
        return n51.f.a(this.f28845d, j7Var.f28845d) && n51.f.a(this.f28846e, j7Var.f28846e) && n51.f.a(this.f28847f, j7Var.f28847f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.j7();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28848g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.i7 i7Var = this.f28845d;
            if (i7Var != null && zArr[1]) {
                fVar.e(1, i7Var.f28488d);
            }
            bw5.h7 h7Var = this.f28846e;
            if (h7Var != null && zArr[2]) {
                fVar.e(2, h7Var.f28105d);
            }
            java.lang.String str = this.f28847f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.i7 i7Var2 = this.f28845d;
            if (i7Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, i7Var2.f28488d);
            }
            bw5.h7 h7Var2 = this.f28846e;
            if (h7Var2 != null && zArr[2]) {
                i18 += b36.f.e(2, h7Var2.f28105d);
            }
            java.lang.String str2 = this.f28847f;
            return (str2 == null || !zArr[3]) ? i18 : i18 + b36.f.j(3, str2);
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
        bw5.i7 i7Var3 = null;
        bw5.h7 h7Var3 = null;
        if (intValue == 1) {
            int g17 = aVar2.g(intValue);
            if (g17 == 0) {
                i7Var3 = bw5.i7.EcsJsaPlatform_Unknown;
            } else if (g17 == 1) {
                i7Var3 = bw5.i7.EcsJsaPlatform_Cpp;
            } else if (g17 == 2) {
                i7Var3 = bw5.i7.EcsJsaPlatform_Native;
            } else if (g17 == 3) {
                i7Var3 = bw5.i7.EcsJsaPlatform_Flutter;
            } else if (g17 == 4) {
                i7Var3 = bw5.i7.EcsJsaPlatform_LiteApp;
            }
            this.f28845d = i7Var3;
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f28847f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        int g18 = aVar2.g(intValue);
        if (g18 == 0) {
            h7Var3 = bw5.h7.EcsJsaEnv_Unknown;
        } else if (g18 == 1) {
            h7Var3 = bw5.h7.EcsJsaEnv_WeApp;
        } else if (g18 == 2) {
            h7Var3 = bw5.h7.EcsJsaEnv_WebView;
        } else if (g18 == 4) {
            h7Var3 = bw5.h7.EcsJsaEnv_MagicBrush;
        } else if (g18 == 8) {
            h7Var3 = bw5.h7.EcsJsaEnv_LiteApp;
        } else if (g18 == 15) {
            h7Var3 = bw5.h7.EcsJsaEnv_All;
        }
        this.f28846e = h7Var3;
        zArr[2] = true;
        return 0;
    }
}
