package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.j f290298d;

    public h(com.p314xaae8f345.mm.ui.j jVar) {
        this.f290298d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.j jVar = this.f290298d;
        android.view.ViewGroup.LayoutParams layoutParams = jVar.f290509i.getLayoutParams();
        if (-2 != layoutParams.width) {
            layoutParams.width = -2;
            jVar.f290509i.setLayoutParams(layoutParams);
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = jVar.f290504d.getLayoutParams();
        if (-2 != layoutParams2.width) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActionBarCustomArea", "fixWhenTitleTooLong, already fix title");
            return;
        }
        android.text.Layout layout = jVar.f290504d.getLayout();
        if (layout == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ActionBarCustomArea", "fixWhenTitleTooLong, layout is null");
            return;
        }
        if (layout.getEllipsisCount(0) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActionBarCustomArea", "fixWhenTitleTooLong, title is not too long");
            return;
        }
        int width = jVar.f290504d.getWidth();
        int width2 = jVar.f290508h.getWidth();
        android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) jVar.f290508h.getLayoutParams();
        int marginStart = layoutParams3.getMarginStart();
        int marginEnd = layoutParams3.getMarginEnd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActionBarCustomArea", "fixWhenTitleTooLong, titleWidth: %d, titleGotoBtnWidth: %d, titleGotoBtnMarginStart: %d, titleGotoBtnMarginEnd: %d", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(width2), java.lang.Integer.valueOf(marginStart), java.lang.Integer.valueOf(marginEnd));
        layoutParams2.width = ((width - width2) - marginStart) - marginEnd;
        jVar.f290504d.setLayoutParams(layoutParams2);
    }
}
