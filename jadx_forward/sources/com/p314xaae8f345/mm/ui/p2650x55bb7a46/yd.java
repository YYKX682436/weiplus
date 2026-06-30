package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class yd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f f287801d;

    public yd(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f activityC21642xe60a98f) {
        this.f287801d = activityC21642xe60a98f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.CharSequence charSequence;
        r45.jq0 jq0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/TextPreviewUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.H;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f activityC21642xe60a98f = this.f287801d;
        activityC21642xe60a98f.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        if (activityC21642xe60a98f.f279872u != null && (charSequence = activityC21642xe60a98f.f279860f) != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.m(c5303xc75d2f73, charSequence.toString(), 1);
            am.c4 c4Var = c5303xc75d2f73.f135623g;
            c4Var.f87856i = activityC21642xe60a98f;
            c4Var.f87860m = 43;
            r45.bq0 bq0Var = c4Var.f87848a;
            if (bq0Var != null && (jq0Var = bq0Var.f452495d) != null) {
                jq0Var.e(activityC21642xe60a98f.f279872u.Q0());
                jq0Var.j(c01.z1.r());
                c5303xc75d2f73.e();
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/TextPreviewUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
