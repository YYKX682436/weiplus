package cw2;

/* loaded from: classes8.dex */
public final class p7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f305472d;

    public p7(android.view.View view) {
        this.f305472d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f305472d.requestLayout();
    }
}
