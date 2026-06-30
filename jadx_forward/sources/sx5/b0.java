package sx5;

/* loaded from: classes13.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f495232d;

    public b0(sx5.a1 a1Var) {
        this.f495232d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.FrameLayout frameLayout = this.f495232d.f495222w;
        if (frameLayout != null) {
            frameLayout.setVisibility(4);
        }
    }
}
