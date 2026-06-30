package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public class c8 implements c01.qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f279616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21385x68412954 f279617c;

    public c8(com.p314xaae8f345.mm.ui.ActivityC21385x68412954 activityC21385x68412954, int i17, android.app.ProgressDialog progressDialog) {
        this.f279617c = activityC21385x68412954;
        this.f279615a = i17;
        this.f279616b = progressDialog;
    }

    @Override // c01.qa
    public void a(com.p314xaae8f345.mm.p971x6de15a2e.s sVar) {
        synchronized (com.p314xaae8f345.mm.ui.ActivityC21385x68412954.f278353f) {
            com.p314xaae8f345.mm.ui.ActivityC21385x68412954.f278352e = true;
        }
        com.p314xaae8f345.mm.ui.a8 a8Var = new com.p314xaae8f345.mm.ui.a8(this);
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar2 = c01.d9.e().f152297d;
        if (sVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneQueue", "flushPushLog autoAuth  == null");
        } else {
            sVar2.m0();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40529x312e01fd();
        com.p314xaae8f345.mm.app.i3.d(new int[]{this.f279615a}, gm0.j1.a(), gm0.j1.a() ? gm0.j1.b().h() : 0, 0, 24, null, "", "", new com.p314xaae8f345.mm.ui.b8(this, a8Var));
    }
}
