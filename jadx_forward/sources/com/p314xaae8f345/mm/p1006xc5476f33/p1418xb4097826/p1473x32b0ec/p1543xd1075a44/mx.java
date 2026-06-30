package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes.dex */
public final class mx implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rx f200665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f200666e;

    public mx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rx rxVar, java.util.LinkedList linkedList) {
        this.f200665d = rxVar;
        this.f200666e = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rx rxVar = this.f200665d;
        if (rxVar.X) {
            return;
        }
        rxVar.X = true;
        if (rxVar.Y) {
            return;
        }
        java.util.LinkedList linkedList = this.f200666e;
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (!zl2.r4.f555483a.u1((r45.f62) obj)) {
                    break;
                }
            }
        }
        r45.f62 f62Var = (r45.f62) obj;
        if (f62Var != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(linkedList.indexOf(f62Var));
            int intValue = valueOf.intValue();
            if (!(intValue >= 0 && intValue < linkedList.size())) {
                valueOf = null;
            }
            if (valueOf != null) {
                if (!(rxVar.f0().f519665e != valueOf.intValue())) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue2 = valueOf.intValue();
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = rxVar.N;
                    if (c1163xf1deaba4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timeRv");
                        throw null;
                    }
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c1163xf1deaba4.p0(intValue2);
                    if (p07 == null || (view = p07.f3639x46306858) == null) {
                        return;
                    }
                    view.performClick();
                }
            }
        }
    }
}
