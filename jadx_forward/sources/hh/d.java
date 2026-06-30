package hh;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f362966a = new java.util.ArrayList();

    public final void a(java.lang.Object obj) {
        synchronized (this.f362966a) {
            ((java.util.ArrayList) this.f362966a).add(obj);
        }
    }

    public final void b() {
        synchronized (this.f362966a) {
            ((java.util.ArrayList) this.f362966a).clear();
        }
    }

    public final java.util.List c(yz5.l block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.f362966a) {
            java.util.Iterator it = this.f362966a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(block.mo146xb9724478(it6.next()));
        }
        return arrayList2;
    }

    public final void d(yz5.l block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        c(new hh.c(block));
    }
}
