package l45;

/* loaded from: classes10.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l45.l f397985d;

    public j(l45.l lVar) {
        this.f397985d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        l45.l lVar = this.f397985d;
        try {
            java.util.Iterator it = lVar.f397992h.f397996d.iterator();
            while (it.hasNext()) {
                ((dl.b) it.next()).z();
            }
            lVar.f397992h.p();
        } catch (java.lang.Exception unused) {
        }
    }
}
