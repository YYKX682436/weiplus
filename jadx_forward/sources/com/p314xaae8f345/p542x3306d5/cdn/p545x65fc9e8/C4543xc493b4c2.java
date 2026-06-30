package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.VideoUploadOptions */
/* loaded from: classes8.dex */
public class C4543xc493b4c2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2 f19200xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2();

    /* renamed from: duration_seconds */
    private int f19201x54346ad4;

    /* renamed from: hasSetFields */
    private final boolean[] f19202xcb94b041 = new boolean[5];

    /* renamed from: is_small */
    private boolean f19203x76bfdb2;

    /* renamed from: is_snsad */
    private boolean f19204x76cb446;

    /* renamed from: source */
    private int f19205xca90681b;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2 m39930xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2 m39931x7c90cfc0() {
        return f19200xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2 m39932x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2 m39933x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2 c4543xc493b4c2 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f19201x54346ad4), java.lang.Integer.valueOf(c4543xc493b4c2.f19201x54346ad4)) && n51.f.a(java.lang.Integer.valueOf(this.f19205xca90681b), java.lang.Integer.valueOf(c4543xc493b4c2.f19205xca90681b)) && n51.f.a(java.lang.Boolean.valueOf(this.f19203x76bfdb2), java.lang.Boolean.valueOf(c4543xc493b4c2.f19203x76bfdb2)) && n51.f.a(java.lang.Boolean.valueOf(this.f19204x76cb446), java.lang.Boolean.valueOf(c4543xc493b4c2.f19204x76cb446));
    }

    /* renamed from: getDurationSeconds */
    public int m39934xc7f0b815() {
        return this.f19201x54346ad4;
    }

    /* renamed from: getIsSmall */
    public boolean m39935xb93d7dc7() {
        return this.f19203x76bfdb2;
    }

    /* renamed from: getIsSnsad */
    public boolean m39936xb93e345b() {
        return this.f19204x76cb446;
    }

    /* renamed from: getSource */
    public int m39937x2fa78b11() {
        return this.f19205xca90681b;
    }

    /* renamed from: hasDurationSeconds */
    public boolean m39938x68494451() {
        return m39939x6e095e9(1);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39939x6e095e9(int i17) {
        return this.f19202xcb94b041[i17];
    }

    /* renamed from: hasIsSmall */
    public boolean m39940xf4940603() {
        return m39939x6e095e9(3);
    }

    /* renamed from: hasIsSnsad */
    public boolean m39941xf494bc97() {
        return m39939x6e095e9(4);
    }

    /* renamed from: hasSource */
    public boolean m39942xef810b55() {
        return m39939x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2 m39943x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f19202xcb94b041[1]) {
                fVar.e(1, this.f19201x54346ad4);
            }
            if (this.f19202xcb94b041[2]) {
                fVar.e(2, this.f19205xca90681b);
            }
            if (this.f19202xcb94b041[3]) {
                fVar.a(3, this.f19203x76bfdb2);
            }
            if (this.f19202xcb94b041[4]) {
                fVar.a(4, this.f19204x76cb446);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f19202xcb94b041[1] ? 0 + b36.f.e(1, this.f19201x54346ad4) : 0;
            if (this.f19202xcb94b041[2]) {
                e17 += b36.f.e(2, this.f19205xca90681b);
            }
            if (this.f19202xcb94b041[3]) {
                e17 += b36.f.a(3, this.f19203x76bfdb2);
            }
            return this.f19202xcb94b041[4] ? e17 + b36.f.a(4, this.f19204x76cb446) : e17;
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
            this.f19201x54346ad4 = aVar2.g(intValue);
            this.f19202xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f19205xca90681b = aVar2.g(intValue);
            this.f19202xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f19203x76bfdb2 = aVar2.c(intValue);
            this.f19202xcb94b041[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f19204x76cb446 = aVar2.c(intValue);
        this.f19202xcb94b041[4] = true;
        return 0;
    }

    /* renamed from: setDurationSeconds */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2 m39945xfec75189(int i17) {
        this.f19201x54346ad4 = i17;
        this.f19202xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setIsSmall */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2 m39946x2caecb3b(boolean z17) {
        this.f19203x76bfdb2 = z17;
        this.f19202xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setIsSnsad */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2 m39947x2caf81cf(boolean z17) {
        this.f19204x76cb446 = z17;
        this.f19202xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setSource */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2 m39948x22dcbf1d(int i17) {
        this.f19205xca90681b = i17;
        this.f19202xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2 m39944x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2) super.mo11468x92b714fd(bArr);
    }
}
