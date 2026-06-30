package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui;

/* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailItemView */
/* loaded from: classes.dex */
public class C17103x5f535272 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f238031d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f238032e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f238033f;

    public C17103x5f535272(android.content.Context context, boolean z17) {
        super(context);
        this.f238033f = false;
        this.f238033f = z17;
        a();
    }

    public final void a() {
        if (this.f238033f) {
            android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569714jr, this);
        } else {
            android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569713jq, this);
        }
        this.f238031d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.axa);
        this.f238032e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ax_);
    }

    public void b(int i17, java.lang.CharSequence charSequence) {
        c(getContext().getString(i17), charSequence, false);
    }

    public void c(java.lang.String str, java.lang.CharSequence charSequence, boolean z17) {
        this.f238031d.setText(str);
        if (!z17) {
            this.f238032e.setText(charSequence);
            return;
        }
        android.widget.TextView textView = this.f238032e;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        float textSize = this.f238032e.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, charSequence, textSize));
    }

    public C17103x5f535272(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f238033f = false;
        a();
    }

    public C17103x5f535272(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f238033f = false;
        a();
    }
}
