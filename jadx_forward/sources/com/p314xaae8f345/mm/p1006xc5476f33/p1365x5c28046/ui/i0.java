package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes15.dex */
public class i0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b f179592a;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b activityC13279x3d93ec0b) {
        this.f179592a = activityC13279x3d93ec0b;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17 = message.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b activityC13279x3d93ec0b = this.f179592a;
        switch (i17) {
            case 1001:
                pr.r0 r0Var = activityC13279x3d93ec0b.f179237m;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiCustomUI", "dz[updateSyncView status:%s]", r0Var.toString());
                if (activityC13279x3d93ec0b.f179231d == com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0.EDIT) {
                    return;
                }
                int ordinal = r0Var.ordinal();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = activityC13279x3d93ec0b.S;
                if (ordinal == 0 || ordinal == 5) {
                    activityC13279x3d93ec0b.f179242q = false;
                    if (n3Var != null) {
                        n3Var.mo50307xb9e94560(1003, 0);
                    }
                    activityC13279x3d93ec0b.d7(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0.NORMAL);
                    return;
                }
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return;
                    }
                    activityC13279x3d93ec0b.f179242q = false;
                    if (n3Var != null) {
                        n3Var.mo50303x856b99f0(1003);
                    }
                    android.view.View view = activityC13279x3d93ec0b.f179238n;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "handleLoaderStateChange", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "handleLoaderStateChange", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    activityC13279x3d93ec0b.a7(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.o0.START);
                    activityC13279x3d93ec0b.d7(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0.WITH_OUT_ADD);
                    return;
                }
                if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(activityC13279x3d93ec0b)) {
                    activityC13279x3d93ec0b.f179242q = false;
                    android.view.View view2 = activityC13279x3d93ec0b.f179238n;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "handleLoaderStateChange", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "handleLoaderStateChange", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    activityC13279x3d93ec0b.a7(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.o0.PAUSE);
                } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(activityC13279x3d93ec0b) && !activityC13279x3d93ec0b.f179242q) {
                    activityC13279x3d93ec0b.f179242q = true;
                    if (n3Var != null) {
                        n3Var.mo50307xb9e94560(1003, 0);
                    }
                    activityC13279x3d93ec0b.a7(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.o0.EMPTY);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0 q0Var = activityC13279x3d93ec0b.f179231d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0 q0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0.SYNCING;
                if (q0Var != q0Var2) {
                    activityC13279x3d93ec0b.d7(q0Var2);
                    return;
                }
                return;
            case 1002:
                activityC13279x3d93ec0b.f179235h.e();
                com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(activityC13279x3d93ec0b);
                return;
            case 1003:
                android.view.View view3 = activityC13279x3d93ec0b.f179238n;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI$4", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI$4", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            default:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiCustomUI", "unknow Msg");
                return;
        }
    }
}
