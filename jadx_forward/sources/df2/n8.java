package df2;

/* loaded from: classes3.dex */
public final class n8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f312372d;

    public n8(df2.s8 s8Var) {
        this.f312372d = s8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList m75941xfb821914;
        r45.nz3 nz3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/GiftFundingCardController$sendGiftListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.s8 s8Var = this.f312372d;
        r45.e84 e84Var = s8Var.f312840s;
        if (e84Var != null && (m75941xfb821914 = e84Var.m75941xfb821914(2)) != null && (nz3Var = (r45.nz3) kz5.n0.Z(m75941xfb821914)) != null) {
            if (nz3Var.m75939xb282bd08(3) == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm) s8Var.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm.class);
                if (hmVar != null) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    java.lang.String m75945x2fec8307 = e84Var.m75945x2fec8307(5);
                    bundle.putString("PARAM_FINDER_LIVE_SEND_GIFT_FUNDING_TASK_ID", m75945x2fec8307 != null ? m75945x2fec8307 : "");
                    hmVar.E1 = bundle;
                }
                mm2.s2 s2Var = (mm2.s2) s8Var.m56788xbba4bfc0(mm2.s2.class);
                if (s2Var != null && (c14227x4262fb44 = s2Var.f410937f) != null) {
                    c14227x4262fb44.mo7808x76db6cb1(new mm2.q2(true, 0, 2, null));
                }
                s8Var.k7(2);
            } else {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("PARAM_FINDER_LIVE_GIFT_ID", nz3Var.m75945x2fec8307(0));
                bundle2.putBoolean("PARAM_FINDER_LIVE_SHOW_SEND_BTN", false);
                java.lang.String m75945x2fec83072 = e84Var.m75945x2fec8307(5);
                bundle2.putString("PARAM_FINDER_LIVE_SEND_GIFT_FUNDING_TASK_ID", m75945x2fec83072 != null ? m75945x2fec83072 : "");
                s8Var.X6(qo0.b.Z1, bundle2);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/GiftFundingCardController$sendGiftListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
