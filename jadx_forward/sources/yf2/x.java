package yf2;

/* loaded from: classes3.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.z f543341d;

    public x(yf2.z zVar) {
        this.f543341d = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view;
        yf2.z zVar = this.f543341d;
        if (!zVar.f543356p && (view = zVar.f543353m) != null) {
            view.setEnabled(true);
        }
        android.view.View view2 = zVar.f543353m;
        if (view2 != null) {
            view2.setOnClickListener(new yf2.w(zVar));
        }
    }
}
