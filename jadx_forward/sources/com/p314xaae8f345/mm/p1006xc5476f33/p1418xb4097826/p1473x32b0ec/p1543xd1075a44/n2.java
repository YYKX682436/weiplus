package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class n2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s2 f200682d;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s2 s2Var) {
        this.f200682d = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLicenseBottomSheet$createContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s2 s2Var = this.f200682d;
        android.widget.CheckBox checkBox = s2Var.f201242k;
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkBox");
            throw null;
        }
        if (checkBox.isChecked()) {
            s2Var.f201233b.mo152xb9724478();
            s2Var.b().h();
        } else {
            android.widget.CheckBox checkBox2 = s2Var.f201242k;
            if (checkBox2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkBox");
                throw null;
            }
            checkBox2.requestFocus();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLicenseBottomSheet$createContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
