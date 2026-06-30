package ck1;

/* loaded from: classes4.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.y0 f123837d;

    public a0(ck1.y0 y0Var) {
        this.f123837d = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ck1.y0 y0Var = this.f123837d;
        android.widget.LinearLayout linearLayout = ((ck1.u0) y0Var).f123918d;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setGravity(1 < ((ck1.u0) y0Var).f123920f.getLineCount() ? 48 : 16);
    }
}
