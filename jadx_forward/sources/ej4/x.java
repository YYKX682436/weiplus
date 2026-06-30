package ej4;

/* loaded from: classes11.dex */
public final class x extends ej4.r {

    /* renamed from: d, reason: collision with root package name */
    public final bi4.c f334922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.lang.String userName, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 iconTV, bi4.c iconScene) {
        super(iconTV, userName, null, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconTV, "iconTV");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconScene, "iconScene");
        this.f334922d = iconScene;
        b();
    }

    @Override // ej4.r
    public void b() {
        java.lang.Object obj = a().get();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 c21526xca364659 = obj instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659) obj : null;
        if (c21526xca364659 == null) {
            return;
        }
        java.lang.CharSequence O = bk4.i.a().O(c21526xca364659, this.f334907a, c21526xca364659.m79231xfb85ada3(), i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 20), bi4.d.OUTLINED, this.f334922d);
        if (O == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c21526xca364659.m79231xfb85ada3(), O)) {
            return;
        }
        nf.e.f(new ej4.w(c21526xca364659, this, O));
    }
}
