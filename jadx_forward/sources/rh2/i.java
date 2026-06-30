package rh2;

/* loaded from: classes5.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final rh2.i f477186d = new rh2.i();

    @Override // java.lang.Runnable
    public final void run() {
        rh2.j jVar = rh2.j.f477187a;
        com.p314xaae8f345.mm.udr.e0 e0Var = (com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e0Var);
        jVar.a(e0Var);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : rh2.j.f477188b) {
            if (((com.p314xaae8f345.mm.udr.a1) e0Var).Ui("ilinkres_4e2919fe", (java.lang.String) ((jz5.l) obj).f384366d) == null) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KWSResourceLoader", "[prefetch] all resources cached locally");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[prefetch] triggering UDR download: ");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((java.lang.String) ((jz5.l) it.next()).f384366d);
        }
        sb6.append(arrayList2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KWSResourceLoader", sb6.toString());
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
        qVar.c("ilinkres_4e2919fe");
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            jz5.l lVar = (jz5.l) it6.next();
            java.util.LinkedList linkedList = qVar.f299081e;
            if (linkedList != null) {
                linkedList.add(lVar.f384366d);
            }
        }
        ((com.p314xaae8f345.mm.udr.a1) e0Var).Di(qVar, new rh2.h(e0Var));
    }
}
