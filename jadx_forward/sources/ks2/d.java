package ks2;

/* loaded from: classes2.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.cq4 f393135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f393136e;

    public d(r45.cq4 cq4Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        this.f393135d = cq4Var;
        this.f393136e = k3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer$InfoItemDetailAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) this.f393135d.m75936x14adae67(3);
        if (c19786x6a1e2862 != null) {
            xc2.y2 y2Var = xc2.y2.f534876a;
            android.content.Context context = this.f393136e.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            xc2.y2.i(y2Var, context, new xc2.p0(c19786x6a1e2862), 0, null, 12, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer$InfoItemDetailAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
