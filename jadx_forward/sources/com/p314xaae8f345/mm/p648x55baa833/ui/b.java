package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10330xb121fb05 f145579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f145580e;

    public b(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10330xb121fb05 activityC10330xb121fb05, android.content.Intent intent) {
        this.f145579d = activityC10330xb121fb05;
        this.f145580e = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10330xb121fb05 activityC10330xb121fb05 = this.f145579d;
        activityC10330xb121fb05.setResult(-1, this.f145580e);
        activityC10330xb121fb05.finish();
    }
}
