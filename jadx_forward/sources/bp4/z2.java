package bp4;

/* loaded from: classes5.dex */
public final class z2 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18831xf8e91db9 f104969f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(android.view.ViewGroup layout, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18831xf8e91db9 c18831xf8e91db9 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18831xf8e91db9) layout.findViewById(com.p314xaae8f345.mm.R.id.d8p);
        this.f104969f = c18831xf8e91db9;
        c18831xf8e91db9.m72703xac70caa4(new bp4.y2(this, status));
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18831xf8e91db9 c18831xf8e91db9 = this.f104969f;
        if (!(c18831xf8e91db9.getVisibility() == 0)) {
            return false;
        }
        c18831xf8e91db9.m72702x76500a7f(false);
        ju3.d0.k(this.f546865d, ju3.c0.W, null, 2, null);
        return true;
    }
}
