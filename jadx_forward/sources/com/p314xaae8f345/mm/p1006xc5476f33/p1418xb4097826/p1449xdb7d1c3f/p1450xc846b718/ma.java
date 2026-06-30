package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes2.dex */
public final class ma implements zy2.da {
    @Override // zy2.da
    public boolean a(r45.vs2 ctrInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrInfo, "ctrInfo");
        if (ctrInfo.f470020e == 28) {
            java.util.LinkedList show_infos = ctrInfo.f470022g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(show_infos, "show_infos");
            if (!show_infos.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotTransform", "initPostRecordTemplateRedDotListener >> addRedDotCtrlInfo show info is not empty");
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_POST_RECORD_TEMPLATE_NEW_TIPS_INT, 1);
                ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("ProfileActionSheetPublish", new int[]{1023});
                ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("PersonalCenterActionSheetPost", new int[]{1023});
                ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("ProfilePublish", new int[]{1023});
                ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("TLCamera", new int[]{1023});
                ya2.b2 b17 = ya2.h.f542017a.b(ctrInfo.f470029q);
                if (b17 != null && b17.G0()) {
                    ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("ProfileActionSheetPublish");
                    ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("PersonalCenterActionSheetPost");
                    ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("ProfilePublish");
                    ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("TLCamera");
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotTransform", "initPostRecordTemplateRedDotListener >> addRedDotCtrlInfo show info is empty");
            }
        }
        return false;
    }
}
