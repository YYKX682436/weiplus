package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView */
/* loaded from: classes8.dex */
public class C18997x8359ff6c extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f259300d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f259301e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f259302f;

    public C18997x8359ff6c(android.content.Context context, boolean z17) {
        super(context);
        this.f259302f = false;
        this.f259302f = z17;
        a();
    }

    public final void a() {
        if (this.f259302f) {
            android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569714jr, this);
        } else {
            android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569713jq, this);
        }
        this.f259300d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.axa);
        this.f259301e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ax_);
    }

    public void b(int i17, java.lang.CharSequence charSequence) {
        c(getContext().getString(i17), charSequence, "", "", false);
    }

    public void c(java.lang.String str, java.lang.CharSequence charSequence, java.lang.String str2, java.lang.String str3, boolean z17) {
        this.f259300d.setText(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            this.f259300d.setTextColor(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.b(str2, true));
        }
        if (z17) {
            android.widget.TextView textView = this.f259301e;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = getContext();
            float textSize = this.f259301e.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, charSequence, textSize));
        } else {
            this.f259301e.setText(charSequence);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            return;
        }
        this.f259301e.setTextColor(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.b(str3, true));
    }

    public void d(java.lang.String str, java.lang.CharSequence charSequence, int i17, int i18, boolean z17) {
        this.f259300d.setText(str);
        if (i17 != -1) {
            this.f259300d.setTextColor(i17);
        }
        if (z17) {
            android.widget.TextView textView = this.f259301e;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = getContext();
            float textSize = this.f259301e.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, charSequence, textSize));
        } else {
            this.f259301e.setText(charSequence);
        }
        if (i18 != -1) {
            this.f259301e.setTextColor(i18);
        }
    }

    public C18997x8359ff6c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f259302f = false;
        a();
    }

    public C18997x8359ff6c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f259302f = false;
        a();
    }
}
