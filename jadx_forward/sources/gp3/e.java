package gp3;

/* loaded from: classes9.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f355899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 f355900e;

    public e(gp3.k kVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 c16774xbacd37e9) {
        this.f355899d = context;
        this.f355900e = c16774xbacd37e9;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f355899d;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574350hz4);
        android.content.Context context2 = this.f355899d;
        db5.e1.A(context, string, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572072xy), context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574360i11), context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new gp3.c(this), new gp3.d(this));
        yj0.a.h(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
