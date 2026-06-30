package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes12.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.a f226283d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.a aVar) {
        this.f226283d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/BaseMapUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.a aVar = this.f226283d;
        intent.putExtra("key_fav_item_id", aVar.n().getLongExtra("kFavInfoLocalId", -1L));
        intent.putExtra("key_fav_result_list", aVar.n().getStringArrayListExtra("kTags"));
        o72.u4 u4Var = (o72.u4) i95.n0.c(o72.u4.class);
        android.content.Intent n17 = aVar.n();
        java.lang.String str = aVar.f226276v;
        long j17 = aVar.f226275u;
        int i17 = o72.u4.W0;
        ((o82.i) u4Var).Ai(n17, str, j17, 7);
        o72.x1.M0(aVar.f226261d, ".ui.FavTagEditUI", intent, 4100, null);
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/BaseMapUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
