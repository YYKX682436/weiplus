package kp4;

/* loaded from: classes10.dex */
public final class q extends kp4.n {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18807xe5ec60d0 f392665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp4.r f392666e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kp4.r rVar, android.view.View itemView) {
        super(rVar, itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f392666e = rVar;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.gdt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f392665d = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18807xe5ec60d0) findViewById;
    }

    @Override // kp4.n
    public void i(kp4.a trackInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trackInfo, "trackInfo");
        kp4.r rVar = this.f392666e;
        boolean z17 = rVar.f392674m;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18807xe5ec60d0 c18807xe5ec60d0 = this.f392665d;
        if (z17) {
            boolean z18 = m8183xf806b362() != rVar.f392669e;
            boolean z19 = m8183xf806b362() != rVar.f392670f;
            c18807xe5ec60d0.f257543p = true;
            c18807xe5ec60d0.f257544q = true;
            c18807xe5ec60d0.f257545r = z18;
            c18807xe5ec60d0.f257546s = z19;
        } else {
            boolean z27 = m8183xf806b362() == rVar.f392669e;
            boolean z28 = m8183xf806b362() == rVar.f392670f;
            c18807xe5ec60d0.f257543p = z27;
            c18807xe5ec60d0.f257544q = z28;
            c18807xe5ec60d0.f257545r = false;
            c18807xe5ec60d0.f257546s = false;
        }
        kp4.s0 s0Var = rVar.f392673i;
        if (s0Var != null) {
            c18807xe5ec60d0.m72633x102fa5d7(s0Var);
        }
        c18807xe5ec60d0.m72634x873c5e57(trackInfo);
        this.f3639x46306858.setBackground(null);
        android.view.View view = this.f3639x46306858;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/thumb/FrameListAdapter$FrameViewHolder", "onBind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/thumb/FrameListAdapter$FrameViewHolder", "onBind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i17 = rVar.f392671g;
        if (i17 >= 0) {
            if (trackInfo.f392612i == i17) {
                android.view.View view2 = this.f3639x46306858;
                view2.setBackground(i65.a.i(view2.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.b96));
            } else {
                android.view.View view3 = this.f3639x46306858;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/thumb/FrameListAdapter$FrameViewHolder", "onBind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/vlog/ui/thumb/FrameListAdapter$FrameViewHolder", "onBind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        this.f3639x46306858.setOnClickListener(new kp4.p(rVar, this));
    }

    @Override // kp4.n
    public void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18807xe5ec60d0 c18807xe5ec60d0 = this.f392665d;
        rm5.k kVar = c18807xe5ec60d0.f257551x;
        if (kVar != null) {
            kVar.mo122875x5cd39ffa();
        }
        c18807xe5ec60d0.f257551x = null;
        c18807xe5ec60d0.f257536f = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18807xe5ec60d0.f257534d, "clearThumb");
        c18807xe5ec60d0.f257537g.clear();
        c18807xe5ec60d0.f257538h = null;
        c18807xe5ec60d0.postInvalidate();
    }
}
