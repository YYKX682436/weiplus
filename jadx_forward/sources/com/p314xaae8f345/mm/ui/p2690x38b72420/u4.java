package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class u4 implements com.p314xaae8f345.mm.ui.p2690x38b72420.n4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 f288739d;

    public u4(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47) {
        this.f288739d = abstractActivityC22312xbd689c47;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.n4
    public void d4(java.lang.String str, int i17, boolean z17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21465x84498b3 c21465x84498b3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBaseSelectContactUI", "Callback SearchEnd Count=%d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47 = this.f288739d;
        android.view.View view = abstractActivityC22312xbd689c47.f287986n;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI$5", "end", "(Ljava/lang/String;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$5", "end", "(Ljava/lang/String;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z17 && i17 == 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                abstractActivityC22312xbd689c47.s7();
                return;
            } else {
                com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47.V6(abstractActivityC22312xbd689c47);
                return;
            }
        }
        abstractActivityC22312xbd689c47.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBaseSelectContactUI", "setSearchStatus");
        abstractActivityC22312xbd689c47.r7(abstractActivityC22312xbd689c47.f287979d, 8);
        abstractActivityC22312xbd689c47.f287979d.setAdapter((android.widget.ListAdapter) abstractActivityC22312xbd689c47.f287982g);
        abstractActivityC22312xbd689c47.f287982g.notifyDataSetChanged();
        if (abstractActivityC22312xbd689c47.m7() && (c21465x84498b3 = abstractActivityC22312xbd689c47.f287980e) != null) {
            c21465x84498b3.setVisibility(abstractActivityC22312xbd689c47.f287982g.v() ? 0 : 8);
        }
        android.view.View view2 = abstractActivityC22312xbd689c47.f287991s;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "setSearchStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "setSearchStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        abstractActivityC22312xbd689c47.f287979d.setVisibility(0);
    }
}
