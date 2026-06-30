package sp2;

/* loaded from: classes2.dex */
public final class i1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492582d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(sp2.o2 o2Var) {
        super(1);
        this.f492582d = o2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Throwable) obj) instanceof java.util.concurrent.CancellationException) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "invokeOnCompletion: cgi is cancel");
            java.lang.String cacheBusinessKey = this.f492582d.V;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheBusinessKey, "cacheBusinessKey");
            by1.d a17 = by1.c.f117886b.a().a("7312+0+" + cacheBusinessKey + "+0");
            aq2.k kVar = a17 instanceof aq2.k ? (aq2.k) a17 : null;
            if (kVar != null) {
                kVar.g();
            }
        }
        return jz5.f0.f384359a;
    }
}
