package ym5;

/* loaded from: classes2.dex */
public final class j1 implements ym5.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f544924a;

    public j1(android.view.View.OnClickListener onClickListener) {
        this.f544924a = onClickListener;
    }

    @Override // ym5.i1
    public void a(android.view.View view, android.view.MotionEvent motionEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.view.View.OnClickListener onClickListener = this.f544924a;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
