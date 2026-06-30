package gp3;

/* loaded from: classes9.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 f355905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f355906e;

    public h(gp3.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 c16774xbacd37e9, android.content.Context context) {
        this.f355905d = c16774xbacd37e9;
        this.f355906e = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 c16774xbacd37e9 = this.f355905d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.C);
        android.content.Context context = this.f355906e;
        if (!K0) {
            linkedList2.add(0);
            linkedList.add(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575112kt3));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.D)) {
            linkedList2.add(1);
            linkedList.add(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575113kt4));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.N)) {
            linkedList2.add(2);
            linkedList.add(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kt6));
        }
        if (linkedList2.size() == 1) {
            dp3.g.b(((java.lang.Integer) linkedList2.get(0)).intValue(), context, c16774xbacd37e9);
            yj0.a.h(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            db5.e1.d(this.f355906e, null, linkedList, linkedList2, null, true, new gp3.g(this));
            yj0.a.h(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
