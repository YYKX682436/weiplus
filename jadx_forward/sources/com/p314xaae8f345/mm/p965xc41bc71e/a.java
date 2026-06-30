package com.p314xaae8f345.mm.p965xc41bc71e;

/* loaded from: classes9.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e a(int i17, java.util.List itemsShowOnDialog, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemsShowOnDialog, "itemsShowOnDialog");
        com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e c11157x9b46987e = new com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e();
        c11157x9b46987e.f153308e = z17 ? 1 : 0;
        int i18 = 1;
        if (i17 != 1) {
            i18 = 3;
            if (i17 != 3) {
                i18 = 2;
            }
        }
        c11157x9b46987e.f153307d = i18;
        java.util.Iterator it = itemsShowOnDialog.iterator();
        while (it.hasNext()) {
            m31.q0 q0Var = (m31.q0) it.next();
            java.util.ArrayList arrayList = c11157x9b46987e.f153309f;
            com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e.ItemUiData itemUiData = new com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e.ItemUiData();
            java.lang.String str = q0Var.f404736d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            itemUiData.f153310d = str;
            itemUiData.f153311e = q0Var.f404733a ? 1 : 0;
            if (q0Var instanceof m31.a1) {
                itemUiData.f153312f = ((m31.a1) q0Var).f404652f;
            } else if (q0Var instanceof m31.z0) {
                itemUiData.f153313g = ((m31.z0) q0Var).f404775e;
            }
            arrayList.add(itemUiData);
        }
        return c11157x9b46987e;
    }
}
