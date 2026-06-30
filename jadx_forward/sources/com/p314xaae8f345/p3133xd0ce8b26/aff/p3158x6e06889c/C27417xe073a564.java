package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderObjectBaseInfo */
/* loaded from: classes2.dex */
public class C27417xe073a564 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 f59976xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564();

    /* renamed from: id, reason: collision with root package name */
    public long f298934id = 0;

    /* renamed from: session_buffer */
    public java.lang.String f59981x55b51a09 = "";

    /* renamed from: client_recv_time_ms */
    public long f59979x3b9502f3 = 0;

    /* renamed from: client_expose_time_ms */
    public long f59978x869d1d1 = 0;

    /* renamed from: client_expose_count */
    public int f59977x30e61cc8 = 0;

    /* renamed from: client_udf_kv */
    public java.lang.String f59980x249c3de7 = "";

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 m114950xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 m114951x7c90cfc0() {
        return f59976xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 m114952x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 m114953x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 c27417xe073a564 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f298934id), java.lang.Long.valueOf(c27417xe073a564.f298934id)) && n51.f.a(this.f59981x55b51a09, c27417xe073a564.f59981x55b51a09) && n51.f.a(java.lang.Long.valueOf(this.f59979x3b9502f3), java.lang.Long.valueOf(c27417xe073a564.f59979x3b9502f3)) && n51.f.a(java.lang.Long.valueOf(this.f59978x869d1d1), java.lang.Long.valueOf(c27417xe073a564.f59978x869d1d1)) && n51.f.a(java.lang.Integer.valueOf(this.f59977x30e61cc8), java.lang.Integer.valueOf(c27417xe073a564.f59977x30e61cc8)) && n51.f.a(this.f59980x249c3de7, c27417xe073a564.f59980x249c3de7);
    }

    /* renamed from: getClientExposeCount */
    public int m114954x9f08862a() {
        return this.f59977x30e61cc8;
    }

    /* renamed from: getClientExposeTimeMs */
    public long m114955x5eb24b98() {
        return this.f59978x869d1d1;
    }

    /* renamed from: getClientRecvTimeMs */
    public long m114956x317cd47a() {
        return this.f59979x3b9502f3;
    }

    /* renamed from: getClientUdfKv */
    public java.lang.String m114957xcee7c541() {
        return this.f59980x249c3de7;
    }

    /* renamed from: getClient_expose_count */
    public int m114958x8915f992() {
        return this.f59977x30e61cc8;
    }

    /* renamed from: getClient_expose_time_ms */
    public long m114959x1415a41b() {
        return this.f59978x869d1d1;
    }

    /* renamed from: getClient_recv_time_ms */
    public long m114960x93c4dfbd() {
        return this.f59979x3b9502f3;
    }

    /* renamed from: getClient_udf_kv */
    public java.lang.String m114961xe1fbfa31() {
        return this.f59980x249c3de7;
    }

    /* renamed from: getId */
    public long m114962x5db1b11() {
        return this.f298934id;
    }

    /* renamed from: getSessionBuffer */
    public java.lang.String m114963x97edf6c0() {
        return this.f59981x55b51a09;
    }

    /* renamed from: getSession_buffer */
    public java.lang.String m114964x444ce6ff() {
        return this.f59981x55b51a09;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 m114965x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f298934id);
            java.lang.String str = this.f59981x55b51a09;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f59979x3b9502f3);
            fVar.h(4, this.f59978x869d1d1);
            fVar.e(5, this.f59977x30e61cc8);
            java.lang.String str2 = this.f59980x249c3de7;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f298934id) + 0;
            java.lang.String str3 = this.f59981x55b51a09;
            if (str3 != null) {
                h17 += b36.f.j(2, str3);
            }
            int h18 = h17 + b36.f.h(3, this.f59979x3b9502f3) + b36.f.h(4, this.f59978x869d1d1) + b36.f.e(5, this.f59977x30e61cc8);
            java.lang.String str4 = this.f59980x249c3de7;
            return str4 != null ? h18 + b36.f.j(6, str4) : h18;
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
                this.f298934id = aVar2.i(intValue);
                return 0;
            case 2:
                this.f59981x55b51a09 = aVar2.k(intValue);
                return 0;
            case 3:
                this.f59979x3b9502f3 = aVar2.i(intValue);
                return 0;
            case 4:
                this.f59978x869d1d1 = aVar2.i(intValue);
                return 0;
            case 5:
                this.f59977x30e61cc8 = aVar2.g(intValue);
                return 0;
            case 6:
                this.f59980x249c3de7 = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setClientExposeCount */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 m114967x7a9e929e(int i17) {
        this.f59977x30e61cc8 = i17;
        return this;
    }

    /* renamed from: setClientExposeTimeMs */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 m114968xf5ddcda4(long j17) {
        this.f59978x869d1d1 = j17;
        return this;
    }

    /* renamed from: setClientRecvTimeMs */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 m114969xd5796986(long j17) {
        this.f59979x3b9502f3 = j17;
        return this;
    }

    /* renamed from: setClientUdfKv */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 m114970x654d38b5(java.lang.String str) {
        this.f59980x249c3de7 = str;
        return this;
    }

    /* renamed from: setClient_expose_count */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 m114971xd75ab906(int i17) {
        this.f59977x30e61cc8 = i17;
        return this;
    }

    /* renamed from: setClient_expose_time_ms */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 m114972xe428568f(long j17) {
        this.f59978x869d1d1 = j17;
        return this;
    }

    /* renamed from: setClient_recv_time_ms */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 m114973xe2099f31(long j17) {
        this.f59979x3b9502f3 = j17;
        return this;
    }

    /* renamed from: setClient_udf_kv */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 m114974x74d260a5(java.lang.String str) {
        this.f59980x249c3de7 = str;
        return this;
    }

    /* renamed from: setId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 m114975x684351d(long j17) {
        this.f298934id = j17;
        return this;
    }

    /* renamed from: setSessionBuffer */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 m114976x2ac45d34(java.lang.String str) {
        this.f59981x55b51a09 = str;
        return this;
    }

    /* renamed from: setSession_buffer */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 m114977xc434f0b(java.lang.String str) {
        this.f59981x55b51a09 = str;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 m114966x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27417xe073a564) super.mo11468x92b714fd(bArr);
    }
}
