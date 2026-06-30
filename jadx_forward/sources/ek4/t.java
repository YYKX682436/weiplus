package ek4;

/* loaded from: classes12.dex */
public abstract class t {
    public static final void a(java.util.List list, java.lang.String mediaId, int i17, dn.o task, dn.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ek4.a) it.next()).a(mediaId, i17, task, hVar);
        }
    }

    public static final void b(java.util.List list, java.lang.String mediaId, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ek4.a) it.next()).f(mediaId, j17, j18);
        }
    }

    public static final void c(java.util.List list, java.lang.String mediaId, int i17, dn.o oVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ek4.a) it.next()).c(mediaId, i17, oVar);
        }
    }

    public static final void d(java.util.List list, java.lang.String mediaId, int i17, dn.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ek4.a) it.next()).b(mediaId, i17, hVar);
        }
    }
}
