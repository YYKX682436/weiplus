package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public class z4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI f64709d;

    public z4(com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI modRemarkRoomNameUI) {
        this.f64709d = modRemarkRoomNameUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI modRemarkRoomNameUI = this.f64709d;
        int i17 = modRemarkRoomNameUI.f63826p;
        if (i17 != 1) {
            if (i17 == 2) {
                java.lang.String o17 = com.tencent.mm.sdk.platformtools.t8.o(modRemarkRoomNameUI.f63817d.getText().toString().trim());
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(modRemarkRoomNameUI.f63825o, true);
                com.tencent.mm.roomsdk.model.factory.a p17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(modRemarkRoomNameUI.f63825o).p(modRemarkRoomNameUI.f63825o, o17);
                p17.f192248d = new com.tencent.mm.chatroom.ui.d5(modRemarkRoomNameUI, n17, o17, p17);
                if (com.tencent.mm.sdk.platformtools.t8.K0(o17) || !o17.equals(n17.P0())) {
                    p17.c(modRemarkRoomNameUI.getContext(), modRemarkRoomNameUI.getString(com.tencent.mm.R.string.f490573yv), modRemarkRoomNameUI.getString(com.tencent.mm.R.string.bcr), false, false, null);
                } else {
                    db5.e1.u(modRemarkRoomNameUI, modRemarkRoomNameUI.getString(com.tencent.mm.R.string.f492885i45), "", new com.tencent.mm.chatroom.ui.u4(modRemarkRoomNameUI, p17), null);
                }
            } else if (i17 == 3) {
                java.lang.String o18 = com.tencent.mm.sdk.platformtools.t8.o(modRemarkRoomNameUI.f63817d.getText().toString().trim());
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 4L, 1L, true);
                com.tencent.mm.roomsdk.model.factory.a n18 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(modRemarkRoomNameUI.f63825o).n(modRemarkRoomNameUI.f63825o, c01.z1.r(), o18 != null ? o18 : "");
                n18.f192248d = new com.tencent.mm.chatroom.ui.c5(modRemarkRoomNameUI, o18, n18);
                n18.c(modRemarkRoomNameUI, modRemarkRoomNameUI.getString(com.tencent.mm.R.string.f490573yv), modRemarkRoomNameUI.getString(com.tencent.mm.R.string.bcr), false, false, null);
            }
        } else {
            java.lang.String o19 = com.tencent.mm.sdk.platformtools.t8.o(modRemarkRoomNameUI.f63817d.getText().toString().trim());
            com.tencent.mm.roomsdk.model.factory.a i18 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(modRemarkRoomNameUI.f63825o).i(modRemarkRoomNameUI.f63825o, o19);
            i18.f192248d = new com.tencent.mm.chatroom.ui.b5(modRemarkRoomNameUI, o19, i18);
            i18.c(modRemarkRoomNameUI.getContext(), modRemarkRoomNameUI.getString(com.tencent.mm.R.string.f490573yv), modRemarkRoomNameUI.getString(com.tencent.mm.R.string.bcr), false, false, null);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
