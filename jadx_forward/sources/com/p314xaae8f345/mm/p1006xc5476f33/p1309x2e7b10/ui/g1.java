package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes9.dex */
public class g1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17 f176542d;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17 viewOnClickListenerC13051xc6cfcc17) {
        this.f176542d = viewOnClickListenerC13051xc6cfcc17;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17 viewOnClickListenerC13051xc6cfcc17 = this.f176542d;
        int b17 = i65.a.b(viewOnClickListenerC13051xc6cfcc17.mo55332x76847179(), 67);
        int height = viewOnClickListenerC13051xc6cfcc17.f176357h.getChildAt(0).getHeight() + b17;
        int height2 = viewOnClickListenerC13051xc6cfcc17.getWindow().findViewById(android.R.id.content).getHeight();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "bottomHeight: %d  totalViewHeight:%d  screenHeight:%d ", java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(height), java.lang.Integer.valueOf(height2));
        viewOnClickListenerC13051xc6cfcc17.f176357h.setFillViewport(true);
        if (height > height2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17.T6(viewOnClickListenerC13051xc6cfcc17, true);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17.T6(viewOnClickListenerC13051xc6cfcc17, false);
        }
        viewOnClickListenerC13051xc6cfcc17.f176357h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
