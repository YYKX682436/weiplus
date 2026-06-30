package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes8.dex */
public final class dp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fp f184702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.n3 f184703e;

    public dp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fp fpVar, so2.n3 n3Var) {
        this.f184702d = fpVar;
        this.f184703e = n3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert$bindOperateLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f184702d.f184938i;
        if (lVar != null) {
            lVar.mo146xb9724478(this.f184703e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert$bindOperateLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
