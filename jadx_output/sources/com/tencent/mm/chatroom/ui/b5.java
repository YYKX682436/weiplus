package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public class b5 extends o65.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.roomsdk.model.factory.a f64054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI f64055f;

    public b5(com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI modRemarkRoomNameUI, java.lang.String str, com.tencent.mm.roomsdk.model.factory.a aVar) {
        this.f64055f = modRemarkRoomNameUI;
        this.f64053d = str;
        this.f64054e = aVar;
    }

    @Override // o65.b
    public void a(int i17, int i18, java.lang.String str, o65.b bVar) {
        o65.f fVar = (o65.f) bVar;
        int i19 = this.f343223a;
        com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI modRemarkRoomNameUI = this.f64055f;
        if (i19 != 0) {
            this.f64054e.a();
            if (com.tencent.mm.sdk.platformtools.t8.K0(fVar.f343225c) && com.tencent.mm.sdk.platformtools.t8.K0(fVar.f343224b)) {
                return;
            }
            db5.e1.s(modRemarkRoomNameUI, fVar.f343225c, fVar.f343224b);
            return;
        }
        dp.a.makeText(modRemarkRoomNameUI, modRemarkRoomNameUI.getString(com.tencent.mm.R.string.f490586z7), 0).show();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(modRemarkRoomNameUI.f63825o, true);
        if (n17 != null && ((int) n17.E2) > 0) {
            n17.M1(this.f64053d);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().m0(n17);
        }
        modRemarkRoomNameUI.finish();
    }
}
