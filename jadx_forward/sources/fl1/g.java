package fl1;

/* loaded from: classes7.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.j f345294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f345295e;

    public g(fl1.i iVar, fl1.j jVar, android.widget.ImageView imageView) {
        this.f345294d = jVar;
        this.f345295e = imageView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeDialog$LoginAuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fl1.j jVar = this.f345294d;
        int i17 = jVar.f345327b;
        android.widget.ImageView imageView = this.f345295e;
        if (i17 == 2) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c8r);
            jVar.f345327b = 1;
        } else if (i17 == 1) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c8p);
            jVar.f345327b = 2;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeDialog$LoginAuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
