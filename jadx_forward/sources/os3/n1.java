package os3;

/* loaded from: classes.dex */
public class n1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f429690d;

    public n1(os3.v1 v1Var, android.widget.ImageView imageView) {
        this.f429690d = imageView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/FileUploadHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.ImageView imageView = this.f429690d;
        if (imageView.getVisibility() == 0) {
            imageView.performClick();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/FileUploadHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
