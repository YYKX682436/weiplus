package vc4;

/* loaded from: classes4.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f516827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06 f516828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc4.p f516829f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f516830g;

    public m(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06 c18258x7ccfbc06, xc4.p pVar, int i17) {
        this.f516827d = z17;
        this.f516828e = c18258x7ccfbc06;
        this.f516829f = pVar;
        this.f516830g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadFinderPostView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/item/header/ImproveItemFooter$loadFinderPostView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xc4.p pVar = this.f516829f;
        boolean z17 = this.f516827d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.C18258x7ccfbc06 c18258x7ccfbc06 = this.f516828e;
        if (z17) {
            vc4.l lVar = new vc4.l(pVar, c18258x7ccfbc06, new java.lang.ref.WeakReference(c18258x7ccfbc06));
            n34.h3 h3Var = n34.h3.f416143d;
            java.lang.String W0 = pVar.W0();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addPostCallback", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            n34.h3.f416148i.put(W0, lVar);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addPostCallback", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        }
        int i17 = 0;
        int i18 = this.f516830g;
        if (i18 == 37 || i18 == 36) {
            wa4.d0 d0Var = wa4.d0.f525748d;
        } else {
            wa4.d0 d0Var2 = wa4.d0.f525748d;
            i17 = 1;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6059xe0ced7dc c6059xe0ced7dc = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6059xe0ced7dc();
        android.content.Context context = c18258x7ccfbc06.getContext();
        am.qv qvVar = c6059xe0ced7dc.f136341g;
        qvVar.f89280b = context;
        qvVar.f89279a = i17;
        qvVar.f89281c = pVar.c1();
        c6059xe0ced7dc.e();
        if (!z17) {
            pm0.v.V(700L, new vc4.j(c18258x7ccfbc06));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/item/header/ImproveItemFooter$loadFinderPostView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadFinderPostView$1");
    }
}
