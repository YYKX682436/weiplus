package mj;

/* loaded from: classes12.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f408495d;

    public e(android.content.Context context) {
        this.f408495d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        mj.i.f408501o = new mj.i(this.f408495d, new com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p588x373aa5.C4717x6bd28ad6(this.f408495d));
        java.lang.Object obj = mj.i.f408502p;
        synchronized (obj) {
            obj.notifyAll();
        }
    }
}
