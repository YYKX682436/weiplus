package kf3;

/* loaded from: classes12.dex */
public class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f388887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf3.k0 f388888e;

    public h0(kf3.k0 k0Var, java.lang.String str) {
        this.f388888e = k0Var;
        this.f388887d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnVoiceClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kf3.k0 k0Var = this.f388888e;
        kf3.i0 i0Var = k0Var.f388915u;
        if (i0Var != null) {
            boolean E = c01.d9.b().E();
            java.lang.String str = "";
            com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc activityC16486x3260b8cc = ((kf3.u0) i0Var).f388983a;
            if (E) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                java.lang.String str2 = this.f388887d;
                if (str2 == null) {
                    str2 = "";
                }
                if (activityC16486x3260b8cc.f230063h.c() && str2.equals(activityC16486x3260b8cc.f230061f.f388911q)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc.f230058q.a();
                    activityC16486x3260b8cc.f230059d.setKeepScreenOn(false);
                    activityC16486x3260b8cc.f230063h.h(false);
                } else if (activityC16486x3260b8cc.T6(str2)) {
                    str = str2;
                }
            } else {
                db5.t7.k(activityC16486x3260b8cc, null);
            }
            k0Var.f388911q = str;
            k0Var.notifyDataSetChanged();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnVoiceClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
