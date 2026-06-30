package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class rc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SelectDelMemberUI f64486d;

    public rc(com.tencent.mm.chatroom.ui.SelectDelMemberUI selectDelMemberUI) {
        this.f64486d = selectDelMemberUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.chatroom.ui.SelectDelMemberUI selectDelMemberUI = this.f64486d;
        java.lang.String string = selectDelMemberUI.getString(com.tencent.mm.R.string.i4c);
        int i17 = com.tencent.mm.chatroom.ui.SelectDelMemberUI.f63967v;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(selectDelMemberUI.f63981q);
        com.tencent.mm.ui.widget.dialog.j0 u17 = db5.e1.u(selectDelMemberUI, string, arrayList.size() <= 3 ? selectDelMemberUI.getString(com.tencent.mm.R.string.ofr, com.tencent.mm.sdk.platformtools.t8.c1(selectDelMemberUI.d7(arrayList), "、")) : selectDelMemberUI.getString(com.tencent.mm.R.string.ofs, com.tencent.mm.sdk.platformtools.t8.c1(selectDelMemberUI.d7(arrayList.subList(0, 3)), "、"), java.lang.Integer.valueOf(arrayList.size())), new com.tencent.mm.chatroom.ui.pc(this), new com.tencent.mm.chatroom.ui.qc(this));
        u17.f211831i.setMaxLines(4);
        android.widget.Button button = u17.f211829g;
        button.setText(com.tencent.mm.R.string.ofo);
        button.setTextColor(selectDelMemberUI.getColor(com.tencent.mm.R.color.f478532ac));
        return false;
    }
}
