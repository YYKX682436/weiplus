package wu3;

/* loaded from: classes5.dex */
public final class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17048x9295f61d f531361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f531362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f531363f;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17048x9295f61d c17048x9295f61d, int i17, int i18) {
        this.f531361d = c17048x9295f61d;
        this.f531362e = i17;
        this.f531363f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17048x9295f61d c17048x9295f61d = this.f531361d;
        android.widget.Scroller scroller = c17048x9295f61d.f237591e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(scroller);
        scroller.startScroll(c17048x9295f61d.f237594h, 0, this.f531362e, 0, this.f531363f);
        c17048x9295f61d.invalidate();
    }
}
