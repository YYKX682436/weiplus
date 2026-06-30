package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes8.dex */
public final class dp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.fp f103169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.n3 f103170e;

    public dp(com.tencent.mm.plugin.finder.convert.fp fpVar, so2.n3 n3Var) {
        this.f103169d = fpVar;
        this.f103170e = n3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert$bindOperateLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f103169d.f103405i;
        if (lVar != null) {
            lVar.invoke(this.f103170e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert$bindOperateLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
