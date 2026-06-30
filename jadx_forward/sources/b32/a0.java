package b32;

/* loaded from: classes10.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13399xaee30621 f99160d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13399xaee30621 c13399xaee30621) {
        this.f99160d = c13399xaee30621;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13399xaee30621 c13399xaee30621 = this.f99160d;
        b32.c0 c0Var = c13399xaee30621.f180268q;
        if (c0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
            if (!c0Var.l()) {
                android.view.ViewGroup viewGroup = c13399xaee30621.f180261g;
                java.lang.Object obj = c13399xaee30621.f180268q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type android.view.View");
                viewGroup.removeView((android.view.View) obj);
            }
        }
        c13399xaee30621.f180268q = null;
        c13399xaee30621.f180266o = null;
    }
}
