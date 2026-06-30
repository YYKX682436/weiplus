package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes8.dex */
public final class z extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f148917d;

    /* renamed from: e, reason: collision with root package name */
    public zh1.w0 f148918e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f148917d = jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.y(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgByOtherAppUIC", "onActivityResult requestCode:" + i17 + " resultCode:" + i18);
        if (i17 == 2) {
            jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            ((ht.a) vVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.f(m158354x19263085, i17, i18, intent, true, com.p314xaae8f345.mm.R.C30867xcad56011.brq, com.p314xaae8f345.mm.R.C30867xcad56011.brr, 17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.x(this));
        }
    }
}
