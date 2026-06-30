package gm2;

/* loaded from: classes3.dex */
public final class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355055d;

    public w1(android.view.View view) {
        this.f355055d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f355055d.invalidate();
    }
}
