package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class pe0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jf0 f195394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.a84 f195395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195396f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195397g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f195398h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195399i;

    public pe0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jf0 jf0Var, r45.a84 a84Var, java.lang.String str, java.lang.String str2, ya2.b2 b2Var, java.lang.String str3) {
        this.f195394d = jf0Var;
        this.f195395e = a84Var;
        this.f195396f = str;
        this.f195397g = str2;
        this.f195398h = b2Var;
        this.f195399i = str3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$applyCoAuthorAfterUi$sheetClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f195394d.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ya2.b2 b2Var = this.f195398h;
        java.lang.String m176700xe5e0d2a0 = b2Var != null ? b2Var.m176700xe5e0d2a0() : null;
        if (m176700xe5e0d2a0 == null) {
            m176700xe5e0d2a0 = "";
        }
        if (m176700xe5e0d2a0.length() == 0) {
            m176700xe5e0d2a0 = this.f195399i;
        }
        qe2.l.d(context, this.f195395e, this.f195396f, this.f195397g, m176700xe5e0d2a0);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$applyCoAuthorAfterUi$sheetClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
