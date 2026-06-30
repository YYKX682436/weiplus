package hb2;

/* loaded from: classes.dex */
public final class i0 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f361589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f361590e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f361591f;

    public i0(yz5.l lVar, int i17, android.content.Context context) {
        this.f361589d = lVar;
        this.f361590e = i17;
        this.f361591f = context;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.hi2 req = (r45.hi2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        if (ret.m75939xb282bd08(1) == 0) {
            this.f361589d.mo146xb9724478(java.lang.Integer.valueOf(this.f361590e));
            return;
        }
        android.content.Context context = this.f361591f;
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572890mh5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.f293309c = string;
        e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
        e4Var.c();
    }
}
