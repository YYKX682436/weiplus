package i11;

/* loaded from: classes13.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i11.c f368672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i11.h f368673e;

    public p(i11.h hVar, i11.c cVar) {
        this.f368673e = hVar;
        this.f368672d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        i11.c cVar;
        i11.u uVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        i11.h hVar = this.f368673e;
        hVar.f368630f.lock();
        java.util.List list = hVar.f368628d;
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            cVar = this.f368672d;
            if (!hasNext) {
                break;
            }
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference == null || weakReference.get() == null || ((i11.c) weakReference.get()).equals(cVar)) {
                arrayList.add(weakReference);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            ((java.util.concurrent.CopyOnWriteArrayList) list).remove((java.lang.ref.WeakReference) it6.next());
        }
        java.util.List list2 = hVar.f368629e;
        java.util.Iterator it7 = ((java.util.concurrent.CopyOnWriteArrayList) list2).iterator();
        while (true) {
            if (!it7.hasNext()) {
                break;
            }
            i11.c cVar2 = (i11.c) it7.next();
            if (cVar2 != null && cVar2.equals(cVar)) {
                ((java.util.concurrent.CopyOnWriteArrayList) list2).remove(cVar);
                break;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationGeo", "stop listeners size %d, persistListeners size:%d", java.lang.Integer.valueOf(((java.util.concurrent.CopyOnWriteArrayList) list).size()), java.lang.Integer.valueOf(((java.util.concurrent.CopyOnWriteArrayList) list2).size()));
        if (((java.util.concurrent.CopyOnWriteArrayList) list).size() == 0 && (uVar = hVar.f368626b) != null) {
            uVar.f368685a.mo50293x3498a0(new i11.w(uVar));
        }
        hVar.f368630f.unlock();
    }
}
