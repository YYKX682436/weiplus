package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public final class f3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.GroupAdminManagerUI f64147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64148e;

    public f3(com.tencent.mm.chatroom.ui.GroupAdminManagerUI groupAdminManagerUI, java.lang.String str) {
        this.f64147d = groupAdminManagerUI;
        this.f64148e = str;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        int i18 = com.tencent.mm.chatroom.ui.GroupAdminManagerUI.f63759q;
        if (valueOf != null && valueOf.intValue() == 0) {
            com.tencent.mm.chatroom.ui.GroupAdminManagerUI groupAdminManagerUI = this.f64147d;
            groupAdminManagerUI.f63765i = db5.e1.Q(groupAdminManagerUI.getContext(), groupAdminManagerUI.getString(com.tencent.mm.R.string.f490573yv), groupAdminManagerUI.getString(com.tencent.mm.R.string.i49), true, false, null);
            java.lang.String str = this.f64148e;
            java.util.LinkedList V6 = groupAdminManagerUI.V6(str, ",");
            if (com.tencent.mm.storage.z3.N4(groupAdminManagerUI.f63761e)) {
                pq5.g l17 = new kn.e(groupAdminManagerUI.f63761e, V6).l();
                l17.f(groupAdminManagerUI);
                l17.h(new com.tencent.mm.chatroom.ui.g3(groupAdminManagerUI, str));
            } else {
                pq5.g l18 = new kn.g(groupAdminManagerUI.f63761e, V6).l();
                l18.f(groupAdminManagerUI);
                l18.h(new com.tencent.mm.chatroom.ui.h3(groupAdminManagerUI, str));
            }
        }
    }
}
