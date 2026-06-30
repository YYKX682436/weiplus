package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ql implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f185936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f185937f;

    public ql(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f185935d = s0Var;
        this.f185936e = abstractC14490x69736cb5;
        this.f185937f = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderLikeConvert$onBindViewHolder$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f185935d.f374654e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e c15307x329a684e = activity != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e) activity.findViewById(com.p314xaae8f345.mm.R.id.edz) : null;
        if (c15307x329a684e != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e.w(c15307x329a684e, this.f185935d, this.f185936e.getFeedObject(), this.f185937f, 0, null, null, 56, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderLikeConvert$onBindViewHolder$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
