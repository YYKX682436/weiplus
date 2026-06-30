package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/colive/FinderLiveCoLiveInvitationErrorUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationErrorUI */
/* loaded from: classes15.dex */
public final class ActivityC14184xa1edf579 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f193077n = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f193078d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f193079e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f193080f;

    /* renamed from: g, reason: collision with root package name */
    public int f193081g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f193082h;

    /* renamed from: i, reason: collision with root package name */
    public int f193083i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f193084m;

    static {
        kz5.p1.f(-200224, -200231, -200030, -200446, -200447, -200452, -200453, -200454, -200455, -200456, -200457, -200458, -200459, -200460, -200008, -200461);
    }

    public final void T6(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveInvitationErrorUI", "dismissAsCanceled: from=" + str);
        setResult(0);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e9m;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r12, int r13, android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14184xa1edf579.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        T6("backPressed");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        super.onCreate(bundle);
        this.f193081g = getIntent().getIntExtra("co_live_error_code", 0);
        this.f193082h = getIntent().getBooleanExtra("co_live_use_close_icon", false);
        this.f193083i = getIntent().getIntExtra("co_live_user_flag", 0);
        this.f193084m = getIntent().getStringExtra("co_live_spam_jump_url");
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        mo78530x8b45058f();
        if (this.f193082h) {
            mo74406x9c8c0d33(new re2.t0(this), com.p314xaae8f345.mm.R.raw.f79678x41464de0);
        } else {
            mo54448x9c8c0d33(new re2.u0(this));
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.stj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f193078d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.sti);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f193079e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.sth);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f193080f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) findViewById3;
        android.widget.TextView textView = this.f193078d;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("errorDescTv");
            throw null;
        }
        com.p314xaae8f345.mm.ui.fk.a(textView);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = this.f193079e;
        if (c22661xa3a2b3c0 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelBtn");
            throw null;
        }
        c22661xa3a2b3c0.setOnClickListener(new re2.v0(this));
        java.lang.String stringExtra = getIntent().getStringExtra("co_live_error_desc");
        java.lang.String str = stringExtra != null ? stringExtra : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveInvitationErrorUI", "bindData: errorCode=" + this.f193081g + ", userFlag=" + this.f193083i + ", spamJumpUrl=" + this.f193084m);
        android.widget.TextView textView2 = this.f193078d;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("errorDescTv");
            throw null;
        }
        textView2.setText(str);
        int i17 = this.f193081g;
        boolean z17 = true;
        if (i17 != -200460) {
            if (i17 == -200008) {
                java.lang.String str2 = this.f193084m;
                if (!(str2 == null || str2.length() == 0)) {
                    string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.onh);
                }
            }
            string = null;
        } else {
            string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.onh);
        }
        if (string != null && string.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c02 = this.f193080f;
            if (c22661xa3a2b3c02 != null) {
                c22661xa3a2b3c02.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("actionBtn");
                throw null;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c03 = this.f193080f;
        if (c22661xa3a2b3c03 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("actionBtn");
            throw null;
        }
        c22661xa3a2b3c03.setVisibility(0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c04 = this.f193080f;
        if (c22661xa3a2b3c04 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("actionBtn");
            throw null;
        }
        c22661xa3a2b3c04.setText(string);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c05 = this.f193080f;
        if (c22661xa3a2b3c05 != null) {
            c22661xa3a2b3c05.setOnClickListener(new re2.s0(this, i17));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("actionBtn");
            throw null;
        }
    }
}
