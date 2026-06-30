package rf4;

/* loaded from: classes4.dex */
public final class z1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 f476664d;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 c18486xb54a9331) {
        this.f476664d = c18486xb54a9331;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.view.View view = this.f476664d.f253547i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryMsgView$animateClose$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/StoryMsgView$animateClose$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 c18486xb54a9331 = this.f476664d;
        yz5.q onMsgPanelStateCallback = c18486xb54a9331.getOnMsgPanelStateCallback();
        if (onMsgPanelStateCallback != null) {
            onMsgPanelStateCallback.mo147xb9724478(0, java.lang.Integer.valueOf(c18486xb54a9331.f253544f.m8300xfda78ef6()), java.lang.Boolean.valueOf(c18486xb54a9331.f253553r));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18476x97dac0b0 c18476x97dac0b0 = c18486xb54a9331.f253549n;
        c18476x97dac0b0.f253453w = false;
        if (c18476x97dac0b0.f253448r) {
            android.graphics.drawable.Drawable drawable = c18476x97dac0b0.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b3s);
            android.widget.TextView textView = c18476x97dac0b0.f253444n;
            textView.setBackground(drawable);
            android.graphics.drawable.Drawable drawable2 = c18476x97dac0b0.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b3s);
            android.widget.TextView textView2 = c18476x97dac0b0.f253445o;
            textView2.setBackground(drawable2);
            if4.a aVar = c18476x97dac0b0.f253455y;
            if (aVar != null && aVar.f372771f) {
                c18476x97dac0b0.d(true, textView2);
            } else {
                c18476x97dac0b0.d(false, textView2);
            }
            if4.a aVar2 = c18476x97dac0b0.f253455y;
            if (aVar2 != null && aVar2.f372770e) {
                c18476x97dac0b0.d(true, textView);
            } else {
                c18476x97dac0b0.d(false, textView);
            }
            c18476x97dac0b0.b(textView);
            c18476x97dac0b0.b(textView2);
        } else {
            android.view.View view = c18476x97dac0b0.f253447q;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryActionView", "onMsgClosed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/StoryActionView", "onMsgClosed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c18486xb54a9331.getCommentInputView().b();
        c18486xb54a9331.getCommentInputView().setVisibility(8);
        mf4.d dVar = mf4.d.f407693a;
        mf4.d.f407700h = true;
        mf4.d.f407701i = true;
    }
}
