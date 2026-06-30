package yk5;

/* loaded from: classes11.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f544420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yk5.u f544421e;

    public k(yk5.u uVar, java.lang.Runnable runnable) {
        this.f544421e = uVar;
        this.f544420d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f544420d.run();
        this.f544421e.notifyDataSetChanged();
    }
}
