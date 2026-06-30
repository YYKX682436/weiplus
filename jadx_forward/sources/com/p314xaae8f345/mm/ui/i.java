package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.j f290422d;

    public i(com.p314xaae8f345.mm.ui.j jVar) {
        this.f290422d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.j jVar = this.f290422d;
        android.view.ViewGroup.LayoutParams layoutParams = jVar.f290504d.getLayoutParams();
        if (-2 != layoutParams.width) {
            layoutParams.width = -2;
            jVar.f290504d.setLayoutParams(layoutParams);
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = jVar.f290509i.getLayoutParams();
        if (-2 != layoutParams2.width) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActionBarCustomArea", "fixWhenTitleTooLong, already fix subTitle");
            return;
        }
        android.text.Layout layout = jVar.f290509i.getLayout();
        if (layout == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ActionBarCustomArea", "fixWhenTitleTooLong, layout is null");
            return;
        }
        if (layout.getEllipsisCount(0) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActionBarCustomArea", "fixWhenTitleTooLong, subTitle is not too long");
            return;
        }
        int width = jVar.f290509i.getWidth();
        int width2 = jVar.f290511k.getWidth();
        android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) jVar.f290511k.getLayoutParams();
        int marginStart = layoutParams3.getMarginStart();
        int marginEnd = layoutParams3.getMarginEnd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActionBarCustomArea", "fixWhenTitleTooLong, subTitleWidth: %d, subTitleGotoBtnWidth: %d, subTitleGotoBtnMarginStart: %d, subTitleGotoBtnMarginEnd: %d", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(width2), java.lang.Integer.valueOf(marginStart), java.lang.Integer.valueOf(marginEnd));
        layoutParams2.width = ((width - width2) - marginStart) - marginEnd;
        jVar.f290509i.setLayoutParams(layoutParams2);
    }
}
