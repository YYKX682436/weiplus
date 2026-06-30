package ky2;

/* loaded from: classes.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f395098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ky2.w f395099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f395100f;

    public n(android.widget.EditText editText, ky2.w wVar, int i17) {
        this.f395098d = editText;
        this.f395099e = wVar;
        this.f395100f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f395100f;
        ky2.w wVar = this.f395099e;
        android.widget.EditText editText = this.f395098d;
        editText.postDelayed(new ky2.m(i17, wVar, editText), 300L);
        wVar.getClass();
    }
}
