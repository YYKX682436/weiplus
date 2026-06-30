package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes3.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 f183480d;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 c1Var) {
        this.f183480d = c1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.CheckBox checkBox = this.f183480d.f183386r;
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("announceCheckBox");
            throw null;
        }
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("announceCheckBox");
            throw null;
        }
        checkBox.setChecked(!checkBox.isChecked());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
