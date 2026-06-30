package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class me implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.oe f216697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f216698e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f216699f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f216700g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f216701h;

    public me(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.oe oeVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var, android.view.View view, android.widget.TextView textView) {
        this.f216697d = oeVar;
        this.f216698e = abstractC14490x69736cb5;
        this.f216699f = s0Var;
        this.f216700g = view;
        this.f216701h = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneUIC$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.oe oeVar = this.f216697d;
        r45.u25 u25Var = oeVar.f217003o;
        oeVar.h7(this.f216698e, u25Var != null ? u25Var.m75945x2fec8307(4) : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) this.f216699f.p(com.p314xaae8f345.mm.R.id.ghd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15178x4303ff90);
        cw2.ca.d(c15178x4303ff90, null, false, 3, null);
        in5.s0 s0Var = this.f216699f;
        android.content.Context context = s0Var.f374654e;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f216698e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y5 y5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y5.f184249a;
            r45.u25 u25Var2 = oeVar.f217003o;
            y5Var.d(abstractActivityC21394xb3d2c0cf, abstractC14490x69736cb5, 4L, (r24 & 8) != 0, (r24 & 16) != 0 ? "" : u25Var2 != null ? u25Var2.m75945x2fec8307(4) : null, (r24 & 32) != 0 ? "" : null, (r24 & 64) != 0 ? 0 : 0, (r24 & 128) != 0 ? null : s0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.le(this.f216700g, oeVar, this.f216701h, c15178x4303ff90));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneUIC$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
