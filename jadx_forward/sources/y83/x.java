package y83;

/* loaded from: classes.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16159x6f4d8fe0 f541537d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16159x6f4d8fe0 activityC16159x6f4d8fe0) {
        this.f541537d = activityC16159x6f4d8fe0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.CheckBox checkBox = this.f541537d.f224670o;
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("syncMsgCb");
            throw null;
        }
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("syncMsgCb");
            throw null;
        }
        checkBox.setChecked(!checkBox.isChecked());
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
