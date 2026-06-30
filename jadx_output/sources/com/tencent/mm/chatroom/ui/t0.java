package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class t0 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f64517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64518b;

    public t0(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI, android.widget.LinearLayout linearLayout) {
        this.f64518b = chatroomInfoUI;
        this.f64517a = linearLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = this.f64518b;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) chatroomInfoUI.getWindow().findViewById(android.R.id.content);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(viewGroup == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomInfoUI", "remove cover view now. contentView is null [%b]", objArr);
        if (viewGroup != null) {
            viewGroup.removeView(this.f64517a);
        }
        chatroomInfoUI.getListView().setTranscriptMode(chatroomInfoUI.W);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
