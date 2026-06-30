package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class r2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s2 f214458d;

    public r2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s2 s2Var) {
        this.f214458d = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow$initSecondPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s2 s2Var = this.f214458d;
        java.util.List list = s2Var.f214539n;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            java.lang.Integer num = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (next instanceof r45.jy0) {
                num = java.lang.Integer.valueOf(((r45.jy0) next).m75939xb282bd08(0));
            } else if (next instanceof r45.ot0) {
                num = java.lang.Integer.valueOf(((r45.ot0) next).m75939xb282bd08(0));
            }
            if (num != null) {
                arrayList2.add(num);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(s2Var.f214539n)) {
            android.content.Context context = s2Var.f214527b;
            db5.t7.h(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572832cp1));
            i17 = 3;
        } else {
            android.content.Context context2 = s2Var.f214527b;
            db5.t7.h(context2, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572834cp3));
            i17 = 2;
        }
        yz5.a aVar = s2Var.f214540o;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        android.content.Context context3 = s2Var.f214527b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context3 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        gm0.j1.d().g(new db2.j5(i17, arrayList2, s2Var.f214528c, s2Var.f214529d, s2Var.f214531f, s2Var.f214532g, s2Var.f214533h, s2Var.f214534i, nyVar != null ? nyVar.V6() : null));
        s2Var.f214535j = 2;
        s2Var.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow$initSecondPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
