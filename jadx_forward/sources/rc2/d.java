package rc2;

/* loaded from: classes2.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc2.f f475465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475467f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f475468g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f475469h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f475470i;

    public d(rc2.f fVar, android.view.View view, android.view.View view2, java.util.List list, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.util.List list2) {
        this.f475465d = fVar;
        this.f475466e = view;
        this.f475467f = view2;
        this.f475468g = list;
        this.f475469h = c0Var;
        this.f475470i = list2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rc2.f fVar = this.f475465d;
        android.view.View view = this.f475466e;
        android.graphics.Rect T6 = fVar.T6(view);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, this.f475467f)) {
            T6.top += (int) fVar.m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        }
        fVar.U6(T6, "enableAlphaViewList");
        java.util.List<android.graphics.Rect> list = this.f475468g;
        if (list != null) {
            for (android.graphics.Rect rect : list) {
                in5.s0 s0Var = fVar.f475474d;
                rc2.f.P6(fVar, s0Var != null ? s0Var.f3639x46306858 : null, rect);
                if (T6.left < rect.right && T6.right > rect.left && T6.top < rect.bottom && T6.bottom > rect.top) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f475469h;
                    if (!c0Var.f391645d && view.getVisibility() == 0) {
                        c0Var.f391645d = true;
                        fVar.W6(true);
                        java.util.List<android.view.KeyEvent.Callback> list2 = this.f475470i;
                        if (list2 != null) {
                            for (android.view.KeyEvent.Callback callback : list2) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.alpha.IFeedEnableAlpha");
                                rc2.g gVar = (rc2.g) callback;
                                gVar.a(0.2f);
                                gVar.mo56030x57aaa426(false);
                            }
                        }
                    }
                }
            }
        }
    }
}
