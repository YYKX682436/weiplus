package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

/* loaded from: classes15.dex */
public final class t0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19173xce219fad f262742d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19173xce219fad activityC19173xce219fad) {
        this.f262742d = activityC19173xce219fad;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19173xce219fad activityC19173xce219fad = this.f262742d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WecoinIapUI", "showLoadingDialog onCancel currentScene: %d", java.lang.Integer.valueOf(activityC19173xce219fad.f262661h));
        nt4.f a17 = activityC19173xce219fad.f262661h == activityC19173xce219fad.f262660g ? nt4.f.a(7) : nt4.f.a(1);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_err_code", a17.f421356a);
        intent.putExtra("key_err_msg", a17.f421357b);
        activityC19173xce219fad.setResult(-1, intent);
        activityC19173xce219fad.finish();
    }
}
