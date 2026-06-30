package uh1;

/* loaded from: classes7.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f509368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f509369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uh1.q f509370f;

    public m(uh1.q qVar, java.lang.Runnable runnable, java.lang.String str) {
        this.f509370f = qVar;
        this.f509368d = runnable;
        this.f509369e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f509369e;
        uh1.q qVar = this.f509370f;
        try {
            this.f509368d.run();
        } finally {
            ((java.util.concurrent.ConcurrentSkipListSet) qVar.f509390d).remove(str);
        }
    }
}
