package mt1;

/* loaded from: classes12.dex */
public final class u implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m3.d f412798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f412799e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f412800f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f412801g;

    public u(m3.d dVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var3) {
        this.f412798d = dVar;
        this.f412799e = f0Var;
        this.f412800f = f0Var2;
        this.f412801g = f0Var3;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.lang.String str;
        m3.d dVar = this.f412798d;
        com.p314xaae8f345.mm.vfs.x1 m17 = com.p314xaae8f345.mm.vfs.w6.m(ot1.h.u0((java.lang.String) dVar.f404626b));
        if (m17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CalcWxNewService", "File not exists when refreshing link: " + ((java.lang.String) dVar.f404626b));
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f412799e;
            f0Var.f391649d = f0Var.f391649d + 1;
        }
        ot1.h hVar = new ot1.h();
        java.lang.Object first = dVar.f404625a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "first");
        hVar.f72763xa3c65b86 = ((java.lang.Number) first).longValue();
        hVar.f68219x9f7e1864 = m17 != null ? m17.f294767d : 0L;
        if (m17 instanceof com.p314xaae8f345.mm.vfs.k5) {
            this.f412800f.f391649d++;
            str = ((com.p314xaae8f345.mm.vfs.k5) m17).f294562h;
        } else {
            if (m17 != null) {
                this.f412801g.f391649d++;
            }
            str = null;
        }
        hVar.y0(str);
        return hVar;
    }
}
