package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

/* loaded from: classes2.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.k f202741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f202742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f202743f;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.k kVar, android.view.View view, int i17) {
        this.f202741d = kVar;
        this.f202742e = view;
        this.f202743f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewFeedItemUIC$createView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.k kVar = this.f202741d;
        android.app.Activity context = kVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        go2.a1 a1Var = (go2.a1) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(go2.a1.class);
        if (a1Var != null) {
            a1Var.R6(java.lang.Integer.valueOf(kVar.f202777i), java.lang.Integer.valueOf(kVar.f202778m), java.lang.Integer.valueOf(kVar.f202779n), kVar.f202776h, this.f202742e, this.f202743f, kVar.f202784s, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewFeedItemUIC$createView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
