package i13;

/* loaded from: classes10.dex */
public final class h extends i13.c implements i50.m {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f368818h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f368819i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f368820m;

    /* renamed from: n, reason: collision with root package name */
    public final int f368821n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f368822o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f368823p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f368824q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f368825r;

    /* renamed from: s, reason: collision with root package name */
    public final yz5.l f368826s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String id6, java.lang.String title, java.lang.String desc, java.util.Map extraParams, int i17, java.lang.String str, android.graphics.drawable.Drawable drawable, boolean z17, boolean z18, yz5.l lVar) {
        super(id6, 0L, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraParams, "extraParams");
        this.f368818h = title;
        this.f368819i = desc;
        this.f368820m = extraParams;
        this.f368821n = i17;
        this.f368822o = str;
        this.f368823p = drawable;
        this.f368824q = z17;
        this.f368825r = z18;
        this.f368826s = lVar;
    }

    @Override // i13.c
    public android.graphics.drawable.Drawable b() {
        android.graphics.drawable.Drawable drawable = this.f368823p;
        return drawable == null ? super.b() : drawable;
    }

    @Override // i13.c
    public java.lang.String c() {
        java.lang.String str = this.f368822o;
        return str == null ? super.c() : str;
    }

    @Override // i13.c
    public boolean e() {
        return this.f368824q;
    }

    @Override // i13.c
    public boolean f() {
        return this.f368825r;
    }

    @Override // i13.c
    public void g() {
        super.g();
        int i17 = 1;
        if (this.f368821n == 1) {
            i50.q qVar = (i50.q) i95.n0.c(i50.q.class);
            i95.m c17 = i95.n0.c(h13.l0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            if (h13.l0.Ui((h13.l0) c17, null, 1, null)) {
                i95.m c18 = i95.n0.c(h13.l0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                if (!h13.l0.Vi((h13.l0) c18, null, 1, null)) {
                    i17 = 4;
                }
            } else {
                i95.m c19 = i95.n0.c(h13.l0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                i17 = h13.l0.Vi((h13.l0) c19, null, 1, null) ? 3 : 2;
            }
            ((h13.c0) qVar).Di("", i17, 5, this.f368808d, false, null);
        }
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return 3;
    }

    @Override // i13.c
    public void i() {
        java.lang.String str = (java.lang.String) this.f368820m.get("weAppUsername");
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        int size = k13.l1.I.a().f384772q.size();
        ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Ni(3, this.f368821n == 1 ? 5 : 3, str2, size, this.f368808d);
    }

    @Override // i13.c
    public void k(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        yz5.l lVar = this.f368826s;
        if (lVar != null) {
            lVar.mo146xb9724478(view);
        }
    }

    @Override // i13.c
    public void l(boolean z17) {
        super.l(z17);
        if (z17) {
            java.lang.String str = (java.lang.String) this.f368820m.get("weAppUsername");
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = str;
            int size = k13.l1.I.a().f384772q.size();
            ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Ni(2, this.f368821n == 1 ? 5 : 3, str2, size, this.f368808d);
        }
    }

    @Override // i13.c
    public void n(in5.s0 holder, android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        yz5.l lVar = this.f368826s;
        if (lVar != null) {
            lVar.mo146xb9724478(view);
        }
    }

    @Override // i13.c
    public void o() {
        super.o();
        i13.n a17 = i13.n.f368830c.a();
        a17.getClass();
        java.lang.String forcePushId = this.f368808d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forcePushId, "forcePushId");
        a17.f368833b.remove(forcePushId);
        j13.a.f378710d.d(forcePushId);
    }
}
