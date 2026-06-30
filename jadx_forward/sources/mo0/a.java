package mo0;

/* loaded from: classes3.dex */
public final class a extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 {

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f411789f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i17) {
        super.onWindowVisibilityChanged(i17);
        yz5.l lVar = this.f411789f;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FluentSwitchRelativeLayout", "onWindowVisibilityChanged visibility: " + i17 + " function: " + this.f411789f);
    }

    /* renamed from: setNotifyVisibilityFunction */
    public final void m148144xf8bfd6b5(yz5.l function) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(function, "function");
        this.f411789f = function;
    }
}
