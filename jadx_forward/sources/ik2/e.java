package ik2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f373418a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f373419b;

    /* renamed from: c, reason: collision with root package name */
    public hq0.e0 f373420c;

    public e() {
        ((oe0.x) i95.n0.c(oe0.x.class)).getClass();
        this.f373418a = "wxe208ce76dfa39515";
    }

    public final void a(android.content.Context context, java.lang.String finderUserName, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFrameSetSurfaceMgr", "createFrameSetRoot now:" + this.f373420c);
        if (this.f373420c == null) {
            this.f373420c = ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).wi(new java.lang.Object(), context, new oe0.u(finderUserName, j17, null, null, null, null, null, null, 252, null));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFrameSetSurfaceMgr", "createFrameSetRoot done now:" + this.f373420c);
        }
    }

    public final void b() {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFrameSetSurfaceMgr", "unMount");
        hq0.e0 e0Var = this.f373420c;
        if (e0Var != null && (str = e0Var.f364517e) != null) {
            ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).Bi(str);
        }
        this.f373420c = null;
    }
}
