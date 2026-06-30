package wj5;

/* loaded from: classes5.dex */
public final class f extends wj5.c {

    /* renamed from: e, reason: collision with root package name */
    public final yb5.d f528330e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d f528331f;

    public f(yb5.d ui6, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d tipsBarContext, yj5.b processor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsBarContext, "tipsBarContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processor, "processor");
        this.f528330e = ui6;
        this.f528331f = tipsBarContext;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570110xr;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        xj5.b item = (xj5.b) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        o(holder, item, i17, i18, z17, list);
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f564230ll)).setText(this.f528330e.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ngy, java.lang.Integer.valueOf(item.f536432u)));
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.m38);
        com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d dVar = this.f528331f;
        int i19 = dVar.a() ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/ui/tipsbar/convert/ChatRoomInviteTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/ChatRoomInviteTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/ui/tipsbar/convert/ChatRoomInviteTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/ChatRoomInviteTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        holder.f3639x46306858.setOnClickListener(new wj5.d(this, item));
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.f564232ln)).s(com.p314xaae8f345.mm.R.raw.f79771x5bcdb8e1, com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        n(itemView, i17, dVar, new wj5.e(this));
    }

    @Override // wj5.c, in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
