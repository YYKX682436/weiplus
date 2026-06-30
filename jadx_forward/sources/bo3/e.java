package bo3;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Queue f104557a;

    /* renamed from: b, reason: collision with root package name */
    public static final bo3.b f104558b;

    static {
        bo3.e eVar = new bo3.e();
        f104557a = new java.util.PriorityQueue(11, bo3.d.f104556d);
        bo3.a aVar = new bo3.a();
        bo3.b bVar = new bo3.b();
        f104558b = bVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Nfc.NfcDispatchLogic", "<init>");
        eVar.a(aVar);
        eVar.a(bVar);
    }

    public final void a(bo3.c processor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processor, "processor");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Nfc.NfcDispatchLogic", "addProcessor, processor: " + processor.mo10961xfb82e301());
        f104557a.add(processor);
    }
}
