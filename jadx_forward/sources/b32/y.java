package b32;

/* loaded from: classes10.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13399xaee30621 f99187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b32.c0 f99188e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Matrix f99189f;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13399xaee30621 c13399xaee30621, b32.c0 c0Var, android.graphics.Matrix matrix) {
        this.f99187d = c13399xaee30621;
        this.f99188e = c0Var;
        this.f99189f = matrix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13399xaee30621 c13399xaee30621 = this.f99187d;
        android.view.ViewGroup viewGroup = c13399xaee30621.f180261g;
        b32.c0 c0Var = this.f99188e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c0Var, "null cannot be cast to non-null type android.view.View");
        viewGroup.addView((android.view.View) c0Var, layoutParams);
        c0Var.b(c13399xaee30621.m54949xbd40714a(), c13399xaee30621.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561884vc));
        c13399xaee30621.m54951x40b67ed6(c0Var);
        c13399xaee30621.f180261g.bringChildToFront(c13399xaee30621.m54948x40031356());
        android.graphics.Matrix m17 = this.f99189f;
        if (m17 == null || !(c0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13401x43e552ab)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13401x43e552ab c13401x43e552ab = (com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13401x43e552ab) c0Var;
        c13401x43e552ab.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m17, "m");
        ((w22.i) c13401x43e552ab.f180273r).f524078b.f106450g.set(m17);
    }
}
