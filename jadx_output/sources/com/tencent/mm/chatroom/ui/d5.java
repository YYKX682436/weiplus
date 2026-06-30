package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public class d5 extends o65.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f64107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64108e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.roomsdk.model.factory.a f64109f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI f64110g;

    public d5(com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI modRemarkRoomNameUI, com.tencent.mm.storage.z3 z3Var, java.lang.String str, com.tencent.mm.roomsdk.model.factory.a aVar) {
        this.f64110g = modRemarkRoomNameUI;
        this.f64107d = z3Var;
        this.f64108e = str;
        this.f64109f = aVar;
    }

    @Override // o65.b
    public void a(int i17, int i18, java.lang.String str, o65.b bVar) {
        o65.f fVar = (o65.f) bVar;
        int i19 = this.f343223a;
        com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI modRemarkRoomNameUI = this.f64110g;
        if (i19 != 0) {
            this.f64109f.a();
            if (com.tencent.mm.sdk.platformtools.t8.K0(fVar.f343225c) && com.tencent.mm.sdk.platformtools.t8.K0(fVar.f343224b)) {
                return;
            }
            db5.e1.s(modRemarkRoomNameUI, fVar.f343225c, fVar.f343224b);
            return;
        }
        dp.a.makeText(modRemarkRoomNameUI, modRemarkRoomNameUI.getString(com.tencent.mm.R.string.f490586z7), 0).show();
        com.tencent.mm.storage.z3 z3Var = this.f64107d;
        if (z3Var != null && ((int) z3Var.E2) > 0) {
            z3Var.n1(this.f64108e);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().m0(z3Var);
        }
        modRemarkRoomNameUI.finish();
    }
}
