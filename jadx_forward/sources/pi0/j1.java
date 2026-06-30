package pi0;

/* loaded from: classes4.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f436154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f436155e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f436156f;

    public j1(android.view.ViewGroup viewGroup, pi0.l1 l1Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f436154d = viewGroup;
        this.f436155e = l1Var;
        this.f436156f = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup = this.f436154d;
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        io.p3284xd2ae381c.Log.i(this.f436155e.k(), "container size:[" + width + ", " + height + ']');
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        ((p3325xe03a0797.p3326xc267989b.r) this.f436156f).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new android.graphics.Point(width, height)));
    }
}
