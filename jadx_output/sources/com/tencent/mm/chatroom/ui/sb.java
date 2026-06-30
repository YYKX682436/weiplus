package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class sb implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SeeRoomMemberUI f64513d;

    public sb(com.tencent.mm.chatroom.ui.SeeRoomMemberUI seeRoomMemberUI) {
        this.f64513d = seeRoomMemberUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.chatroom.ui.SeeRoomMemberUI seeRoomMemberUI = this.f64513d;
        if (seeRoomMemberUI.f63948t) {
            com.tencent.mm.storage.z3 z3Var = seeRoomMemberUI.f63936e.getItem(i17).f64692b;
            if (z3Var == null) {
                return true;
            }
            if (seeRoomMemberUI.f63937f.field_roomowner.equals(z3Var.d1())) {
                return true;
            }
            db5.e1.u(seeRoomMemberUI, seeRoomMemberUI.getString(com.tencent.mm.R.string.i4b), "", new com.tencent.mm.chatroom.ui.qb(this, i17), new com.tencent.mm.chatroom.ui.rb(this));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SeeRoomMemberUI", "U are not a roomowner");
        }
        return true;
    }
}
