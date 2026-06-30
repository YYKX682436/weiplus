package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f231104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c f231105e;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c cVar, java.util.List list) {
        this.f231105e = cVar;
        this.f231104d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c cVar = this.f231105e;
        if (cVar.f231047a != null) {
            java.util.List<com.p314xaae8f345.mm.p960xd6a841b0.C11145xd1f31e9e> list = this.f231104d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "onVideoGroupMemberChange:%s", list);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 v0Var = cVar.f231047a;
            if (v0Var.x()) {
                v0Var.f231707q.clear();
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 n17 = v0Var.n();
                boolean z17 = false;
                for (com.p314xaae8f345.mm.p960xd6a841b0.C11145xd1f31e9e c11145xd1f31e9e : list) {
                    int i17 = c11145xd1f31e9e.f153154g;
                    if (i17 == 2 || i17 == 3) {
                        v0Var.f231707q.add(c11145xd1f31e9e.f153152e);
                    }
                    if (n17 != null && c11145xd1f31e9e.f153155h == 101) {
                        n17.j(c11145xd1f31e9e.f153152e);
                        v0Var.f231707q.add(c11145xd1f31e9e.f153152e);
                        z17 = true;
                    }
                }
                zj3.g gVar = zj3.g.f554835a;
                zj3.g.f554847m = java.lang.Math.max(zj3.g.f554847m, v0Var.f231707q.size());
                if (v0Var.L == null) {
                    v0Var.L = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.k2();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.k2 k2Var = v0Var.L;
                if (k2Var != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkScreenCastManager", "memberList is " + list);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : list) {
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p960xd6a841b0.C11145xd1f31e9e) obj).f153152e, c01.z1.r())) {
                            arrayList2.add(obj);
                        }
                    }
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p960xd6a841b0.C11145xd1f31e9e c11145xd1f31e9e2 = (com.p314xaae8f345.mm.p960xd6a841b0.C11145xd1f31e9e) it.next();
                        yz5.l lVar = (yz5.l) k2Var.f231564d.get(java.lang.Integer.valueOf(c11145xd1f31e9e2.f153155h));
                        if (lVar != null) {
                            java.lang.String wxUserName = c11145xd1f31e9e2.f153152e;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wxUserName, "wxUserName");
                            lVar.mo146xb9724478(wxUserName);
                        }
                        int i18 = c11145xd1f31e9e2.f153155h;
                        if (i18 == 101 || i18 == 102) {
                            arrayList.add(c11145xd1f31e9e2.f153152e);
                        }
                    }
                    k2Var.f231563c = arrayList;
                    zj3.g gVar2 = zj3.g.f554835a;
                    zj3.g.f554849o = java.lang.Math.max(zj3.g.f554849o, arrayList.size());
                }
                java.util.ArrayList arrayList3 = (java.util.ArrayList) v0Var.f231708r;
                arrayList3.clear();
                arrayList3.addAll(list);
                if (n17 != null && !z17) {
                    n17.k();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkManager", "onVideoGroupMemberChange %s", v0Var.f231707q);
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z zVar = v0Var.C;
                if (zVar != null) {
                    zVar.i4();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MT.MultiTalkManager", "uiCallback is NULL !!!");
                }
            }
        }
    }
}
