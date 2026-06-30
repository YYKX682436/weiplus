package bo3;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Queue f23024a;

    /* renamed from: b, reason: collision with root package name */
    public static final bo3.b f23025b;

    static {
        bo3.e eVar = new bo3.e();
        f23024a = new java.util.PriorityQueue(11, bo3.d.f23023d);
        bo3.a aVar = new bo3.a();
        bo3.b bVar = new bo3.b();
        f23025b = bVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.Nfc.NfcDispatchLogic", "<init>");
        eVar.a(aVar);
        eVar.a(bVar);
    }

    public final void a(bo3.c processor) {
        kotlin.jvm.internal.o.g(processor, "processor");
        com.tencent.mars.xlog.Log.i("MicroMsg.Nfc.NfcDispatchLogic", "addProcessor, processor: " + processor.getName());
        f23024a.add(processor);
    }
}
