package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class p0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r0 f91203d;

    public p0(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r0 r0Var) {
        this.f91203d = r0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r0 r0Var = this.f91203d;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0091x9a98b7b6 c0091x9a98b7b6 = r0Var.L;
        r0Var.getClass();
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (!(n3.x0.b(c0091x9a98b7b6) && c0091x9a98b7b6.getGlobalVisibleRect(r0Var.K))) {
            r0Var.mo2732x63a3b28a();
        } else {
            r0Var.g();
            super/*androidx.appcompat.widget.ListPopupWindow*/.mo2735x35dafd();
        }
    }
}
