package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3;

/* loaded from: classes2.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f202672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f202673e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f202674f;

    public g(r45.mb4 mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var) {
        this.f202672d = mb4Var;
        this.f202673e = abstractC14490x69736cb5;
        this.f202674f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/convert/MemberImageConvert$refreshPosterMedia$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.mb4 mb4Var = this.f202672d;
        sb6.append(mb4Var.m75945x2fec8307(0));
        sb6.append(mb4Var.m75945x2fec8307(18));
        intent.putExtra("nowUrl", sb6.toString());
        intent.putExtra("thumbUrl", mb4Var.m75945x2fec8307(1) + mb4Var.m75945x2fec8307(19));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f202673e;
        java.util.LinkedList<r45.mb4> m59264x7efe73ec = abstractC14490x69736cb5.getFeedObject().m59264x7efe73ec();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m59264x7efe73ec, 10));
        for (r45.mb4 mb4Var2 : m59264x7efe73ec) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(mb4Var2.m75945x2fec8307(0));
            java.lang.String m75945x2fec8307 = mb4Var2.m75945x2fec8307(18);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            sb7.append(m75945x2fec8307);
            arrayList2.add(sb7.toString());
        }
        intent.putExtra("urlList", (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]));
        intent.putExtra("isFromWebView", false);
        intent.putExtra("ShowIndicator", false);
        if (abstractC14490x69736cb5.getFeedObject().m59264x7efe73ec().size() > 0) {
            intent.putExtra("ShowGalleryIndicator", true);
        }
        intent.putExtra("BottomSheetStyle", 0);
        intent.putExtra("shouldShowScanQrCodeMenu", true);
        j45.l.j(this.f202674f.f374654e, "subapp", ".ui.gallery.GestureGalleryUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/convert/MemberImageConvert$refreshPosterMedia$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
