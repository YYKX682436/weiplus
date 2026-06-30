package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes8.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f293300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f f293301e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f293302f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f293303g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f293304h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f293305i;

    public e(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f fVar, java.lang.CharSequence charSequence, boolean z17, int i17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        this.f293300d = context;
        this.f293301e = fVar;
        this.f293302f = charSequence;
        this.f293303g = z17;
        this.f293304h = i17;
        this.f293305i = onCancelListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f293300d;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null || !(activity.isDestroyed() || activity.isFinishing())) {
            this.f293301e.f293318c = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context, this.f293302f, this.f293303g, this.f293304h, this.f293305i);
        }
    }
}
