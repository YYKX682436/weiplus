package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.ListPopupWindow f9644d;

    public l1(androidx.appcompat.widget.ListPopupWindow listPopupWindow) {
        this.f9644d = listPopupWindow;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.appcompat.widget.ListPopupWindow listPopupWindow = this.f9644d;
        androidx.appcompat.widget.b1 b1Var = listPopupWindow.f9419f;
        if (b1Var != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (!n3.x0.b(b1Var) || listPopupWindow.f9419f.getCount() <= listPopupWindow.f9419f.getChildCount() || listPopupWindow.f9419f.getChildCount() > listPopupWindow.f9429s) {
                return;
            }
            listPopupWindow.E.setInputMethodMode(2);
            listPopupWindow.show();
        }
    }
}
