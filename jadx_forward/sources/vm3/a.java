package vm3;

/* loaded from: classes14.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f519673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vm3.d f519674e;

    public a(int i17, vm3.d dVar) {
        this.f519673d = i17;
        this.f519674e = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ScrollView U6;
        vm3.d dVar = this.f519674e;
        int scrollY = this.f519673d - dVar.U6().getScrollY();
        if (scrollY <= 0 || (U6 = dVar.U6()) == null) {
            return;
        }
        U6.smoothScrollBy(0, scrollY);
    }
}
