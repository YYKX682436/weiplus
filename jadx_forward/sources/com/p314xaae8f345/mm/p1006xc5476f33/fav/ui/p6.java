package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes11.dex */
public class p6 implements db5.t6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d f182869d;

    public p6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d activityC13572xe5ee659d) {
        this.f182869d = activityC13572xe5ee659d;
    }

    @Override // db5.t6
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d activityC13572xe5ee659d = this.f182869d;
        activityC13572xe5ee659d.f181950g.p(str);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.f fVar = activityC13572xe5ee659d.f181954n;
        ((java.util.HashSet) fVar.f182033g).remove(str);
        fVar.notifyDataSetChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 c13623x735f56a5 = activityC13572xe5ee659d.f181949f;
        if (c13623x735f56a5 != null) {
            c13623x735f56a5.s(str, false);
        }
        activityC13572xe5ee659d.T6();
    }

    @Override // db5.t6
    public void c() {
    }

    @Override // db5.t6
    public void d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d activityC13572xe5ee659d = this.f182869d;
        activityC13572xe5ee659d.f181950g.d(str, true);
        activityC13572xe5ee659d.T6();
    }

    @Override // db5.t6
    public void f(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d activityC13572xe5ee659d = this.f182869d;
        activityC13572xe5ee659d.f181950g.p(str);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.f fVar = activityC13572xe5ee659d.f181954n;
        ((java.util.HashSet) fVar.f182033g).remove(str);
        fVar.notifyDataSetChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 c13623x735f56a5 = activityC13572xe5ee659d.f181949f;
        if (c13623x735f56a5 != null) {
            c13623x735f56a5.s(str, false);
        }
        activityC13572xe5ee659d.T6();
    }

    @Override // db5.t6
    public void g(java.lang.String str) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d activityC13572xe5ee659d = this.f182869d;
        if (K0) {
            activityC13572xe5ee659d.f181952i.setVisibility(8);
            activityC13572xe5ee659d.f181951h.setVisibility(0);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.g gVar = activityC13572xe5ee659d.f181955o;
            gVar.f182039g.clear();
            java.util.LinkedList linkedList = (java.util.LinkedList) gVar.f182038f;
            linkedList.clear();
            gVar.f182037e = str == null ? "" : str;
            o72.i3 tj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj();
            tj6.getClass();
            boolean K02 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
            java.util.ArrayList arrayList = new java.util.ArrayList(16);
            java.util.Iterator it = tj6.f424893a.f465734d.iterator();
            while (it.hasNext()) {
                java.util.Iterator it6 = ((r45.pq0) it.next()).f464834e.iterator();
                while (it6.hasNext()) {
                    r45.oq0 oq0Var = (r45.oq0) it6.next();
                    if (K02 || oq0Var.f463971d.contains(str)) {
                        arrayList.add(oq0Var.f463971d);
                    }
                }
            }
            linkedList.addAll(arrayList);
            gVar.notifyDataSetChanged();
            activityC13572xe5ee659d.f181952i.setVisibility(0);
            activityC13572xe5ee659d.f181951h.setVisibility(8);
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d.f181946s;
        activityC13572xe5ee659d.T6();
    }

    @Override // db5.t6
    public void h(java.lang.String str) {
    }

    @Override // db5.t6
    public void j(boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d activityC13572xe5ee659d = this.f182869d;
        activityC13572xe5ee659d.f181956p = z17;
        activityC13572xe5ee659d.f181953m.setVisibility((!z17 || i17 <= 0) ? 8 : 0);
        activityC13572xe5ee659d.f181953m.setText(activityC13572xe5ee659d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cdm, java.lang.Integer.valueOf(i17)));
        activityC13572xe5ee659d.T6();
    }
}
