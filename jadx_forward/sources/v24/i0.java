package v24;

/* loaded from: classes5.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v24.q f514460d;

    public i0(v24.q qVar) {
        this.f514460d = qVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/utils/SafeSwitchTipDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        v24.q qVar = this.f514460d;
        qVar.R = true;
        qVar.B();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/utils/SafeSwitchTipDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
