package bs2;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final bs2.d f23823d = new bs2.d();

    public d() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.lifecycle.o mo133getLifecycle;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = bs2.f.f23831b;
        if (finderThumbPlayerProxy != null) {
            finderThumbPlayerProxy.stop();
            finderThumbPlayerProxy.b();
        }
        bs2.f.f23831b = null;
        bs2.f.f23832c = null;
        bs2.f.f23833d = null;
        android.widget.FrameLayout frameLayout = bs2.f.f23834e;
        if (frameLayout != null) {
            androidx.lifecycle.x xVar = bs2.f.f23835f;
            if (xVar != null) {
                android.content.Context context = frameLayout.getContext();
                androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
                if (appCompatActivity != null && (mo133getLifecycle = appCompatActivity.mo133getLifecycle()) != null) {
                    mo133getLifecycle.c(xVar);
                }
            }
            bs2.f.f23835f = null;
            frameLayout.removeAllViews();
            android.view.ViewParent parent = frameLayout.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
        }
        bs2.f.f23834e = null;
        return jz5.f0.f302826a;
    }
}
