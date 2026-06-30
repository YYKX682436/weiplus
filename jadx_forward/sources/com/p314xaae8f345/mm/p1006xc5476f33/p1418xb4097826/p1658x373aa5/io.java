package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes.dex */
public final class io implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f213931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f213932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f213933f;

    public io(java.lang.String str, android.content.Context context, java.lang.String str2) {
        this.f213931d = str;
        this.f213932e = context;
        this.f213933f = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfileFinderEntry$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f213931d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            ((c61.l7) i95.n0.c(c61.l7.class)).getClass();
            vd2.t3.f517454a.a(this.f213932e, str, this.f213933f, 98);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfileFinderEntry$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
