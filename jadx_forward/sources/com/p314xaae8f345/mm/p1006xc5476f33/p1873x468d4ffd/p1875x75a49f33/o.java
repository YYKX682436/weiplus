package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes10.dex */
public class o implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.ActivityC16536xd4e3d45b f230595d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.ActivityC16536xd4e3d45b activityC16536xd4e3d45b) {
        this.f230595d = activityC16536xd4e3d45b;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onCompletion */
    public void mo9755xa6db431b() {
        this.f230595d.f230392e.a(0.0d, true);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onError */
    public void mo9756xaf8aa769(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightEditUI", "%d on error what %d extra %d", java.lang.Integer.valueOf(this.f230595d.hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onPrepared */
    public void mo9757x58d5b73c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.ActivityC16536xd4e3d45b activityC16536xd4e3d45b = this.f230595d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = activityC16536xd4e3d45b.f230392e;
        if (c19745xad58a1a4 != null) {
            c19745xad58a1a4.mo69330x68ac462();
            activityC16536xd4e3d45b.f230392e.mo69317x764cf626(true);
            activityC16536xd4e3d45b.f230392e.setAlpha(1.0f);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.n(this), 300L);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public int q(int i17, int i18) {
        return 0;
    }
}
