package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.f1 f9548d;

    public d1(androidx.appcompat.widget.f1 f1Var) {
        this.f9548d = f1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.ViewParent parent = this.f9548d.f9579g.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
