package aa3;

/* loaded from: classes7.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa3.q f2568d;

    public p(aa3.q qVar) {
        this.f2568d = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aa3.q qVar = this.f2568d;
        qVar.getClass();
        aa3.c cVar = qVar.f2580b;
        if (cVar == null) {
            return;
        }
        if (cVar.q()) {
            qVar.f2582d = 0;
            android.view.View view = cVar.getView();
            qVar.e(android.graphics.Insets.of(0, 0, 0, view != null ? view.getMeasuredHeight() : 0));
            return;
        }
        android.view.View view2 = cVar.getView();
        if (view2 != null) {
            view2.getMeasuredHeight();
        }
        int i17 = qVar.f2582d + 1;
        qVar.f2582d = i17;
        if (i17 < 5) {
            qVar.d();
        }
    }
}
