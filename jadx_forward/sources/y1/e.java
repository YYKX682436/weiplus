package y1;

/* loaded from: classes14.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1.g f540236d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d1.g gVar) {
        super(1);
        this.f540236d = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        u1.w it = (u1.w) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        u1.c1 c17 = y1.q0.c(it);
        if (c17.p0()) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f540236d, s1.a0.b(c17))) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
