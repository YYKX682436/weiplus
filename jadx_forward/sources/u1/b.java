package u1;

/* loaded from: classes14.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final u1.b f505080d = new u1.b();

    public b() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        u1.g gVar = (u1.g) obj;
        p2.s it = (p2.s) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gVar, "$this$null");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        u1.w wVar = (u1.w) gVar;
        if (wVar.f505233x != it) {
            wVar.f505233x = it;
            wVar.I(false);
            u1.w p17 = wVar.p();
            if (p17 != null) {
                p17.u();
            }
            wVar.v();
        }
        return jz5.f0.f384359a;
    }
}
