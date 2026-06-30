package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class pu implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f104294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f104295e;

    public pu(yz5.l lVar, int i17) {
        this.f104294d = lVar;
        this.f104295e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaLiveViewHolder$bindMedia$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f104294d.invoke(java.lang.Integer.valueOf(this.f104295e));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaLiveViewHolder$bindMedia$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
