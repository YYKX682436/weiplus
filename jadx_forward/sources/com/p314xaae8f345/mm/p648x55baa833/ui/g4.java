package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes9.dex */
public final class g4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10345xa3bf9f3e f145708d;

    public g4(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10345xa3bf9f3e activityC10345xa3bf9f3e) {
        this.f145708d = activityC10345xa3bf9f3e;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10345xa3bf9f3e activityC10345xa3bf9f3e = this.f145708d;
        intent.putExtra("intent_key_invitation_reason", java.lang.String.valueOf(((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21525x1d56253b) ((jz5.n) activityC10345xa3bf9f3e.f145319d).mo141623x754a37bb()).getText()));
        activityC10345xa3bf9f3e.setResult(-1, intent);
        activityC10345xa3bf9f3e.finish();
        return true;
    }
}
