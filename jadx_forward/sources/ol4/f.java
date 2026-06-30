package ol4;

/* loaded from: classes14.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f427687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ol4.q qVar) {
        super(0);
        this.f427687d = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ol4.q qVar = this.f427687d;
        qVar.f427722k = true;
        ((kk4.f0) qVar.f427713b).mo100930x65825f6();
        pl4.k kVar = qVar.f427732u;
        if (kVar != null) {
            kVar.j(false);
        }
        wu5.c cVar = qVar.f427719h;
        if (cVar != null) {
            cVar.cancel(false);
        }
        qVar.f427719h = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(qVar.f427730s, "call pause cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return jz5.f0.f384359a;
    }
}
