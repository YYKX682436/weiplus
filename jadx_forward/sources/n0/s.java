package n0;

/* loaded from: classes14.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f415227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.d f415228e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f415229f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(yz5.a aVar, n0.d dVar, int i17) {
        super(3);
        this.f415227d = aVar;
        this.f415228e = dVar;
        this.f415229f = i17;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.e applier = (n0.e) obj;
        n0.o4 slots = (n0.o4) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(applier, "applier");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slots, "slots");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((n0.d4) obj3, "<anonymous parameter 2>");
        java.lang.Object mo152xb9724478 = this.f415227d.mo152xb9724478();
        n0.d anchor = this.f415228e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchor, "anchor");
        slots.L(slots.c(anchor), mo152xb9724478);
        applier.f(this.f415229f, mo152xb9724478);
        applier.h(mo152xb9724478);
        return jz5.f0.f384359a;
    }
}
