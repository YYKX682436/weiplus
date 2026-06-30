package bb2;

/* loaded from: classes10.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13682x42ec4fe7 f100396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13682x42ec4fe7 c13682x42ec4fe7) {
        super(0);
        this.f100396d = c13682x42ec4fe7;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13682x42ec4fe7 c13682x42ec4fe7 = this.f100396d;
        c13682x42ec4fe7.setVisibility(8);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = c13682x42ec4fe7.f184316e;
        if (c22789xd23e9a9b.f()) {
            c22789xd23e9a9b.n();
        }
        c13682x42ec4fe7.f184319h = 0L;
        c13682x42ec4fe7.f184318g = false;
        c13682x42ec4fe7.f184321m = false;
        c13682x42ec4fe7.f184324p = false;
        java.lang.Runnable runnable = c13682x42ec4fe7.f184323o;
        if (runnable != null) {
            c13682x42ec4fe7.removeCallbacks(runnable);
        }
        c13682x42ec4fe7.f184323o = null;
        pm0.v.C(c13682x42ec4fe7.f184333y);
        java.lang.Runnable runnable2 = c13682x42ec4fe7.f184320i;
        if (runnable2 != null) {
            c13682x42ec4fe7.removeCallbacks(runnable2);
        }
        c13682x42ec4fe7.f184320i = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13682x42ec4fe7.a(c13682x42ec4fe7);
        android.view.View view = c13682x42ec4fe7.f184325q;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(c13682x42ec4fe7.f184326r);
        }
        c13682x42ec4fe7.f184325q = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBulletFastFollowBtn", "removeFooterLayoutChangeListener");
        return jz5.f0.f384359a;
    }
}
