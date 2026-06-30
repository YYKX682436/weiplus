package vz4;

/* loaded from: classes8.dex */
public final class z implements com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f523310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f523311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f523312c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz4.j f523313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f523314e;

    public z(java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, vz4.j jVar, java.lang.String str2) {
        this.f523310a = str;
        this.f523311b = h0Var;
        this.f523312c = c0Var;
        this.f523313d = jVar;
        this.f523314e = str2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.c
    public final void a(java.lang.Object obj) {
        if ((obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.C19536xae4f4bc7) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f523310a, ((com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.C19536xae4f4bc7) obj).f269863d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.h.b((com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.c) this.f523311b.f391656d);
            vz4.d0 d0Var = vz4.d0.f523262a;
            java.lang.Object obj2 = vz4.d0.f523263b;
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f523312c;
            vz4.j jVar = this.f523313d;
            java.lang.String str = this.f523314e;
            synchronized (obj2) {
                if (!c0Var.f391645d) {
                    c0Var.f391645d = true;
                    jVar.mo64503xe05b4124(str);
                }
            }
            ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.WePkgUpdateManager");
        }
    }
}
