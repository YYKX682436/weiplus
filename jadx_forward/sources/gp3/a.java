package gp3;

/* loaded from: classes9.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 f355893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f355894e;

    public a(gp3.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 c16774xbacd37e9, android.content.Context context) {
        this.f355893d = c16774xbacd37e9;
        this.f355894e = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 c16774xbacd37e9 = this.f355893d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.C)) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.a0(this.f355894e, c16774xbacd37e9.C);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
