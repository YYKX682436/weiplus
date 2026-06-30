package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class b5 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGameSelectUI f109696d;

    public b5(com.tencent.mm.plugin.finder.feed.ui.FinderGameSelectUI finderGameSelectUI) {
        this.f109696d = finderGameSelectUI;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        r45.n73 n73Var;
        java.lang.String string;
        r45.n73 n73Var2;
        r45.n73 n73Var3;
        r45.z53 z53Var;
        java.lang.String str;
        r45.n73 n73Var4;
        r45.z53 z53Var2;
        r45.n73 n73Var5;
        r45.z53 z53Var3;
        r45.n73 n73Var6;
        r45.z53 z53Var4;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        int i18 = com.tencent.mm.plugin.finder.feed.ui.FinderGameSelectUI.F;
        com.tencent.mm.plugin.finder.feed.ui.FinderGameSelectUI finderGameSelectUI = this.f109696d;
        finderGameSelectUI.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("selectPosition ");
        sb6.append(i17);
        sb6.append(", game:");
        java.util.ArrayList arrayList = finderGameSelectUI.f109289x;
        cm2.m mVar = (cm2.m) kz5.n0.a0(arrayList, i17);
        sb6.append((mVar == null || (n73Var6 = mVar.f43365d) == null || (z53Var4 = (r45.z53) n73Var6.getCustom(1)) == null) ? null : z53Var4.getString(1));
        sb6.append(", ");
        cm2.m mVar2 = (cm2.m) kz5.n0.a0(arrayList, i17);
        sb6.append((mVar2 == null || (n73Var5 = mVar2.f43365d) == null || (z53Var3 = (r45.z53) n73Var5.getCustom(1)) == null) ? null : z53Var3.getString(0));
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = finderGameSelectUI.f109288w;
        com.tencent.mars.xlog.Log.i(str2, sb7);
        if (i17 >= 0 && i17 < arrayList.size()) {
            java.util.Iterator it = arrayList.iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                } else if (((cm2.m) it.next()).f43366e) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i19 != i17) {
                cm2.m mVar3 = finderGameSelectUI.f109290y;
                if (mVar3 != null) {
                    mVar3.f43366e = false;
                }
                cm2.m mVar4 = (cm2.m) arrayList.get(i17);
                finderGameSelectUI.f109290y = mVar4;
                if (mVar4 != null) {
                    mVar4.f43366e = true;
                }
                androidx.recyclerview.widget.f2 adapter2 = finderGameSelectUI.f7().getAdapter();
                if (adapter2 != null) {
                    adapter2.notifyItemChanged(i17, 1);
                }
                androidx.recyclerview.widget.f2 adapter3 = finderGameSelectUI.f7().getAdapter();
                if (adapter3 != null) {
                    adapter3.notifyItemChanged(i19, 1);
                }
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_LIVE_GAME_SELECT_APPID_STRING_SYNC;
                cm2.m mVar5 = finderGameSelectUI.f109290y;
                if (mVar5 == null || (n73Var4 = mVar5.f43365d) == null || (z53Var2 = (r45.z53) n73Var4.getCustom(1)) == null || (str = z53Var2.getString(0)) == null) {
                    str = "";
                }
                c17.x(u3Var, str);
            }
        }
        cm2.m mVar6 = finderGameSelectUI.f109290y;
        boolean z17 = (mVar6 == null || (n73Var3 = mVar6.f43365d) == null || (z53Var = (r45.z53) n73Var3.getCustom(1)) == null || z53Var.getInteger(13) != 1) ? false : true;
        com.tencent.mm.plugin.finder.assist.x2 x2Var = com.tencent.mm.plugin.finder.assist.x2.f102672a;
        if (z17) {
            r45.z53 z53Var5 = (r45.z53) mVar6.f43365d.getCustom(1);
            x2Var.f(2, z53Var5 != null ? z53Var5.getString(0) : null);
        } else if (com.tencent.mm.plugin.finder.assist.x2.f102673b == 18) {
            x2Var.b(3);
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Finder_Game_Select_Hardcode :");
        ae2.b2 b2Var = ae2.b2.f3461a;
        jz5.g gVar = ae2.b2.f3479m;
        sb8.append(((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue());
        com.tencent.mars.xlog.Log.i(str2, sb8.toString());
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue();
        if (intValue == 1) {
            r45.sw6 sw6Var = (mVar6 == null || (n73Var = mVar6.f43365d) == null) ? null : (r45.sw6) n73Var.getCustom(0);
            if (sw6Var != null) {
                sw6Var.set(1, 1);
            }
        } else if (intValue == 2) {
            r45.sw6 sw6Var2 = (mVar6 == null || (n73Var2 = mVar6.f43365d) == null) ? null : (r45.sw6) n73Var2.getCustom(0);
            if (sw6Var2 != null) {
                sw6Var2.set(2, 1);
            }
        }
        if (mVar6 != null) {
            r45.n73 n73Var7 = mVar6.f43365d;
            r45.z53 z53Var6 = (r45.z53) n73Var7.getCustom(1);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(z53Var6 != null ? z53Var6.getString(0) : null) && ((r45.z53) n73Var7.getCustom(1)) != null) {
                r45.sw6 sw6Var3 = (r45.sw6) n73Var7.getCustom(0);
                if (!(sw6Var3 != null && sw6Var3.getInteger(1) == 1)) {
                    r45.sw6 sw6Var4 = (r45.sw6) n73Var7.getCustom(0);
                    if (!(sw6Var4 != null && sw6Var4.getInteger(2) == 1)) {
                        r45.z53 z53Var7 = (r45.z53) n73Var7.getCustom(1);
                        ke2.y yVar = new ke2.y((z53Var7 == null || (string = z53Var7.getString(0)) == null) ? "" : string, 0, false, null, false, null, 60, null);
                        yVar.t(finderGameSelectUI, finderGameSelectUI.getResources().getString(com.tencent.mm.R.string.f9y), 500L);
                        pq5.g l17 = yVar.l();
                        l17.f(finderGameSelectUI);
                        l17.K(new com.tencent.mm.plugin.finder.feed.ui.h5(finderGameSelectUI, mVar6));
                        return;
                    }
                }
                r45.sw6 sw6Var5 = (r45.sw6) n73Var7.getCustom(0);
                java.lang.String string2 = sw6Var5 != null && sw6Var5.getInteger(1) == 1 ? finderGameSelectUI.getContext().getString(com.tencent.mm.R.string.l4z) : finderGameSelectUI.getContext().getString(com.tencent.mm.R.string.f493653l50);
                kotlin.jvm.internal.o.d(string2);
                db5.e1.A(finderGameSelectUI.getContext(), string2, "", finderGameSelectUI.getContext().getString(com.tencent.mm.R.string.f490507x1), "", com.tencent.mm.plugin.finder.feed.ui.f5.f110005d, com.tencent.mm.plugin.finder.feed.ui.g5.f110075d);
                return;
            }
        }
        db5.t7.makeText(finderGameSelectUI.getContext(), com.tencent.mm.R.string.f491542dh1, 0).show();
    }
}
