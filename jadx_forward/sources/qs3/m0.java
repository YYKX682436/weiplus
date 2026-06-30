package qs3;

/* loaded from: classes13.dex */
public final class m0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qs3.n0 f447894a;

    public m0(qs3.n0 n0Var) {
        this.f447894a = n0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Object obj = msg.obj;
        if (obj instanceof android.view.View) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type android.view.View");
            android.view.View view = (android.view.View) obj;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/radar/ui/RadarViewController$AvatarAnimator$delayShowHandler$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/radar/ui/RadarViewController$AvatarAnimator$delayShowHandler$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.clearAnimation();
            qs3.n0 n0Var = this.f447894a;
            if (n0Var.f447897b) {
                return;
            }
            java.lang.Object tag = view.getTag(n0Var.f447899d.f236583v);
            android.view.animation.Animation animation = tag instanceof android.view.animation.Animation ? (android.view.animation.Animation) tag : null;
            if (animation == null) {
                animation = n0Var.a();
            }
            view.startAnimation(animation);
        }
    }
}
