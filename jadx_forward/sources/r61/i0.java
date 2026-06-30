package r61;

/* loaded from: classes15.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f474415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r61.n0 f474416e;

    public i0(r61.n0 n0Var, int i17) {
        this.f474416e = n0Var;
        this.f474415d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/friend/model/FriendAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r61.n0 n0Var = this.f474416e;
        int i17 = n0Var.f474448m;
        int i18 = this.f474415d;
        if (i17 == 1) {
            n0Var.f474447i[i18] = 0;
        } else if (i17 == 2) {
            n0Var.f474447i[i18] = 0;
        }
        n0Var.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/account/friend/model/FriendAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
