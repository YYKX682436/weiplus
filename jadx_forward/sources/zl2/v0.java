package zl2;

/* loaded from: classes3.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f555527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f555528e;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar, boolean z17) {
        this.f555527d = lVar;
        this.f555528e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f555527d;
        if (lVar.f194857f.getLayoutParams() != null && (lVar.f194857f.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) && lVar.x0()) {
            int u07 = lVar.u0();
            zl2.r4 r4Var = zl2.r4.f555483a;
            android.content.Context context = lVar.f194857f.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            int z07 = r4Var.z0(context, r4Var.W1(lVar.S0()) || r4Var.z1(lVar.S0()));
            boolean z17 = this.f555528e;
            if (z17) {
                android.view.ViewGroup.LayoutParams layoutParams = lVar.f194857f.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(z07);
            } else {
                android.view.ViewGroup.LayoutParams layoutParams2 = lVar.f194857f.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(z07);
            }
            lVar.f194857f.requestLayout();
            if (zl2.q4.f555466a.E()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "plugin:" + lVar.mo57003x337a8b() + ",Orientation:" + u07 + ",ifLeft:" + z17 + ", padding:" + z07);
            }
            lVar.f194857f.setTag(com.p314xaae8f345.mm.R.id.ffz, java.lang.Integer.valueOf(u07));
        }
    }
}
