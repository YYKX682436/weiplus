package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes4.dex */
public class i6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f101166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f101167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavTagEditUI f101168f;

    public i6(com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI, java.util.List list, android.app.Dialog dialog) {
        this.f101168f = favTagEditUI;
        this.f101166d = list;
        this.f101167e = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI = this.f101168f;
        java.util.LinkedList linkedList2 = favTagEditUI.f100414d.field_tagProto.f385097f;
        java.util.Iterator it = this.f101166d.iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            t72.a f17 = t72.b.f416040a.f(str);
            if (f17 != null) {
                i17 = f17.field_id;
                int indexOf = linkedList2.indexOf(java.lang.Integer.valueOf(i17));
                com.tencent.mars.xlog.Log.i("MicroMsg.FavTagEditUI", "[addTagSingleSelect] index = " + indexOf + ", remove ids size = " + linkedList2.size());
                if (indexOf > 0) {
                    linkedList2.remove(indexOf);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FavTagEditUI", "[addTagSingleSelect] tag name = " + str + ", tagID = " + i17);
            r45.hi hiVar = new r45.hi();
            hiVar.f376177e = i17;
            hiVar.f376178f = str;
            hiVar.f376176d = favTagEditUI.f100414d.field_id;
            hiVar.f376179g = 1;
            linkedList.add(hiVar);
        }
        while (i17 < linkedList2.size()) {
            int intValue = ((java.lang.Integer) linkedList2.get(i17)).intValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.FavTagEditUI", "[addTagSingleSelect] remove tag id = " + intValue);
            t72.a e17 = t72.b.f416040a.e(intValue);
            if (e17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FavTagEditUI", "[addTagSingleSelect] favTag = null, id = " + intValue);
            } else {
                r45.hi hiVar2 = new r45.hi();
                hiVar2.f376177e = intValue;
                hiVar2.f376178f = e17.field_name;
                hiVar2.f376176d = favTagEditUI.f100414d.field_id;
                hiVar2.f376179g = 2;
                linkedList.add(hiVar2);
            }
            i17++;
        }
        o72.z4 uj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).uj();
        final android.app.Dialog dialog = this.f101167e;
        ((t72.l) uj6).U6(linkedList, new yz5.l() { // from class: com.tencent.mm.plugin.fav.ui.i6$$a
            @Override // yz5.l
            public final java.lang.Object invoke(java.lang.Object obj) {
                com.tencent.mm.plugin.fav.ui.i6 i6Var = com.tencent.mm.plugin.fav.ui.i6.this;
                i6Var.getClass();
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fav.ui.j6(i6Var, dialog));
                return null;
            }
        });
    }
}
