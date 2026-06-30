package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f234162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f234163e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f234164f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e f234165g;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e c16759xaa786f9e, android.widget.TextView textView, android.widget.CheckBox checkBox, android.view.View view) {
        this.f234165g = c16759xaa786f9e;
        this.f234162d = textView;
        this.f234163e = checkBox;
        this.f234164f = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView = this.f234162d;
        if (textView.getLineCount() > 1) {
            android.widget.CheckBox checkBox = this.f234163e;
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) checkBox.getLayoutParams();
            if (layoutParams != null) {
                android.graphics.Rect rect = new android.graphics.Rect();
                textView.getLineBounds(0, rect);
                int height = (rect.height() - layoutParams.height) / 2;
                layoutParams.gravity = 48;
                layoutParams.topMargin = height;
                checkBox.setLayoutParams(layoutParams);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e c16759xaa786f9e = this.f234165g;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) c16759xaa786f9e.findViewById(com.p314xaae8f345.mm.R.id.chq);
        if (linearLayout == null) {
            return;
        }
        android.view.View view = this.f234164f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineAlertView", "showOpenAlertView: qrCodeView.getHeight%s %s", java.lang.Integer.valueOf(view.getHeight()), java.lang.Integer.valueOf(linearLayout.getHeight()));
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (linearLayout.getHeight() > view.getHeight()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OfflineAlertView", "don't modify alert height");
            layoutParams2.height = linearLayout.getHeight();
            linearLayout.setLayoutParams(layoutParams2);
        } else if (linearLayout.getHeight() > 0) {
            layoutParams2.height = view.getHeight();
            linearLayout.setLayoutParams(layoutParams2);
            android.view.View findViewById = c16759xaa786f9e.findViewById(com.p314xaae8f345.mm.R.id.f569111p21);
            android.view.View findViewById2 = c16759xaa786f9e.findViewById(com.p314xaae8f345.mm.R.id.f569112p22);
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams3.weight = 67.0f;
            findViewById.setLayoutParams(layoutParams3);
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) findViewById2.getLayoutParams();
            layoutParams4.weight = 56.0f;
            findViewById2.setLayoutParams(layoutParams4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.z zVar = c16759xaa786f9e.f234010h;
        if (zVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.q1) zVar).a();
        }
    }
}
