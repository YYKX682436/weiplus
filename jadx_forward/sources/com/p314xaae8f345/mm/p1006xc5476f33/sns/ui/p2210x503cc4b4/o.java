package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class o extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f251374d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar) {
        this.f251374d = iVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1
    public void a(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$13");
        java.lang.Object tag = view.getTag();
        boolean z17 = tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder;
        if (z17 || (tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 a17 = z17 ? com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.a(((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder) tag).f250797d) : tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) tag : null;
            j45.l.g("favorite");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = a17.m70354x74235b3e();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 s17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.s(this.f251374d, a17);
            if (m70354x74235b3e.m70147xe6739387()) {
                if (m70354x74235b3e.m70146xae00c4ba()) {
                    contextMenu.add(0, 2, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                } else if (s17.f38067xf8d8cf13 == 0) {
                    contextMenu.add(0, 3, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
                }
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a564 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
            c5348xb8e1a564.f135674g.f87754c = a17.m70363x51f8f990();
            c5348xb8e1a564.e();
            if (c5348xb8e1a564.f135675h.f87869a) {
                contextMenu.add(0, 18, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572041x2));
            }
            if (a17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.a.b(contextMenu, a17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$13");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1
    public boolean b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$13");
        if (!(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder) && !(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$13");
            return false;
        }
        java.lang.Object tag = view.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 a17 = tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder ? com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.a(((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder) view.getTag()).f250797d) : tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) tag : null;
        if (a17 != null) {
            this.f251374d.f251342l.e(view, a17.m70363x51f8f990(), a17.m70371x485d7());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$13");
        return true;
    }
}
