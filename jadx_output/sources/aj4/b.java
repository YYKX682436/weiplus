package aj4;

/* loaded from: classes10.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f5309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi4.r1 f5310e;

    public b(java.util.LinkedList linkedList, zi4.r1 r1Var) {
        this.f5309d = linkedList;
        this.f5310e = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.RandomAccess randomAccess;
        aj4.v vVar = aj4.v.f5377a;
        java.util.LinkedList<bw5.sb> items = this.f5309d;
        kotlin.jvm.internal.o.g(items, "items");
        if (items.isEmpty()) {
            randomAccess = kz5.p0.f313996d;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(items.size());
            for (bw5.sb sbVar : items) {
                try {
                    arrayList.add(vVar.d(sbVar));
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TextStatusFlutterMediaProvider", th6, "compress one failed, fallback to origin", new java.lang.Object[0]);
                    arrayList.add(sbVar);
                }
            }
            randomAccess = arrayList;
        }
        bw5.bb bbVar = new bw5.bb();
        bbVar.f25587d.addAll(randomAccess);
        bbVar.f25588e[1] = true;
        this.f5310e.a(bbVar, 0L, "");
    }
}
