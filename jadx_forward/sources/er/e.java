package er;

/* loaded from: classes12.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ er.f f337461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f337462e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(er.f fVar, boolean z17) {
        super(0);
        this.f337461d = fVar;
        this.f337462e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IEmojiLoadTask", "thread pool, " + this.f337461d.f337463f.mo42933xb5885648());
        java.util.LinkedList<dr.s> linkedList = new java.util.LinkedList();
        java.util.List list = this.f337461d.f337470p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "access$getRequests$p(...)");
        er.f fVar = this.f337461d;
        synchronized (list) {
            linkedList.addAll(fVar.f337470p);
            fVar.f337470p.clear();
        }
        boolean z17 = this.f337462e;
        for (dr.s sVar : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IEmojiLoadTask", "fotEach onLoad " + sVar.f323933a.mo42933xb5885648());
            sVar.c(z17);
        }
        return jz5.f0.f384359a;
    }
}
