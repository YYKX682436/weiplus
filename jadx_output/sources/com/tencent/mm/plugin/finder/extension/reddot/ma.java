package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes2.dex */
public final class ma implements zy2.da {
    @Override // zy2.da
    public boolean a(r45.vs2 ctrInfo) {
        kotlin.jvm.internal.o.g(ctrInfo, "ctrInfo");
        if (ctrInfo.f388487e == 28) {
            java.util.LinkedList show_infos = ctrInfo.f388489g;
            kotlin.jvm.internal.o.f(show_infos, "show_infos");
            if (!show_infos.isEmpty()) {
                com.tencent.mars.xlog.Log.i("Finder.RedDotTransform", "initPostRecordTemplateRedDotListener >> addRedDotCtrlInfo show info is not empty");
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_POST_RECORD_TEMPLATE_NEW_TIPS_INT, 1);
                ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("ProfileActionSheetPublish", new int[]{1023});
                ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("PersonalCenterActionSheetPost", new int[]{1023});
                ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("ProfilePublish", new int[]{1023});
                ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("TLCamera", new int[]{1023});
                ya2.b2 b17 = ya2.h.f460484a.b(ctrInfo.f388496q);
                if (b17 != null && b17.G0()) {
                    ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("ProfileActionSheetPublish");
                    ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("PersonalCenterActionSheetPost");
                    ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("ProfilePublish");
                    ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("TLCamera");
                }
            } else {
                com.tencent.mars.xlog.Log.i("Finder.RedDotTransform", "initPostRecordTemplateRedDotListener >> addRedDotCtrlInfo show info is empty");
            }
        }
        return false;
    }
}
