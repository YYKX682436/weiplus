package cd0;

/* loaded from: classes5.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p761xc84f0e86.C10677xd5472755 f122062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f122063e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p689xc5a27af6.p761xc84f0e86.C10677xd5472755 c10677xd5472755, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(0);
        this.f122062d = c10677xd5472755;
        this.f122063e = activityC0065xcd7aa112;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p689xc5a27af6.p761xc84f0e86.C10677xd5472755 c10677xd5472755 = this.f122062d;
        java.lang.String str = (java.lang.String) ((jz5.n) c10677xd5472755.f149327g).mo141623x754a37bb();
        if (!(str == null || r26.n0.N(str))) {
            android.content.Intent intent = new android.content.Intent();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f122063e;
            android.content.Intent putExtra = intent.setClassName(activityC0065xcd7aa112, str).addFlags(67108864).addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965).addFlags(268435456).putExtra("KEY_START_FROM_LANDING_UIC", true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra, "putExtra(...)");
            putExtra.getFlags();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa1122 = this.f122063e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(putExtra);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC0065xcd7aa1122, arrayList.toArray(), "com/tencent/mm/feature/revoke/RevokeChattingLandingPageUIC$goToChattingHomePage$2", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC0065xcd7aa1122.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC0065xcd7aa1122, "com/tencent/mm/feature/revoke/RevokeChattingLandingPageUIC$goToChattingHomePage$2", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC0065xcd7aa112.overridePendingTransition(0, 0);
            try {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = c10677xd5472755.U6() != 0 ? pt0.f0.f439742b1.n((java.lang.String) ((jz5.n) c10677xd5472755.f149325e).mo141623x754a37bb(), c10677xd5472755.U6()) : null;
                if (n17 != null) {
                    long j17 = ot0.q.v(n17.U1()) != null ? r1.f430199i : 0L;
                    int c17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.c(n17.mo78013xfb85f7b0());
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c c6423x452b9f7c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c();
                    c6423x452b9f7c.f137646e = 30L;
                    c6423x452b9f7c.f137645d = j17;
                    c6423x452b9f7c.f137648g = c17;
                    c6423x452b9f7c.k();
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MRevokeChat.LandingPageUIC", th6, "report err", new java.lang.Object[0]);
            }
        }
        return jz5.f0.f384359a;
    }
}
