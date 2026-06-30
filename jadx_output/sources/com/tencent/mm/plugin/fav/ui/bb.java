package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes4.dex */
public class bb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f100524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f100525e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f100526f;

    public bb(com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI, java.lang.String[] strArr, java.util.List list, android.app.Dialog dialog) {
        this.f100524d = strArr;
        this.f100525e = list;
        this.f100526f = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : this.f100524d) {
            t72.a f17 = t72.b.f416040a.f(str);
            if (f17 == null) {
                arrayList.add(str);
                i17 = 0;
            } else {
                i17 = f17.field_id;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "tag name = " + str + ", tagID = " + i17);
            int i18 = 0;
            while (true) {
                java.util.List list = this.f100525e;
                if (i18 < list.size()) {
                    o72.r2 r2Var = (o72.r2) list.get(i18);
                    r45.hi hiVar = new r45.hi();
                    hiVar.f376177e = i17;
                    hiVar.f376178f = str;
                    hiVar.f376176d = r2Var.field_id;
                    hiVar.f376179g = 1;
                    linkedList.add(hiVar);
                    i18++;
                }
            }
        }
        o72.z4 uj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).uj();
        final android.app.Dialog dialog = this.f100526f;
        ((t72.l) uj6).U6(linkedList, new yz5.l() { // from class: com.tencent.mm.plugin.fav.ui.bb$$a
            @Override // yz5.l
            public final java.lang.Object invoke(java.lang.Object obj) {
                com.tencent.mm.plugin.fav.ui.bb bbVar = com.tencent.mm.plugin.fav.ui.bb.this;
                bbVar.getClass();
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fav.ui.cb(bbVar, dialog));
                return null;
            }
        });
    }
}
