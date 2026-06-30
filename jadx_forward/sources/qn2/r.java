package qn2;

/* loaded from: classes3.dex */
public final class r implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f446674d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f446675e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f446676f;

    public r(qn2.z zVar, java.lang.ref.WeakReference rPlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rPlugin, "rPlugin");
        this.f446674d = rPlugin;
        this.f446675e = "FinderLiveLotteryCardPlugin";
    }

    @Override // ym5.w1
    public void a(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        qn2.z zVar = (qn2.z) this.f446674d.get();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BigAnimListener onAnimationCancel ViewCallback is null:");
        sb6.append(zVar == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f446675e, sb6.toString());
        android.widget.FrameLayout frameLayout = zVar != null ? zVar.f446754q : null;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = zVar != null ? zVar.f446755r : null;
        if (c22789xd23e9a9b2 != null) {
            c22789xd23e9a9b2.setVisibility(8);
        }
        yz5.a aVar = this.f446676f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // ym5.w1
    public void b(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2;
        qn2.z zVar = (qn2.z) this.f446674d.get();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BigAnimListener onAnimationStart ViewCallback is null:");
        sb6.append(zVar == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f446675e, sb6.toString());
        android.widget.FrameLayout frameLayout = zVar != null ? zVar.f446754q : null;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = zVar != null ? zVar.f446755r : null;
        if (c22789xd23e9a9b3 != null) {
            c22789xd23e9a9b3.setVisibility(0);
        }
        if (zVar == null || (c22789xd23e9a9b2 = zVar.f446755r) == null) {
            return;
        }
        c22789xd23e9a9b2.d();
    }

    @Override // ym5.w1
    public void c(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        qn2.z zVar = (qn2.z) this.f446674d.get();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BigAnimListener onAnimationEnd ViewCallback is null:");
        sb6.append(zVar == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f446675e, sb6.toString());
        android.widget.FrameLayout frameLayout = zVar != null ? zVar.f446754q : null;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = zVar != null ? zVar.f446755r : null;
        if (c22789xd23e9a9b2 != null) {
            c22789xd23e9a9b2.setVisibility(8);
        }
        yz5.a aVar = this.f446676f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // ym5.w1
    public void e(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
    }
}
