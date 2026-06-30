package n0;

/* loaded from: classes14.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.d f415233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f415234e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(n0.d dVar, int i17) {
        super(3);
        this.f415233d = dVar;
        this.f415234e = i17;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.e applier = (n0.e) obj;
        n0.o4 slots = (n0.o4) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(applier, "applier");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slots, "slots");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((n0.d4) obj3, "<anonymous parameter 2>");
        n0.d anchor = this.f415233d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchor, "anchor");
        java.lang.Object v17 = slots.v(slots.c(anchor));
        applier.i();
        applier.g(this.f415234e, v17);
        return jz5.f0.f384359a;
    }
}
