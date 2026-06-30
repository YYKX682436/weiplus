package df2;

/* loaded from: classes3.dex */
public final class ro implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.to f312793d;

    public ro(df2.to toVar) {
        this.f312793d = toVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        df2.to toVar = this.f312793d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f c76 = toVar.c7();
        boolean isShown = c76 != null ? c76.isShown() : false;
        android.view.View S6 = toVar.S6(com.p314xaae8f345.mm.R.id.egj);
        if (S6 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = S6.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = isShown ? toVar.O6().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7) : -2;
            }
            S6.requestLayout();
        }
    }
}
