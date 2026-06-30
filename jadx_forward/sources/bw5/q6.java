package bw5;

/* loaded from: classes9.dex */
public class q6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.p6 f113505d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113506e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.o6 f113507f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f113508g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f113509h = new boolean[5];

    static {
        new bw5.q6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.q6 mo11468x92b714fd(byte[] bArr) {
        return (bw5.q6) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q6)) {
            return false;
        }
        bw5.q6 q6Var = (bw5.q6) fVar;
        return n51.f.a(this.f113505d, q6Var.f113505d) && n51.f.a(this.f113506e, q6Var.f113506e) && n51.f.a(this.f113507f, q6Var.f113507f) && n51.f.a(this.f113508g, q6Var.f113508g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.q6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f113509h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.p6 p6Var = this.f113505d;
            if (p6Var != null && zArr[1]) {
                fVar.e(1, p6Var.f113009d);
            }
            java.lang.String str = this.f113506e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            bw5.o6 o6Var = this.f113507f;
            if (o6Var != null && zArr[3]) {
                fVar.e(3, o6Var.f112521d);
            }
            java.lang.String str2 = this.f113508g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.p6 p6Var2 = this.f113505d;
            if (p6Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, p6Var2.f113009d);
            }
            java.lang.String str3 = this.f113506e;
            if (str3 != null && zArr[2]) {
                i18 += b36.f.j(2, str3);
            }
            bw5.o6 o6Var2 = this.f113507f;
            if (o6Var2 != null && zArr[3]) {
                i18 += b36.f.e(3, o6Var2.f112521d);
            }
            java.lang.String str4 = this.f113508g;
            return (str4 == null || !zArr[4]) ? i18 : i18 + b36.f.j(4, str4);
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
        bw5.p6 p6Var3 = null;
        bw5.o6 o6Var3 = null;
        if (intValue == 1) {
            int g17 = aVar2.g(intValue);
            if (g17 == 0) {
                p6Var3 = bw5.p6.EcsDecryptWordRespRet_Failed;
            } else if (g17 == 1) {
                p6Var3 = bw5.p6.EcsDecryptWordRespRet_Success;
            }
            this.f113505d = p6Var3;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f113506e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f113508g = aVar2.k(intValue);
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
        this.f113507f = o6Var3;
        zArr[3] = true;
        return 0;
    }
}
