package aa3;

/* loaded from: classes7.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa3.q f84101d;

    public p(aa3.q qVar) {
        this.f84101d = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aa3.q qVar = this.f84101d;
        qVar.getClass();
        aa3.c cVar = qVar.f84113b;
        if (cVar == null) {
            return;
        }
        if (cVar.q()) {
            qVar.f84115d = 0;
            android.view.View mo890xfb86a31b = cVar.mo890xfb86a31b();
            qVar.e(android.graphics.Insets.of(0, 0, 0, mo890xfb86a31b != null ? mo890xfb86a31b.getMeasuredHeight() : 0));
            return;
        }
        android.view.View mo890xfb86a31b2 = cVar.mo890xfb86a31b();
        if (mo890xfb86a31b2 != null) {
            mo890xfb86a31b2.getMeasuredHeight();
        }
        int i17 = qVar.f84115d + 1;
        qVar.f84115d = i17;
        if (i17 < 5) {
            qVar.d();
        }
    }
}
