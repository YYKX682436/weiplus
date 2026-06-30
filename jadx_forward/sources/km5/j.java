package km5;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.util.Pair f390857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f390858e;

    public j(km5.q qVar, android.util.Pair pair, java.lang.Object obj) {
        this.f390857d = pair;
        this.f390858e = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((km5.e) this.f390857d.first).a(this.f390858e);
    }
}
