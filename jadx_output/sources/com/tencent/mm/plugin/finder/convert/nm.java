package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class nm implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f104109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f104111f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104112g;

    public nm(boolean z17, java.lang.String str, r45.h32 h32Var, in5.s0 s0Var) {
        this.f104109d = z17;
        this.f104110e = str;
        this.f104111f = h32Var;
        this.f104112g = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderLiveReservedRecordItemConvert$bindNoticeContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f104109d) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_CONTACT", this.f104110e);
            r45.h32 h32Var = this.f104111f;
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_INFO", h32Var.toByteArray());
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VISITOR", true);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VIP", h32Var.getInteger(14) == 1);
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Context context = this.f104112g.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            i0Var.Hj(context, intent, 10011);
            cl0.g gVar = new cl0.g();
            gVar.s("source_type", 0);
            gVar.s("ref_page_type", "");
            cl0.g gVar2 = new cl0.g();
            r45.ov2 a17 = zl2.t.a(h32Var);
            gVar2.h("coupon_id", a17 != null ? a17.getString(1) : null);
            gVar2.o("ui_position", 1);
            gVar.o("notice_type", 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderLiveReservedRecordItemConvert$bindNoticeContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
