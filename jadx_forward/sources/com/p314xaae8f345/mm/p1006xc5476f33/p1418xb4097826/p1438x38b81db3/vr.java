package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class vr implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wr f186340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f186341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f186342f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f186343g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f186344h;

    public vr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wr wrVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.widget.LinearLayout linearLayout, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f186340d = wrVar;
        this.f186341e = f0Var;
        this.f186342f = c1163xf1deaba4;
        this.f186343g = linearLayout;
        this.f186344h = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderOpenEntranceTipConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209127a3).mo141623x754a37bb()).r()).intValue();
        if (intValue != 0) {
            i17 = 1;
            if (intValue != 1 && intValue == 2) {
                i17 = 4;
            }
        } else {
            i17 = 3;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.dv.f184735d = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.dv.f184736e = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wr wrVar = this.f186340d;
        int i18 = this.f186341e.f391649d;
        android.content.Context context = this.f186342f.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        wrVar.n(intValue, i18, context, this.f186343g.getTag(), (java.lang.String) this.f186344h.f391656d, "");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderOpenEntranceTipConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
