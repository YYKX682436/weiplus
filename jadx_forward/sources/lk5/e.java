package lk5;

/* loaded from: classes14.dex */
public final class e extends p012xc85e97e9.p016x746ad0e3.app.b {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 f400560a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f400561b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f400562c;

    public e(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 vasActivity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vasActivity, "vasActivity");
        this.f400560a = vasActivity;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(vasActivity.m81200x2aac75d8());
        this.f400561b = frameLayout;
        frameLayout.setId(com.p314xaae8f345.mm.R.id.hvf);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void B(boolean z17) {
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void C(int i17) {
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void D(boolean z17) {
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void E(boolean z17) {
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void F(boolean z17) {
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void G(float f17) {
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void H(int i17) {
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void I(android.graphics.drawable.Drawable drawable) {
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void L() {
        this.f400560a.m81171xb6e57581();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public android.view.View j() {
        return this.f400562c;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public int k() {
        return 0;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public int l() {
        return 0;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public java.lang.CharSequence n() {
        return "";
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void o() {
        this.f400560a.m81170xebf830dc();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public boolean q() {
        return this.f400561b.getVisibility() == 0;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void w(android.graphics.drawable.Drawable drawable) {
        this.f400561b.setBackgroundDrawable(drawable);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void x(int i17) {
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void y(android.view.View view) {
        android.view.View view2 = this.f400562c;
        android.view.ViewGroup viewGroup = this.f400561b;
        if (view2 != null) {
            viewGroup.removeView(view2);
        }
        if (view != null) {
            viewGroup.addView(view);
        }
        this.f400562c = view;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void z(android.view.View view, p012xc85e97e9.p016x746ad0e3.app.C0063x293d4d7 c0063x293d4d7) {
    }
}
