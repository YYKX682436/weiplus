package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class wb implements o65.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SeeRoomMemberUI f64624a;

    public wb(com.tencent.mm.chatroom.ui.SeeRoomMemberUI seeRoomMemberUI) {
        this.f64624a = seeRoomMemberUI;
    }

    @Override // o65.c, o65.b
    /* renamed from: b */
    public void a(int i17, int i18, java.lang.String str, o65.c cVar) {
        tm.a b17 = tm.a.b(str);
        com.tencent.mm.chatroom.ui.SeeRoomMemberUI seeRoomMemberUI = this.f64624a;
        if (b17 != null) {
            b17.c(seeRoomMemberUI, null, null);
        } else if (i18 == -66) {
            db5.e1.s(seeRoomMemberUI, seeRoomMemberUI.getString(com.tencent.mm.R.string.bo_), seeRoomMemberUI.getString(com.tencent.mm.R.string.f490573yv));
            seeRoomMemberUI.d1();
            seeRoomMemberUI.Z0();
        }
    }
}
