package nz4;

/* loaded from: classes12.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f423166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nz4.y f423167e;

    public q(nz4.y yVar, boolean z17) {
        this.f423167e = yVar;
        this.f423166d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f423167e.C(this.f423166d);
    }
}
