package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class h9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI f110113d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI finderLiveDelManagerUI) {
        super(1);
        this.f110113d = finderLiveDelManagerUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.String username = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI finderLiveDelManagerUI = this.f110113d;
        java.util.Iterator it = finderLiveDelManagerUI.f109366i.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (kotlin.jvm.internal.o.b(((r45.l82) obj2).getString(0), username)) {
                break;
            }
        }
        r45.l82 l82Var = (r45.l82) obj2;
        r45.xn1 xn1Var = l82Var != null ? (r45.xn1) l82Var.getCustom(2) : null;
        if (xn1Var != null) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
            if (finderContact != null) {
                finderContact.setUsername(username);
            }
            com.tencent.mm.plugin.finder.live.widget.hp hpVar = finderLiveDelManagerUI.f109365h;
            if (hpVar != null) {
                androidx.appcompat.app.AppCompatActivity context = finderLiveDelManagerUI.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.plugin.finder.live.widget.hp.y0(hpVar, xn1Var, "", 4, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(context).c(zy2.ra.class))).V6(), false, null, 32, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
