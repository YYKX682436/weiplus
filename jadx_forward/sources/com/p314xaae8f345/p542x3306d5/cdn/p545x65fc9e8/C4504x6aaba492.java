package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.InitConfig */
/* loaded from: classes2.dex */
public class C4504x6aaba492 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4504x6aaba492 f18872xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4504x6aaba492();

    /* renamed from: hasSetFields */
    private final boolean[] f18873xcb94b041 = new boolean[4];

    /* renamed from: history_savepath */
    private java.lang.String f18874xacbe526d;

    /* renamed from: is_weixin_user */
    private boolean f18875x303c4bf3;

    /* renamed from: username */
    private java.lang.String f18876xf02988d6;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4504x6aaba492 m39160xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4504x6aaba492();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4504x6aaba492 m39161x7c90cfc0() {
        return f18872xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4504x6aaba492 m39162x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4504x6aaba492();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4504x6aaba492 m39163x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4504x6aaba492)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4504x6aaba492 c4504x6aaba492 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4504x6aaba492) fVar;
        return n51.f.a(this.f18874xacbe526d, c4504x6aaba492.f18874xacbe526d) && n51.f.a(this.f18876xf02988d6, c4504x6aaba492.f18876xf02988d6) && n51.f.a(java.lang.Boolean.valueOf(this.f18875x303c4bf3), java.lang.Boolean.valueOf(c4504x6aaba492.f18875x303c4bf3));
    }

    /* renamed from: getHistorySavepath */
    public java.lang.String m39164x9f6b65a0() {
        return this.f18873xcb94b041[1] ? this.f18874xacbe526d : "";
    }

    /* renamed from: getIsWeixinUser */
    public boolean m39165x102b708d() {
        return this.f18875x303c4bf3;
    }

    /* renamed from: getUsername */
    public java.lang.String m39166x6c03c64c() {
        return this.f18873xcb94b041[2] ? this.f18876xf02988d6 : "";
    }

    /* renamed from: hasFieldNumber */
    public boolean m39167x6e095e9(int i17) {
        return this.f18873xcb94b041[i17];
    }

    /* renamed from: hasHistorySavepath */
    public boolean m39168x3fc3f1dc() {
        return m39167x6e095e9(1);
    }

    /* renamed from: hasIsWeixinUser */
    public boolean m39169xf40cadd1() {
        return m39167x6e095e9(3);
    }

    /* renamed from: hasUsername */
    public boolean m39170x9b7e4590() {
        return m39167x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4504x6aaba492 m39171x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4504x6aaba492();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f18874xacbe526d;
            if (str != null && this.f18873xcb94b041[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f18876xf02988d6;
            if (str2 != null && this.f18873xcb94b041[2]) {
                fVar.j(2, str2);
            }
            if (this.f18873xcb94b041[3]) {
                fVar.a(3, this.f18875x303c4bf3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f18874xacbe526d;
            if (str3 != null && this.f18873xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f18876xf02988d6;
            if (str4 != null && this.f18873xcb94b041[2]) {
                i18 += b36.f.j(2, str4);
            }
            return this.f18873xcb94b041[3] ? i18 + b36.f.a(3, this.f18875x303c4bf3) : i18;
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
            this.f18874xacbe526d = aVar2.k(intValue);
            this.f18873xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f18876xf02988d6 = aVar2.k(intValue);
            this.f18873xcb94b041[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f18875x303c4bf3 = aVar2.c(intValue);
        this.f18873xcb94b041[3] = true;
        return 0;
    }

    /* renamed from: setHistorySavepath */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4504x6aaba492 m39173xd641ff14(java.lang.String str) {
        this.f18874xacbe526d = str;
        this.f18873xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setIsWeixinUser */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4504x6aaba492 m39174x46746b99(boolean z17) {
        this.f18875x303c4bf3 = z17;
        this.f18873xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setUsername */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4504x6aaba492 m39175x66bc2758(java.lang.String str) {
        this.f18876xf02988d6 = str;
        this.f18873xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4504x6aaba492 m39172x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4504x6aaba492 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4504x6aaba492) super.mo11468x92b714fd(bArr);
    }
}
