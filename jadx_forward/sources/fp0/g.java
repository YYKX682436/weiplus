package fp0;

/* loaded from: classes10.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.o f346786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fp0.d f346787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fp0.u f346788f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fp0.o oVar, fp0.d dVar, fp0.u uVar) {
        super(0);
        this.f346786d = oVar;
        this.f346787e = dVar;
        this.f346788f = uVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fp0.d work;
        java.lang.Object obj;
        fp0.o oVar = this.f346786d;
        java.util.Iterator it = oVar.f346807f.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            work = this.f346787e;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((fp0.d) ((fp0.q) obj).f346808a).d(), work.d())) {
                break;
            }
        }
        fp0.q qVar = (fp0.q) obj;
        fp0.u status = this.f346788f;
        if (qVar != null) {
            oVar.f346807f.remove(qVar);
            for (fp0.p pVar : qVar.f346809b) {
                if (pVar != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(work, "null cannot be cast to non-null type T of com.tencent.mm.loader.loader.LoaderCore.callPrepareInUI.<no name provided>.onTaskStatusCallback.<no name provided>.invoke$lambda$2$lambda$1");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(status);
                    pVar.a(work, status);
                }
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(work, "$work");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(status, "$status");
        pm0.v.X(new fp0.j(oVar, work, status));
        if (fp0.f.f346785a[status.ordinal()] == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Loader.DefaultTaskLoader", oVar.f() + "workStat wait");
        } else {
            oVar.c();
        }
        return jz5.f0.f384359a;
    }
}
