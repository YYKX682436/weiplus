package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes9.dex */
public class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 f236916d;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 activityC16969x3ace7680) {
        this.f236916d = activityC16969x3ace7680;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/RecordMsgFileUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean b17 = fp.i.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 activityC16969x3ace7680 = this.f236916d;
        if (!b17) {
            db5.e1.i(activityC16969x3ace7680.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.cbp, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        bt3.g2.O(activityC16969x3ace7680.f236833v, activityC16969x3ace7680.f236831t, activityC16969x3ace7680.f236830s, true);
        activityC16969x3ace7680.D = true;
        activityC16969x3ace7680.V6();
        activityC16969x3ace7680.b7(7, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
