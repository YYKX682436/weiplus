package tj3;

/* loaded from: classes8.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tj3.p f501289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f501290e;

    public k(tj3.p pVar, android.graphics.Rect rect) {
        this.f501289d = pVar;
        this.f501290e = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tj3.p pVar = this.f501289d;
        boolean z17 = pVar.f501325k;
        android.graphics.Rect rect = this.f501290e;
        if (z17) {
            boolean z18 = pVar.f501324j;
            pVar.b().setX((rect.right - pVar.b().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv)) - pVar.b().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr));
            pVar.b().setY((rect.bottom - pVar.b().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv)) - pVar.b().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1));
            pVar.b().setVisibility(z18 ? 0 : 4);
        }
        pVar.c().setVisibility(pVar.f501324j ? 0 : 4);
        if (pVar.f501324j) {
            pVar.d().setVisibility(0);
            android.widget.TextView d17 = pVar.d();
            android.view.ViewGroup.LayoutParams layoutParams = pVar.d().getLayoutParams();
            if (layoutParams != null) {
                int width = rect.width() - pVar.a();
                pVar.d().setMaxWidth(width);
                pVar.d().setWidth(width);
                layoutParams.width = width;
                layoutParams.height = pVar.d().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561253dd);
            } else {
                layoutParams = null;
            }
            d17.setLayoutParams(layoutParams);
        }
    }
}
