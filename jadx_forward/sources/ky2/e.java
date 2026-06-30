package ky2;

/* loaded from: classes.dex */
public final class e implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f395060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ky2.w f395061e;

    public e(android.view.View view, ky2.w wVar) {
        this.f395060d = view;
        this.f395061e = wVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        ky2.w wVar = this.f395061e;
        if (!z17) {
            wVar.getClass();
            return;
        }
        this.f395060d.getLocationInWindow(new int[2]);
        wVar.getClass();
    }
}
