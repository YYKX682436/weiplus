package com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958;

/* loaded from: classes.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.ActivityC16174xab39c6e1 f224907d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.ActivityC16174xab39c6e1 activityC16174xab39c6e1) {
        this.f224907d = activityC16174xab39c6e1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/searchContact/ContactManagerUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.ActivityC16174xab39c6e1 activityC16174xab39c6e1 = this.f224907d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.C16173x548f83b U6 = activityC16174xab39c6e1.U6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(U6);
        java.util.ArrayList arrayList2 = U6.B;
        if (arrayList2 != null && arrayList2.size() != 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC16174xab39c6e1, 1, true);
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.h(activityC16174xab39c6e1);
            java.util.Iterator it = arrayList2.iterator();
            int i17 = 0;
            java.lang.String str2 = "";
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.d) it.next();
                if (android.text.TextUtils.isEmpty(dVar.f224886i)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(str2);
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = dVar.f224887m;
                    sb6.append(z3Var != null ? z3Var.P0() : null);
                    str2 = sb6.toString();
                } else {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(str2);
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = dVar.f224887m;
                    sb7.append(z3Var2 != null ? z3Var2.P0() : null);
                    sb7.append('@');
                    sb7.append(dVar.f224886i);
                    str2 = sb7.toString();
                }
                i17++;
                if (i17 < arrayList2.size()) {
                    str2 = str2 + (char) 12289;
                }
            }
            if (arrayList2.size() > 1) {
                str = activityC16174xab39c6e1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572573bo2, java.lang.String.valueOf(arrayList2.size()), str2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            } else if (arrayList2.size() == 1) {
                str = activityC16174xab39c6e1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572571bo0, str2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            } else {
                str = "";
            }
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.k(3L, ""));
            k0Var.r(str, 17, i65.a.b(activityC16174xab39c6e1, 14), null);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.i(activityC16174xab39c6e1);
            k0Var.v();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/searchContact/ContactManagerUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
