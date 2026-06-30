package dl2;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930.C14278x370c3dac f316719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f316720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dl2.c f316721f;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930.C14278x370c3dac c14278x370c3dac, int i17, dl2.c cVar) {
        this.f316719d = c14278x370c3dac;
        this.f316720e = i17;
        this.f316721f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveCustomGiftTagView$adapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f316720e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930.C14278x370c3dac c14278x370c3dac = this.f316719d;
        c14278x370c3dac.m57094xca767a(i17);
        this.f316721f.m8146xced61ae5();
        yz5.l lVar = c14278x370c3dac.f196284m;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(c14278x370c3dac.selectedTabIndex));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveCustomGiftTagView$adapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
