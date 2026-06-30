package pk2;

/* loaded from: classes3.dex */
public final class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f437296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.j32 f437297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.c32 f437298f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f437299g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 f437300h;

    public g2(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, r45.j32 j32Var, r45.c32 c32Var, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var) {
        this.f437296d = abstractActivityC21394xb3d2c0cf;
        this.f437297e = j32Var;
        this.f437298f = c32Var;
        this.f437299g = z17;
        this.f437300h = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorMoreLiveNoticeOption$Companion$showNoticeEmptyPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pk2.l2.f437471m.a(this.f437296d, this.f437297e, "onItemClicked", this.f437298f, this.f437299g);
        this.f437300h.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorMoreLiveNoticeOption$Companion$showNoticeEmptyPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
