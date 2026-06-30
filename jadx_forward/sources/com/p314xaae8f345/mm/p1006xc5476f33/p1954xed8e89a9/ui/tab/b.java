package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes11.dex */
public abstract class b {
    public static final java.lang.String a(int i17, java.util.LinkedList linkedList) {
        if (i17 > 0 && linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.j36 j36Var = (r45.j36) it.next();
                if (j36Var.f459076d == i17) {
                    java.lang.String Wording = j36Var.f459077e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Wording, "Wording");
                    return Wording;
                }
            }
        }
        return "";
    }

    public static final java.lang.String b(android.content.Context context, int i17, r45.wl wlVar) {
        java.util.LinkedList linkedList;
        r45.l53 l53Var;
        if (wlVar != null && (wlVar.f470772m & i17) != 0 && (linkedList = wlVar.f470773n) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                l53Var = (r45.l53) it.next();
                if (l53Var.f460680d == i17) {
                    break;
                }
            }
        }
        l53Var = null;
        java.lang.String str = l53Var != null ? l53Var.f460682f : null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", new android.content.Intent().putExtra("rawUrl", str), null);
            if (context != null) {
                if (!(context instanceof android.app.Activity)) {
                    context = null;
                }
                if (context != null) {
                    android.app.Activity activity = (android.app.Activity) context;
                    activity.finish();
                    activity.overridePendingTransition(0, 0);
                }
            }
        }
        if (l53Var != null) {
            return l53Var.f460681e;
        }
        return null;
    }

    public static final java.lang.String c(r45.wl wlVar, android.content.Context context) {
        return b(context, 8, wlVar);
    }

    public static final jz5.l d(r45.wl wlVar) {
        r45.td5 td5Var;
        r45.td5 td5Var2;
        java.util.LinkedList linkedList = null;
        java.lang.String a17 = a(1, (wlVar == null || (td5Var2 = wlVar.f470782w) == null) ? null : td5Var2.f467861e);
        if (wlVar != null && (td5Var = wlVar.f470782w) != null) {
            linkedList = td5Var.f467861e;
        }
        return new jz5.l(a17, a(2, linkedList));
    }
}
