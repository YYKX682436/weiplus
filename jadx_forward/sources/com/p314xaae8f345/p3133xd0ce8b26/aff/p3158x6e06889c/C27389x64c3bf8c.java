package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.EntranceReportConfig */
/* loaded from: classes8.dex */
public class C27389x64c3bf8c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c f59743xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c();

    /* renamed from: report_switch */
    public int f59746xd442dc9f = 0;

    /* renamed from: report_ts_interval */
    public int f59747xe1026bfa = 0;

    /* renamed from: sns_expose_feed_threshold */
    public int f59753xd52dc55e = 0;

    /* renamed from: reddot_session_report_sync_delay */
    public int f59744x88e9a2fa = 0;

    /* renamed from: sns_delivery_update_n_feed */
    public int f59752xc7a220a1 = 0;

    /* renamed from: sns_delivery_before_m_feed */
    public int f59749x1ad6688c = 0;

    /* renamed from: sns_delivery_disable_cache */
    public boolean f59750x2d4d507 = false;

    /* renamed from: sns_delivery_disable_preload */
    public boolean f59751x6dc5464e = false;

    /* renamed from: sns_delivery_back_page */
    public int f59748xd237aa83 = 0;

    /* renamed from: report_delay_time */
    public int f59745xbae743f4 = 0;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m113980xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m113981x7c90cfc0() {
        return f59743xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m113982x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m113983x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c c27389x64c3bf8c = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f59746xd442dc9f), java.lang.Integer.valueOf(c27389x64c3bf8c.f59746xd442dc9f)) && n51.f.a(java.lang.Integer.valueOf(this.f59747xe1026bfa), java.lang.Integer.valueOf(c27389x64c3bf8c.f59747xe1026bfa)) && n51.f.a(java.lang.Integer.valueOf(this.f59753xd52dc55e), java.lang.Integer.valueOf(c27389x64c3bf8c.f59753xd52dc55e)) && n51.f.a(java.lang.Integer.valueOf(this.f59744x88e9a2fa), java.lang.Integer.valueOf(c27389x64c3bf8c.f59744x88e9a2fa)) && n51.f.a(java.lang.Integer.valueOf(this.f59752xc7a220a1), java.lang.Integer.valueOf(c27389x64c3bf8c.f59752xc7a220a1)) && n51.f.a(java.lang.Integer.valueOf(this.f59749x1ad6688c), java.lang.Integer.valueOf(c27389x64c3bf8c.f59749x1ad6688c)) && n51.f.a(java.lang.Boolean.valueOf(this.f59750x2d4d507), java.lang.Boolean.valueOf(c27389x64c3bf8c.f59750x2d4d507)) && n51.f.a(java.lang.Boolean.valueOf(this.f59751x6dc5464e), java.lang.Boolean.valueOf(c27389x64c3bf8c.f59751x6dc5464e)) && n51.f.a(java.lang.Integer.valueOf(this.f59748xd237aa83), java.lang.Integer.valueOf(c27389x64c3bf8c.f59748xd237aa83)) && n51.f.a(java.lang.Integer.valueOf(this.f59745xbae743f4), java.lang.Integer.valueOf(c27389x64c3bf8c.f59745xbae743f4));
    }

    /* renamed from: getReddotSessionReportSyncDelay */
    public int m113984x189adb0c() {
        return this.f59744x88e9a2fa;
    }

    /* renamed from: getReddot_session_report_sync_delay */
    public int m113985x7605e70() {
        return this.f59744x88e9a2fa;
    }

    /* renamed from: getReportDelayTime */
    public int m113986xe8c3de6() {
        return this.f59745xbae743f4;
    }

    /* renamed from: getReportSwitch */
    public int m113987x850fd3fe() {
        return this.f59746xd442dc9f;
    }

    /* renamed from: getReportTsInterval */
    public int m113988x97a4102e() {
        return this.f59747xe1026bfa;
    }

    /* renamed from: getReport_delay_time */
    public int m113989xe1bcb3e() {
        return this.f59745xbae743f4;
    }

    /* renamed from: getReport_switch */
    public int m113990x91a298e9() {
        return this.f59746xd442dc9f;
    }

    /* renamed from: getReport_ts_interval */
    public int m113991xf45ecdf0() {
        return this.f59747xe1026bfa;
    }

    /* renamed from: getSnsDeliveryBackPage */
    public int m113992x93c34a8c() {
        return this.f59748xd237aa83;
    }

    /* renamed from: getSnsDeliveryBeforeMFeed */
    public int m113993x8ca42d36() {
        return this.f59749x1ad6688c;
    }

    /* renamed from: getSnsDeliveryDisableCache */
    public boolean m113994xd3d53cf0() {
        return this.f59750x2d4d507;
    }

    /* renamed from: getSnsDeliveryDisablePreload */
    public boolean m113995x4b57f7() {
        return this.f59751x6dc5464e;
    }

    /* renamed from: getSnsDeliveryUpdateNFeed */
    public int m113996xabc689ad() {
        return this.f59752xc7a220a1;
    }

    /* renamed from: getSnsExposeFeedThreshold */
    public int m113997xfc66c967() {
        return this.f59753xd52dc55e;
    }

    /* renamed from: getSns_delivery_back_page */
    public int m113998x3c062179() {
        return this.f59748xd237aa83;
    }

    /* renamed from: getSns_delivery_before_m_feed */
    public int m113999x7a047482() {
        return this.f59749x1ad6688c;
    }

    /* renamed from: getSns_delivery_disable_cache */
    public boolean m114000x6202e0fd() {
        return this.f59750x2d4d507;
    }

    /* renamed from: getSns_delivery_disable_preload */
    public boolean m114001xb9a02cc4() {
        return this.f59751x6dc5464e;
    }

    /* renamed from: getSns_delivery_update_n_feed */
    public int m114002x26d02c97() {
        return this.f59752xc7a220a1;
    }

    /* renamed from: getSns_expose_feed_threshold */
    public int m114003xa6b362a8() {
        return this.f59753xd52dc55e;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m114004x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f59746xd442dc9f);
            fVar.e(2, this.f59747xe1026bfa);
            fVar.e(3, this.f59753xd52dc55e);
            fVar.e(4, this.f59744x88e9a2fa);
            fVar.e(5, this.f59752xc7a220a1);
            fVar.e(6, this.f59749x1ad6688c);
            fVar.a(7, this.f59750x2d4d507);
            fVar.a(8, this.f59751x6dc5464e);
            fVar.e(9, this.f59748xd237aa83);
            fVar.e(17, this.f59745xbae743f4);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f59746xd442dc9f) + 0 + b36.f.e(2, this.f59747xe1026bfa) + b36.f.e(3, this.f59753xd52dc55e) + b36.f.e(4, this.f59744x88e9a2fa) + b36.f.e(5, this.f59752xc7a220a1) + b36.f.e(6, this.f59749x1ad6688c) + b36.f.a(7, this.f59750x2d4d507) + b36.f.a(8, this.f59751x6dc5464e) + b36.f.e(9, this.f59748xd237aa83) + b36.f.e(17, this.f59745xbae743f4);
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
        if (intValue == 17) {
            this.f59745xbae743f4 = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f59746xd442dc9f = aVar2.g(intValue);
                return 0;
            case 2:
                this.f59747xe1026bfa = aVar2.g(intValue);
                return 0;
            case 3:
                this.f59753xd52dc55e = aVar2.g(intValue);
                return 0;
            case 4:
                this.f59744x88e9a2fa = aVar2.g(intValue);
                return 0;
            case 5:
                this.f59752xc7a220a1 = aVar2.g(intValue);
                return 0;
            case 6:
                this.f59749x1ad6688c = aVar2.g(intValue);
                return 0;
            case 7:
                this.f59750x2d4d507 = aVar2.c(intValue);
                return 0;
            case 8:
                this.f59751x6dc5464e = aVar2.c(intValue);
                return 0;
            case 9:
                this.f59748xd237aa83 = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setReddotSessionReportSyncDelay */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m114006x13843e18(int i17) {
        this.f59744x88e9a2fa = i17;
        return this;
    }

    /* renamed from: setReddot_session_report_sync_delay */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m114007xd9895b7c(int i17) {
        this.f59744x88e9a2fa = i17;
        return this;
    }

    /* renamed from: setReportDelayTime */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m114008x4562d75a(int i17) {
        this.f59745xbae743f4 = i17;
        return this;
    }

    /* renamed from: setReportSwitch */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m114009xbb58cf0a(int i17) {
        this.f59746xd442dc9f = i17;
        return this;
    }

    /* renamed from: setReportTsInterval */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m114010x3ba0a53a(int i17) {
        this.f59747xe1026bfa = i17;
        return this;
    }

    /* renamed from: setReport_delay_time */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m114011xe9b1d7b2(int i17) {
        this.f59745xbae743f4 = i17;
        return this;
    }

    /* renamed from: setReport_switch */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m114012x2478ff5d(int i17) {
        this.f59746xd442dc9f = i17;
        return this;
    }

    /* renamed from: setReport_ts_interval */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m114013x8b8a4ffc(int i17) {
        this.f59747xe1026bfa = i17;
        return this;
    }

    /* renamed from: setSnsDeliveryBackPage */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m114014xe2080a00(int i17) {
        this.f59748xd237aa83 = i17;
        return this;
    }

    /* renamed from: setSnsDeliveryBeforeMFeed */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m114015xbee7c942(int i17) {
        this.f59749x1ad6688c = i17;
        return this;
    }

    /* renamed from: setSnsDeliveryDisableCache */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m114016xea052264(boolean z17) {
        this.f59750x2d4d507 = z17;
        return this;
    }

    /* renamed from: setSnsDeliveryDisablePreload */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m114017x4a17b06b(boolean z17) {
        this.f59751x6dc5464e = z17;
        return this;
    }

    /* renamed from: setSnsDeliveryUpdateNFeed */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m114018xde0a25b9(int i17) {
        this.f59752xc7a220a1 = i17;
        return this;
    }

    /* renamed from: setSnsExposeFeedThreshold */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m114019x2eaa6573(int i17) {
        this.f59753xd52dc55e = i17;
        return this;
    }

    /* renamed from: setSns_delivery_back_page */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m114020x6e49bd85(int i17) {
        this.f59748xd237aa83 = i17;
        return this;
    }

    /* renamed from: setSns_delivery_before_m_feed */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m114021x69c32a8e(int i17) {
        this.f59749x1ad6688c = i17;
        return this;
    }

    /* renamed from: setSns_delivery_disable_cache */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m114022x51c19709(boolean z17) {
        this.f59750x2d4d507 = z17;
        return this;
    }

    /* renamed from: setSns_delivery_disable_preload */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m114023xb4898fd0(boolean z17) {
        this.f59751x6dc5464e = z17;
        return this;
    }

    /* renamed from: setSns_delivery_update_n_feed */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m114024x168ee2a3(int i17) {
        this.f59752xc7a220a1 = i17;
        return this;
    }

    /* renamed from: setSns_expose_feed_threshold */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m114025xf07fbb1c(int i17) {
        this.f59753xd52dc55e = i17;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c m114005x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27389x64c3bf8c) super.mo11468x92b714fd(bArr);
    }
}
