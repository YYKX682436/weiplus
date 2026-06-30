package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkCmdItem */
/* loaded from: classes4.dex */
public class C3047xecae462a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a f10985xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a();

    /* renamed from: cmdbuf */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10986xaf1ebaf9;

    /* renamed from: cmdid */
    private int f10987x5a627d5;

    /* renamed from: hasSetFields */
    private final boolean[] f10988xcb94b041 = new boolean[3];

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a m24179xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a m24180x7c90cfc0() {
        return f10985xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a m24181x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a m24182x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a c3047xecae462a = (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f10987x5a627d5), java.lang.Integer.valueOf(c3047xecae462a.f10987x5a627d5)) && n51.f.a(this.f10986xaf1ebaf9, c3047xecae462a.f10986xaf1ebaf9);
    }

    /* renamed from: getCmdbuf */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m24183x1435ddef() {
        return this.f10988xcb94b041[2] ? this.f10986xaf1ebaf9 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getCmdid */
    public int m24184x7443ce1f() {
        return this.f10987x5a627d5;
    }

    /* renamed from: hasCmdbuf */
    public boolean m24185xd40f5e33() {
        return m24187x6e095e9(2);
    }

    /* renamed from: hasCmdid */
    public boolean m24186x6d7355b() {
        return m24187x6e095e9(1);
    }

    /* renamed from: hasFieldNumber */
    public boolean m24187x6e095e9(int i17) {
        return this.f10988xcb94b041[i17];
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a m24188x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f10988xcb94b041[1]) {
                fVar.e(1, this.f10987x5a627d5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10986xaf1ebaf9;
            if (gVar != null && this.f10988xcb94b041[2]) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f10988xcb94b041[1] ? 0 + b36.f.e(1, this.f10987x5a627d5) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10986xaf1ebaf9;
            return (gVar2 == null || !this.f10988xcb94b041[2]) ? e17 : e17 + b36.f.b(2, gVar2);
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
            this.f10987x5a627d5 = aVar2.g(intValue);
            this.f10988xcb94b041[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f10986xaf1ebaf9 = aVar2.d(intValue);
        this.f10988xcb94b041[2] = true;
        return 0;
    }

    /* renamed from: setCmdbuf */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a m24190x76b11fb(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10986xaf1ebaf9 = gVar;
        this.f10988xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setCmdid */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a m24191x52d1e893(int i17) {
        this.f10987x5a627d5 = i17;
        this.f10988xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a m24189x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a) super.mo11468x92b714fd(bArr);
    }
}
