package cj;

/* loaded from: classes12.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj.i f41832d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(cj.i iVar) {
        super(5);
        this.f41832d = iVar;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        java.io.File hprof = (java.io.File) obj;
        java.io.File keyFile = (java.io.File) obj2;
        java.lang.String activity = (java.lang.String) obj3;
        java.lang.String key = (java.lang.String) obj4;
        java.lang.String failure = (java.lang.String) obj5;
        kotlin.jvm.internal.o.g(hprof, "hprof");
        kotlin.jvm.internal.o.g(keyFile, "keyFile");
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(failure, "failure");
        oj.j.c("Matrix.LeakProcessor.NativeForkAnalyze", "Found record " + activity + '(' + hprof.getName() + ").", new java.lang.Object[0]);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(failure);
        java.lang.String absolutePath = hprof.getAbsolutePath();
        kotlin.jvm.internal.o.f(absolutePath, "hprof.absolutePath");
        java.io.File file = com.tencent.matrix.resource.MemoryUtil.f52933a;
        com.tencent.matrix.resource.MemoryUtil memoryUtil = com.tencent.matrix.resource.MemoryUtil.f52936d;
        ti.a f17 = memoryUtil.f(absolutePath, key, 1200L, new com.tencent.matrix.resource.p(memoryUtil));
        java.lang.Throwable th6 = f17.f419487f;
        if (th6 != null) {
            arrayList.add(th6.toString());
        }
        wi.b bVar = wi.b.FORK_ANALYSE;
        boolean z17 = f17.f419485d;
        cj.i iVar = this.f41832d;
        long j17 = f17.f419488g;
        if (z17) {
            iVar.f41833d.f52964a.f41835e.b(activity, false);
            java.lang.String aVar = f17.toString();
            iVar.f41833d.f52964a.f41834d.d(0, bVar, activity, key, aVar, java.lang.String.valueOf(j17), 1);
            oj.j.c("Matrix.LeakProcessor.NativeForkAnalyze", "retry leak found: " + aVar, new java.lang.Object[0]);
        } else if (th6 != null) {
            arrayList.add(th6.toString());
            iVar.f41833d.f52964a.f41834d.d(5, bVar, activity, key, kz5.n0.g0(arrayList, ";", null, null, 0, null, null, 62, null), java.lang.String.valueOf(j17), 1);
        }
        return jz5.f0.f302826a;
    }
}
