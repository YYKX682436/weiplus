package wl5;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wl5.x f528641d;

    public e(wl5.x xVar) {
        this.f528641d = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        wl5.x xVar = this.f528641d;
        if (xVar.I) {
            com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "isReInit, return.", new java.lang.Object[0]);
            return;
        }
        com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "in mShowSelectViewRunnable. opener: %s, inScrolling: %s.", java.lang.Boolean.valueOf(xVar.O), java.lang.Boolean.valueOf(xVar.P));
        if (xVar.f528699k == null) {
            if (!xVar.M) {
                xVar.q();
            }
            if (xVar.N) {
                return;
            }
            xVar.o();
            return;
        }
        if (xVar.O) {
            if (!xVar.Q) {
                com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "Oh, bypass the judge logic! Don't worry, that's reasonable.", new java.lang.Object[0]);
                return;
            }
            xVar.Q = false;
            com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "judge result(delay), click outside.", new java.lang.Object[0]);
            wl5.u uVar = xVar.Y;
            if (uVar != null) {
                uVar.a();
                return;
            }
            return;
        }
        xVar.O = true;
        if (xVar.P) {
            com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "menu is hide: %s, cursor is hide: %s.", java.lang.Boolean.valueOf(xVar.M), java.lang.Boolean.valueOf(xVar.N));
            if (!xVar.M && xVar.f528694f) {
                xVar.q();
            }
            if (!xVar.N) {
                xVar.o();
                wl5.w wVar = xVar.f528691c;
                xVar.l(wVar.f528684a, wVar.f528685b);
                xVar.N = false;
            }
            wl5.v vVar = xVar.f528699k;
            if (vVar != null && xVar.M && !xVar.N && xVar.f528694f) {
                vVar.f(xVar.f528698j);
            }
        }
        xVar.P = false;
    }
}
