package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes4.dex */
public class k6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f182751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f182752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d f182753f;

    public k6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d activityC13572xe5ee659d, java.util.List list, android.app.Dialog dialog) {
        this.f182753f = activityC13572xe5ee659d;
        this.f182751d = list;
        this.f182752e = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i17 = 0;
        while (true) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d activityC13572xe5ee659d = this.f182753f;
            if (i17 >= activityC13572xe5ee659d.f181957q.size()) {
                o72.z4 uj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).uj();
                final android.app.Dialog dialog = this.f182752e;
                ((t72.l) uj6).U6(linkedList, new yz5.l() { // from class: com.tencent.mm.plugin.fav.ui.k6$$a
                    @Override // yz5.l
                    /* renamed from: invoke */
                    public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.k6 k6Var = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.k6.this;
                        k6Var.getClass();
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            return null;
                        }
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.l6(k6Var, dialog));
                        return null;
                    }
                });
                return;
            }
            o72.r2 r2Var = (o72.r2) activityC13572xe5ee659d.f181957q.get(i17);
            for (java.lang.String str : this.f182751d) {
                t72.a f17 = t72.b.f497573a.f(str);
                int i18 = f17 == null ? 0 : f17.f68043xc8a07680;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagEditUI", "[addTagMultiSelect] tag name = " + str + ", tagID = " + i18);
                r45.hi hiVar = new r45.hi();
                hiVar.f457710e = i18;
                hiVar.f457711f = str;
                hiVar.f457709d = r2Var.f67643xc8a07680;
                hiVar.f457712g = 1;
                linkedList.add(hiVar);
            }
            i17++;
        }
    }
}
