package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes8.dex */
public class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16472xf5823d43 f229991a;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16472xf5823d43 activityC16472xf5823d43) {
        this.f229991a = activityC16472xf5823d43;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.List list;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallFunctionSettingsUI", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c);
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16472xf5823d43 activityC16472xf5823d43 = this.f229991a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.yk3 yk3Var = (r45.yk3) fVar.f152151d;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16472xf5823d43.f229762o;
            activityC16472xf5823d43.getClass();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = yk3Var.f472709e;
            if (gVar != null) {
                activityC16472xf5823d43.f229765f.setText(gVar.i());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = yk3Var.f472710f;
            if (gVar2 != null) {
                activityC16472xf5823d43.f229766g.setText(gVar2.i());
            }
            java.util.LinkedList linkedList = ((r45.yk3) fVar.f152151d).f472708d;
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                int i19 = -1;
                while (true) {
                    boolean hasNext = it.hasNext();
                    list = activityC16472xf5823d43.f229769m;
                    if (!hasNext) {
                        break;
                    }
                    r45.y55 y55Var = (r45.y55) it.next();
                    if (i19 != y55Var.f472340i) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.s(null);
                        sVar.f230010a = 0;
                        sVar.f230012c = y55Var.f472341m;
                        java.util.ArrayList arrayList = (java.util.ArrayList) list;
                        arrayList.add(sVar);
                        if (arrayList.size() - 2 >= 0) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.s) arrayList.get(arrayList.size() - 2)).f230013d = true;
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.s sVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.s(null);
                    sVar2.f230010a = 1;
                    sVar2.f230011b = y55Var;
                    ((java.util.ArrayList) list).add(sVar2);
                    i19 = y55Var.f472340i;
                }
                java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
                if (!arrayList2.isEmpty()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.s) arrayList2.get(arrayList2.size() - 1)).f230013d = true;
                }
            }
            activityC16472xf5823d43.f229767h.notifyDataSetChanged();
        } else {
            at4.j0.c(fVar.f152149b, fVar.f152150c).a(activityC16472xf5823d43.mo55332x76847179(), true);
        }
        return null;
    }
}
