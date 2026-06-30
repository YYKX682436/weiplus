package kp4;

/* loaded from: classes10.dex */
public final class d0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18809x90659727 f392631d;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18809x90659727 c18809x90659727) {
        this.f392631d = c18809x90659727;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView$onFinishInflate$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTrackCropView", "onScrollStateChanged: " + i17);
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18809x90659727 c18809x90659727 = this.f392631d;
            if (c18809x90659727.f257571v) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTrackCropView", "onScrollStateChanged: SCROLL_STATE_IDLE");
                c18809x90659727.f257571v = false;
                c18809x90659727.f257570u = true;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView$onFinishInflate$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView$onFinishInflate$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18809x90659727 c18809x90659727 = this.f392631d;
        c18809x90659727.f257565p = c18809x90659727.f257565p + i17;
        if (!c18809x90659727.f257570u && !c18809x90659727.f257567r && !c18809x90659727.f257572w) {
            long j17 = c18809x90659727.f257564o;
            long j18 = c18809x90659727.f257563n;
            long j19 = (((j17 - j18) * (r9 - c18809x90659727.f257562m)) / c18809x90659727.f257561i) + j18;
            kp4.c0 callback = c18809x90659727.getCallback();
            if (callback != null) {
                callback.mo10992xc9fc1b13(j19);
            }
        }
        if (!c18809x90659727.f257572w) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18809x90659727.a(c18809x90659727);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView$onFinishInflate$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
