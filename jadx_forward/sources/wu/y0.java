package wu;

/* loaded from: classes9.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f531180d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(java.lang.String str) {
        super(1);
        this.f531180d = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.ImageView it = (android.widget.ImageView) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        gk0.k kVar = new gk0.k(it.getWidth(), it.getHeight());
        kVar.f353966d = 0.5f;
        java.nio.charset.Charset charset = r26.c.f450398a;
        java.lang.String str = this.f531180d;
        byte[] bytes = str.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String d17 = uk.k.d(bytes);
        if (d17 == null) {
            d17 = java.lang.String.valueOf(str.hashCode());
        }
        y01.a aVar = new y01.a(d17);
        aVar.d(str);
        java.lang.String wi6 = ((rx.h) ((gk0.k0) i95.n0.c(gk0.k0.class))).wi(kVar, aVar);
        i95.m c17 = i95.n0.c(gk0.n0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        g75.z x66 = gk0.n0.x6((gk0.n0) c17, wi6, kVar, it, null, 8, null);
        x66.l("KeyCdnParams", aVar);
        gk0.j.b(((rx.h) ((gk0.k0) i95.n0.c(gk0.k0.class))).Ai(), x66, null, 2, null);
        return jz5.f0.f384359a;
    }
}
