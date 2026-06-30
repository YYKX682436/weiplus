package rl5;

/* loaded from: classes8.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f478856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rl5.r f478857e;

    public k(rl5.r rVar, int i17) {
        this.f478857e = rVar;
        this.f478856d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/menu/MMPopupMenu$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rl5.r rVar = this.f478857e;
        db5.t4 t4Var = rVar.f478887x;
        if (t4Var != null) {
            db5.g4 g4Var = rVar.f478889z;
            int i17 = this.f478856d;
            t4Var.mo888x34063ac(g4Var.getItem(i17), i17);
        }
        rVar.f478875m.dismiss();
        yj0.a.h(this, "com/tencent/mm/ui/widget/menu/MMPopupMenu$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
