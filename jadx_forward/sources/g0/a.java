package g0;

/* loaded from: classes14.dex */
public final class a implements g0.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f348869d;

    public a(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f348869d = view;
    }

    @Override // g0.e
    public java.lang.Object a(d1.g gVar, s1.z zVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        d1.g d17 = gVar.d(s1.a0.d(zVar));
        this.f348869d.requestRectangleOnScreen(new android.graphics.Rect((int) d17.f307162a, (int) d17.f307163b, (int) d17.f307164c, (int) d17.f307165d), false);
        return jz5.f0.f384359a;
    }
}
