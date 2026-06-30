package fl1;

/* loaded from: classes14.dex */
public class y implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fl1.b2 f345425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fl1.c0 f345426b;

    public y(fl1.c0 c0Var, fl1.b2 b2Var) {
        this.f345426b = c0Var;
        this.f345425a = b2Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        boolean z17;
        android.view.View mo81952xc2a54588;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDialogContainerLayout", "on dialogView start animation end");
        fl1.c0 c0Var = this.f345426b;
        if (c0Var.f345261w) {
            z17 = false;
        } else {
            c0Var.f345261w = true;
            z17 = true;
        }
        java.util.LinkedList linkedList = c0Var.f345249h;
        int size = linkedList.size();
        if (size >= 1) {
        }
        fl1.b2 b2Var = size >= 2 ? (fl1.b2) linkedList.get(size - 2) : null;
        fl1.h2 h2Var = c0Var.f345260v;
        if (h2Var != null) {
            fl1.t tVar = (fl1.t) h2Var;
            tVar.f345402c = true;
            fl1.u uVar = tVar.f345400a;
            uVar.getClass();
            fl1.c0 dialogContainer = tVar.f345401b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialogContainer, "dialogContainer");
            if (z17) {
                android.view.ViewGroup.LayoutParams layoutParams = dialogContainer.getLayoutParams();
                if (layoutParams != null && -1 == layoutParams.width && -1 == layoutParams.height) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(uVar.f345404a, "onDialogShown#[" + dialogContainer + "], isFirstDialog, clear siblings's importantForAccessibility");
                    java.util.Iterator it = uVar.a(dialogContainer).iterator();
                    while (it.hasNext()) {
                        ((android.view.View) it.next()).setImportantForAccessibility(4);
                    }
                }
            }
            if (b2Var != null && (mo81952xc2a54588 = b2Var.mo81952xc2a54588()) != null) {
                mo81952xc2a54588.setImportantForAccessibility(4);
            }
        }
        this.f345425a.m();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
