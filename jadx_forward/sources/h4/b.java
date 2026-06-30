package h4;

/* loaded from: classes14.dex */
public final class b implements h4.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayDeque f360154a;

    /* renamed from: b, reason: collision with root package name */
    public final int f360155b;

    public b(int i17) {
        this.f360155b = i17;
        this.f360154a = new java.util.ArrayDeque(i17 > 10 ? 10 : i17);
    }

    @Override // h4.a
    public void a(h4.n item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        while (true) {
            java.util.ArrayDeque arrayDeque = this.f360154a;
            if (arrayDeque.size() < this.f360155b) {
                arrayDeque.offerLast(item);
                return;
            }
            arrayDeque.pollFirst();
        }
    }

    @Override // h4.a
    /* renamed from: getItems */
    public java.util.Collection mo132836x749b8e0a() {
        return this.f360154a;
    }

    @Override // h4.a
    /* renamed from: isEmpty */
    public boolean mo132837x7aab3243() {
        return ((java.util.ArrayDeque) mo132836x749b8e0a()).isEmpty();
    }
}
