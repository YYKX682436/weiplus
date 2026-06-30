package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class s3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.GroupToolsManagereUI f64500d;

    public s3(com.tencent.mm.chatroom.ui.GroupToolsManagereUI groupToolsManagereUI) {
        this.f64500d = groupToolsManagereUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsManagereUI", "menu click");
        com.tencent.mm.chatroom.ui.GroupToolsManagereUI groupToolsManagereUI = this.f64500d;
        rn.h hVar = groupToolsManagereUI.f63780p;
        hVar.field_stickToollist = rn.h.u0(hVar.f397604t);
        groupToolsManagereUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsManagereUI", "doAlterWxApp()");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (groupToolsManagereUI.f63780p.f397604t.size() > 0) {
            java.util.Iterator it = groupToolsManagereUI.f63780p.f397604t.iterator();
            while (it.hasNext()) {
                com.tencent.mm.chatroom.storage.GroupToolItem groupToolItem = (com.tencent.mm.chatroom.storage.GroupToolItem) it.next();
                r45.wt5 wt5Var = new r45.wt5();
                wt5Var.f389449d = groupToolItem.f63682d;
                wt5Var.f389450e = "";
                linkedList.add(wt5Var);
            }
        }
        kn.a0 a0Var = new kn.a0(groupToolsManagereUI.f63782r, linkedList);
        gm0.j1.d().g(a0Var);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = groupToolsManagereUI.f63775h;
        if (u3Var == null) {
            groupToolsManagereUI.f63775h = db5.e1.Q(groupToolsManagereUI, groupToolsManagereUI.getString(com.tencent.mm.R.string.f490573yv), groupToolsManagereUI.getString(com.tencent.mm.R.string.f490468vx), true, true, new com.tencent.mm.chatroom.ui.t3(groupToolsManagereUI, a0Var));
            return true;
        }
        if (u3Var.isShowing()) {
            return true;
        }
        groupToolsManagereUI.f63775h.show();
        return true;
    }
}
