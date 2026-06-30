package qt2;

/* loaded from: classes2.dex */
public final class e0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt2.f0 f448101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f448102e;

    public e0(qt2.f0 f0Var, android.view.View view) {
        this.f448101d = f0Var;
        this.f448102e = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        qt2.f0 f0Var = this.f448101d;
        f0Var.getClass();
        android.view.View layout = this.f448102e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        if (!f0Var.f448122f) {
            int height = layout.getHeight();
            f0Var.f448109v = height;
            if (height == 0) {
                f0Var.f448109v = layout.getMeasuredHeight();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f0Var.f448105r, "bottomHeight=" + f0Var.f448109v);
            f0Var.e7(8);
            f0Var.W6((float) f0Var.c7(), 260L);
            f0Var.f448122f = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y3.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y3.f207005a, f0Var.m158354x19263085(), 1, null, 4, null);
            layout.removeCallbacks(f0Var.f448107t);
            if (true ^ (f0Var instanceof qt2.h0)) {
                f0Var.f448107t = new qt2.d0(f0Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                layout.postDelayed(f0Var.f448107t, ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209184d3).mo141623x754a37bb()).r()).longValue());
            }
        }
        android.view.ViewTreeObserver viewTreeObserver = layout.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(f0Var.f448108u);
        }
    }
}
