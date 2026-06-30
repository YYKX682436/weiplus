package wl5;

/* loaded from: classes10.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wl5.x f528649d;

    public m(wl5.x xVar) {
        this.f528649d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/textview/SelectableTextHelper$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "onClick", new java.lang.Object[0]);
        wl5.x xVar = this.f528649d;
        android.view.View.OnClickListener onClickListener = xVar.f528703o;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        xVar.M = true;
        xVar.N = true;
        xVar.i();
        xVar.k();
        wl5.v vVar = xVar.f528699k;
        if (vVar != null) {
            vVar.a();
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/textview/SelectableTextHelper$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
