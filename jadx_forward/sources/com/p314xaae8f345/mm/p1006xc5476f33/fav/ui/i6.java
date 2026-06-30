package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes4.dex */
public class i6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f182699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f182700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d f182701f;

    public i6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d activityC13572xe5ee659d, java.util.List list, android.app.Dialog dialog) {
        this.f182701f = activityC13572xe5ee659d;
        this.f182699d = list;
        this.f182700e = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d activityC13572xe5ee659d = this.f182701f;
        java.util.LinkedList linkedList2 = activityC13572xe5ee659d.f181947d.f67653xef67d413.f466630f;
        java.util.Iterator it = this.f182699d.iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            t72.a f17 = t72.b.f497573a.f(str);
            if (f17 != null) {
                i17 = f17.f68043xc8a07680;
                int indexOf = linkedList2.indexOf(java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagEditUI", "[addTagSingleSelect] index = " + indexOf + ", remove ids size = " + linkedList2.size());
                if (indexOf > 0) {
                    linkedList2.remove(indexOf);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagEditUI", "[addTagSingleSelect] tag name = " + str + ", tagID = " + i17);
            r45.hi hiVar = new r45.hi();
            hiVar.f457710e = i17;
            hiVar.f457711f = str;
            hiVar.f457709d = activityC13572xe5ee659d.f181947d.f67643xc8a07680;
            hiVar.f457712g = 1;
            linkedList.add(hiVar);
        }
        while (i17 < linkedList2.size()) {
            int intValue = ((java.lang.Integer) linkedList2.get(i17)).intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagEditUI", "[addTagSingleSelect] remove tag id = " + intValue);
            t72.a e17 = t72.b.f497573a.e(intValue);
            if (e17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavTagEditUI", "[addTagSingleSelect] favTag = null, id = " + intValue);
            } else {
                r45.hi hiVar2 = new r45.hi();
                hiVar2.f457710e = intValue;
                hiVar2.f457711f = e17.f68044x225f1eb0;
                hiVar2.f457709d = activityC13572xe5ee659d.f181947d.f67643xc8a07680;
                hiVar2.f457712g = 2;
                linkedList.add(hiVar2);
            }
            i17++;
        }
        o72.z4 uj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).uj();
        final android.app.Dialog dialog = this.f182700e;
        ((t72.l) uj6).U6(linkedList, new yz5.l() { // from class: com.tencent.mm.plugin.fav.ui.i6$$a
            @Override // yz5.l
            /* renamed from: invoke */
            public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.i6 i6Var = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.i6.this;
                i6Var.getClass();
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j6(i6Var, dialog));
                return null;
            }
        });
    }
}
