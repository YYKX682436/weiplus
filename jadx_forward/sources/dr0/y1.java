package dr0;

/* loaded from: classes12.dex */
public final class y1 {
    public y1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.String tag, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        jz5.g gVar = dr0.z1.f324113d;
        synchronized (((java.util.List) gVar.mo141623x754a37bb())) {
            dr0.y1 y1Var = dr0.z1.f324112c;
            ((java.util.List) gVar.mo141623x754a37bb()).add(new dr0.z1(tag, msg));
        }
    }
}
