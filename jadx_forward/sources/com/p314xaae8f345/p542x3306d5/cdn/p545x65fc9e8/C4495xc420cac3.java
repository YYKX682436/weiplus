package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.FriendsVideoProfile */
/* loaded from: classes8.dex */
public class C4495xc420cac3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3 f18822xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3();

    /* renamed from: expt_id */
    private int f18823xb1fb6063;

    /* renamed from: hasSetFields */
    private final boolean[] f18824xcb94b041 = new boolean[6];

    /* renamed from: mode */
    private int f18825x3339a3;

    /* renamed from: strategy */
    private java.lang.String f18826x6a8fa373;

    /* renamed from: use_coldrule */
    private boolean f18827xa735e798;

    /* renamed from: used_province */
    private int f18828x6c235572;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3 m38987xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3 m38988x7c90cfc0() {
        return f18822xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3 m38989x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3 m38990x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3 c4495xc420cac3 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f18825x3339a3), java.lang.Integer.valueOf(c4495xc420cac3.f18825x3339a3)) && n51.f.a(java.lang.Boolean.valueOf(this.f18827xa735e798), java.lang.Boolean.valueOf(c4495xc420cac3.f18827xa735e798)) && n51.f.a(java.lang.Integer.valueOf(this.f18828x6c235572), java.lang.Integer.valueOf(c4495xc420cac3.f18828x6c235572)) && n51.f.a(java.lang.Integer.valueOf(this.f18823xb1fb6063), java.lang.Integer.valueOf(c4495xc420cac3.f18823xb1fb6063)) && n51.f.a(this.f18826x6a8fa373, c4495xc420cac3.f18826x6a8fa373);
    }

    /* renamed from: getExptId */
    public int m38991x18404468() {
        return this.f18823xb1fb6063;
    }

    /* renamed from: getMode */
    public int m38992xfb82a219() {
        return this.f18825x3339a3;
    }

    /* renamed from: getStrategy */
    public java.lang.String m38993xe669e0e9() {
        return this.f18824xcb94b041[5] ? this.f18826x6a8fa373 : "";
    }

    /* renamed from: getUseColdrule */
    public boolean m38994x1e2d51() {
        return this.f18827xa735e798;
    }

    /* renamed from: getUsedProvince */
    public int m38995xdc930083() {
        return this.f18828x6c235572;
    }

    /* renamed from: hasExptId */
    public boolean m38996xd819c4ac() {
        return m38997x6e095e9(4);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38997x6e095e9(int i17) {
        return this.f18824xcb94b041[i17];
    }

    /* renamed from: hasMode */
    public boolean m38998x2987635d() {
        return m38997x6e095e9(1);
    }

    /* renamed from: hasStrategy */
    public boolean m38999x15e4602d() {
        return m38997x6e095e9(5);
    }

    /* renamed from: hasUseColdrule */
    public boolean m39000x203e378d() {
        return m38997x6e095e9(2);
    }

    /* renamed from: hasUsedProvince */
    public boolean m39001xc0743dc7() {
        return m38997x6e095e9(3);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3 m39002x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18824xcb94b041[1]) {
                fVar.e(1, this.f18825x3339a3);
            }
            if (this.f18824xcb94b041[2]) {
                fVar.a(2, this.f18827xa735e798);
            }
            if (this.f18824xcb94b041[3]) {
                fVar.e(3, this.f18828x6c235572);
            }
            if (this.f18824xcb94b041[4]) {
                fVar.e(4, this.f18823xb1fb6063);
            }
            java.lang.String str = this.f18826x6a8fa373;
            if (str != null && this.f18824xcb94b041[5]) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f18824xcb94b041[1] ? 0 + b36.f.e(1, this.f18825x3339a3) : 0;
            if (this.f18824xcb94b041[2]) {
                e17 += b36.f.a(2, this.f18827xa735e798);
            }
            if (this.f18824xcb94b041[3]) {
                e17 += b36.f.e(3, this.f18828x6c235572);
            }
            if (this.f18824xcb94b041[4]) {
                e17 += b36.f.e(4, this.f18823xb1fb6063);
            }
            java.lang.String str2 = this.f18826x6a8fa373;
            return (str2 == null || !this.f18824xcb94b041[5]) ? e17 : e17 + b36.f.j(5, str2);
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
            this.f18825x3339a3 = aVar2.g(intValue);
            this.f18824xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f18827xa735e798 = aVar2.c(intValue);
            this.f18824xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f18828x6c235572 = aVar2.g(intValue);
            this.f18824xcb94b041[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f18823xb1fb6063 = aVar2.g(intValue);
            this.f18824xcb94b041[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f18826x6a8fa373 = aVar2.k(intValue);
        this.f18824xcb94b041[5] = true;
        return 0;
    }

    /* renamed from: setExptId */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3 m39004xb757874(int i17) {
        this.f18823xb1fb6063 = i17;
        this.f18824xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setMode */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3 m39005x764d6925(int i17) {
        this.f18825x3339a3 = i17;
        this.f18824xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setStrategy */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3 m39006xe12241f5(java.lang.String str) {
        this.f18826x6a8fa373 = str;
        this.f18824xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setUseColdrule */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3 m39007x9683a0c5(boolean z17) {
        this.f18827xa735e798 = z17;
        this.f18824xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setUsedProvince */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3 m39008x12dbfb8f(int i17) {
        this.f18828x6c235572 = i17;
        this.f18824xcb94b041[3] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3 m39003x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3) super.mo11468x92b714fd(bArr);
    }
}
