package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ni implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl f216866d;

    public ni(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar) {
        this.f216866d = blVar;
    }

    @Override // oa.c
    public void h0(oa.i t17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
    }

    @Override // oa.c
    public void l4(oa.i t17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
        java.lang.Object obj = t17.f425311a;
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gi) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gi giVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gi) obj;
            giVar.b(this.f216866d.f215437t, true);
            giVar.a(false);
            int i17 = giVar.f216058b;
            if (i17 != 1) {
                if (i17 == 2 && (c22699x3dcdb352 = giVar.f216062f) != null) {
                    c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80155x9d99890d);
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = giVar.f216062f;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.raw.f80149x33b6c6e8);
            }
        }
    }

    @Override // oa.c
    public void u1(oa.i t17) {
        android.widget.ImageView imageView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
        java.lang.Object obj = t17.f425311a;
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gi) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gi giVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gi) obj;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar = this.f216866d;
            boolean z17 = false;
            giVar.b(blVar.f215436s, false);
            giVar.a(true);
            r45.nx2 nx2Var = blVar.f7().f339039i;
            nx2Var.set(5, 0);
            nx2Var.set(4, java.lang.Integer.valueOf(blVar.f7().f339041n));
            nx2Var.set(3, java.lang.Boolean.valueOf(((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("TLRecommendTab") != null));
            nx2Var.set(2, java.lang.Boolean.valueOf(((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("TLFollow") != null));
            nx2Var.set(1, java.lang.Boolean.valueOf(((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("finder_tl_hot_tab") != null));
            nx2Var.set(0, java.lang.Boolean.valueOf(((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("FinderEntrance") != null));
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = blVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f435481a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca c15456x2c452bca = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class);
            int i17 = giVar.f216058b;
            c15456x2c452bca.f7(i17, null);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = giVar.f216062f;
            if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 == 35 && (imageView = giVar.f216063g) != null) {
                        imageView.setVisibility(8);
                    }
                } else if (c22699x3dcdb352 != null) {
                    c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79787x448e46cd);
                }
            } else if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79777xe843128);
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = blVar.m158354x19263085();
            if (m158354x19263085 != null && ((com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A()) && com.p314xaae8f345.mm.ui.bk.v0() && (com.p314xaae8f345.mm.ui.bk.P(m158354x19263085) || com.p314xaae8f345.mm.ui.bk.N(m158354x19263085.getTaskId()) || (com.p314xaae8f345.mm.ui.bk.O(m158354x19263085.getContentResolver()) && !m158354x19263085.isInMultiWindowMode())))) {
                z17 = true;
            }
            if (z17 || blVar.g7()) {
                return;
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = blVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class)).W6(!blVar.h7(i17), true);
        }
    }
}
