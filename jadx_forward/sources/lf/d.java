package lf;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf.e f399710d;

    public d(lf.e eVar) {
        this.f399710d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        lf.e eVar = this.f399710d;
        java.util.List list = eVar.f399718n;
        if (list != null && ((java.util.concurrent.CopyOnWriteArrayList) list).size() > 0) {
            lf.e.a(eVar, eVar.f399718n, -1, "timeout", null);
            ((java.util.concurrent.CopyOnWriteArrayList) eVar.f399718n).clear();
        }
        java.util.List list2 = eVar.f399719o;
        if (list2 == null || ((java.util.concurrent.CopyOnWriteArrayList) list2).size() <= 0) {
            return;
        }
        lf.e.a(eVar, eVar.f399719o, -1, "timeout", null);
        ((java.util.concurrent.CopyOnWriteArrayList) eVar.f399719o).clear();
    }
}
