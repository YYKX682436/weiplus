package yo1;

/* loaded from: classes5.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f545650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po1.d f545651e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf.ActivityC12864xc0eb7555 f545652f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f545653g;

    public f(android.net.Uri uri, po1.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf.ActivityC12864xc0eb7555 activityC12864xc0eb7555, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        this.f545650d = uri;
        this.f545651e = dVar;
        this.f545652f = activityC12864xc0eb7555;
        this.f545653g = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        to1.g gVar = to1.g.f502444a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf.ActivityC12864xc0eb7555 activityC12864xc0eb7555 = this.f545652f;
        po1.d dVar = activityC12864xc0eb7555.f174315e;
        if (dVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280);
            throw null;
        }
        fo1.n g17 = gVar.g(this.f545650d, this.f545651e, dVar.f438832e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC12864xc0eb7555.f174314d, "[saveOldPath] error code of save is " + g17);
        nf.e.f(new yo1.e(this.f545653g, g17, activityC12864xc0eb7555));
    }
}
