package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes3.dex */
public final class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 f206228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f206229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206230f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f206231g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206232h;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var, ya2.b2 b2Var, java.lang.String str, r45.h32 h32Var, java.lang.String str2) {
        this.f206228d = s1Var;
        this.f206229e = b2Var;
        this.f206230f = str;
        this.f206231g = h32Var;
        this.f206232h = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleFinderLiveNoticeInfo$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var = this.f206228d;
        if (s1Var.f206253d) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = s1Var.f206251b;
            db5.t7.m(activityC0065xcd7aa112, activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dzx));
            yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleFinderLiveNoticeInfo$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        ya2.b2 b2Var = this.f206229e;
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_CONTACT", b2Var != null ? b2Var.D0() : this.f206230f);
        r45.h32 h32Var = this.f206231g;
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_INFO", h32Var.mo14344x5f01b1f6());
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VISITOR", false);
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VIP", h32Var.m75939xb282bd08(14) == 1);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Hj(s1Var.f206251b, intent, 10011);
        cl0.g gVar = new cl0.g();
        gVar.s("source_type", 0);
        gVar.s("ref_page_type", this.f206232h);
        cl0.g gVar2 = new cl0.g();
        r45.ov2 a17 = zl2.t.a(h32Var);
        gVar2.h("coupon_id", a17 != null ? a17.m75945x2fec8307(1) : null);
        gVar2.o("ui_position", 1);
        gVar.o("notice_type", 1);
        i95.m c17 = i95.n0.c(c50.c1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c50.c1 c1Var = (c50.c1) c17;
        ml2.i5 i5Var = ml2.i5.f409112q;
        java.lang.String str2 = this.f206230f;
        java.lang.String str3 = s1Var.f206255f;
        if (h32Var == null || (str = h32Var.m75945x2fec8307(3)) == null) {
            str = "";
        }
        c50.c1.l9(c1Var, i5Var, str2, 0L, 0, str3, null, null, null, null, str, gVar.toString(), h32Var.m75945x2fec8307(4), gVar2.toString(), s1Var.e(), s1Var.d(), null, 33248, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleFinderLiveNoticeInfo$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
