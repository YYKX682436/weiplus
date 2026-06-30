package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes3.dex */
public final class w4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v4 f180067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.x4 f180068e;

    public w4(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v4 v4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.x4 x4Var) {
        this.f180067d = v4Var;
        this.f180068e = x4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/MediaThumbnailAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int m8183xf806b362 = this.f180067d.m8183xf806b362();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.x4 x4Var = this.f180068e;
        if (m8183xf806b362 == ((java.lang.Number) x4Var.f180090d.mo152xb9724478()).intValue()) {
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/MediaThumbnailAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            x4Var.f180091e.mo146xb9724478(java.lang.Integer.valueOf(m8183xf806b362));
            yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/MediaThumbnailAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
