package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class ih implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPoiAddGuideUI f110155d;

    public ih(com.tencent.mm.plugin.finder.feed.ui.FinderPoiAddGuideUI finderPoiAddGuideUI) {
        this.f110155d = finderPoiAddGuideUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderPoiAddGuideUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.FinderPoiAddGuideUI finderPoiAddGuideUI = this.f110155d;
        android.widget.CheckBox checkBox = finderPoiAddGuideUI.f109477t;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("checkBox");
            throw null;
        }
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("checkBox");
            throw null;
        }
        checkBox.setChecked(!checkBox.isChecked());
        android.widget.CheckBox checkBox2 = finderPoiAddGuideUI.f109477t;
        if (checkBox2 == null) {
            kotlin.jvm.internal.o.o("checkBox");
            throw null;
        }
        finderPoiAddGuideUI.f109482y = checkBox2.isChecked();
        if (finderPoiAddGuideUI.f109482y) {
            android.widget.Button button = finderPoiAddGuideUI.f109479v;
            if (button == null) {
                kotlin.jvm.internal.o.o("addButton");
                throw null;
            }
            button.setBackgroundResource(com.tencent.mm.R.drawable.f481057jk);
            android.widget.Button button2 = finderPoiAddGuideUI.f109479v;
            if (button2 == null) {
                kotlin.jvm.internal.o.o("addButton");
                throw null;
            }
            button2.setTextColor(finderPoiAddGuideUI.getResources().getColor(android.R.color.white));
        } else {
            android.widget.Button button3 = finderPoiAddGuideUI.f109479v;
            if (button3 == null) {
                kotlin.jvm.internal.o.o("addButton");
                throw null;
            }
            button3.setBackgroundResource(com.tencent.mm.R.drawable.f481063jr);
            android.widget.Button button4 = finderPoiAddGuideUI.f109479v;
            if (button4 == null) {
                kotlin.jvm.internal.o.o("addButton");
                throw null;
            }
            button4.setTextColor(finderPoiAddGuideUI.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderPoiAddGuideUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
