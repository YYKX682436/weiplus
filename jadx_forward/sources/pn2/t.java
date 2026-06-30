package pn2;

/* loaded from: classes3.dex */
public final class t implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f438560d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f438561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pn2.c0 f438562f;

    public t(pn2.c0 c0Var, pn2.c0 viewCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewCallback, "viewCallback");
        this.f438562f = c0Var;
        this.f438560d = new java.lang.ref.WeakReference(viewCallback);
    }

    @Override // ym5.w1
    public void a(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        boolean z17 = ((pn2.c0) this.f438560d.get()) == null;
        java.lang.String str = this.f438562f.f438510m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showPrepareLottery onAnimationCancel,view:");
        sb6.append(c22789xd23e9a9b != null ? c22789xd23e9a9b.hashCode() : 0);
        sb6.append(" emptyViewCallback:");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        yz5.a aVar = this.f438561e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // ym5.w1
    public void b(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        java.lang.String str = this.f438562f.f438510m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAnimationStart:$");
        sb6.append(c22789xd23e9a9b != null ? c22789xd23e9a9b.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
    }

    @Override // ym5.w1
    public void c(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        pn2.c0 c0Var = (pn2.c0) this.f438560d.get();
        boolean z17 = c0Var == null;
        java.lang.String str = this.f438562f.f438510m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showPrepareLottery onAnimationEnd,view:");
        sb6.append(c22789xd23e9a9b != null ? c22789xd23e9a9b.hashCode() : 0);
        sb6.append(" emptyViewCallback:");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        android.widget.TextView B = c0Var != null ? c0Var.B() : null;
        if (B != null) {
            B.setVisibility(0);
        }
        yz5.a aVar = this.f438561e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // ym5.w1
    public void e(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        java.lang.String str = this.f438562f.f438510m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAnimationRepeat:$");
        sb6.append(c22789xd23e9a9b != null ? c22789xd23e9a9b.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
    }
}
