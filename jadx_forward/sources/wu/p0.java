package wu;

/* loaded from: classes9.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final wu.p0 f531145d = new wu.p0();

    public p0() {
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
        s15.m s17 = item.f366530e.s();
        if (s17 != null) {
            title.setText(s17.m163611x7531c8a2());
            java.lang.String m163610xd93f812f = s17.m163610xd93f812f();
            if (!(!r26.n0.N(m163610xd93f812f))) {
                m163610xd93f812f = null;
            }
            if (m163610xd93f812f != null) {
                vo0.a aVar = vo0.e.f520001b;
                yo0.f fVar = new yo0.f();
                fVar.f545611b = true;
                fVar.f545610a = true;
                aVar.c(m163610xd93f812f, icon, fVar.a());
            }
        }
        return jz5.f0.f384359a;
    }
}
