package aj4;

/* loaded from: classes10.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f86842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi4.r1 f86843e;

    public b(java.util.LinkedList linkedList, zi4.r1 r1Var) {
        this.f86842d = linkedList;
        this.f86843e = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.RandomAccess randomAccess;
        aj4.v vVar = aj4.v.f86910a;
        java.util.LinkedList<bw5.sb> items = this.f86842d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        if (items.isEmpty()) {
            randomAccess = kz5.p0.f395529d;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(items.size());
            for (bw5.sb sbVar : items) {
                try {
                    arrayList.add(vVar.d(sbVar));
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TextStatusFlutterMediaProvider", th6, "compress one failed, fallback to origin", new java.lang.Object[0]);
                    arrayList.add(sbVar);
                }
            }
            randomAccess = arrayList;
        }
        bw5.bb bbVar = new bw5.bb();
        bbVar.f107120d.addAll(randomAccess);
        bbVar.f107121e[1] = true;
        this.f86843e.a(bbVar, 0L, "");
    }
}
