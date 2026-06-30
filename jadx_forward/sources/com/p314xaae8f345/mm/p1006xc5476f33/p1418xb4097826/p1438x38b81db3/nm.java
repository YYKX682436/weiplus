package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class nm implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f185642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185643e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f185644f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185645g;

    public nm(boolean z17, java.lang.String str, r45.h32 h32Var, in5.s0 s0Var) {
        this.f185642d = z17;
        this.f185643e = str;
        this.f185644f = h32Var;
        this.f185645g = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderLiveReservedRecordItemConvert$bindNoticeContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f185642d) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_CONTACT", this.f185643e);
            r45.h32 h32Var = this.f185644f;
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_INFO", h32Var.mo14344x5f01b1f6());
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VISITOR", true);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VIP", h32Var.m75939xb282bd08(14) == 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            android.content.Context context = this.f185645g.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            i0Var.Hj(context, intent, 10011);
            cl0.g gVar = new cl0.g();
            gVar.s("source_type", 0);
            gVar.s("ref_page_type", "");
            cl0.g gVar2 = new cl0.g();
            r45.ov2 a17 = zl2.t.a(h32Var);
            gVar2.h("coupon_id", a17 != null ? a17.m75945x2fec8307(1) : null);
            gVar2.o("ui_position", 1);
            gVar.o("notice_type", 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderLiveReservedRecordItemConvert$bindNoticeContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
