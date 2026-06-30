package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.ListPopupWindow f9602d;

    public h1(androidx.appcompat.widget.ListPopupWindow listPopupWindow) {
        this.f9602d = listPopupWindow;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.appcompat.widget.b1 b1Var = this.f9602d.f9419f;
        if (b1Var != null) {
            b1Var.setListSelectionHidden(true);
            b1Var.requestLayout();
        }
    }
}
