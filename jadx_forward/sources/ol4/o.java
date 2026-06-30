package ol4;

/* loaded from: classes14.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f427709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427710e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ol4.q qVar, java.lang.String str) {
        super(0);
        this.f427709d = qVar;
        this.f427710e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ol4.q qVar = this.f427709d;
        pl4.k kVar = qVar.f427732u;
        if (kVar != null) {
            kVar.j(true);
        }
        ((kk4.f0) qVar.f427713b).mo100976x360802();
        wu5.c cVar = qVar.f427719h;
        if (cVar != null) {
            cVar.cancel(false);
        }
        qVar.f427719h = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(qVar.f427730s, "call stop cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", " + this.f427710e);
        return jz5.f0.f384359a;
    }
}
