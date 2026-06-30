package af5;

/* loaded from: classes11.dex */
public final class n0 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b f86148d;

    public n0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b c22094xdaed490b) {
        this.f86148d = c22094xdaed490b;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b c22094xdaed490b = this.f86148d;
        c22094xdaed490b.f286180h.f313743c.c();
        com.p314xaae8f345.mm.p2776x373aa5.C22809x58ed379d c22809x58ed379d = c22094xdaed490b.f286186q;
        if (c22809x58ed379d != null) {
            c22809x58ed379d.m82754xe0abd62e(false);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
            throw null;
        }
    }
}
