package rv4;

/* loaded from: classes12.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mv4.f f481990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f481991e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(mv4.f fVar, java.util.List list) {
        super(1);
        this.f481990d = fVar;
        this.f481991e = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        rv4.k it = (rv4.k) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it.f482040e, ((rv4.k) this.f481990d).f482040e)) {
            this.f481991e.add(it);
            z17 = true;
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
