package tb1;

/* loaded from: classes7.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f498450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tb1.q f498451e;

    public p(tb1.q qVar, java.lang.String str) {
        this.f498451e = qVar;
        this.f498450d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        tb1.s.e(this.f498451e.f498458e, this.f498450d);
    }
}
