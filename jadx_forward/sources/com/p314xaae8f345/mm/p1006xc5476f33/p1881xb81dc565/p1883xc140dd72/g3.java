package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f231124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f231125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 f231126f;

    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var, java.util.ArrayList arrayList, boolean z17) {
        this.f231126f = i4Var;
        this.f231124d = arrayList;
        this.f231125e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = this.f231126f;
        int i17 = i4Var.f231170n;
        if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "steve: not in room, status: %d", java.lang.Integer.valueOf(i17));
            return;
        }
        java.util.ArrayList arrayList = this.f231124d;
        if (arrayList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "steve: no subscribers, return,  status: %d", java.lang.Integer.valueOf(i17));
            return;
        }
        int size = arrayList.size();
        boolean z17 = this.f231125e;
        if (size != 1 || z17) {
            int i18 = z17 ? 640 : 480;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Integer num = (java.lang.Integer) it.next();
                r45.bi6 bi6Var = new r45.bi6();
                bi6Var.f452320d = num.intValue();
                bi6Var.f452321e = i18;
                int A = i4Var.A(num.intValue());
                if (A == 102 || A == 101) {
                    bi6Var.f452321e = 240;
                    linkedList2.add(bi6Var);
                } else {
                    linkedList.add(bi6Var);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "subscribeByUserMids, videoMembers memberId:%d", num);
            }
            r45.ai6 ai6Var = i4Var.S1;
            ai6Var.f451560d = linkedList;
            ai6Var.f451561e = linkedList2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "hy: subscribeByUserMids, videoMembers %s", ai6Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.d(i4Var.S1);
            return;
        }
        int i19 = i4Var.f231170n;
        if (i19 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "steve: not in room, status: %d", java.lang.Integer.valueOf(i19));
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList a17 = i4Var.f231156f.a();
        if (a17 == null || a17.size() == 0) {
            return;
        }
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        java.util.Iterator it6 = a17.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w) it6.next();
            if (i4Var.f231189y0.equals(wVar.f231375c)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "subscribeAll, skip myself memberId:%d,memberName%s", java.lang.Integer.valueOf(wVar.f231373a), wVar.f231375c);
            } else {
                int i27 = wVar.f231373a;
                r45.bi6 bi6Var2 = new r45.bi6();
                bi6Var2.f452320d = i27;
                bi6Var2.f452321e = 480;
                int A2 = i4Var.A(i27);
                if (A2 == 102 || A2 == 101) {
                    bi6Var2.f452321e = 240;
                    linkedList4.add(bi6Var2);
                } else {
                    linkedList3.add(bi6Var2);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "subscribeAll, videoMembers memberId:%d,memberName%s", java.lang.Integer.valueOf(i27), wVar.f231375c);
            }
        }
        r45.ai6 ai6Var2 = i4Var.S1;
        ai6Var2.f451560d = linkedList3;
        ai6Var2.f451561e = linkedList4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "hy: subscribe, videoMembers %s", arrayList2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.d(ai6Var2);
    }
}
