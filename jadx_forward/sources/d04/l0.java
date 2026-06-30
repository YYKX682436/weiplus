package d04;

/* loaded from: classes13.dex */
public final class l0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 f306989d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 c17327x39ee10a4) {
        this.f306989d = c17327x39ee10a4;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 c17327x39ee10a4 = this.f306989d;
        java.lang.Object obj = c17327x39ee10a4.N1;
        if (obj == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanProductListView");
            throw null;
        }
        ((android.view.View) obj).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        d04.j jVar = c17327x39ee10a4.N1;
        if (jVar != null) {
            jVar.c(c17327x39ee10a4.getMBottomExtraHeight());
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanProductListView");
            throw null;
        }
    }
}
