package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class m8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22323x39e3762a f288559d;

    public m8(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22323x39e3762a activityC22323x39e3762a) {
        this.f288559d = activityC22323x39e3762a;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22323x39e3762a activityC22323x39e3762a = this.f288559d;
        boolean d17 = com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(activityC22323x39e3762a.L, 8192);
        activityC22323x39e3762a.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = activityC22323x39e3762a.H.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (d17 || !c01.e2.M(str)) {
                hashSet.add(str);
            } else {
                ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                java.util.List n17 = c01.v1.n(str);
                if (n17 != null) {
                    java.util.Iterator it6 = n17.iterator();
                    while (it6.hasNext()) {
                        hashSet.add((java.lang.String) it6.next());
                    }
                }
            }
        }
        arrayList.addAll(hashSet);
        arrayList.remove(c01.z1.r());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(activityC22323x39e3762a.I);
        arrayList2.removeAll(arrayList);
        activityC22323x39e3762a.w7(arrayList, arrayList2);
        return true;
    }
}
