package j93;

/* loaded from: classes5.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.n f379961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f379962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 f379963f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f379964g;

    public l(j93.n nVar, java.lang.String str, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18, android.view.View view) {
        this.f379961d = nVar;
        this.f379962e = str;
        this.f379963f = c21475x81dbaa18;
        this.f379964g = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/uic/ContactLabelRecommendUIC$showRecommendByChatroom$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18 = this.f379963f;
        android.view.View view2 = this.f379964g;
        int indexOfChild = c21475x81dbaa18.indexOfChild(view2);
        j93.n nVar = this.f379961d;
        nVar.f379987t = true;
        nVar.f379980m++;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recommendLabel onTagSelected: ");
        java.lang.String str = this.f379962e;
        sb6.append(str);
        sb6.append(", idx=");
        sb6.append(indexOfChild);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactLabelRecommendUIC", sb6.toString());
        nVar.f379986s.add(str);
        yz5.a aVar = nVar.f379977g;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        pm0.v.K(null, new j93.i(nVar, indexOfChild));
        android.view.View view3 = this.f379964g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/uic/ContactLabelRecommendUIC$showRecommendByChatroom$1$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/label/ui/uic/ContactLabelRecommendUIC$showRecommendByChatroom$1$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c21475x81dbaa18.removeView(view2);
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/uic/ContactLabelRecommendUIC$showRecommendByChatroom$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
