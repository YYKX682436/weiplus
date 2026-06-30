package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes3.dex */
public class a2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f234114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 f234115e;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38, int i17) {
        this.f234115e = activityC16764xd1ab6b38;
        this.f234114d = i17;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI$23", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38 = this.f234115e;
        if (action == 0) {
            activityC16764xd1ab6b38.I.setBackgroundDrawable(activityC16764xd1ab6b38.mo55332x76847179().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bac));
        } else if (motionEvent.getAction() == 1) {
            activityC16764xd1ab6b38.I.setBackgroundDrawable(activityC16764xd1ab6b38.mo55332x76847179().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bad));
            ((android.graphics.drawable.GradientDrawable) activityC16764xd1ab6b38.I.getBackground()).setColor(this.f234114d);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI$23", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
