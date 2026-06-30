package gr5;

/* loaded from: classes15.dex */
public abstract class c {
    public static final java.lang.String a(gr5.b bVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bVar, "<this>");
        int i17 = gr5.b.f356442a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, gr5.a.f356432a)) {
            return "TopStart";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, gr5.a.f356433b)) {
            return "TopCenter";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, gr5.a.f356434c)) {
            return "TopEnd";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, gr5.a.f356435d)) {
            return "CenterStart";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, gr5.a.f356436e)) {
            return "Center";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, gr5.a.f356437f)) {
            return "CenterEnd";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, gr5.a.f356438g)) {
            return "BottomStart";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, gr5.a.f356439h)) {
            return "BottomCenter";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, gr5.a.f356440i)) {
            return "BottomEnd";
        }
        return "Unknown AlignmentCompat: " + bVar;
    }

    public static final boolean b(gr5.b bVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bVar, "<this>");
        int i17 = gr5.b.f356442a;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, gr5.a.f356438g) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, gr5.a.f356439h) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, gr5.a.f356440i);
    }

    public static final boolean c(gr5.b bVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bVar, "<this>");
        int i17 = gr5.b.f356442a;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, gr5.a.f356434c) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, gr5.a.f356437f) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, gr5.a.f356440i);
    }

    public static final boolean d(gr5.b bVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bVar, "<this>");
        int i17 = gr5.b.f356442a;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, gr5.a.f356432a) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, gr5.a.f356435d) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, gr5.a.f356438g);
    }

    public static final boolean e(gr5.b bVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bVar, "<this>");
        int i17 = gr5.b.f356442a;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, gr5.a.f356432a) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, gr5.a.f356433b) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, gr5.a.f356434c);
    }

    public static final gr5.b f(gr5.b bVar, java.lang.Boolean bool) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bVar, "<this>");
        if (bool != null && !bool.booleanValue()) {
            return bVar;
        }
        int i17 = gr5.b.f356442a;
        gr5.b bVar2 = gr5.a.f356432a;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, bVar2);
        gr5.b bVar3 = gr5.a.f356434c;
        if (!b17) {
            gr5.b bVar4 = gr5.a.f356433b;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, bVar4)) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, bVar3)) {
                    bVar2 = gr5.a.f356435d;
                    boolean b18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, bVar2);
                    bVar3 = gr5.a.f356437f;
                    if (!b18) {
                        bVar4 = gr5.a.f356436e;
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, bVar4)) {
                            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, bVar3)) {
                                bVar2 = gr5.a.f356438g;
                                boolean b19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, bVar2);
                                bVar3 = gr5.a.f356440i;
                                if (!b19) {
                                    bVar4 = gr5.a.f356439h;
                                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, bVar4)) {
                                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, bVar3)) {
                                            return bVar;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return bVar2;
            }
            return bVar4;
        }
        return bVar3;
    }
}
