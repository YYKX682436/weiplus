package sj0;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj0.e f489880d;

    public d(sj0.e eVar) {
        this.f489880d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f489880d.f489883d = android.view.Choreographer.getInstance();
        synchronized (this.f489880d.f489885f) {
            this.f489880d.f489885f.notify();
        }
    }
}
