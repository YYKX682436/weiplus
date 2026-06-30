package d6;

/* loaded from: classes14.dex */
public final class k implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f308181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d6.l f308182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewTreeObserver f308183f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f308184g;

    public k(d6.l lVar, android.view.ViewTreeObserver viewTreeObserver, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f308182e = lVar;
        this.f308183f = viewTreeObserver;
        this.f308184g = qVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        d6.l lVar = this.f308182e;
        p135x2eae8f.p138x35e001.C1420x6f1c9387 b17 = d6.i.b(lVar);
        if (b17 != null) {
            android.view.ViewTreeObserver viewTreeObserver = this.f308183f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewTreeObserver, "viewTreeObserver");
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                ((d6.f) lVar).f308172c.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f308181d) {
                this.f308181d = true;
                ((p3325xe03a0797.p3326xc267989b.r) this.f308184g).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(b17));
            }
        }
        return true;
    }
}
