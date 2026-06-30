package m62;

/* loaded from: classes5.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m62.b f405916d;

    public a(m62.b bVar) {
        this.f405916d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f405916d.f405918a.iterator();
        while (it.hasNext()) {
            ((m62.c) it.next()).a();
        }
    }
}
