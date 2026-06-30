package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI */
/* loaded from: classes4.dex */
public final class ActivityC18505x6ae0de9d extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f253695p = 0;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f253699g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f253700h;

    /* renamed from: m, reason: collision with root package name */
    public l75.q0 f253702m;

    /* renamed from: n, reason: collision with root package name */
    public long f253703n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f253704o;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f253696d = jz5.h.b(new eg4.p0(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f253697e = jz5.h.b(eg4.r0.f334319d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f253698f = jz5.h.b(eg4.o0.f334302d);

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f253701i = jz5.h.b(new eg4.q0(this));

    public static final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18505x6ae0de9d activityC18505x6ae0de9d) {
        int y17;
        int m8020x7e414b06;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) activityC18505x6ae0de9d.f253696d).mo141623x754a37bb();
        if (c22849x81a93d25 == null) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c22849x81a93d25.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de == null || activityC18505x6ae0de9d.f253699g || activityC18505x6ae0de9d.f253700h || (y17 = c1162x665295de.y()) < c1162x665295de.m8020x7e414b06() - 2) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordUI", "tryLoadMoreIfNearBottom: lastVisible=" + y17 + " >= " + m8020x7e414b06 + ", trigger syncVerifyRecordHistory");
        if (activityC18505x6ae0de9d.f253700h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordUI", "syncVerifyRecordHistory: already loading, skip");
            return;
        }
        if (((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) activityC18505x6ae0de9d.f253698f).mo141623x754a37bb()).getBoolean("all_history_fetched", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordUI", "syncVerifyRecordHistory: MMKV already marks fetched all, skip network request");
            activityC18505x6ae0de9d.f253699g = true;
            activityC18505x6ae0de9d.W6();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordUI", "syncVerifyRecordHistory: start loading");
            activityC18505x6ae0de9d.f253700h = true;
            v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) activityC18505x6ae0de9d.f253701i).mo141623x754a37bb(), null, new eg4.a1(activityC18505x6ae0de9d, null), 1, null);
        }
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.jb V6() {
        return (com.p314xaae8f345.mm.p2621x8fb0427b.jb) ((jz5.n) this.f253697e).mo141623x754a37bb();
    }

    public final void W6() {
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) this.f253701i).mo141623x754a37bb(), null, new eg4.c1(this, null), 1, null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dyl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.fbf);
        mo78530x8b45058f();
        try {
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).g();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AddFriendVerifyRecordUI", e17, "try cancel notification fail", new java.lang.Object[0]);
        }
        if (!gm0.j1.a()) {
            finish();
            return;
        }
        this.f253703n = c01.id.c();
        com.p314xaae8f345.mm.p2621x8fb0427b.jb V6 = V6();
        ?? r17 = (V6 == null || !(((java.util.ArrayList) V6.z0()).isEmpty() ^ true)) ? 0 : 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordUI", "onCreate: hasLocalVerifyRecord=" + ((boolean) r17) + ", report has_backend_sync=" + ((int) r17));
        if (!this.f253704o) {
            this.f253704o = true;
            cy1.a aVar = (cy1.a) ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FMessageConversationUI)).ik(this, 4, 33926);
            aVar.fk(this, "page_sessionid", java.lang.Long.valueOf(this.f253703n));
            aVar.fk(this, "new_friends_page_type", 2);
            aVar.fk(this, "has_backend_sync", java.lang.Integer.valueOf((int) r17));
        }
        mo54448x9c8c0d33(new eg4.s0(this));
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.gum), new eg4.u0(this));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) this.f253696d).mo141623x754a37bb();
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this, 1, false));
            c22849x81a93d25.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.C18504x12184680(new eg4.f1(this)), new java.util.ArrayList(), false));
            c22849x81a93d25.i(new eg4.e1(this));
            W6();
        }
        this.f253702m = new eg4.v0(this);
        com.p314xaae8f345.mm.p2621x8fb0427b.jb V62 = V6();
        if (V62 != null) {
            V62.add(this.f253702m);
        }
        this.f253699g = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) this.f253698f).mo141623x754a37bb()).getBoolean("all_history_fetched", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordUI", "onCreate: hasFetchedAll=" + this.f253699g + ", no initial sync");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        l75.q0 q0Var = this.f253702m;
        if (q0Var != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.jb V6 = V6();
            if (V6 != null) {
                V6.mo49775xc84af884(q0Var);
            }
            this.f253702m = null;
        }
        r21.w.wi().y0();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
    }
}
