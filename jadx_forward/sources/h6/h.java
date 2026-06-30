package h6;

/* loaded from: classes14.dex */
public abstract class h {
    public static final x5.g a(c6.j jVar, java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        jz5.l lVar = jVar.f120369h;
        if (lVar == null) {
            return null;
        }
        x5.g gVar = (x5.g) lVar.f384366d;
        if (((java.lang.Class) lVar.f384367e).isAssignableFrom(data.getClass())) {
            return gVar;
        }
        throw new java.lang.IllegalStateException((((java.lang.Object) gVar.getClass().getName()) + " cannot handle data with type " + ((java.lang.Object) data.getClass().getName()) + '.').toString());
    }

    public static final boolean b(c6.j jVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jVar, "<this>");
        int ordinal = jVar.f120379r.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1) {
            return true;
        }
        if (ordinal != 2) {
            throw new jz5.j();
        }
        e6.b bVar = jVar.f120364c;
        boolean z17 = bVar instanceof e6.c;
        d6.h hVar = jVar.f120375n;
        if (z17 && (((p135x2eae8f.p139xcb7e7191.C1422x9d6d031) ((e6.c) bVar)).f125447d instanceof android.widget.ImageView) && (hVar instanceof d6.l) && ((d6.f) ((d6.l) hVar)).f308172c == ((p135x2eae8f.p139xcb7e7191.C1422x9d6d031) ((e6.c) bVar)).f125447d) {
            return true;
        }
        return jVar.G.f120319b == null && (hVar instanceof d6.a);
    }

    public static final android.graphics.drawable.Drawable c(c6.j jVar, android.graphics.drawable.Drawable drawable, java.lang.Integer num, android.graphics.drawable.Drawable drawable2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jVar, "<this>");
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return h6.c.a(jVar.f120362a, num.intValue());
    }
}
