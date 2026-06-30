package rc3;

/* loaded from: classes7.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475492d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(rc3.w0 w0Var) {
        super(0);
        this.f475492d = w0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rc3.w0 w0Var = this.f475492d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var.f475638z, "cleanupByConnError");
        je3.i.t8(je3.k.f380831e, w0Var.f475635w, "onConnException", "", null, 1.0E-4f, 8, null);
        w0Var.f475632t = 16;
        java.util.Iterator it = w0Var.f475625m.iterator();
        while (it.hasNext()) {
            ((jc3.u) it.next()).b1();
        }
        w0Var.j();
        return jz5.f0.f384359a;
    }
}
