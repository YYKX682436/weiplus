package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19638x462df501 f273629d;

    public y0(com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19638x462df501 activityC19638x462df501) {
        this.f273629d = activityC19638x462df501;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/FileSelectorPreviewUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) this.f273629d.findViewById(com.p314xaae8f345.mm.R.id.vfh);
        if (checkBox == null) {
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/FileSelectorPreviewUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (checkBox.getVisibility() == 0) {
            checkBox.setChecked(!checkBox.isChecked());
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/FileSelectorPreviewUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
