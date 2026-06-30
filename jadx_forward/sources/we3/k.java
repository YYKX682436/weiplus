package we3;

/* loaded from: classes11.dex */
public final class k extends ve3.q {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f526812a;

    /* renamed from: b, reason: collision with root package name */
    public final int f526813b;

    /* renamed from: c, reason: collision with root package name */
    public final int f526814c;

    /* renamed from: d, reason: collision with root package name */
    public final int f526815d;

    /* renamed from: e, reason: collision with root package name */
    public final mn0.b0 f526816e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f526817f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f526818g;

    public k(java.lang.String finder_export_id, java.lang.String finder_object_id, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finder_export_id, "finder_export_id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finder_object_id, "finder_object_id");
        this.f526812a = finder_export_id;
        this.f526813b = i17;
        this.f526814c = i18;
        this.f526815d = i19;
        c50.q0 q0Var = (c50.q0) i95.n0.c(c50.q0.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        mn0.b0 wi6 = ((v40.q) q0Var).wi(context);
        this.f526816e = wi6;
        mn0.y yVar = (mn0.y) wi6;
        yVar.G(true);
        yVar.K(mn0.d0.B, 23);
        ls5.d dVar = yVar.f411340f;
        if (dVar != null) {
            dVar.f402661h = new we3.g();
        }
        yVar.Q(0);
        yVar.J(new we3.h(this));
    }

    @Override // ve3.q
    public int a() {
        return this.f526813b;
    }

    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBFinderLivePlayerItem", "destroy, playId: " + this.f526813b);
        this.f526817f = false;
        mn0.b0 b0Var = this.f526816e;
        ls5.d dVar = ((mn0.y) b0Var).f411340f;
        if (dVar != null) {
            dVar.f402661h = new we3.i();
        }
        mn0.b0.C(b0Var, false, false, false, 6, null);
        ((mn0.y) b0Var).w();
    }

    public void e(ve3.o callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (this.f526818g) {
            ((xd3.c) callback).b(-1, "cgi still requesting");
            return;
        }
        if (((mn0.y) this.f526816e).b(false)) {
            ((xd3.c) callback).b(-1, "already playing");
            return;
        }
        this.f526818g = true;
        this.f526817f = true;
        i95.m c17 = i95.n0.c(s40.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        s40.w0.U9((s40.w0) c17, 0L, "", 65, 2, "", true, null, 0L, null, false, false, this.f526812a, null, 0, 10176, null).l().K(new we3.j(this, callback));
    }
}
