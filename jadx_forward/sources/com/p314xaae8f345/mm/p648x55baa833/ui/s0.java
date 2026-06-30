package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class s0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public int f146027d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 f146029f;

    public s0(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5, java.lang.String str) {
        this.f146029f = activityC10332x8a1129f5;
        this.f146028e = str;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5 = this.f146029f;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = activityC10332x8a1129f5.f145226h;
        if (rVar == null || this.f146027d > 50) {
            return false;
        }
        android.view.View childAt = activityC10332x8a1129f5.m79335xcc101dd9().getChildAt(((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).o(this.f146028e) - activityC10332x8a1129f5.m79335xcc101dd9().getFirstVisiblePosition());
        int height = childAt != null ? childAt.getHeight() : 0;
        if (height == 0) {
            this.f146027d++;
            return true;
        }
        childAt.getY();
        activityC10332x8a1129f5.m79335xcc101dd9().getFirstVisiblePosition();
        activityC10332x8a1129f5.m79335xcc101dd9().getLastVisiblePosition();
        int y17 = (int) childAt.getY();
        if (y17 < 0) {
            height += y17;
            y17 = 0;
        }
        activityC10332x8a1129f5.getClass();
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(activityC10332x8a1129f5);
        linearLayout.setOrientation(1);
        android.view.View view = new android.view.View(activityC10332x8a1129f5);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, y17);
        view.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
        linearLayout.addView(view, layoutParams);
        android.view.View view2 = new android.view.View(activityC10332x8a1129f5);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, height);
        view2.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        linearLayout.addView(view2, layoutParams2);
        android.view.View view3 = new android.view.View(activityC10332x8a1129f5);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -1);
        view3.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3);
        linearLayout.addView(view3, layoutParams3);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) activityC10332x8a1129f5.getWindow().findViewById(android.R.id.content);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(viewGroup == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomInfoUI", "add cover view now. contentView is null [%b]", objArr);
        if (viewGroup != null) {
            viewGroup.addView(linearLayout);
        }
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 0.4f);
        alphaAnimation.setFillAfter(false);
        alphaAnimation.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        alphaAnimation.setDuration(600L);
        alphaAnimation.setRepeatMode(2);
        alphaAnimation.setRepeatCount(1);
        alphaAnimation.setAnimationListener(new com.p314xaae8f345.mm.p648x55baa833.ui.t0(activityC10332x8a1129f5, linearLayout));
        view.setAnimation(alphaAnimation);
        view3.setAnimation(alphaAnimation);
        alphaAnimation.start();
        return false;
    }
}
