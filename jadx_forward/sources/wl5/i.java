package wl5;

/* loaded from: classes15.dex */
public class i implements android.view.ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wl5.x f528645a;

    public i(wl5.x xVar) {
        this.f528645a = xVar;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        wl5.q qVar;
        wl5.x xVar = this.f528645a;
        wl5.q qVar2 = xVar.f528688a;
        if ((qVar2 != null && qVar2.f528679w) || ((qVar = xVar.f528690b) != null && qVar.f528679w)) {
            return;
        }
        if (xVar.f528699k != null) {
            xVar.f528698j.removeCallbacks(xVar.V);
            android.view.View view = xVar.f528698j;
            int[] iArr = xVar.W;
            view.getLocationInWindow(iArr);
            boolean z17 = xVar.O;
            int[] iArr2 = xVar.R;
            if (z17) {
                if (xVar.P || xVar.Q) {
                    if (xVar.Q) {
                        xVar.Q = false;
                        xVar.O = false;
                        if (iArr2[1] != iArr[1]) {
                            xVar.P = true;
                            com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "judge result(delay), inScrolling.", new java.lang.Object[0]);
                        } else {
                            xVar.P = false;
                            com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "judge result, click outside.", new java.lang.Object[0]);
                        }
                    }
                } else if (iArr2[1] != iArr[1]) {
                    xVar.P = true;
                    xVar.O = false;
                    com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "judge result, inScrolling.", new java.lang.Object[0]);
                } else {
                    xVar.Q = true;
                    com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "need delay judge.", new java.lang.Object[0]);
                }
            }
            iArr2[1] = iArr[1];
        }
        if (xVar.K) {
            return;
        }
        if ((xVar.M && xVar.N) || xVar.L) {
            return;
        }
        xVar.K = true;
        xVar.i();
    }
}
