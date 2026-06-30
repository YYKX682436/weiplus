package al5;

/* loaded from: classes8.dex */
public class q4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g f87536d;

    public q4(al5.u4 u4Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g gVar) {
        this.f87536d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/WeSnackBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g gVar = this.f87536d;
        if (gVar != null) {
            gVar.a();
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/WeSnackBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
