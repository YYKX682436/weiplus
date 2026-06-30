package n0;

/* loaded from: classes14.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f415037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f415038e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, java.util.List list) {
        super(3);
        this.f415037d = f0Var;
        this.f415038e = list;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.e applier = (n0.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(applier, "applier");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((n0.o4) obj2, "<anonymous parameter 1>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((n0.d4) obj3, "<anonymous parameter 2>");
        int i17 = this.f415037d.f391649d;
        java.util.List list = this.f415038e;
        int size = list.size();
        for (int i18 = 0; i18 < size; i18++) {
            java.lang.Object obj4 = list.get(i18);
            int i19 = i17 + i18;
            applier.g(i19, obj4);
            applier.f(i19, obj4);
        }
        return jz5.f0.f384359a;
    }
}
