package vc1;

/* loaded from: classes13.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516536d;

    public l(vc1.p1 p1Var) {
        this.f516536d = p1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        vc1.p1 p1Var = this.f516536d;
        android.widget.FrameLayout frameLayout = p1Var.f516597c;
        synchronized (p1Var.V) {
            java.util.Iterator it = this.f516536d.V.iterator();
            while (it.hasNext()) {
                frameLayout.removeView(((vc1.h1) it.next()).f516507a);
            }
            this.f516536d.V.clear();
        }
    }
}
