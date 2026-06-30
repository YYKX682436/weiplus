package ws2;

/* loaded from: classes3.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f530635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f530636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ws2.p0 f530637f;

    public n0(android.view.ViewGroup viewGroup, android.view.View view, ws2.p0 p0Var) {
        this.f530635d = viewGroup;
        this.f530636e = view;
        this.f530637f = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2 = this.f530635d;
        int measuredHeight = viewGroup2.getMeasuredHeight() != 0 ? viewGroup2.getMeasuredHeight() : i65.a.b(viewGroup2.getContext(), 32);
        boolean z17 = false;
        android.view.View view = this.f530636e;
        int measuredHeight2 = (view != null ? view.getMeasuredHeight() : 0) + measuredHeight;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        int i17 = measuredHeight2 + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
        ws2.p0 p0Var = this.f530637f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad) p0Var.f530650a.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad.class);
        if (adVar != null && adVar.w0() == 0) {
            z17 = true;
        }
        if (!z17) {
            at2.b bVar = (at2.b) p0Var.f530650a.mo57682x2a5e9229(at2.b.class);
            if (bVar != null) {
                bVar.t1(i17 + i65.a.b(viewGroup2.getContext(), 12));
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad) p0Var.f530650a.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad.class);
        if (adVar2 == null || (viewGroup = adVar2.f446856d) == null) {
            return;
        }
        viewGroup.post(new ws2.m0(viewGroup, p0Var, i17));
    }
}
