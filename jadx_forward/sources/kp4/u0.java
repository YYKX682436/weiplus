package kp4;

/* loaded from: classes10.dex */
public final class u0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f392680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0 f392681e;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0 c18814xdf4aba0) {
        this.f392681e = c18814xdf4aba0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$onFinishInflate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0 c18814xdf4aba0 = this.f392681e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18814xdf4aba0.f257587d, "onScrollStateChanged: " + i17);
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0.a(c18814xdf4aba0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18814xdf4aba0.f257587d, "onScrollStateChanged: " + c18814xdf4aba0.f257596p + ", " + c18814xdf4aba0.f257597q);
            kp4.t0 callback = c18814xdf4aba0.getCallback();
            if (callback != null) {
                callback.b(c18814xdf4aba0.f257596p, c18814xdf4aba0.f257597q);
            }
            c18814xdf4aba0.getClass();
            this.f392680d = false;
        } else if (i17 == 1) {
            if (!this.f392680d) {
                c18814xdf4aba0.m72659x233ce8d3(c18814xdf4aba0.getDragCnt() + 1);
            }
            this.f392680d = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$onFinishInflate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$onFinishInflate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0 c18814xdf4aba0 = this.f392681e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0.a(c18814xdf4aba0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18814xdf4aba0.f257587d, "onScroll: range: " + c18814xdf4aba0.f257596p + ", " + c18814xdf4aba0.f257597q);
        kp4.t0 callback = c18814xdf4aba0.getCallback();
        if (callback != null) {
            callback.mo10994xc9fc1b13(c18814xdf4aba0.f257596p);
        }
        c18814xdf4aba0.m72661x3ae760af(c18814xdf4aba0.f257596p);
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$onFinishInflate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
