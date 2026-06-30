package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.ClientContextInfo */
/* loaded from: classes2.dex */
public class C27385x938cd612 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 f59727xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612();

    /* renamed from: context_id */
    public java.lang.String f59730x1051a9ab = "";

    /* renamed from: click_tab_context_id */
    public java.lang.String f59728xc4b8082c = "";

    /* renamed from: client_report_buff */
    public java.lang.String f59729xf156ce0a = "";

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 m113904xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 m113905x7c90cfc0() {
        return f59727xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 m113906x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 m113907x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 c27385x938cd612 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612) fVar;
        return n51.f.a(this.f59730x1051a9ab, c27385x938cd612.f59730x1051a9ab) && n51.f.a(this.f59728xc4b8082c, c27385x938cd612.f59728xc4b8082c) && n51.f.a(this.f59729xf156ce0a, c27385x938cd612.f59729xf156ce0a);
    }

    /* renamed from: getClickTabContextId */
    public java.lang.String m113908x67383c07() {
        return this.f59728xc4b8082c;
    }

    /* renamed from: getClick_tab_context_id */
    public java.lang.String m113909x7283c4a2() {
        return this.f59728xc4b8082c;
    }

    /* renamed from: getClientReportBuff */
    public java.lang.String m113910x39599548() {
        return this.f59729xf156ce0a;
    }

    /* renamed from: getClient_report_buff */
    public java.lang.String m113911x4b33000() {
        return this.f59729xf156ce0a;
    }

    /* renamed from: getContextId */
    public java.lang.String m113912xe72e0074() {
        return this.f59730x1051a9ab;
    }

    /* renamed from: getContext_id */
    public java.lang.String m113913xfe9261a1() {
        return this.f59730x1051a9ab;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 m113914x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f59730x1051a9ab;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f59728xc4b8082c;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f59729xf156ce0a;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f59730x1051a9ab;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f59728xc4b8082c;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f59729xf156ce0a;
            return str6 != null ? j17 + b36.f.j(3, str6) : j17;
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
            this.f59730x1051a9ab = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f59728xc4b8082c = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f59729xf156ce0a = aVar2.k(intValue);
        return 0;
    }

    /* renamed from: setClickTabContextId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 m113916x42ce487b(java.lang.String str) {
        this.f59728xc4b8082c = str;
        return this;
    }

    /* renamed from: setClick_tab_context_id */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 m113917xecd6f3ae(java.lang.String str) {
        this.f59728xc4b8082c = str;
        return this;
    }

    /* renamed from: setClientReportBuff */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 m113918xdd562a54(java.lang.String str) {
        this.f59729xf156ce0a = str;
        return this;
    }

    /* renamed from: setClient_report_buff */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 m113919x9bdeb20c(java.lang.String str) {
        this.f59729xf156ce0a = str;
        return this;
    }

    /* renamed from: setContextId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 m113920x4381c0e8(java.lang.String str) {
        this.f59730x1051a9ab = str;
        return this;
    }

    /* renamed from: setContext_id */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 m113921x2cb6afad(java.lang.String str) {
        this.f59730x1051a9ab = str;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 m113915x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27385x938cd612) super.mo11468x92b714fd(bArr);
    }
}
