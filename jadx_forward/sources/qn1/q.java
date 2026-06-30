package qn1;

/* loaded from: classes12.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f446533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f446534e;

    public q(qn1.t tVar, java.util.Set set, int i17) {
        this.f446533d = set;
        this.f446534e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f446533d.iterator();
        while (it.hasNext()) {
            ((rn1.a0) ((kn1.d) it.next())).a(this.f446534e);
        }
    }
}
