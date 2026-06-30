package rv4;

/* loaded from: classes12.dex */
public abstract class a0 implements nv4.g {

    /* renamed from: a, reason: collision with root package name */
    public final rv4.w f481960a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f481961b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f481962c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f481963d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f481964e;

    public a0(rv4.w session, boolean z17, java.lang.String title, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f481960a = session;
        this.f481961b = z17;
        this.f481962c = title;
        this.f481963d = z18;
    }

    public final ov4.e a(ov4.f fVar) {
        return new ov4.e(this.f481960a.f413207a, null, "", 0, 3, fVar, 0L, b(), "", this.f481962c, 0, null, 0, 7242, null);
    }

    public abstract java.lang.String b();

    public abstract boolean d();

    public abstract void e(boolean z17);

    @Override // nv4.g
    public void w() {
        this.f481960a.f413208b.d("setting-entry-" + this.f481962c + '-' + d(), a(ov4.f.f430763e));
    }
}
