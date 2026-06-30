package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public final class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f281069d = 3;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sb5.z f281070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f281071f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f281072g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f281073h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f281074i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 f281075m;

    public n4(sb5.z zVar, long j17, int i17, int i18, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689) {
        this.f281070e = zVar;
        this.f281071f = j17;
        this.f281072g = i17;
        this.f281073h = i18;
        this.f281074i = f9Var;
        this.f281075m = c21897x17252689;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) this.f281070e;
        long j17 = this.f281071f;
        android.view.View O0 = kVar.O0(j17);
        android.view.KeyEvent.Callback findViewById = O0 != null ? O0.findViewById(com.p314xaae8f345.mm.R.id.sr8) : null;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 c22100x47612006 = findViewById instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006) findViewById : null;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Long.valueOf(j17);
        int i17 = this.f281072g;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Boolean.valueOf(c22100x47612006 != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemMediaGroupCommonComponent", "[tryUpdateMediaGroupMvvmViewOnTongue] msgId:%s selection:%s mvvmView:%s", objArr);
        if (c22100x47612006 != null) {
            int i18 = this.f281073h;
            c22100x47612006.m80181xe076ab3b(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.e1(i18));
            c22100x47612006.D(this.f281074i);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemMediaGroupCommonComponent", "[tryUpdateMediaGroupMvvmViewOnTongue] msgId:%s selection:%s unreadCount:%s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return;
        }
        int i19 = this.f281069d;
        this.f281069d = i19 - 1;
        if (i19 > 0) {
            this.f281075m.m79872xcc101dd9().m75894x7c4d7ca2(this, 100L);
        }
    }
}
