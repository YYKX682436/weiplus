package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public final class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f146235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f146236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.h1 f146237f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f146238g;

    public z1(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var, com.p314xaae8f345.mm.p648x55baa833.ui.h1 h1Var, int i17) {
        this.f146235d = context;
        this.f146236e = f4Var;
        this.f146237f = h1Var;
        this.f146238g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f146235d;
        if (context != null && (context instanceof android.app.Activity) && !((android.app.Activity) context).isDestroyed()) {
            this.f146236e.cancel();
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.j1 j1Var = (com.p314xaae8f345.mm.p648x55baa833.ui.j1) this.f146237f;
        j1Var.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        int i17 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10339x9e5e23ee.f145260s;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10339x9e5e23ee activityC10339x9e5e23ee = j1Var.f145777a;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = a17.z0(activityC10339x9e5e23ee.Z6());
        int i18 = (int) (z07.f69084x8729abea | 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomManagerUI", "dealDelChatroomBtn, state = " + i18);
        z07.f69084x8729abea = i18;
        c01.v1.M(z07);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("dismiss_chatroom", true);
        activityC10339x9e5e23ee.setResult(-1, intent);
        activityC10339x9e5e23ee.W6(4L, this.f146238g);
        activityC10339x9e5e23ee.finish();
    }
}
