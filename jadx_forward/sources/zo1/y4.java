package zo1;

/* loaded from: classes5.dex */
public final class y4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e f556366d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e activityC12873xf94c39e) {
        super(1);
        this.f556366d = activityC12873xf94c39e;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.ArrayList pkgs = (java.util.ArrayList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgs, "pkgs");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e activityC12873xf94c39e = this.f556366d;
        activityC12873xf94c39e.f174403i = currentTimeMillis;
        java.util.Iterator it = pkgs.iterator();
        while (it.hasNext()) {
            qo1.j1.f447056a.e(((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) it.next()).f297362d, false);
        }
        activityC12873xf94c39e.a7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e.Z6(activityC12873xf94c39e, pkgs.isEmpty());
        return jz5.f0.f384359a;
    }
}
