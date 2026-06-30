package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 f145729d;

    public h0(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5) {
        this.f145729d = activityC10332x8a1129f5;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5 = this.f145729d;
        db5.t7.h(activityC10332x8a1129f5.mo55332x76847179(), activityC10332x8a1129f5.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hqj));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("dismiss_chatroom", true);
        activityC10332x8a1129f5.setResult(-1, intent);
        if (activityC10332x8a1129f5.isFinishing()) {
            return;
        }
        activityC10332x8a1129f5.finish();
    }
}
