package com.tencent.mm.plugin.finder.account.component;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.account.component.l f101706d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.finder.account.component.l lVar) {
        super(2);
        this.f101706d = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        in5.s0 holder = (in5.s0) obj;
        j92.a item = (j92.a) obj2;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        this.f101706d.getClass();
        m92.b bVar = item.f298352d;
        java.lang.String str2 = bVar.field_username;
        boolean z17 = str2 == null || str2.length() == 0;
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        if (z17) {
            android.view.View itemView = holder.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            com.tencent.mm.plugin.finder.report.d2.m(d2Var, itemView, "create_new_account", 8, 0, null, null, 56, null);
        } else {
            java.lang.String str3 = bVar.field_username;
            r45.ui4 ui4Var = (r45.ui4) bVar.u0().getCustom(27);
            if (ui4Var == null || (str = ui4Var.getString(0)) == null) {
                str = "";
            }
            zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
            r45.f03 b07 = nk6.b0("finder_private_msg_entrance", str3);
            r45.f03 b08 = nk6.b0("AuthorProfileNotify", str3);
            int i17 = (b07 != null && b07.f373887d == 2 ? b07.f373888e : 0) + (b08 != null && b08.f373887d == 2 ? b08.f373888e : 0);
            android.view.View itemView2 = holder.itemView;
            kotlin.jvm.internal.o.f(itemView2, "itemView");
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("finder_username", str3);
            lVarArr[1] = new jz5.l("is_red_dot", java.lang.Integer.valueOf(i17 > 0 ? 1 : 0));
            lVarArr[2] = new jz5.l("wx_username", str);
            com.tencent.mm.plugin.finder.report.d2.m(d2Var, itemView2, "switch_avatar", 8, 0, kz5.c1.k(lVarArr), null, 40, null);
        }
        return jz5.f0.f302826a;
    }
}
