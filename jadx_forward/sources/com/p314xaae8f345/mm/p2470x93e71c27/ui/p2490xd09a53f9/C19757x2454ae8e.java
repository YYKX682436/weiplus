package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2490xd09a53f9;

/* renamed from: com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView */
/* loaded from: classes9.dex */
public class C19757x2454ae8e extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 {

    /* renamed from: r, reason: collision with root package name */
    public int f273571r;

    /* renamed from: s, reason: collision with root package name */
    public int f273572s;

    /* renamed from: t, reason: collision with root package name */
    public int f273573t;

    /* renamed from: u, reason: collision with root package name */
    public int f273574u;

    /* renamed from: v, reason: collision with root package name */
    public int f273575v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f273576w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View.OnClickListener f273577x;

    public C19757x2454ae8e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f273571r = -1;
        this.f273572s = 0;
        this.f273573t = 4;
        this.f273574u = -1;
        this.f273575v = -1;
        this.f273577x = null;
    }

    /* renamed from: setIconContentDescription */
    public void m75915x984ee11e(java.lang.String str) {
        this.f273576w = str;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352, p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd, android.widget.ImageView
    public void setImageResource(int i17) {
        this.f273571r = i17;
        if (i17 != -1) {
            super.setImageResource(i17);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f273577x = onClickListener;
    }

    /* renamed from: setToClearState */
    public void m75916xed5ee0a1(android.view.View.OnClickListener onClickListener) {
        super.setVisibility(0);
        int i17 = this.f273574u;
        if (i17 != -1) {
            super.setImageResource(i17);
            int i18 = this.f273575v;
            if (i18 != -1) {
                super.setColorFilter(i18, android.graphics.PorterDuff.Mode.SRC_ATOP);
                m82040x7541828(this.f273575v);
            }
        } else {
            super.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563446aj3);
            int i19 = this.f273575v;
            if (i19 != -1) {
                super.setColorFilter(i19, android.graphics.PorterDuff.Mode.SRC_ATOP);
                m82040x7541828(this.f273575v);
            } else {
                super.setColorFilter(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834), android.graphics.PorterDuff.Mode.SRC_ATOP);
                m82040x7541828(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
            }
        }
        super.setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572452b91));
        super.setOnClickListener(onClickListener);
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i17) {
        this.f273573t = i17;
        super.setVisibility(i17);
    }

    /* renamed from: setmUserSetImageIconColor */
    public void m75917xc6cc183b(int i17) {
        this.f273572s = i17;
        if (i17 != -1) {
            m82040x7541828(i17);
        }
    }

    public void t() {
        super.setVisibility(this.f273573t);
        setImageResource(this.f273571r);
        setContentDescription(this.f273576w);
        int i17 = this.f273572s;
        if (i17 != -1) {
            super.setColorFilter(i17, android.graphics.PorterDuff.Mode.SRC_ATOP);
            m82040x7541828(this.f273572s);
        }
        android.view.View.OnClickListener onClickListener = this.f273577x;
        if (onClickListener != null) {
            super.setOnClickListener(onClickListener);
        }
    }

    public C19757x2454ae8e(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public C19757x2454ae8e(android.content.Context context) {
        super(context);
        this.f273571r = -1;
        this.f273572s = 0;
        this.f273573t = 4;
        this.f273574u = -1;
        this.f273575v = -1;
        this.f273577x = null;
    }
}
