package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class b7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI f109698d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI finderLiveAnchorCommentManagerUI) {
        super(1);
        this.f109698d = finderLiveAnchorCommentManagerUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI finderLiveAnchorCommentManagerUI = this.f109698d;
        java.util.Iterator it = finderLiveAnchorCommentManagerUI.f109325x.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (kotlin.jvm.internal.o.b(((r45.l82) obj2).getString(0), str)) {
                break;
            }
        }
        r45.l82 l82Var = (r45.l82) obj2;
        r45.xn1 xn1Var = l82Var != null ? (r45.xn1) l82Var.getCustom(2) : null;
        if (xn1Var != null) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
            if (finderContact != null) {
                finderContact.setUsername(str);
            }
            com.tencent.mm.plugin.finder.live.widget.hp hpVar = finderLiveAnchorCommentManagerUI.E;
            if (hpVar != null) {
                java.lang.String u17 = pm0.v.u(finderLiveAnchorCommentManagerUI.F);
                androidx.appcompat.app.AppCompatActivity context = finderLiveAnchorCommentManagerUI.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                hpVar.x0(xn1Var, (r16 & 2) != 0 ? "" : u17, 4, (r16 & 8) != 0 ? null : ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(context).c(zy2.ra.class))).V6(), false, (r16 & 32) != 0 ? "" : null);
            }
        }
        return jz5.f0.f302826a;
    }
}
