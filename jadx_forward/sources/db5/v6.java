package db5;

/* loaded from: classes11.dex */
public class v6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f310087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.x6 f310088e;

    public v6(db5.x6 x6Var, java.lang.String str) {
        this.f310088e = x6Var;
        this.f310087d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f310088e.f310106f.C.d(this.f310087d.trim());
    }
}
