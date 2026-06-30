package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes4.dex */
public class o0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18403xee2674b6 f252771d;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18403xee2674b6 c18403xee2674b6) {
        this.f252771d = c18403xee2674b6;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$6");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/widget/SnsAdLandingPageFloatView$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18403xee2674b6 c18403xee2674b6 = this.f252771d;
        android.graphics.Rect rect = new android.graphics.Rect(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18403xee2674b6.d(c18403xee2674b6).x().getLeft(), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18403xee2674b6.d(c18403xee2674b6).x().getTop(), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18403xee2674b6.d(c18403xee2674b6).x().getRight(), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18403xee2674b6.d(c18403xee2674b6).x().getBottom());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdLandingPageFloatView", "view area %s, (%f,%f)", rect, java.lang.Float.valueOf(motionEvent.getX()), java.lang.Float.valueOf(motionEvent.getY()));
        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/widget/SnsAdLandingPageFloatView$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$6");
            return false;
        }
        if (motionEvent.getActionMasked() == 1) {
            c18403xee2674b6.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("playExitAnimation", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            if (!c18403xee2674b6.f252340n) {
                c18403xee2674b6.f252344r.start();
                c18403xee2674b6.f252340n = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playExitAnimation", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/widget/SnsAdLandingPageFloatView$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$6");
        return true;
    }
}
