package bw5;

/* loaded from: classes9.dex */
public class j7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.i7 f110378d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.h7 f110379e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f110380f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f110381g = new boolean[4];

    static {
        new bw5.j7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.j7 mo11468x92b714fd(byte[] bArr) {
        return (bw5.j7) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.j7)) {
            return false;
        }
        bw5.j7 j7Var = (bw5.j7) fVar;
        return n51.f.a(this.f110378d, j7Var.f110378d) && n51.f.a(this.f110379e, j7Var.f110379e) && n51.f.a(this.f110380f, j7Var.f110380f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.j7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f110381g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.i7 i7Var = this.f110378d;
            if (i7Var != null && zArr[1]) {
                fVar.e(1, i7Var.f110021d);
            }
            bw5.h7 h7Var = this.f110379e;
            if (h7Var != null && zArr[2]) {
                fVar.e(2, h7Var.f109638d);
            }
            java.lang.String str = this.f110380f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.i7 i7Var2 = this.f110378d;
            if (i7Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, i7Var2.f110021d);
            }
            bw5.h7 h7Var2 = this.f110379e;
            if (h7Var2 != null && zArr[2]) {
                i18 += b36.f.e(2, h7Var2.f109638d);
            }
            java.lang.String str2 = this.f110380f;
            return (str2 == null || !zArr[3]) ? i18 : i18 + b36.f.j(3, str2);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
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
            this.f110378d = i7Var3;
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f110380f = aVar2.k(intValue);
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
        this.f110379e = h7Var3;
        zArr[2] = true;
        return 0;
    }
}
