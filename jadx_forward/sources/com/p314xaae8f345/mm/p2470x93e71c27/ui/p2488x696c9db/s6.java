package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public final class s6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6 f273431a = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6();

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17258x2152d807 b(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7) {
        am.cq cqVar;
        java.util.ArrayList arrayList;
        if (c5886xd11a0be7 == null || (cqVar = c5886xd11a0be7.f136194g) == null || (arrayList = cqVar.f87913m) == null) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17258x2152d807) arrayList.get(0);
    }

    public final java.util.ArrayList a(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7) {
        am.cq cqVar;
        java.util.ArrayList arrayList;
        am.cq cqVar2;
        am.cq cqVar3;
        am.cq cqVar4;
        am.cq cqVar5;
        am.cq cqVar6;
        am.cq cqVar7;
        am.cq cqVar8;
        am.cq cqVar9;
        am.cq cqVar10;
        am.cq cqVar11;
        am.cq cqVar12;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        if (c5886xd11a0be7 != null && (cqVar12 = c5886xd11a0be7.f136194g) != null && (arrayList2 = cqVar12.f87902b) != null) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (next instanceof java.lang.String) {
                    arrayList4.add(next);
                }
            }
        }
        int i17 = 1;
        int i18 = (c5886xd11a0be7 == null || (cqVar11 = c5886xd11a0be7.f136194g) == null) ? 1 : cqVar11.f87907g;
        if (c5886xd11a0be7 != null && (cqVar10 = c5886xd11a0be7.f136194g) != null) {
            i17 = cqVar10.f87908h;
        }
        int i19 = 0;
        boolean z17 = (c5886xd11a0be7 == null || (cqVar9 = c5886xd11a0be7.f136194g) == null) ? false : cqVar9.f87912l;
        java.lang.String str = (c5886xd11a0be7 == null || (cqVar8 = c5886xd11a0be7.f136194g) == null) ? null : cqVar8.f87901a;
        if (str == null) {
            str = "";
        }
        for (java.lang.Object obj : arrayList4) {
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a6357 = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357();
            c17261xe88a6357.f240152d = (java.lang.String) obj;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6 s6Var = f273431a;
            c17261xe88a6357.f240155g = s6Var.h((c5886xd11a0be7 == null || (cqVar7 = c5886xd11a0be7.f136194g) == null) ? null : cqVar7.f87904d, i19);
            c17261xe88a6357.f240153e = s6Var.g((c5886xd11a0be7 == null || (cqVar6 = c5886xd11a0be7.f136194g) == null) ? null : cqVar6.f87903c, i19);
            c17261xe88a6357.f240154f = s6Var.g((c5886xd11a0be7 == null || (cqVar5 = c5886xd11a0be7.f136194g) == null) ? null : cqVar5.f87905e, i19);
            c17261xe88a6357.f240161p = s6Var.g((c5886xd11a0be7 == null || (cqVar4 = c5886xd11a0be7.f136194g) == null) ? null : cqVar4.f87906f, i19);
            c17261xe88a6357.f240156h = s6Var.f((c5886xd11a0be7 == null || (cqVar3 = c5886xd11a0be7.f136194g) == null) ? null : cqVar3.f87909i, i19) / i18;
            c17261xe88a6357.f240157i = s6Var.f((c5886xd11a0be7 == null || (cqVar2 = c5886xd11a0be7.f136194g) == null) ? null : cqVar2.f87910j, i19) / i17;
            c17261xe88a6357.f240158m = i18;
            c17261xe88a6357.f240159n = i17;
            c17261xe88a6357.f240160o = str;
            c17261xe88a6357.f240162q = z17;
            c17261xe88a6357.f240163r = (c5886xd11a0be7 == null || (cqVar = c5886xd11a0be7.f136194g) == null || (arrayList = cqVar.f87913m) == null) ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17258x2152d807) arrayList.get(i19);
            arrayList3.add(c17261xe88a6357);
            i19 = i27;
        }
        return arrayList3;
    }

    public final int c(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7) {
        am.cq cqVar;
        int g17 = g((c5886xd11a0be7 == null || (cqVar = c5886xd11a0be7.f136194g) == null) ? null : cqVar.f87903c, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", "getEventCodeType " + g17);
        return g17;
    }

    public final int d(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7) {
        am.cq cqVar;
        int g17 = g((c5886xd11a0be7 == null || (cqVar = c5886xd11a0be7.f136194g) == null) ? null : cqVar.f87905e, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", "getEventCodeVersion " + g17);
        return g17;
    }

    public final java.lang.String e(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7) {
        am.cq cqVar;
        java.lang.String h17 = h((c5886xd11a0be7 == null || (cqVar = c5886xd11a0be7.f136194g) == null) ? null : cqVar.f87902b, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", "getEventResult ".concat(h17));
        return h17;
    }

    public final float f(java.util.ArrayList arrayList, int i17) {
        float f17 = 0.0f;
        if (!(arrayList == null || arrayList.isEmpty()) && i17 >= 0 && i17 < arrayList.size()) {
            try {
                java.lang.Object obj = arrayList.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                f17 = ((java.lang.Float) obj).floatValue();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", e17, "", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", "getValueFloat:" + f17 + "   index:" + i17);
        return f17;
    }

    public final int g(java.util.ArrayList arrayList, int i17) {
        int i18 = 0;
        if (!(arrayList == null || arrayList.isEmpty()) && i17 >= 0 && i17 < arrayList.size()) {
            try {
                java.lang.Object obj = arrayList.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                i18 = ((java.lang.Integer) obj).intValue();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", e17, "", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", "getValueInt:" + i18 + "   index:" + i17);
        return i18;
    }

    public final java.lang.String h(java.util.ArrayList arrayList, int i17) {
        java.lang.String str = "";
        if (!(arrayList == null || arrayList.isEmpty()) && i17 >= 0 && i17 < arrayList.size()) {
            try {
                java.lang.Object obj = arrayList.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                str = (java.lang.String) obj;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", e17, "", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.scanner.QBarOfImageFileResultEventDataParser", "getValueString:" + str + "   index:" + i17);
        return str;
    }
}
