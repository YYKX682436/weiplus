package tx4;

/* loaded from: classes8.dex */
public abstract class i {
    public static db5.g4 a(android.content.Context context, java.util.List list) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.rk4 rk4Var = (r45.rk4) it.next();
            if (rk4Var != null) {
                if (tx4.h.f504220f.containsValue(java.lang.Integer.valueOf(rk4Var.f466500g))) {
                    arrayList.add(rk4Var);
                }
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
            return null;
        }
        java.util.Collections.sort(arrayList, new tx4.g());
        int i17 = ((r45.rk4) arrayList.get(arrayList.size() - 1)).f466502i;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList2.add(null);
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            r45.rk4 rk4Var2 = (r45.rk4) it6.next();
            int i19 = rk4Var2.f466502i;
            if (i19 > 0 && i19 <= arrayList2.size()) {
                arrayList2.set(rk4Var2.f466502i - 1, rk4Var2);
            }
        }
        db5.g4 g4Var = new db5.g4(context);
        java.util.Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            r45.rk4 rk4Var3 = (r45.rk4) it7.next();
            if (rk4Var3 == null) {
                g4Var.f(-1, "");
            } else {
                g4Var.f(rk4Var3.f466497d, rk4Var3.f466498e + "__" + rk4Var3.f466499f);
            }
        }
        return g4Var;
    }
}
