package bw5;

/* loaded from: classes7.dex */
public class wm0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: m, reason: collision with root package name */
    public static final bw5.wm0 f116317m = new bw5.wm0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f116318d;

    /* renamed from: e, reason: collision with root package name */
    public int f116319e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f116320f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.js0 f116321g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f116322h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f116323i = new boolean[6];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wm0)) {
            return false;
        }
        bw5.wm0 wm0Var = (bw5.wm0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f116318d), java.lang.Boolean.valueOf(wm0Var.f116318d)) && n51.f.a(java.lang.Integer.valueOf(this.f116319e), java.lang.Integer.valueOf(wm0Var.f116319e)) && n51.f.a(this.f116320f, wm0Var.f116320f) && n51.f.a(this.f116321g, wm0Var.f116321g) && n51.f.a(java.lang.Boolean.valueOf(this.f116322h), java.lang.Boolean.valueOf(wm0Var.f116322h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.wm0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116323i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f116318d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f116319e);
            }
            java.lang.String str = this.f116320f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            bw5.js0 js0Var = this.f116321g;
            if (js0Var != null && zArr[4]) {
                fVar.e(4, js0Var.f110668d);
            }
            if (zArr[5]) {
                fVar.a(5, this.f116322h);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f116318d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f116319e);
            }
            java.lang.String str2 = this.f116320f;
            if (str2 != null && zArr[3]) {
                a17 += b36.f.j(3, str2);
            }
            bw5.js0 js0Var2 = this.f116321g;
            if (js0Var2 != null && zArr[4]) {
                a17 += b36.f.e(4, js0Var2.f110668d);
            }
            return zArr[5] ? a17 + b36.f.a(5, this.f116322h) : a17;
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
        if (intValue == 1) {
            this.f116318d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f116319e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f116320f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            int g17 = aVar2.g(intValue);
            this.f116321g = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.js0.StatusXml_InteractionDelete : bw5.js0.StatusXml_InteractionUpdate : bw5.js0.StatusXml_InteractionNone;
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f116322h = aVar2.c(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.wm0) super.mo11468x92b714fd(bArr);
    }
}
