package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkCustomHttpHeader */
/* loaded from: classes4.dex */
public class C3050xd357a169 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169 f11007xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169();

    /* renamed from: hasSetFields */
    private final boolean[] f11008xcb94b041 = new boolean[3];
    private java.lang.String key;

    /* renamed from: value */
    private java.lang.String f11009x6ac9171;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169 m24205xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169 m24206x7c90cfc0() {
        return f11007xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169 m24207x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169 m24208x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169 c3050xd357a169 = (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169) fVar;
        return n51.f.a(this.key, c3050xd357a169.key) && n51.f.a(this.f11009x6ac9171, c3050xd357a169.f11009x6ac9171);
    }

    /* renamed from: getKey */
    public java.lang.String m24209xb5884f29() {
        return this.f11008xcb94b041[1] ? this.key : "";
    }

    /* renamed from: getValue */
    public java.lang.String m24210x754a37bb() {
        return this.f11008xcb94b041[2] ? this.f11009x6ac9171 : "";
    }

    /* renamed from: hasFieldNumber */
    public boolean m24211x6e095e9(int i17) {
        return this.f11008xcb94b041[i17];
    }

    /* renamed from: hasKey */
    public boolean m24212xb7045565() {
        return m24211x6e095e9(1);
    }

    /* renamed from: hasValue */
    public boolean m24213x7dd9ef7() {
        return m24211x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169 m24214x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.key;
            if (str != null && this.f11008xcb94b041[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f11009x6ac9171;
            if (str2 != null && this.f11008xcb94b041[2]) {
                fVar.j(2, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.key;
            if (str3 != null && this.f11008xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f11009x6ac9171;
            return (str4 == null || !this.f11008xcb94b041[2]) ? i18 : i18 + b36.f.j(2, str4);
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
            this.key = aVar2.k(intValue);
            this.f11008xcb94b041[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f11009x6ac9171 = aVar2.k(intValue);
        this.f11008xcb94b041[2] = true;
        return 0;
    }

    /* renamed from: setKey */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169 m24216xca02769d(java.lang.String str) {
        this.key = str;
        this.f11008xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setValue */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169 m24217x53d8522f(java.lang.String str) {
        this.f11009x6ac9171 = str;
        this.f11008xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169 m24215x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3050xd357a169) super.mo11468x92b714fd(bArr);
    }
}
