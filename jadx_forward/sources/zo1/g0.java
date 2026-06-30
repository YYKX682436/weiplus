package zo1;

/* loaded from: classes5.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f f556149d;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f) {
        this.f556149d = activityC12867x6b26c82f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean a17;
        po1.c cVar = po1.d.f438827i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f = this.f556149d;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = activityC12867x6b26c82f.f174341q;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
            throw null;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u uVar = gVar.f297365g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uVar, "getTargetDevice(...)");
        po1.d a18 = cVar.a(uVar);
        boolean z17 = true;
        if (a18.f438829b != po1.g.f438843h) {
            a17 = true;
        } else {
            po1.d e17 = ro1.v.f479547a.e(a18.f438828a);
            a17 = ((e17 == null || so1.b.f491759a.h(e17)) ? so1.g.f491771a : to1.g.f502444a).a(activityC12867x6b26c82f, a18);
        }
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC12867x6b26c82f.f174332e, "Check permission failed.");
            nf.e.f(new zo1.y(activityC12867x6b26c82f, a18));
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar2 = activityC12867x6b26c82f.f174341q;
            if (gVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
                throw null;
            }
            java.lang.String str = gVar2.f297365g.f297522e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getDeviceId(...)");
            boolean m17 = r0Var.m(str);
            java.lang.String str2 = activityC12867x6b26c82f.f174332e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Connectivity of Device=");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar3 = activityC12867x6b26c82f.f174341q;
            if (gVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
                throw null;
            }
            sb6.append(gVar3.f297365g.f297522e);
            sb6.append(" is ");
            sb6.append(m17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
            if (activityC12867x6b26c82f.isFinishing() || activityC12867x6b26c82f.isDestroyed()) {
                return;
            }
            if (!m17) {
                nf.e.f(new zo1.f0(activityC12867x6b26c82f));
            } else {
                activityC12867x6b26c82f.getClass();
                r0Var.l(activityC12867x6b26c82f.f174333f, new zo1.k0(java.lang.System.currentTimeMillis(), activityC12867x6b26c82f));
            }
        }
    }
}
