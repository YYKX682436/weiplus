package s2;

/* loaded from: classes14.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f483785d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.util.List list) {
        super(1);
        this.f483785d = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "$this$layout");
        java.util.List list = this.f483785d;
        int h17 = kz5.c0.h(list);
        if (h17 >= 0) {
            int i17 = 0;
            while (true) {
                s1.n1.e(layout, (s1.o1) list.get(i17), 0, 0, 0.0f, 4, null);
                if (i17 == h17) {
                    break;
                }
                i17++;
            }
        }
        return jz5.f0.f384359a;
    }
}
