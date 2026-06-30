package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes3.dex */
public class bb implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22384x2b6f00ff f289127d;

    public bb(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22384x2b6f00ff activityC22384x2b6f00ff) {
        this.f289127d = activityC22384x2b6f00ff;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/SettingCheckUnProcessWalletConvUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22384x2b6f00ff activityC22384x2b6f00ff = this.f289127d;
            activityC22384x2b6f00ff.mo48674x36654fab();
            activityC22384x2b6f00ff.f288959g[0] = (int) motionEvent.getRawX();
            activityC22384x2b6f00ff.f288959g[1] = (int) motionEvent.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/conversation/SettingCheckUnProcessWalletConvUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
