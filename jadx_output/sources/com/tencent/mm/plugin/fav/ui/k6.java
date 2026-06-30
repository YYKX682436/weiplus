package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes4.dex */
public class k6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f101218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f101219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavTagEditUI f101220f;

    public k6(com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI, java.util.List list, android.app.Dialog dialog) {
        this.f101220f = favTagEditUI;
        this.f101218d = list;
        this.f101219e = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i17 = 0;
        while (true) {
            com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI = this.f101220f;
            if (i17 >= favTagEditUI.f100424q.size()) {
                o72.z4 uj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).uj();
                final android.app.Dialog dialog = this.f101219e;
                ((t72.l) uj6).U6(linkedList, new yz5.l() { // from class: com.tencent.mm.plugin.fav.ui.k6$$a
                    @Override // yz5.l
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        com.tencent.mm.plugin.fav.ui.k6 k6Var = com.tencent.mm.plugin.fav.ui.k6.this;
                        k6Var.getClass();
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            return null;
                        }
                        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fav.ui.l6(k6Var, dialog));
                        return null;
                    }
                });
                return;
            }
            o72.r2 r2Var = (o72.r2) favTagEditUI.f100424q.get(i17);
            for (java.lang.String str : this.f101218d) {
                t72.a f17 = t72.b.f416040a.f(str);
                int i18 = f17 == null ? 0 : f17.field_id;
                com.tencent.mars.xlog.Log.i("MicroMsg.FavTagEditUI", "[addTagMultiSelect] tag name = " + str + ", tagID = " + i18);
                r45.hi hiVar = new r45.hi();
                hiVar.f376177e = i18;
                hiVar.f376178f = str;
                hiVar.f376176d = r2Var.field_id;
                hiVar.f376179g = 1;
                linkedList.add(hiVar);
            }
            i17++;
        }
    }
}
