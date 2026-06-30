package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class ml implements com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa f211061d;

    public ml(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa) {
        this.f211061d = abstractActivityC15087xee12defa;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa activity = this.f211061d;
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            java.util.List h76 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) pf5.z.f435481a.a(activity).c(zy2.ra.class))).h7();
            if ((h76.isEmpty() ^ true ? h76 : null) == null) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa.f210337s;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MMFinderUI", "[onScreenShot] extStats is empty");
            } else if (((java.lang.Boolean) ((jz5.n) activity.f210339e).mo141623x754a37bb()).booleanValue()) {
                i95.m c17 = i95.n0.c(cq.k.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                new bq.m1(0, h76, xy2.c.d(mo55332x76847179)).l().q(new cq.m0(null, null));
            } else {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
                gm0.j1.d().g(new db2.i6(0, h76, xy2.c.d(mo55332x768471792)));
            }
        } catch (java.lang.Throwable th6) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa.f210337s;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.MMFinderUI", th6, "onScreenShot", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5694x221c525a c5694x221c525a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5694x221c525a();
        am.ij ijVar = c5694x221c525a.f136018g;
        ijVar.getClass();
        ijVar.f88488a = j17;
        c5694x221c525a.e();
    }
}
