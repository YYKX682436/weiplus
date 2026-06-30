package aw2;

/* loaded from: classes.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f14795d;

    public s0(android.widget.CheckBox checkBox) {
        this.f14795d = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/upload/postui/postwidget/FinderPostToCommentWidget$onCreate$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f14795d.setChecked(!r7.isChecked());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/upload/postui/postwidget/FinderPostToCommentWidget$onCreate$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
