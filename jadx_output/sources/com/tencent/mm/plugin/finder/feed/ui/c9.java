package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class c9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI f109746d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI finderLiveDelManagerUI) {
        super(1);
        this.f109746d = finderLiveDelManagerUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI.f109360m;
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI finderLiveDelManagerUI = this.f109746d;
        finderLiveDelManagerUI.getClass();
        if (!(str == null || str.length() == 0)) {
            dk2.q4 q4Var = dk2.q4.f233938a;
            androidx.appcompat.app.AppCompatActivity context = finderLiveDelManagerUI.getContext();
            gk2.e eVar = new gk2.e(null, 1, null);
            androidx.appcompat.app.AppCompatActivity context2 = finderLiveDelManagerUI.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            dk2.q4.j(q4Var, context, eVar, false, str, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(context2).c(zy2.ra.class))).V6(), false, null, 96, null);
        }
        return jz5.f0.f302826a;
    }
}
