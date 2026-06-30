package ws2;

/* loaded from: classes3.dex */
public final class e2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.j2 f530563d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(ws2.j2 j2Var) {
        super(0);
        this.f530563d = j2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f530563d.f530595i);
        ws2.j2 j2Var = this.f530563d;
        synchronized (valueOf) {
            if (((mm2.h5) j2Var.f410496d.a(mm2.h5.class)).f410645g != null) {
                if (((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) j2Var.f530596m).mo141623x754a37bb()).e() && !j2Var.f530595i) {
                    ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) j2Var.f530596m).mo141623x754a37bb()).c(1000L, 1000L);
                }
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                j2Var.f530594h.clear();
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) j2Var.f530596m).mo141623x754a37bb()).d();
            }
        }
        return jz5.f0.f384359a;
    }
}
