package hr3;

/* loaded from: classes11.dex */
public class i7 implements r35.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hr3.j7 f365183a;

    public i7(hr3.j7 j7Var) {
        this.f365183a = j7Var;
    }

    @Override // r35.d2
    public void a(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
    }

    @Override // r35.d2
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
    }

    @Override // r35.d2
    public void c(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
    }

    @Override // r35.d2
    public void d(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
    }

    @Override // r35.d2
    public void e(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        hr3.j7 j7Var = this.f365183a;
        lz.f fVar = j7Var.f365215p.M;
        if (fVar != null ? ((r35.u1) fVar).f450807f.g(i17) : false) {
            java.lang.String c17 = lz.a.c(j7Var.f365215p, i17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(j7Var.f365206d, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2.class);
            intent.putExtra("Contact_User", c17);
            intent.putExtra("Contact_RoomNickname", j7Var.f365214o.z0(c17));
            android.content.Context context = j7Var.f365206d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactWidgetGroupCard$1", "onItemNormalClick", "(Landroid/view/ViewGroup;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/profile/ui/ContactWidgetGroupCard$1", "onItemNormalClick", "(Landroid/view/ViewGroup;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
