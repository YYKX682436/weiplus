package rf4;

/* loaded from: classes4.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f476593a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.l f476594b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.l f476595c;

    /* renamed from: d, reason: collision with root package name */
    public int f476596d;

    /* renamed from: e, reason: collision with root package name */
    public final long f476597e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f476598f;

    public h2(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f476593a = view;
        this.f476597e = android.view.ViewConfiguration.getDoubleTapTimeout();
        this.f476598f = new rf4.g2(this);
    }

    public final void a() {
        yz5.l lVar;
        int i17 = this.f476596d;
        android.view.View view = this.f476593a;
        if (i17 == 1) {
            yz5.l lVar2 = this.f476594b;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(view);
            }
        } else if (i17 == 2 && (lVar = this.f476595c) != null) {
            lVar.mo146xb9724478(view);
        }
        this.f476596d = 0;
    }
}
