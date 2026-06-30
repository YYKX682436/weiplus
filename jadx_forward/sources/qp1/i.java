package qp1;

/* loaded from: classes14.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static volatile qp1.d f447258a;

    public static final void a() {
        qp1.d dVar = f447258a;
        wu5.c cVar = dVar != null ? dVar.f447248b : null;
        if (cVar == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancelAutoCollapse taskId: ");
        qp1.d dVar2 = f447258a;
        sb6.append(dVar2 != null ? java.lang.Long.valueOf(dVar2.f447247a) : null);
        sb6.append(", isDone: ");
        sb6.append(cVar.isDone());
        sb6.append(", isCancelled: ");
        sb6.append(cVar.isCancelled());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallCollapseHelper", sb6.toString());
        if (!cVar.isDone() && !cVar.isCancelled()) {
            cVar.cancel(false);
        }
        f447258a = null;
    }
}
