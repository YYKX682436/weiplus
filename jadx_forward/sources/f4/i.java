package f4;

/* loaded from: classes15.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.Executor f340921a;

    /* renamed from: b, reason: collision with root package name */
    public final f4.g f340922b;

    /* renamed from: c, reason: collision with root package name */
    public final f4.q f340923c;

    /* renamed from: d, reason: collision with root package name */
    public final float f340924d;

    public i(android.view.Window window, java.util.concurrent.Executor executor, f4.g gVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f340921a = executor;
        this.f340922b = gVar;
        android.view.View peekDecorView = window.peekDecorView();
        if (peekDecorView == null) {
            throw new java.lang.IllegalStateException("window.peekDecorView() is null: JankStats can only be created with a Window that has a non-null DecorView");
        }
        android.view.ViewParent parent = peekDecorView.getParent();
        android.view.View view = peekDecorView;
        while (parent instanceof android.view.View) {
            view = parent;
            parent = view.getParent();
        }
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.jid);
        if (tag == null) {
            tag = new f4.s();
            view.setTag(com.p314xaae8f345.mm.R.id.jid, tag);
        }
        f4.s sVar = (f4.s) tag;
        if (sVar.f340937a == null) {
            sVar.f340937a = new f4.u(null);
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        f4.q pVar = i17 >= 31 ? new f4.p(this, peekDecorView, window) : i17 >= 26 ? new f4.o(this, peekDecorView, window) : new f4.n(this, peekDecorView, window);
        this.f340923c = pVar;
        pVar.a(true);
        this.f340924d = 2.0f;
    }

    public final void a(boolean z17) {
        this.f340923c.a(z17);
    }
}
