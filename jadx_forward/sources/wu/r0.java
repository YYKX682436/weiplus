package wu;

/* loaded from: classes9.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final wu.r0 f531151d = new wu.r0();

    public r0() {
        super(3);
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        hu.b item = (hu.b) obj;
        android.widget.ImageView icon = (android.widget.ImageView) obj2;
        android.widget.TextView title = (android.widget.TextView) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(icon, "icon");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        s15.h hVar = item.f366530e;
        s15.s y17 = hVar.y();
        if (y17 != null) {
            title.setText(hVar.m75945x2fec8307(hVar.f384955d + 0));
            java.lang.String l17 = y17.l();
            if (!(!r26.n0.N(l17))) {
                l17 = null;
            }
            if (l17 != null) {
                vo0.a aVar = vo0.e.f520001b;
                yo0.f fVar = new yo0.f();
                fVar.f545611b = true;
                fVar.f545610a = true;
                aVar.c(l17, icon, fVar.a());
            }
        }
        return jz5.f0.f384359a;
    }
}
