package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class qb implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f64461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.sb f64462e;

    public qb(com.tencent.mm.chatroom.ui.sb sbVar, int i17) {
        this.f64462e = sbVar;
        this.f64461d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.chatroom.ui.SeeRoomMemberUI seeRoomMemberUI = this.f64462e.f64513d;
        com.tencent.mm.chatroom.ui.cc ccVar = seeRoomMemberUI.f63936e;
        int i18 = this.f64461d;
        if (ccVar.getItem(i18).f64691a == 1) {
            java.lang.String d17 = seeRoomMemberUI.f63936e.getItem(i18).f64692b.d1();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            if (str.equals(d17)) {
                db5.e1.i(seeRoomMemberUI.getContext(), com.tencent.mm.R.string.i4t, com.tencent.mm.R.string.f490573yv);
            } else {
                seeRoomMemberUI.T6(d17);
            }
        }
    }
}
