package zw1;

/* loaded from: classes9.dex */
public final class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f558281d;

    public o2(ww1.b3 b3Var) {
        this.f558281d = b3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.RelativeLayout relativeLayout = this.f558281d.f531686y;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setVisibility(8);
    }
}
