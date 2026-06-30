package ky2;

/* loaded from: classes.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f395105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ky2.w f395106e;

    public p(android.widget.EditText editText, ky2.w wVar) {
        this.f395105d = editText;
        this.f395106e = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f395105d.requestFocus();
        this.f395106e.f395124n = false;
    }
}
