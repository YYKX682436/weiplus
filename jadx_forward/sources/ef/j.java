package ef;

/* loaded from: classes7.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef.m f333653d;

    public j(ef.m mVar) {
        this.f333653d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ef.m mVar = this.f333653d;
        mVar.getClass();
        ef.e eVar = mVar.f333659c;
        if (eVar == null) {
            return;
        }
        if (eVar.q()) {
            mVar.f333664h = 0;
            android.view.View mo127526xfb86a31b = eVar.mo127526xfb86a31b();
            mVar.e(java.lang.Integer.valueOf(mo127526xfb86a31b != null ? mo127526xfb86a31b.getMeasuredHeight() : 0));
            return;
        }
        android.view.View mo127526xfb86a31b2 = eVar.mo127526xfb86a31b();
        if (mo127526xfb86a31b2 != null) {
            mo127526xfb86a31b2.getMeasuredHeight();
        }
        int i17 = mVar.f333664h + 1;
        mVar.f333664h = i17;
        if (i17 < 5) {
            mVar.d();
        }
    }
}
