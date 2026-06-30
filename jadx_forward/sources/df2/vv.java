package df2;

/* loaded from: classes3.dex */
public final class vv extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f313165m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f313166n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f313165m = "LiveVipTagController";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        android.view.View T6 = T6(com.p314xaae8f345.mm.R.id.fod, com.p314xaae8f345.mm.R.id.fob);
        this.f313166n = T6;
        if (T6 != null) {
            boolean z17 = ((je2.a0) m56788xbba4bfc0(je2.a0.class)).f380730i;
            boolean z18 = ((je2.a0) m56788xbba4bfc0(je2.a0.class)).f380728g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313165m, "[onLiveActivate] isVipLive:" + z17 + ", isVisitorVip:" + z18);
            android.view.View findViewById = T6.findViewById(com.p314xaae8f345.mm.R.id.foc);
            ae2.in inVar = ae2.in.f85221a;
            if (!((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f85248c6).mo141623x754a37bb()).r()).booleanValue() && (!z17 || !z18)) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(T6, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveVipTagController", "onLiveStart", "(Lcom/tencent/mm/protocal/protobuf/FinderJoinLiveResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                T6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(T6, "com/tencent/mm/plugin/finder/live/controller/LiveVipTagController", "onLiveStart", "(Lcom/tencent/mm/protocal/protobuf/FinderJoinLiveResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(T6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveVipTagController", "onLiveStart", "(Lcom/tencent/mm/protocal/protobuf/FinderJoinLiveResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            T6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(T6, "com/tencent/mm/plugin/finder/live/controller/LiveVipTagController", "onLiveStart", "(Lcom/tencent/mm/protocal/protobuf/FinderJoinLiveResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams ? (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMargins(((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + com.p314xaae8f345.mm.ui.bl.c(T6.getContext()));
            }
            T6.setOnTouchListener(new df2.tv(T6));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.uv(T6, null), 3, null);
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        this.f313166n = null;
    }
}
