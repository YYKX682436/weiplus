package s50;

/* loaded from: classes12.dex */
public final class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s50.l1 f484562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f484563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f484564f;

    public a1(s50.l1 l1Var, java.lang.ref.WeakReference weakReference, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f484562d = l1Var;
        this.f484563e = weakReference;
        this.f484564f = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k23.j2 m17 = ((k23.v0) this.f484564f.f391656d).m();
        s50.l1.Ai(this.f484562d, this.f484563e, m17 != null ? m17.m141821x8cbe620() : 0);
    }
}
