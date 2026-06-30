package lf3;

/* loaded from: classes3.dex */
public final class a0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf3.c0 f399839d;

    public a0(lf3.c0 c0Var) {
        this.f399839d = c0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        lf3.j jVar;
        android.view.ViewTreeObserver viewTreeObserver;
        lf3.c0 c0Var = this.f399839d;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4 = c0Var.f399843d;
        if (c22956x1a4bbf4 != null && (viewTreeObserver = c22956x1a4bbf4.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf42 = c0Var.f399843d;
        if (c22956x1a4bbf42 == null || (jVar = (lf3.j) c0Var.U6(lf3.j.class)) == null) {
            return true;
        }
        jVar.m6(c22956x1a4bbf42, c22956x1a4bbf42.getWidth(), c22956x1a4bbf42.getHeight());
        return true;
    }
}
