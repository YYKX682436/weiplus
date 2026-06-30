package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class m4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGalleryUI f110293d;

    public m4(com.tencent.mm.plugin.finder.feed.ui.FinderGalleryUI finderGalleryUI) {
        this.f110293d = finderGalleryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        java.lang.String str;
        java.lang.String string;
        kotlin.jvm.internal.o.g(it, "it");
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.feed.ui.FinderGalleryUI finderGalleryUI = this.f110293d;
        com.tencent.mm.plugin.finder.assist.i0.wk((com.tencent.mm.plugin.finder.assist.i0) c17, finderGalleryUI, null, 2, null);
        androidx.appcompat.app.AppCompatActivity context = finderGalleryUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[3];
        java.lang.String str2 = "";
        if (V6 == null || (str = V6.getString(1)) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("finder_context_id", str);
        if (V6 != null && (string = V6.getString(2)) != null) {
            str2 = string;
        }
        lVarArr[1] = new jz5.l("finder_tab_context_id", str2);
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6 != null ? V6.getInteger(5) : 0));
        ((cy1.a) rVar).Ej("teen_mode_umbrella", kz5.c1.k(lVarArr), 25496);
        return true;
    }
}
