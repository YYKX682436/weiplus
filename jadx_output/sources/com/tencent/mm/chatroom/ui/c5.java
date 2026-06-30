package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public class c5 extends o65.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.roomsdk.model.factory.a f64074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI f64075f;

    public c5(com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI modRemarkRoomNameUI, java.lang.String str, com.tencent.mm.roomsdk.model.factory.a aVar) {
        this.f64075f = modRemarkRoomNameUI;
        this.f64073d = str;
        this.f64074e = aVar;
    }

    @Override // o65.b
    public void a(int i17, int i18, java.lang.String str, o65.b bVar) {
        com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI modRemarkRoomNameUI = this.f64075f;
        if (i18 == 0) {
            dp.a.makeText(modRemarkRoomNameUI, modRemarkRoomNameUI.getString(com.tencent.mm.R.string.f490586z7), 0).show();
            com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(modRemarkRoomNameUI.f63825o);
            if (z07 != null) {
                z07.field_chatroomname = modRemarkRoomNameUI.f63825o;
                z07.field_selfDisplayName = this.f64073d;
                ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().update(z07, new java.lang.String[0]);
                modRemarkRoomNameUI.finish();
                return;
            }
            return;
        }
        this.f64074e.a();
        androidx.appcompat.app.AppCompatActivity context = modRemarkRoomNameUI.getContext();
        java.lang.String str2 = this.f343225c;
        java.lang.String string = modRemarkRoomNameUI.getString(com.tencent.mm.R.string.f490391to);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = string;
        }
        dp.a.makeText(context, str2, 1).show();
    }
}
