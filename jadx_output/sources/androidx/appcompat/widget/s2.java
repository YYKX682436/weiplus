package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.Toolbar f9700d;

    public s2(androidx.appcompat.widget.Toolbar toolbar) {
        this.f9700d = toolbar;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.appcompat.widget.q qVar;
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f9700d.f9478d;
        if (actionMenuView == null || (qVar = actionMenuView.f9340z) == null) {
            return;
        }
        qVar.o();
    }
}
