package i24;

/* loaded from: classes4.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f369614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.p2069x59a10c41.C17573xff4753cb f369615e;

    public a(android.widget.LinearLayout linearLayout, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.p2069x59a10c41.C17573xff4753cb c17573xff4753cb) {
        this.f369614d = linearLayout;
        this.f369615e = c17573xff4753cb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object tag = this.f369614d.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type android.app.Dialog");
        ((android.app.Dialog) tag).dismiss();
        this.f369615e.s7();
    }
}
