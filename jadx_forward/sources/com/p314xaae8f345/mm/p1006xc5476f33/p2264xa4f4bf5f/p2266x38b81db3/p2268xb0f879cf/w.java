package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf;

/* loaded from: classes11.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.x f254783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ej4.k f254784e;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.x xVar, ej4.k kVar) {
        this.f254783d = xVar;
        this.f254784e = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/dowhat/RecentUseStatusConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.v vVar = this.f254783d.f254785e;
        if (vVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            ej4.k kVar = this.f254784e;
            java.lang.String iconId = kVar.f334902d;
            java.lang.String str = kVar.f334903e;
            if (str == null) {
                str = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.t7 t7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.t7) vVar;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconId, "iconId");
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h6 h6Var = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9.C1;
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9 = t7Var.f255851a;
            if (!activityC18635xb8188ef9.b7().isExpand) {
                activityC18635xb8188ef9.f255074i = str;
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9.X6(t7Var.f255851a, iconId, true, false, 4, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/dowhat/RecentUseStatusConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
