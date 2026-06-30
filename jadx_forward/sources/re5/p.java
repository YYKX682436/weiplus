package re5;

/* loaded from: classes8.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f476120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gg3.c f476121e;

    public p(android.widget.TextView textView, gg3.c cVar) {
        this.f476120d = textView;
        this.f476121e = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = "." + com.p314xaae8f345.mm.vfs.w6.n(this.f476121e.f353262d);
        android.widget.TextView textView = this.f476120d;
        textView.setText(str);
        textView.invalidate();
    }
}
