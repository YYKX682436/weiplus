package androidx.appcompat.app;

/* loaded from: classes15.dex */
public class c0 extends androidx.appcompat.widget.ContentFrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.g0 f9082o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(androidx.appcompat.app.g0 g0Var, android.content.Context context) {
        super(context, null);
        this.f9082o = g0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return this.f9082o.m(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            if (x17 < -5 || y17 < -5 || x17 > getWidth() + 5 || y17 > getHeight() + 5) {
                androidx.appcompat.app.g0 g0Var = this.f9082o;
                g0Var.l(g0Var.q(0, true), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i17) {
        setBackgroundDrawable(k.a.a(getContext(), i17));
    }
}
