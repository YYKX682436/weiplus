package qt2;

/* loaded from: classes2.dex */
public final class d implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt2.e f448090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f448091e;

    public d(qt2.e eVar, android.view.View view) {
        this.f448090d = eVar;
        this.f448091e = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        qt2.e eVar = this.f448090d;
        eVar.getClass();
        android.view.View layout = this.f448091e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        if (!eVar.f448122f) {
            int height = layout.getHeight();
            eVar.f448097v = height;
            if (height == 0) {
                eVar.f448097v = layout.getMeasuredHeight();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f448093r, "bottomHeight=" + eVar.f448097v);
            int i17 = eVar.f448097v;
            if (i17 <= 0) {
                i17 = i65.a.b(eVar.m80379x76847179(), 170);
            }
            eVar.W6(i17, 260L);
            eVar.f448122f = true;
            layout.removeCallbacks(eVar.f448095t);
            eVar.f448095t = new qt2.c(eVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            layout.postDelayed(eVar.f448095t, ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209184d3).mo141623x754a37bb()).r()).longValue());
        }
        android.view.ViewTreeObserver viewTreeObserver = layout.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(eVar.f448096u);
        }
    }
}
