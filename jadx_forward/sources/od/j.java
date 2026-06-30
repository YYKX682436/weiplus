package od;

/* loaded from: classes8.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ od.k f426046e;

    public j(od.k kVar, java.lang.String str) {
        this.f426046e = kVar;
        this.f426045d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f426046e.b(this.f426045d, false);
    }
}
