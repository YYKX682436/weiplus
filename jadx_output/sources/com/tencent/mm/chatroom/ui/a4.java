package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class a4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.x3 f64028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.c4 f64029e;

    public a4(com.tencent.mm.chatroom.ui.c4 c4Var, com.tencent.mm.chatroom.ui.x3 x3Var) {
        this.f64029e = c4Var;
        this.f64028d = x3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.chatroom.ui.w3 w3Var = this.f64029e.f64072h;
        if (w3Var != null) {
            int adapterPosition = this.f64028d.getAdapterPosition();
            com.tencent.mm.chatroom.ui.n3 n3Var = (com.tencent.mm.chatroom.ui.n3) w3Var;
            n3Var.getClass();
            java.lang.Object tag = view.getTag();
            if (tag instanceof com.tencent.mm.chatroom.storage.GroupToolItem) {
                boolean booleanValue = ((java.lang.Boolean) ((android.view.ViewGroup) view.getParent()).getTag()).booleanValue();
                com.tencent.mm.chatroom.storage.GroupToolItem groupToolItem = (com.tencent.mm.chatroom.storage.GroupToolItem) tag;
                com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsManagereUI", "iRecentUseToolsCallback click stick:%s", java.lang.Boolean.valueOf(booleanValue));
                com.tencent.mm.chatroom.ui.GroupToolsManagereUI groupToolsManagereUI = n3Var.f64387a;
                if (booleanValue) {
                    groupToolItem.f63684f = c01.id.c();
                    groupToolsManagereUI.f63780p.f397604t.remove(groupToolItem);
                    groupToolsManagereUI.f63781q.addFirst(groupToolItem);
                    groupToolsManagereUI.f63776i.notifyItemRemoved(adapterPosition);
                    groupToolsManagereUI.f63779o.notifyItemInserted(0);
                } else if (groupToolsManagereUI.f63780p.v0()) {
                    db5.e1.E(groupToolsManagereUI, groupToolsManagereUI.getString(com.tencent.mm.R.string.f490829az1), "", groupToolsManagereUI.getString(com.tencent.mm.R.string.f490454vi), false, null);
                } else {
                    groupToolsManagereUI.f63780p.f397604t.addLast(groupToolItem);
                    groupToolsManagereUI.f63781q.remove(groupToolItem);
                    groupToolsManagereUI.f63776i.notifyItemInserted(groupToolsManagereUI.f63780p.f397604t.size() - 1);
                    groupToolsManagereUI.f63779o.notifyItemRemoved(adapterPosition);
                }
                if (booleanValue && !groupToolsManagereUI.f63780p.v0()) {
                    com.tencent.mm.chatroom.ui.c4 c4Var = groupToolsManagereUI.f63779o;
                    c4Var.f64070f = true;
                    c4Var.notifyDataSetChanged();
                } else if (!booleanValue && groupToolsManagereUI.f63780p.v0()) {
                    com.tencent.mm.chatroom.ui.c4 c4Var2 = groupToolsManagereUI.f63779o;
                    c4Var2.f64070f = false;
                    c4Var2.notifyDataSetChanged();
                }
                groupToolsManagereUI.f63783s = true;
                groupToolsManagereUI.U6();
                groupToolsManagereUI.V6();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsManagereUI", "iRecentUseToolsCallback click");
            }
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
