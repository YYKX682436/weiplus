package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class n5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 f185610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185611e;

    public n5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 q6Var, in5.s0 s0Var) {
        this.f185610d = q6Var;
        this.f185611e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshCloseCommentTips$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.uy0 uy0Var = this.f185610d.f185873e.f187758v;
        if (uy0Var != null && (c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) uy0Var.m75936x14adae67(3)) != null) {
            xc2.y2 y2Var = xc2.y2.f534876a;
            android.content.Context context = this.f185611e.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            xc2.y2.i(y2Var, context, new xc2.p0(c19786x6a1e2862), 0, null, 12, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshCloseCommentTips$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
