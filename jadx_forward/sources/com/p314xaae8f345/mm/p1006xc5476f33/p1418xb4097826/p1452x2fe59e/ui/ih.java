package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes.dex */
public final class ih implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14063x9a4df5f3 f191688d;

    public ih(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14063x9a4df5f3 activityC14063x9a4df5f3) {
        this.f191688d = activityC14063x9a4df5f3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderPoiAddGuideUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14063x9a4df5f3 activityC14063x9a4df5f3 = this.f191688d;
        android.widget.CheckBox checkBox = activityC14063x9a4df5f3.f191010t;
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkBox");
            throw null;
        }
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkBox");
            throw null;
        }
        checkBox.setChecked(!checkBox.isChecked());
        android.widget.CheckBox checkBox2 = activityC14063x9a4df5f3.f191010t;
        if (checkBox2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkBox");
            throw null;
        }
        activityC14063x9a4df5f3.f191015y = checkBox2.isChecked();
        if (activityC14063x9a4df5f3.f191015y) {
            android.widget.Button button = activityC14063x9a4df5f3.f191012v;
            if (button == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addButton");
                throw null;
            }
            button.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562590jk);
            android.widget.Button button2 = activityC14063x9a4df5f3.f191012v;
            if (button2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addButton");
                throw null;
            }
            button2.setTextColor(activityC14063x9a4df5f3.getResources().getColor(android.R.color.white));
        } else {
            android.widget.Button button3 = activityC14063x9a4df5f3.f191012v;
            if (button3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addButton");
                throw null;
            }
            button3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562596jr);
            android.widget.Button button4 = activityC14063x9a4df5f3.f191012v;
            if (button4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addButton");
                throw null;
            }
            button4.setTextColor(activityC14063x9a4df5f3.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderPoiAddGuideUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
