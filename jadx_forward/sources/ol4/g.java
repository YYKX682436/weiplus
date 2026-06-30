package ol4;

/* loaded from: classes14.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f427688d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ol4.q qVar) {
        super(0);
        this.f427688d = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ol4.q qVar = this.f427688d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2295x6fbd6873.p2296xc53e9ae1.tts.p2297xdb7d1c3f.C18723x96879d03 c18723x96879d03 = qVar.f427733v;
        if (c18723x96879d03 != null) {
            c18723x96879d03.m72142x41012807();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2295x6fbd6873.p2296xc53e9ae1.tts.p2297xdb7d1c3f.C18721x9ae6bd22 c18721x9ae6bd22 = qVar.f427735x;
        if (c18721x9ae6bd22 != null) {
            c18721x9ae6bd22.m72126x41012807();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2295x6fbd6873.p2296xc53e9ae1.tts.p2297xdb7d1c3f.C18725xc88c8712 c18725xc88c8712 = qVar.f427734w;
        if (c18725xc88c8712 != null) {
            c18725xc88c8712.m72204x41012807();
        }
        ((kk4.f0) qVar.f427713b).mo100933x41012807();
        pl4.k kVar = qVar.f427732u;
        if (kVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingTPResourceLoader", "release fileCacheId:" + kVar.f438251b);
            kVar.f438261l = true;
        }
        wu5.c cVar = qVar.f427719h;
        if (cVar != null) {
            cVar.cancel(false);
        }
        qVar.f427719h = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(qVar.f427730s, "call release cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return jz5.f0.f384359a;
    }
}
