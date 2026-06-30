package cx4;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f306181a = new java.util.ArrayList();

    public final void a(cx4.p info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.ArrayList arrayList = this.f306181a;
        if (arrayList.size() > 0) {
            info.f306180d = info.f306178b - ((cx4.p) arrayList.get(arrayList.size() - 1)).f306178b;
        }
        arrayList.add(info);
    }
}
