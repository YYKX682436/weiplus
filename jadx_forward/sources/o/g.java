package o;

/* loaded from: classes15.dex */
public class g implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o.l f423248d;

    public g(o.l lVar) {
        this.f423248d = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        o.l lVar = this.f423248d;
        if (!lVar.mo2734x58a9c73b() || ((java.util.ArrayList) lVar.f423265o).size() <= 0 || ((o.k) ((java.util.ArrayList) lVar.f423265o).get(0)).f423255a.D) {
            return;
        }
        android.view.View view = lVar.f423272v;
        if (view == null || !view.isShown()) {
            lVar.mo2732x63a3b28a();
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) lVar.f423265o).iterator();
        while (it.hasNext()) {
            ((o.k) it.next()).f423255a.mo2735x35dafd();
        }
    }
}
