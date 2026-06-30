package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkAppLoginInfo */
/* loaded from: classes8.dex */
public class C3030xcc4691f9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3030xcc4691f9 f10695xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3030xcc4691f9();

    /* renamed from: auth_code */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10696x570bd224;

    /* renamed from: client_info */
    private java.lang.String f10697xf5a0d0a2;

    /* renamed from: hasSetFields */
    private final boolean[] f10698xcb94b041 = new boolean[5];

    /* renamed from: session_module_type */
    private int f10699x5c187504;

    /* renamed from: session_type */
    private int f10700xd718f343;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3030xcc4691f9 m23346xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3030xcc4691f9();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3030xcc4691f9 m23347x7c90cfc0() {
        return f10695xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3030xcc4691f9 m23348x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3030xcc4691f9();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3030xcc4691f9 m23349x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3030xcc4691f9)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3030xcc4691f9 c3030xcc4691f9 = (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3030xcc4691f9) fVar;
        return n51.f.a(this.f10696x570bd224, c3030xcc4691f9.f10696x570bd224) && n51.f.a(java.lang.Integer.valueOf(this.f10700xd718f343), java.lang.Integer.valueOf(c3030xcc4691f9.f10700xd718f343)) && n51.f.a(java.lang.Integer.valueOf(this.f10699x5c187504), java.lang.Integer.valueOf(c3030xcc4691f9.f10699x5c187504)) && n51.f.a(this.f10697xf5a0d0a2, c3030xcc4691f9.f10697xf5a0d0a2);
    }

    /* renamed from: getAuthCode */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m23350xd131292b() {
        return this.f10698xcb94b041[1] ? this.f10696x570bd224 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getClientInfo */
    public java.lang.String m23351x2ff1a70f() {
        return this.f10698xcb94b041[4] ? this.f10697xf5a0d0a2 : "";
    }

    /* renamed from: getSessionModuleType */
    public int m23352xc93fb646() {
        return this.f10699x5c187504;
    }

    /* renamed from: getSessionType */
    public int m23353xd87f91ba() {
        return this.f10700xd718f343;
    }

    /* renamed from: hasAuthCode */
    public boolean m23354xaba86f() {
        return m23356x6e095e9(1);
    }

    /* renamed from: hasClientInfo */
    public boolean m23355x6ac96553() {
        return m23356x6e095e9(4);
    }

    /* renamed from: hasFieldNumber */
    public boolean m23356x6e095e9(int i17) {
        return this.f10698xcb94b041[i17];
    }

    /* renamed from: hasSessionModuleType */
    public boolean m23357xb5a62382() {
        return m23356x6e095e9(3);
    }

    /* renamed from: hasSessionType */
    public boolean m23358xf89f9bf6() {
        return m23356x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3030xcc4691f9 m23359x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3030xcc4691f9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10696x570bd224;
            if (gVar != null && this.f10698xcb94b041[1]) {
                fVar.b(1, gVar);
            }
            if (this.f10698xcb94b041[2]) {
                fVar.e(2, this.f10700xd718f343);
            }
            if (this.f10698xcb94b041[3]) {
                fVar.e(3, this.f10699x5c187504);
            }
            java.lang.String str = this.f10697xf5a0d0a2;
            if (str != null && this.f10698xcb94b041[4]) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10696x570bd224;
            if (gVar2 != null && this.f10698xcb94b041[1]) {
                i18 = 0 + b36.f.b(1, gVar2);
            }
            if (this.f10698xcb94b041[2]) {
                i18 += b36.f.e(2, this.f10700xd718f343);
            }
            if (this.f10698xcb94b041[3]) {
                i18 += b36.f.e(3, this.f10699x5c187504);
            }
            java.lang.String str2 = this.f10697xf5a0d0a2;
            return (str2 == null || !this.f10698xcb94b041[4]) ? i18 : i18 + b36.f.j(4, str2);
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
            this.f10696x570bd224 = aVar2.d(intValue);
            this.f10698xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f10700xd718f343 = aVar2.g(intValue);
            this.f10698xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f10699x5c187504 = aVar2.g(intValue);
            this.f10698xcb94b041[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f10697xf5a0d0a2 = aVar2.k(intValue);
        this.f10698xcb94b041[4] = true;
        return 0;
    }

    /* renamed from: setAuthCode */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3030xcc4691f9 m23361xcbe98a37(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10696x570bd224 = gVar;
        this.f10698xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setClientInfo */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3030xcc4691f9 m23362x5e15f51b(java.lang.String str) {
        this.f10697xf5a0d0a2 = str;
        this.f10698xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setSessionModuleType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3030xcc4691f9 m23363xa4d5c2ba(int i17) {
        this.f10699x5c187504 = i17;
        this.f10698xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setSessionType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3030xcc4691f9 m23364x6ee5052e(int i17) {
        this.f10700xd718f343 = i17;
        this.f10698xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3030xcc4691f9 m23360x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3030xcc4691f9 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3030xcc4691f9) super.mo11468x92b714fd(bArr);
    }
}
