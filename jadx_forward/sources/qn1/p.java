package qn1;

/* loaded from: classes12.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f446532d;

    public p(qn1.t tVar, java.util.Set set) {
        this.f446532d = set;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f446532d.iterator();
        while (it.hasNext()) {
            ((rn1.a0) ((kn1.d) it.next())).b();
        }
    }
}
