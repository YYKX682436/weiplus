package y;

/* loaded from: classes14.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f539863d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.util.List list) {
        super(1);
        this.f539863d = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "$this$layout");
        java.util.List list = this.f539863d;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            s1.n1.b(layout, (s1.o1) list.get(i17), 0, 0, 0.0f, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
