package a24;

/* loaded from: classes.dex */
public final class s implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f82434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe f82435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82436f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17508x8f0972f6 f82437g;

    public s(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17508x8f0972f6 abstractActivityC17508x8f0972f6) {
        this.f82434d = c22849x81a93d25;
        this.f82435e = c16718x7059cefe;
        this.f82436f = str;
        this.f82437g = abstractActivityC17508x8f0972f6;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i17;
        a24.i iVar;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f82434d;
        android.view.ViewTreeObserver viewTreeObserver = c22849x81a93d25.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = this.f82435e;
        java.util.ArrayList<xm3.d> arrayList = c16718x7059cefe != null ? c16718x7059cefe.f233598o : null;
        if (arrayList != null) {
            i17 = 0;
            for (xm3.d dVar : arrayList) {
                c24.f fVar = dVar instanceof c24.f ? (c24.f) dVar : null;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((fVar == null || (iVar = fVar.f119610e) == null) ? null : iVar.a7(), this.f82436f)) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        i17 = -1;
        if (i17 == -1) {
            return;
        }
        c22849x81a93d25.post(new a24.r(c22849x81a93d25, i17, this.f82437g));
    }
}
