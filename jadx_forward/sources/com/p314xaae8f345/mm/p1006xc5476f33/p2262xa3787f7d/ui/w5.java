package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class w5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 f254710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f254711e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ScrollView f254712f;

    public w5(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049, int i17, android.widget.ScrollView scrollView) {
        this.f254710d = c22607x763d2049;
        this.f254711e = i17;
        this.f254712f = scrollView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049 = this.f254710d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c22607x763d2049.getHeight());
        int i17 = this.f254711e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeGuardianInfoUI", "inputContainer.height: %d, screenHeight: %d", valueOf, java.lang.Integer.valueOf(i17));
        if (c22607x763d2049.getHeight() > i17) {
            this.f254712f.scrollBy(0, c22607x763d2049.getHeight() - i17);
        }
    }
}
