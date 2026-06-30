package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public class p6 implements db5.t6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavTagEditUI f101336d;

    public p6(com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI) {
        this.f101336d = favTagEditUI;
    }

    @Override // db5.t6
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI = this.f101336d;
        favTagEditUI.f100417g.p(str);
        com.tencent.mm.plugin.fav.ui.adapter.f fVar = favTagEditUI.f100421n;
        ((java.util.HashSet) fVar.f100500g).remove(str);
        fVar.notifyDataSetChanged();
        com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel = favTagEditUI.f100416f;
        if (favTagPanel != null) {
            favTagPanel.s(str, false);
        }
        favTagEditUI.T6();
    }

    @Override // db5.t6
    public void c() {
    }

    @Override // db5.t6
    public void d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI = this.f101336d;
        favTagEditUI.f100417g.d(str, true);
        favTagEditUI.T6();
    }

    @Override // db5.t6
    public void f(java.lang.String str) {
        com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI = this.f101336d;
        favTagEditUI.f100417g.p(str);
        com.tencent.mm.plugin.fav.ui.adapter.f fVar = favTagEditUI.f100421n;
        ((java.util.HashSet) fVar.f100500g).remove(str);
        fVar.notifyDataSetChanged();
        com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel = favTagEditUI.f100416f;
        if (favTagPanel != null) {
            favTagPanel.s(str, false);
        }
        favTagEditUI.T6();
    }

    @Override // db5.t6
    public void g(java.lang.String str) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI = this.f101336d;
        if (K0) {
            favTagEditUI.f100419i.setVisibility(8);
            favTagEditUI.f100418h.setVisibility(0);
        } else {
            com.tencent.mm.plugin.fav.ui.adapter.g gVar = favTagEditUI.f100422o;
            gVar.f100506g.clear();
            java.util.LinkedList linkedList = (java.util.LinkedList) gVar.f100505f;
            linkedList.clear();
            gVar.f100504e = str == null ? "" : str;
            o72.i3 tj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj();
            tj6.getClass();
            boolean K02 = com.tencent.mm.sdk.platformtools.t8.K0(str);
            java.util.ArrayList arrayList = new java.util.ArrayList(16);
            java.util.Iterator it = tj6.f343360a.f384201d.iterator();
            while (it.hasNext()) {
                java.util.Iterator it6 = ((r45.pq0) it.next()).f383301e.iterator();
                while (it6.hasNext()) {
                    r45.oq0 oq0Var = (r45.oq0) it6.next();
                    if (K02 || oq0Var.f382438d.contains(str)) {
                        arrayList.add(oq0Var.f382438d);
                    }
                }
            }
            linkedList.addAll(arrayList);
            gVar.notifyDataSetChanged();
            favTagEditUI.f100419i.setVisibility(0);
            favTagEditUI.f100418h.setVisibility(8);
        }
        int i17 = com.tencent.mm.plugin.fav.ui.FavTagEditUI.f100413s;
        favTagEditUI.T6();
    }

    @Override // db5.t6
    public void h(java.lang.String str) {
    }

    @Override // db5.t6
    public void j(boolean z17, int i17) {
        com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI = this.f101336d;
        favTagEditUI.f100423p = z17;
        favTagEditUI.f100420m.setVisibility((!z17 || i17 <= 0) ? 8 : 0);
        favTagEditUI.f100420m.setText(favTagEditUI.getString(com.tencent.mm.R.string.cdm, java.lang.Integer.valueOf(i17)));
        favTagEditUI.T6();
    }
}
