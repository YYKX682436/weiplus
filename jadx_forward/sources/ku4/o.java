package ku4;

/* loaded from: classes7.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ku4.o f394059d = new ku4.o();

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList(ku4.z.f394072a.j());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebCanvasStorageLogic", "init appId size = " + linkedList.size());
        for (java.lang.String str : linkedList) {
            ku4.z zVar = ku4.z.f394072a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            ku4.z.a(zVar, new com.p314xaae8f345.mm.vfs.r6(ku4.z.f394073b + '/' + str), str, currentTimeMillis);
            ku4.z.a(zVar, new com.p314xaae8f345.mm.vfs.r6(ku4.z.f394074c + '/' + str), str, currentTimeMillis);
        }
    }
}
