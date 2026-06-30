package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.b1 f9509d;

    public a1(androidx.appcompat.widget.b1 b1Var) {
        this.f9509d = b1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.appcompat.widget.b1 b1Var = this.f9509d;
        b1Var.f9532s = null;
        b1Var.drawableStateChanged();
    }
}
