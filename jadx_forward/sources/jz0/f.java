package jz0;

/* loaded from: classes5.dex */
public final class f implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz0.k f384105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.s4 f384106e;

    public f(jz0.k kVar, com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var) {
        this.f384105d = kVar;
        this.f384106e = s4Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        jz0.k kVar = this.f384105d;
        kVar.P6().getViewTreeObserver().removeOnPreDrawListener(this);
        this.f384106e.c(kVar.P6(), kVar.O6(), new jz0.e(kVar));
        return true;
    }
}
