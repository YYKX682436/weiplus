package com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b;

/* loaded from: classes.dex */
public final class e0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f290834d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f290835e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f290836f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f290837g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f290838h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f290839i;

    /* renamed from: m, reason: collision with root package name */
    public int f290840m;

    /* renamed from: n, reason: collision with root package name */
    public em.j2 f290841n;

    /* renamed from: o, reason: collision with root package name */
    public int f290842o;

    /* renamed from: p, reason: collision with root package name */
    public int f290843p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f290844q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Integer f290845r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f290846s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f290842o = -1;
        this.f290843p = -1;
        this.f290844q = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iex);
        new java.util.LinkedList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0121, code lost:
    
        if (r19.f290839i != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T6(wi5.n0 r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e0.T6(wi5.n0, boolean):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.lang.String stringExtra;
        j75.f Q6;
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i18 != -1 || intent == null) {
            return;
        }
        switch (i17) {
            case 74517:
                j75.f Q62 = Q6();
                if (Q62 == null || (stringExtra = intent.getStringExtra("Select_Conv_User")) == null) {
                    return;
                }
                Q62.B3(new wi5.c0(kz5.b0.c(stringExtra), -1));
                return;
            case 74518:
                java.lang.String stringExtra2 = intent.getStringExtra("Select_Conv_User");
                java.util.List f07 = stringExtra2 != null ? r26.n0.f0(stringExtra2, new java.lang.String[]{","}, false, 0, 6, null) : null;
                boolean z17 = false;
                if (f07 != null && (!f07.isEmpty())) {
                    z17 = true;
                }
                java.util.List list = z17 ? f07 : null;
                if (list == null || (Q6 = Q6()) == null) {
                    return;
                }
                Q6.B3(new wi5.m0(list, -1));
                return;
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "non-MM process, remove YuanBao forward entry");
            m158354x19263085().getIntent().removeExtra("KEY_IS_SUPPORT_FORWARD_TO_YUANBAO");
        }
        S6(new com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.v(this));
        boolean booleanExtra = m158359x1e885992().getBooleanExtra("KEY_IS_ONLY_MULTI_SELECT_MODE", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.w(this, booleanExtra));
    }
}
