package tj5;

/* loaded from: classes10.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 f501377d;

    public i(com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381) {
        this.f501377d = c22479x68a26381;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = this.f501377d;
        if (c22479x68a26381.f291349g == null) {
            return;
        }
        if (c22479x68a26381.hasWindowFocus()) {
            c22479x68a26381.s();
        } else {
            c22479x68a26381.getViewTreeObserver().addOnWindowFocusChangeListener(new tj5.h(this));
        }
    }
}
