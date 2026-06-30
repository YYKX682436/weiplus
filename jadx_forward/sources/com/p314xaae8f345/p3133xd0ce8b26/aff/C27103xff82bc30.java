package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkMsgIotAppMsg */
/* loaded from: classes2.dex */
public class C27103xff82bc30 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27103xff82bc30 f59154xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27103xff82bc30();

    /* renamed from: appbody */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f59155xd0b3bb43;

    /* renamed from: appid */
    private java.lang.String f59156x58b82fc;

    /* renamed from: hasSetFields */
    private final boolean[] f59157xcb94b041 = new boolean[4];
    private long uin;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27103xff82bc30 m110316xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27103xff82bc30();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27103xff82bc30 m110317x7c90cfc0() {
        return f59154xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27103xff82bc30 m110318x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27103xff82bc30();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27103xff82bc30 m110319x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27103xff82bc30)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27103xff82bc30 c27103xff82bc30 = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27103xff82bc30) fVar;
        return n51.f.a(this.f59156x58b82fc, c27103xff82bc30.f59156x58b82fc) && n51.f.a(java.lang.Long.valueOf(this.uin), java.lang.Long.valueOf(c27103xff82bc30.uin)) && n51.f.a(this.f59155xd0b3bb43, c27103xff82bc30.f59155xd0b3bb43);
    }

    /* renamed from: getAppbody */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m110320xe80f70d() {
        return this.f59157xcb94b041[3] ? this.f59155xd0b3bb43 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getAppid */
    public java.lang.String m110321x74292946() {
        return this.f59157xcb94b041[1] ? this.f59156x58b82fc : "";
    }

    /* renamed from: getUin */
    public long m110322xb5887524() {
        return this.uin;
    }

    /* renamed from: hasAppbody */
    public boolean m110323x49d77f49() {
        return m110325x6e095e9(3);
    }

    /* renamed from: hasAppid */
    public boolean m110324x6bc9082() {
        return m110325x6e095e9(1);
    }

    /* renamed from: hasFieldNumber */
    public boolean m110325x6e095e9(int i17) {
        return this.f59157xcb94b041[i17];
    }

    /* renamed from: hasUin */
    public boolean m110326xb7047b60() {
        return m110325x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27103xff82bc30 m110327x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27103xff82bc30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f59156x58b82fc;
            if (str != null && this.f59157xcb94b041[1]) {
                fVar.j(1, str);
            }
            if (this.f59157xcb94b041[2]) {
                fVar.h(2, this.uin);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f59155xd0b3bb43;
            if (gVar != null && this.f59157xcb94b041[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f59156x58b82fc;
            if (str2 != null && this.f59157xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (this.f59157xcb94b041[2]) {
                i18 += b36.f.h(2, this.uin);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f59155xd0b3bb43;
            return (gVar2 == null || !this.f59157xcb94b041[3]) ? i18 : i18 + b36.f.b(3, gVar2);
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
            this.f59156x58b82fc = aVar2.k(intValue);
            this.f59157xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.uin = aVar2.i(intValue);
            this.f59157xcb94b041[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f59155xd0b3bb43 = aVar2.d(intValue);
        this.f59157xcb94b041[3] = true;
        return 0;
    }

    /* renamed from: setAppbody */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27103xff82bc30 m110329x81f24481(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59155xd0b3bb43 = gVar;
        this.f59157xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setAppid */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27103xff82bc30 m110330x52b743ba(java.lang.String str) {
        this.f59156x58b82fc = str;
        this.f59157xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setUin */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27103xff82bc30 m110331xca029c98(long j17) {
        this.uin = j17;
        this.f59157xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27103xff82bc30 m110328x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27103xff82bc30 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27103xff82bc30) super.mo11468x92b714fd(bArr);
    }
}
