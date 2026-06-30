package dn2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn2.b f323412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f323413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f323414f;

    public a(dn2.b bVar, java.lang.String str, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        this.f323412d = bVar;
        this.f323413e = str;
        this.f323414f = c19786x6a1e2862;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        df2.nm nmVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/CommentTopAreaBulletItem$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f323412d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommentTopAreaBulletItem", "click FinderLiveEnterRoomBulletAppMsg, tips:" + this.f323413e + '}');
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
        if (c14197x319b1b9e != null && (nmVar = (df2.nm) c14197x319b1b9e.m56798x25fe639c(df2.nm.class)) != null) {
            nmVar.Z6(this.f323414f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/CommentTopAreaBulletItem$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
