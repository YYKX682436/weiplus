package bt2;

/* loaded from: classes.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f24177d;

    public a(android.view.ViewGroup viewGroup) {
        this.f24177d = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup = this.f24177d;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        marginLayoutParams.topMargin = (marginLayoutParams2 != null ? java.lang.Integer.valueOf(marginLayoutParams2.topMargin + com.tencent.mm.ui.bl.h(viewGroup.getContext())) : null).intValue();
    }
}
