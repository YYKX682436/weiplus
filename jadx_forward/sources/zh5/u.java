package zh5;

/* loaded from: classes8.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f554604d;

    public u(android.app.Dialog dialog) {
        this.f554604d = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f554604d.dismiss();
    }
}
