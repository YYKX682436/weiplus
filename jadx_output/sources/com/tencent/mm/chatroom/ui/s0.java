package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class s0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public int f64494d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64496f;

    public s0(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI, java.lang.String str) {
        this.f64496f = chatroomInfoUI;
        this.f64495e = str;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = this.f64496f;
        com.tencent.mm.ui.base.preference.r rVar = chatroomInfoUI.f63693h;
        if (rVar == null || this.f64494d > 50) {
            return false;
        }
        android.view.View childAt = chatroomInfoUI.getListView().getChildAt(((com.tencent.mm.ui.base.preference.h0) rVar).o(this.f64495e) - chatroomInfoUI.getListView().getFirstVisiblePosition());
        int height = childAt != null ? childAt.getHeight() : 0;
        if (height == 0) {
            this.f64494d++;
            return true;
        }
        childAt.getY();
        chatroomInfoUI.getListView().getFirstVisiblePosition();
        chatroomInfoUI.getListView().getLastVisiblePosition();
        int y17 = (int) childAt.getY();
        if (y17 < 0) {
            height += y17;
            y17 = 0;
        }
        chatroomInfoUI.getClass();
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(chatroomInfoUI);
        linearLayout.setOrientation(1);
        android.view.View view = new android.view.View(chatroomInfoUI);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, y17);
        view.setBackgroundResource(com.tencent.mm.R.color.a0c);
        linearLayout.addView(view, layoutParams);
        android.view.View view2 = new android.view.View(chatroomInfoUI);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, height);
        view2.setBackgroundResource(com.tencent.mm.R.color.a9e);
        linearLayout.addView(view2, layoutParams2);
        android.view.View view3 = new android.view.View(chatroomInfoUI);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -1);
        view3.setBackgroundResource(com.tencent.mm.R.color.f478712f3);
        linearLayout.addView(view3, layoutParams3);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) chatroomInfoUI.getWindow().findViewById(android.R.id.content);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(viewGroup == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomInfoUI", "add cover view now. contentView is null [%b]", objArr);
        if (viewGroup != null) {
            viewGroup.addView(linearLayout);
        }
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 0.4f);
        alphaAnimation.setFillAfter(false);
        alphaAnimation.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        alphaAnimation.setDuration(600L);
        alphaAnimation.setRepeatMode(2);
        alphaAnimation.setRepeatCount(1);
        alphaAnimation.setAnimationListener(new com.tencent.mm.chatroom.ui.t0(chatroomInfoUI, linearLayout));
        view.setAnimation(alphaAnimation);
        view3.setAnimation(alphaAnimation);
        alphaAnimation.start();
        return false;
    }
}
