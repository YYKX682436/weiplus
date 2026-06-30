package ro1;

/* loaded from: classes5.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f479525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f479526e;

    public l(java.util.List list, java.util.List list2) {
        this.f479525d = list;
        this.f479526e = list2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f479525d.isEmpty()) {
            ro1.t.f479541d.e5(this.f479525d);
            java.util.Set set = ro1.t.f479543f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(set, "access$getVolumeChangeListeners$p(...)");
            java.util.List list = this.f479525d;
            synchronized (set) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(set, "access$getVolumeChangeListeners$p(...)");
                java.util.Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((ro1.e) it.next()).e5(list);
                }
            }
        }
        if (!this.f479526e.isEmpty()) {
            ro1.t.f479541d.X4(this.f479526e);
            java.util.Set set2 = ro1.t.f479543f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(set2, "access$getVolumeChangeListeners$p(...)");
            java.util.List list2 = this.f479526e;
            synchronized (set2) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(set2, "access$getVolumeChangeListeners$p(...)");
                java.util.Iterator it6 = set2.iterator();
                while (it6.hasNext()) {
                    ((ro1.e) it6.next()).X4(list2);
                }
            }
        }
    }
}
