package su3;

/* loaded from: classes5.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su3.f f494311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ su3.m f494312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f494313f;

    public e(su3.f fVar, su3.m mVar, android.view.View view) {
        this.f494311d = fVar;
        this.f494312e = mVar;
        this.f494313f = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.p pVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/adapter/RecommendMusicAdapter$BaseViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int m8183xf806b362 = this.f494311d.m8183xf806b362();
        su3.m mVar = this.f494312e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a x17 = mVar.x(m8183xf806b362);
        if (x17 != null && (pVar = mVar.f494334o) != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(m8183xf806b362), x17);
        }
        this.f494313f.requestFocus();
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/adapter/RecommendMusicAdapter$BaseViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
