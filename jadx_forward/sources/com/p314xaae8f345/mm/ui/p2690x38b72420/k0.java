package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes5.dex */
public class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.C22287x2d5af6c8 f288515d;

    public k0(com.p314xaae8f345.mm.ui.p2690x38b72420.C22287x2d5af6c8 c22287x2d5af6c8) {
        this.f288515d = c22287x2d5af6c8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/BizContactEntranceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.ContactOa.k(view.getContext(), null)) {
            yj0.a.h(this, "com/tencent/mm/ui/contact/BizContactEntranceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean g07 = ((qk.s6) gm0.j1.s(qk.s6.class)).g0();
        com.p314xaae8f345.mm.ui.p2690x38b72420.C22287x2d5af6c8 c22287x2d5af6c8 = this.f288515d;
        if (g07) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(c22287x2d5af6c8.f287854d);
            ((qk.s6) gm0.j1.s(qk.s6.class)).s2(8, "");
            yj0.a.h(this, "com/tencent/mm/ui/contact/BizContactEntranceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).q()) {
            int i17 = com.p314xaae8f345.mm.ui.p2690x38b72420.C22287x2d5af6c8.f287853n;
            c22287x2d5af6c8.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("intent_service_type", c22287x2d5af6c8.f287860m);
            j45.l.j(view.getContext(), "brandservice", ".ui.BrandServiceIndexUI", intent, null);
        } else {
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).B(view.getContext(), new com.p314xaae8f345.mm.ui.p2690x38b72420.j0(this, view));
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/BizContactEntranceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
