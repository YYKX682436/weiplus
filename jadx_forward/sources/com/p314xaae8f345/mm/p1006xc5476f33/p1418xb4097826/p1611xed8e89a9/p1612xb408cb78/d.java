package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78;

/* loaded from: classes2.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14877xc2c814e1 f204892d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14877xc2c814e1 c14877xc2c814e1) {
        this.f204892d = c14877xc2c814e1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/filter/FinderCollectionFilterView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14877xc2c814e1.f204873h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14877xc2c814e1 c14877xc2c814e1 = this.f204892d;
        c14877xc2c814e1.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCollectionFilterView", "handleMoreClick");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.b bVar = c14877xc2c814e1.f204874d;
        if (bVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        intent.putExtra("finder_username", bVar.f204889c);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.b bVar2 = c14877xc2c814e1.f204874d;
        if (bVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g a17 = bVar2.f204888b.a();
        intent.putExtra("KEY_LAST_BUFFER", a17 != null ? a17.g() : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.b bVar3 = c14877xc2c814e1.f204874d;
        if (bVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        intent.putExtra("finder_collection_business_type", bVar3.f204888b.c());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        android.content.Context context = c14877xc2c814e1.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        i0Var.ek(context, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/filter/FinderCollectionFilterView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
