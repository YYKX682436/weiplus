package zu3;

/* loaded from: classes10.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2004x317b13.C17058xaee30621 f557339d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2004x317b13.C17058xaee30621 c17058xaee30621) {
        this.f557339d = c17058xaee30621;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2004x317b13.C17058xaee30621 c17058xaee30621 = this.f557339d;
        android.view.View view = c17058xaee30621.B;
        if (view != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            c17058xaee30621.h(view, false);
        }
    }
}
