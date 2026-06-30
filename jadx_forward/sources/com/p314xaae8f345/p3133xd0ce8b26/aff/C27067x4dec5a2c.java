package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkAppGetSessionInfo */
/* loaded from: classes8.dex */
public class C27067x4dec5a2c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27067x4dec5a2c f58717xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27067x4dec5a2c();

    /* renamed from: client_session_key */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f58718xfebf0ec2;

    /* renamed from: cookie */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f58719xaf400a64;

    /* renamed from: hasSetFields */
    private final boolean[] f58720xcb94b041 = new boolean[7];

    /* renamed from: real_uin */
    private long f58721xccc04e39;

    /* renamed from: server_session_key */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f58722x2b18d63a;

    /* renamed from: serverid */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f58723x5233779e;

    /* renamed from: show_uin */
    private long f58724xebd30818;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27067x4dec5a2c m109082xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27067x4dec5a2c();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27067x4dec5a2c m109083x7c90cfc0() {
        return f58717xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27067x4dec5a2c m109084x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27067x4dec5a2c();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27067x4dec5a2c m109085x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27067x4dec5a2c)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27067x4dec5a2c c27067x4dec5a2c = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27067x4dec5a2c) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f58721xccc04e39), java.lang.Long.valueOf(c27067x4dec5a2c.f58721xccc04e39)) && n51.f.a(java.lang.Long.valueOf(this.f58724xebd30818), java.lang.Long.valueOf(c27067x4dec5a2c.f58724xebd30818)) && n51.f.a(this.f58718xfebf0ec2, c27067x4dec5a2c.f58718xfebf0ec2) && n51.f.a(this.f58722x2b18d63a, c27067x4dec5a2c.f58722x2b18d63a) && n51.f.a(this.f58723x5233779e, c27067x4dec5a2c.f58723x5233779e) && n51.f.a(this.f58719xaf400a64, c27067x4dec5a2c.f58719xaf400a64);
    }

    /* renamed from: getClientSessionKey */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m109086x2950c98a() {
        return this.f58720xcb94b041[3] ? this.f58718xfebf0ec2 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getCookie */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m109087x14572d5a() {
        return this.f58720xcb94b041[6] ? this.f58719xaf400a64 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getRealUin */
    public long m109088x7e3661a6() {
        return this.f58721xccc04e39;
    }

    /* renamed from: getServerSessionKey */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m109089x25e60f02() {
        return this.f58720xcb94b041[4] ? this.f58722x2b18d63a : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getServerid */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m109090xce0db514() {
        return this.f58720xcb94b041[5] ? this.f58723x5233779e : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getShowUin */
    public long m109091xb9056fe7() {
        return this.f58724xebd30818;
    }

    /* renamed from: hasClientSessionKey */
    public boolean m109092x9409c4ce() {
        return m109094x6e095e9(3);
    }

    /* renamed from: hasCookie */
    public boolean m109093xd430ad9e() {
        return m109094x6e095e9(6);
    }

    /* renamed from: hasFieldNumber */
    public boolean m109094x6e095e9(int i17) {
        return this.f58720xcb94b041[i17];
    }

    /* renamed from: hasRealUin */
    public boolean m109095xb98ce9e2() {
        return m109094x6e095e9(1);
    }

    /* renamed from: hasServerSessionKey */
    public boolean m109096x909f0a46() {
        return m109094x6e095e9(4);
    }

    /* renamed from: hasServerid */
    public boolean m109097xfd883458() {
        return m109094x6e095e9(5);
    }

    /* renamed from: hasShowUin */
    public boolean m109098xf45bf823() {
        return m109094x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27067x4dec5a2c m109099x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27067x4dec5a2c();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f58720xcb94b041[1]) {
                fVar.h(1, this.f58721xccc04e39);
            }
            if (this.f58720xcb94b041[2]) {
                fVar.h(2, this.f58724xebd30818);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f58718xfebf0ec2;
            if (gVar != null && this.f58720xcb94b041[3]) {
                fVar.b(3, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f58722x2b18d63a;
            if (gVar2 != null && this.f58720xcb94b041[4]) {
                fVar.b(4, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f58723x5233779e;
            if (gVar3 != null && this.f58720xcb94b041[5]) {
                fVar.b(5, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f58719xaf400a64;
            if (gVar4 != null && this.f58720xcb94b041[6]) {
                fVar.b(6, gVar4);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = this.f58720xcb94b041[1] ? 0 + b36.f.h(1, this.f58721xccc04e39) : 0;
            if (this.f58720xcb94b041[2]) {
                h17 += b36.f.h(2, this.f58724xebd30818);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f58718xfebf0ec2;
            if (gVar5 != null && this.f58720xcb94b041[3]) {
                h17 += b36.f.b(3, gVar5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f58722x2b18d63a;
            if (gVar6 != null && this.f58720xcb94b041[4]) {
                h17 += b36.f.b(4, gVar6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar7 = this.f58723x5233779e;
            if (gVar7 != null && this.f58720xcb94b041[5]) {
                h17 += b36.f.b(5, gVar7);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar8 = this.f58719xaf400a64;
            return (gVar8 == null || !this.f58720xcb94b041[6]) ? h17 : h17 + b36.f.b(6, gVar8);
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
        switch (intValue) {
            case 1:
                this.f58721xccc04e39 = aVar2.i(intValue);
                this.f58720xcb94b041[1] = true;
                return 0;
            case 2:
                this.f58724xebd30818 = aVar2.i(intValue);
                this.f58720xcb94b041[2] = true;
                return 0;
            case 3:
                this.f58718xfebf0ec2 = aVar2.d(intValue);
                this.f58720xcb94b041[3] = true;
                return 0;
            case 4:
                this.f58722x2b18d63a = aVar2.d(intValue);
                this.f58720xcb94b041[4] = true;
                return 0;
            case 5:
                this.f58723x5233779e = aVar2.d(intValue);
                this.f58720xcb94b041[5] = true;
                return 0;
            case 6:
                this.f58719xaf400a64 = aVar2.d(intValue);
                this.f58720xcb94b041[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setClientSessionKey */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27067x4dec5a2c m109101xcd4d5e96(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f58718xfebf0ec2 = gVar;
        this.f58720xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setCookie */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27067x4dec5a2c m109102x78c6166(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f58719xaf400a64 = gVar;
        this.f58720xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setRealUin */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27067x4dec5a2c m109103xf1a7af1a(long j17) {
        this.f58721xccc04e39 = j17;
        this.f58720xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setServerSessionKey */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27067x4dec5a2c m109104xc9e2a40e(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f58722x2b18d63a = gVar;
        this.f58720xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setServerid */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27067x4dec5a2c m109105xc8c61620(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f58723x5233779e = gVar;
        this.f58720xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setShowUin */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27067x4dec5a2c m109106x2c76bd5b(long j17) {
        this.f58724xebd30818 = j17;
        this.f58720xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27067x4dec5a2c m109100x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27067x4dec5a2c mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27067x4dec5a2c) super.mo11468x92b714fd(bArr);
    }
}
