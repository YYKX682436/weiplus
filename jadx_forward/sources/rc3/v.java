package rc3;

/* loaded from: classes7.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475615d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(rc3.w0 w0Var) {
        super(0);
        this.f475615d = w0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rc3.w0 w0Var = this.f475615d;
        w0Var.f475632t = 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var.f475638z, "onCreated");
        je3.o oVar = w0Var.f475636x;
        if (oVar != null) {
            oVar.b();
        }
        java.util.Iterator it = w0Var.f475625m.iterator();
        while (it.hasNext()) {
            ((jc3.u) it.next()).mo123042x8cf48009();
        }
        return jz5.f0.f384359a;
    }
}
