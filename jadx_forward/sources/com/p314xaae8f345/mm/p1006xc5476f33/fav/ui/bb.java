package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes4.dex */
public class bb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f182057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f182058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f182059f;

    public bb(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a, java.lang.String[] strArr, java.util.List list, android.app.Dialog dialog) {
        this.f182057d = strArr;
        this.f182058e = list;
        this.f182059f = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : this.f182057d) {
            t72.a f17 = t72.b.f497573a.f(str);
            if (f17 == null) {
                arrayList.add(str);
                i17 = 0;
            } else {
                i17 = f17.f68043xc8a07680;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "tag name = " + str + ", tagID = " + i17);
            int i18 = 0;
            while (true) {
                java.util.List list = this.f182058e;
                if (i18 < list.size()) {
                    o72.r2 r2Var = (o72.r2) list.get(i18);
                    r45.hi hiVar = new r45.hi();
                    hiVar.f457710e = i17;
                    hiVar.f457711f = str;
                    hiVar.f457709d = r2Var.f67643xc8a07680;
                    hiVar.f457712g = 1;
                    linkedList.add(hiVar);
                    i18++;
                }
            }
        }
        o72.z4 uj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).uj();
        final android.app.Dialog dialog = this.f182059f;
        ((t72.l) uj6).U6(linkedList, new yz5.l() { // from class: com.tencent.mm.plugin.fav.ui.bb$$a
            @Override // yz5.l
            /* renamed from: invoke */
            public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.bb bbVar = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.bb.this;
                bbVar.getClass();
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.cb(bbVar, dialog));
                return null;
            }
        });
    }
}
